package Assignment5Part2;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        NormalEmployee n = new NormalEmployee();
        n.getEmployeeDetails();
        n.salaryCalculation();
        n.displayEmployeeDetails();


        BonusEmployee b = new BonusEmployee();
        b.getEmployeeDetails();
        b.salaryCalculation();
        b.displayEmployeeDetails();

    }
}