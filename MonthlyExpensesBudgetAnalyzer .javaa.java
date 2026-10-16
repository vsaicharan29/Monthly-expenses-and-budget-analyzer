import java.util.Scanner;

public class MonthlyExpensesBudgetAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   MONTHLY EXPENSES BUDGET ANALYZER");
        System.out.println("======================================");

        // Input monthly income
        System.out.print("Enter your monthly income: Rs. ");
        double income = sc.nextDouble();

        // Input expenses
        System.out.println("\nEnter your monthly expenses:");

        System.out.print("House Rent: Rs. ");
        double rent = sc.nextDouble();

        System.out.print("Food: Rs. ");
        double food = sc.nextDouble();

        System.out.print("Transportation: Rs. ");
        double transport = sc.nextDouble();

        System.out.print("Electricity Bill: Rs. ");
        double electricity = sc.nextDouble();

        System.out.print("Internet / Mobile Bill: Rs. ");
        double internet = sc.nextDouble();

        System.out.print("Education: Rs. ");
        double education = sc.nextDouble();

        System.out.print("Entertainment: Rs. ");
        double entertainment = sc.nextDouble();

        System.out.print("Other Expenses: Rs. ");
        double others = sc.nextDouble();

        // Calculate total expenses
        double totalExpenses =
                rent + food + transport + electricity +
                internet + education + entertainment + others;

        // Calculate remaining balance
        double savings = income - totalExpenses;

        // Calculate expense percentage
        double expensePercentage = (totalExpenses / income) * 100;

        System.out.println("\n======================================");
        System.out.println("        MONTHLY BUDGET REPORT");
        System.out.println("======================================");

        System.out.printf("Monthly Income     : Rs. %.2f%n", income);
        System.out.printf("Total Expenses     : Rs. %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance  : Rs. %.2f%n", savings);
        System.out.printf("Expense Percentage : %.2f%%%n", expensePercentage);

        System.out.println("--------------------------------------");

        // Budget analysis
        if (totalExpenses > income) {

            System.out.println("Status: OVER BUDGET");

            double extra = totalExpenses - income;

            System.out.printf(
                    "You spent Rs. %.2f more than your income.%n",
                    extra
            );

            System.out.println("Suggestion: Reduce unnecessary expenses.");

        } else if (expensePercentage >= 80) {

            System.out.println("Status: HIGH EXPENSES");

            System.out.println(
                    "Suggestion: Try to increase your monthly savings."
            );

        } else if (expensePercentage >= 50) {

            System.out.println("Status: GOOD BUDGET");

            System.out.println(
                    "You are managing your expenses properly."
            );

        } else {

            System.out.println("Status: EXCELLENT BUDGET");

            System.out.println(
                    "You are saving a good amount of your income."
            );
        }

        System.out.println("======================================");

        sc.close();
    }
}