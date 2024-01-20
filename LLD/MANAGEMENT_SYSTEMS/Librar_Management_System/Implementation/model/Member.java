package LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.model;

import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.enums.MemberShipStatus;
import LLD.MANAGEMENT_SYSTEMS.Librar_Management_System.Implementation.enums.MemberShipType;

public class Member extends User{

    MemberShipStatus memberShipStatus;
    MemberShipType memberShipType;
    int totalBooksCheckout;
    int totalBooksReserved;
    int totalFine;
    long memberShipDate;
    public MemberShipStatus getMemberShipStatus() {
        return memberShipStatus;
    }

    public void setMemberShipStatus(MemberShipStatus memberShipStatus) {
        this.memberShipStatus = memberShipStatus;
    }

    public MemberShipType getMemberShipType() {
        return memberShipType;
    }

    public void setMemberShipType(MemberShipType memberShipType) {
        this.memberShipType = memberShipType;
    }

    public int getTotalBooksCheckout() {
        return totalBooksCheckout;
    }

    public void setTotalBooksCheckout(int totalBooksCheckout) {
        this.totalBooksCheckout = totalBooksCheckout;
    }

    public int getTotalBooksReserved() {
        return totalBooksReserved;
    }

    public void setTotalBooksReserved(int totalBooksReserved) {
        this.totalBooksReserved = totalBooksReserved;
    }

    public int getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(int totalFine) {
        this.totalFine = totalFine;
    }

    public long getMemberShipDate() {
        return memberShipDate;
    }

    public void setMemberShipDate(long memberShipDate) {
        this.memberShipDate = memberShipDate;
    }

    public void init(int id){
        setId(id);
        String mockk = "MOCKK_"+ id;
        setName(mockk);
        setPhone(mockk);
        setMemberShipStatus(MemberShipStatus.VALID);
        setMemberShipType(MemberShipType.STANDARD);
        setTotalBooksCheckout(0);
        setTotalBooksReserved(0);
        setTotalFine(0);
    }
}
