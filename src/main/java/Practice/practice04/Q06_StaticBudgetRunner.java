package Practice.practice04;

public class Q06_StaticBudgetRunner {
    /*
    write a simple home budget code
     */

    public static void main(String[] args) {
        Budget father=new Budget();
        System.out.println(Budget.budget);

        father.getSalary(5000);
        System.out.println(Budget.budget);

        father.getAllovence(500);
        System.out.println(father.allowance);

        father.purchaseAllowance(200);
        System.out.println(father.allowance);

        father.pruchaseBudget(1000);
        System.out.println(Budget.budget);

        System.out.println(father.allowance);

        Budget mother= new Budget();
        mother.getSalary(2000);
        mother.getSalary(3000);
        mother.getAllovence(2000);
        mother.purchaseAllowance(350);


        System.out.println(Budget.budget);
        System.out.println(mother.allowance);






    }

}
