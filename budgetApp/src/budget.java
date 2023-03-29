import java.util.HashMap;

public class budget {
    private double budget;
    private HashMap<String,Double> transacties = new HashMap<>();

    public budget() {
        super();
        transacties = new transacties().getTranacties();
        budget = getBudget();
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double currentBudget() {
        double totalCost = 0.0;
        for (String transaction : transacties .keySet()) {
            totalCost += transacties .get(transaction);
        }
        double remainingBudget = Main.budgetchache - totalCost;
        return remainingBudget;
    }
}