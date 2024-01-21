package MachineCoding_HLD.Librar_Management_System.Implementation.service;
import MachineCoding_HLD.Librar_Management_System.Implementation.data.FineRepository;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.BookItem;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Fine;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.Member;
import MachineCoding_HLD.Librar_Management_System.Implementation.model.lending.BookLending;
import MachineCoding_HLD.Librar_Management_System.Implementation.util.Constants;

public class FineService {

    FineRepository fineRepository;
    public FineService(FineRepository fineRepository){
        this.fineRepository = fineRepository;
    }

    public void collectFine(Member member, BookItem bookItem, BookLending lending){
        long tenDaysBefore = System.currentTimeMillis() - Constants.convertDayToEpoc(Constants.MAX_DAYS_MEMBER_CAN_KEEP_BOOK);
        if(lending.getIssueAt() < tenDaysBefore){
            Fine fine = new Fine();
            long amount = (tenDaysBefore - lending.getIssueAt())/Constants.ONE_DAY_MILISECONDS;
            fine.init(member,bookItem,amount);
            fineRepository.collectFine(fine);
        }
    }
}
