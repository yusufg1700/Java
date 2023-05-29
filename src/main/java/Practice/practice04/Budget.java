package Practice.practice04;

public class Budget {
    public static int budget;
    public int allowance;

    public void getAllovence(int receivedAllowance){
        allowance+=receivedAllowance;
        budget-=receivedAllowance;
    }

    public void pruchaseBudget(int moneyToPurchase){
        budget-=moneyToPurchase;

    }

    public void purchaseAllowance(int allowanceToPurchase){
        allowance-=allowanceToPurchase;
    }

    public void getSalary(int receivedSalary){
        budget+=receivedSalary;
    }
}
