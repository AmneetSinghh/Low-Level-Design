package MachineCoding_HLD.Hotel_Management_System.Implementation.model;

import MachineCoding_HLD.Hotel_Management_System.Implementation.enums.PaymentType;

public class PaymentDetails {
    int id;
    PaymentType type;
    int amount;
    long createdAt;
    long updatedAt;

    public PaymentDetails(int id, PaymentType type, int amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    long deletedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PaymentType getType() {
        return type;
    }

    public void setType(PaymentType type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
}
