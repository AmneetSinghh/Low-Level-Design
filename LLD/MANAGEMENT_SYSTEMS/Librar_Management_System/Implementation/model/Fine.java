package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.enums.ReservationStatus;

public class Fine {
    private int id;
    private Member member;
    private BookItem bookItem;
    private long fineAmount;
    private long createdAt;
    private long updatedAt;
    private long deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public BookItem getBookItem() {
        return bookItem;
    }

    public void setBookItem(BookItem bookItem) {
        this.bookItem = bookItem;
    }

    public long getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(long fineAmount) {
        this.fineAmount = fineAmount;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(long deletedAt) {
        this.deletedAt = deletedAt;
    }

    public void init(Member member, BookItem bookItem,long fineAmount){
        setId(member.getId());
        setMember(member);
        setBookItem(bookItem);
        setCreatedAt(System.currentTimeMillis());
        setUpdatedAt(System.currentTimeMillis());
        setFineAmount(fineAmount);
    }
}
