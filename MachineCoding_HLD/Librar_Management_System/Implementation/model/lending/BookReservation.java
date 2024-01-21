package MachineCoding_HLD.Librar_Management_System.Implementation.model.lending;

import MachineCoding_HLD.Librar_Management_System.Implementation.enums.ReservationStatus;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.util.Constants;

public class BookReservation extends BaseLending {
    private ReservationStatus reservationStatus;
    private long reservedAt;
    private long availableAt;


    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public long getReservedAt() {
        return reservedAt;
    }

    public void setReservedAt(long reservedAt) {
        this.reservedAt = reservedAt;
    }

    public long getAvailableAt() {
        return availableAt;
    }

    public void setAvailableAt(long availableAt) {
        this.availableAt = availableAt;
    }

    public void init(Member member, BookItem bookItem){
        setBookItem(bookItem);
        setCreatedAt(System.currentTimeMillis());
        setId(member.getId());
        setMember(member);
        setPrice(100);
        setReservationStatus(ReservationStatus.PENDING);
        setReservedAt(System.currentTimeMillis());
        setUpdatedAt(System.currentTimeMillis());
        setAvailableAt(System.currentTimeMillis() + Constants.convertDayToEpoc(Constants.MAX_DAYS_MEMBER_CAN_KEEP_BOOK));
    }
}
