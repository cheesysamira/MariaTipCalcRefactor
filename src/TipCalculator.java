import java.util.Scanner;
public class TipCalculator {
    Scanner scan = new Scanner(System.in);
    private int people;
    private int tip;
    private double totalBillBeforeTip = 0.0;

    private double cost;
    public TipCalculator(int numPeople, int tipPercentage) {
        people = numPeople;
        tip = tipPercentage;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tip;
    }

    public void addMeal(double cost) {
        while (cost != - 1) {
            this.cost = cost;
            totalBillBeforeTip += cost;
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            cost = scan.nextDouble();
        }
    }

    public double tipAmount() {
        return ((tip/100.0)*totalBillBeforeTip);
    }

    public double totalBill() {
        return tipAmount()+totalBillBeforeTip;
    }

    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip/people;
    }

    public double perPersonTipAmount() {
        return tipAmount()/people;
    }

    public double perPersonTotalCost() {
        return totalBill()/people;
    }

}