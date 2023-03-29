import java.util.HashMap;
import javax.swing.*;

public class Main {
    static budget Budget = new budget();
    static transacties Transactions = new transacties();
    public static double budgetchache;

    public static void main(String[] args) {
        // Maak een JFrame-venster met de titel "Budget Input"
        JFrame frame = new JFrame("BudgetApp");
        // Sluit het programma af wanneer het venster wordt gesloten
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// datum
        date d = new datum("29-3-2023");
        String datum = JOptionPane.showInputDialog(frame, "Voer de de datum in");
        d.setDatum(datum);
        // Vraag de gebruiker om het budget in te voeren met behulp van JOptionPane.showInputDialog()
      double budget = Double.parseDouble(JOptionPane.showInputDialog(frame, "Voer uw budget in:"));
        // Sla het ingevoerde budget op in de "Budget" variabele met behulp van de setBudget() methode van de "budget" klasse
        Budget.setBudget(budget);
       budgetchache= budget;
        // Haal de huidige transacties op met behulp van de getTransactions() methode van de "transacties" klasse
        HashMap<String, Double> transactions = Transactions.getTranacties();

        // Maak een budgetRapport-object
        budgetRapport rapport = new budgetRapport();

        // Haal de JTextArea-component met de transacties op uit het budgetRapport-object
        JTextArea textArea = rapport.getTransactionsTextArea(transactions);

        // Maak een JScrollPane-component om de JTextArea-component in te plaatsen
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Voeg de JScrollPane-component toe aan het venster
        frame.getContentPane().add(scrollPane);

        // Vraag de gebruiker om een nieuwe transactie toe te voegen
        String transactionName = JOptionPane.showInputDialog(frame, "Voer de naam van de transactie in:");
        double transactionAmount = Double.parseDouble(JOptionPane.showInputDialog(frame, "Voer het transactiebedrag in:"));

        // Voeg de nieuwe transactie toe met behulp van de setTransaction() methode van de "transacties" klasse
        Transactions.SetTransacties(transactionName, transactionAmount);

        // Haal de bijgewerkte transacties op
        transactions = Transactions.getTranacties();

        // Haal de bijgewerkte JTextArea-component met de transacties op uit het budgetRapport-object
        JTextArea updatedTextArea = rapport.getTransactionsTextArea(transactions);

        // Maak een nieuwe JScrollPane-component om de bijgewerkte JTextArea-component in te plaatsen
        JScrollPane updatedScrollPane = new JScrollPane(updatedTextArea);

        // Vervang de JScrollPane-component in het venster met de nieuwe JScrollPane-component om de bijgewerkte transacties weer te geven
        frame.getContentPane().remove(scrollPane);
        frame.getContentPane().add(updatedScrollPane);

        // Maak het venster zichtbaar
        frame.pack();
        frame.setVisible(true);
    }


}