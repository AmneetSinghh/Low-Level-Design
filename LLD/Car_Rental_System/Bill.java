package LLD.Car_Rental_System;


public class Bill {

    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){
        return 100.0;
        // we calculate the total bill amount after calculating total reseration hours or days,,, from the reservation object,
    }

}
/*
1/ Bill class means bill is generated, but may be payment is done or not.

 */