import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTransactionListener implements ActionListener {
    private Transactions transactions;
    private Budget budget;

    public AddTransactionListener (Transactions transactions, Budget budget) {
        this.transactions = transactions;
        this.budget = budget;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String transactionName = JOptionPane.showInputDialog(null, "Enter the transaction name:");
        double transactionAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the transaction amount:"));
        transactions.SetTransacties(transactionName, transactionAmount);
        budget.setCurrentBudget(budget.getBudget() - transactions.getTotalCost());


    }

}