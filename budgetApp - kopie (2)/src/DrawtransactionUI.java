import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class DrawtransactionUI {
    Transactions transactions;
    private int maxPriceWidth = 0;

    public void DrawTransactions(Graphics g, Transactions transactions, JButton addButton) {
        setGraphicsFont(g);
        int x = 500 + 5;
        int y = 40;
        iterateTransactions(g, transactions, x, y);
        ButtonPositioner.positionButton(addButton, 500, 500, 200, 30);
    }

    private void setGraphicsFont(Graphics g) {
        Color textColor = Color.BLACK;
        Font font = new Font("Arial", Font.PLAIN, 14);
        g.setFont(font);
    }

    private void iterateTransactions(Graphics g, Transactions transactions, int x, int y) {
        Color textColor = Color.BLACK;
        for (Map.Entry<String, Double> transaction : transactions.getTranacties().entrySet()) {
            String transactionName = transaction.getKey();
            double price = transaction.getValue();
            drawTransaction(g, textColor, transactionName, price, x, y);
            y += 20;
        }
    }

    private void drawTransaction(Graphics g, Color textColor, String transactionName, double price, int x, int y) {
        DrawUIUtils.drawLabel(g, textColor, transactionName, x, y);
        updateMaxPriceWidth(price, g);
        DrawUIUtils.drawPrice(g, price, x, y, 210);
    }

    private void updateMaxPriceWidth(double price, Graphics g) {
        String priceString = String.format("%.2f", price);
        int priceWidth = g.getFontMetrics().stringWidth(priceString);
        if (priceWidth > maxPriceWidth) {
            maxPriceWidth = priceWidth;
        }
    }
}


