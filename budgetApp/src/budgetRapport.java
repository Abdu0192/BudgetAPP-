import javax.swing.*;
import java.util.HashMap;

class budgetRapport extends budget  {

    public JTextArea getTransactionsTextArea(HashMap<String, Double> transactions) {
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        textArea.append("Huidige transacties:\n");
        for (String transaction : transactions.keySet()) {
            textArea.append(transaction + ": " + transactions.get(transaction) + "\n");
        }
        textArea.append("................................ ");

        textArea.append("\noverige  budget: " + currentBudget());
        return textArea;
    }
    @Override
    public void setBudget(double budget) {
       System.out.println("NULL");
    }
}