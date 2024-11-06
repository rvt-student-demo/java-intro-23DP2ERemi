package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }


    public void eatAffordably() {
        if (balance > 5) {
            this.balance =  balance - 2.6;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    
    public void eatHeartily() {
        if (balance > 5) {
            this.balance =  balance - 4.6;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void addMoney(double amount) {
        
       if(amount > 0){
        if (balance >= 150){
            System.out.println("the balance is  too high");
        }
        else if (balance + amount >= 150){
            this.balance = 150;
        }
        else{   
            this.balance = balance + amount;
        }
    }
    else{
        System.out.println("Amount is incorrect");
    }
    }


    public String toString() {
        return "Balance: " + balance;
    }
}
