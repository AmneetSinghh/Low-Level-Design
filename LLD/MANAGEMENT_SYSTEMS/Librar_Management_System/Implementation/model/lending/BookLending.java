package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.BookItem;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.Member;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model.lending.BaseLending;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.util.Constants;

public class BookLending extends BaseLending {
    public long getIssueAt() {
        return issueAt;
    }

    public void setIssueAt(long issueAt) {
        this.issueAt = issueAt;
    }

    private long issueAt;
    private long returnedAt;
    private long dueDate;

    public long getDueDate() {
        return dueDate;
    }

    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }

    public long getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(long returnedAt) {
        this.returnedAt = returnedAt;
    }

    public void init(Member member, BookItem bookItem){
        setBookItem(bookItem);
        setCreatedAt(System.currentTimeMillis());
        setId(member.getId());
        setMember(member);
        setPrice(100);
        setUpdatedAt(System.currentTimeMillis());
        setDueDate(System.currentTimeMillis() + Constants.convertDayToEpoc(Constants.MAX_DAYS_MEMBER_CAN_KEEP_BOOK));
    }

}
