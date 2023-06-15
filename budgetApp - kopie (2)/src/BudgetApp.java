import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BudgetApp extends JPanel {

    private Transactions transactions;
    private  Budget budget = new Budget();
    private DrawtransactionUI  ui;
    private OverBudgetWaarschuwing waarschuwing;
    private DrawBudgetUI budgetui;

    private JButton addButton = new JButton("Add Transaction");
    private JButton BudgetButton = new JButton("Add Budget");

    public BudgetApp() {
        this.transactions = new Transactions(); this.ui = new DrawtransactionUI(); this.budgetui = new DrawBudgetUI(); this.waarschuwing = new OverBudgetWaarschuwing();
        addButton.addActionListener(new AddTransactionListener(transactions, budget));
        BudgetButton.addActionListener(new AddBudgetListener(transactions, budget));
        add(addButton);add(BudgetButton);
        repaint();
    }



    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ui.DrawTransactions(g,transactions,addButton); budgetui.draw(g,BudgetButton,budget);
        for(int i =0; i<1;i++){ waarschuwing.CheckBudgetisOnder0(budget.getCurrentBudget());}
        repaint();

    }
}
