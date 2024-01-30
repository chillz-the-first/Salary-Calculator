public class Main {
    public static void main(String[] args) {
        SalaryCalculator pay = new SalaryCalculator();
        System.out.println(pay.salaryMultiplier(7));
        System.out.println(pay.bonusMultiplier(5));
        System.out.println(pay.bonusForProductsSold(5));
        System.out.println(pay.finalSalary(0, 90));
    }
}
