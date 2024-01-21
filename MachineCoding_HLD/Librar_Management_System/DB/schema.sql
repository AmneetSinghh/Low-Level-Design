-- users --

-- basic information for users.
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    phone VARCHAR(255),
    address VARCHAR(255),
    role_list user_roles_enum[], -- while adding new role just push into this array.
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ
);

-- Define the enum type
CREATE TYPE user_roles_enum AS ENUM ('Admin', 'Staff', 'Member');
CREATE TYPE membership_status_enum AS ENUM ('Valid', 'Expired');
CREATE TYPE membership_type_enum AS ENUM ('Premium', 'Standard');

CREATE TABLE members (
    id SERIAL PRIMARY KEY,
    user_id INT UNIQUE REFERENCES users(id) ON DELETE CASCADE,
    membership_status membership_status_enum DEFAULT 'Valid',
    membership_type membership_type_enum DEFAULT 'Standard',
    membership_date TIMESTAMPTZ,
    member_book_analytics_id INT REFERENCES member_analytics(id),
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ
);

CREATE TABLE admins (
    id SERIAL PRIMARY KEY,
    user_id INT UNIQUE REFERENCES users(id) ON DELETE CASCADE,
    permissions JSONB,
    role_info TEXT,
    admin_info JSONB,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ
);

-- if member wants to be admin steps :    1. click on admin 2. we get userId of member add roles into it. 3. create admin with same userId.


--  not needed as such, just made it.
CREATE TABLE member_books_analytics(
    id SERIAL PRIMARY KEY,
    member_id int references members(id),
    total_reserved int,
    total_issued int,
    total_fine int,
    created_at timestampz default CURRENT_TIMESTAMP,
    updated_at timestampz,
    deleted_at timestampz,
)


-- books --

CREATE TABLE book(
    id SERIAL PRIMARY KEY,
    author VARCHAR(255),
    subject VARCHAR(255),
    title VARCHAR(255) NOT NULL,
    no_of_pages int,
    total_copies int,
    book_item_id int references book_item(id),
    published_at TIMESTAMPTZ,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,
)

-- represent copy of book
-- each book can have multiple copies

CREATE TYPE book_type_enum AS ENUM ('Premium', 'Standard','Classic','Gold');
CREATE TYPE book_status_enum AS ENUM ('Available', 'Reserved', 'Lent', 'NotAvailable');
CREATE TYPE book_format_enum AS ENUM ('Journal', 'Paperback');


CREATE TABLE book_item(
    id SERIAL PRIMARY KEY,
    book_type book_type_enum,
    book_status book_status_enum,
    book_format book_format_enum,
    rack_id int references book_racks(id),
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,
)


CREATE TYPE book_reservation_status_enum AS ENUM ('Pending', 'Completed', 'Cancelled');

-- reserve a book which is not available and checkout.

CREATE TABLE book_reservation(
    id SERIAL PRIMARY KEY,
    reservation_status book_reservation_status_enum,
    member_id int references members(id),
    book_item_id int references book_item(id),
    amount int,
    reserved_at TIMESTAMPTZ,
    available_at TIMESTAMPTZ, -- book will available at this timestamp
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,
)

CREATE TABLE book_lending(
    id SERIAL PRIMARY KEY,
    member_id int references members(id),
    book_item_id int references book_item(id),
    amount int,
    issued_at TIMESTAMPTZ,
    due_at TIMESTAMPTZ,
    returned_at TIMESTAMPTZ,
    fine_id int references fine_details(id),
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,
)

CREATE TABLE fine_details(
    id SERIAL PRIMARY KEY,
    member_id int references members(id),
    book_item_id int references book_item(id),
    charge int,
    created_at TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMPTZ,
    deleted_at TIMESTAMPTZ,
)
