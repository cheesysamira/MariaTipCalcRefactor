import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the tip calculator!\n");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        TipCalculator bill = new TipCalculator(people,tip);
        bill.addMeal(0.0);

        System.out.println("--------------------------------");
        System.out.println("Total Bill Before Tip: $" + String.format("%.2f", bill.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: " + bill.getTipPercentage() + "%");
        System.out.println("Total Tip: $" + String.format("%.2f", bill.tipAmount()));
        System.out.println("Total Bill With Tip: $" + String.format("%.2f", bill.totalBill()));
        System.out.println("Per Person Cost Before Tip: $" + String.format("%.2f", bill.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: $" + String.format("%.2f", bill.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: $" + String.format("%.2f", bill.perPersonTotalCost()));

    }
}