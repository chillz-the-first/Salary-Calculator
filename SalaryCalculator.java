public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double result = (daysSkipped >= 5) ? 0.85 : 1;
        return result;
    }

    public int bonusMultiplier(int productsSold) {
        int result = (productsSold >= 20) ? 13 : 10;
        return result;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonus = bonusMultiplier(productsSold);
        double multi = (bonus == 13) ? 1.3 : 1.0;
        int base = productsSold * 10;
        double result = base * multi;
        return result;
    }

    /*Implement the finalSalary method. It should multiply the base salary of 1000.00 by the salary multiplier,
     add the bonus, and return the result. However, salaries should be capped at 2000.00. */
    public double finalSalary(int daysSkipped, int productsSold) {
        double multi = salaryMultiplier(daysSkipped);
        double bonus = bonusForProductsSold(productsSold);
        double salary = 1000 * multi + bonus;
        if (salary > 2000.00) {
            salary = 2000;
        }
        return salary;
    } 
}
