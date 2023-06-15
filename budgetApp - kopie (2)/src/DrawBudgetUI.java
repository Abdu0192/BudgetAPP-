import javax.swing.*;
import java.awt.*;

public class DrawBudgetUI {
    Budget budget = new Budget();
        public void draw(Graphics g, JButton button,Budget budget) {
            g.setFont(new Font("Arial", Font.PLAIN, 14));
            drawLabel(g, Color.BLACK, "Budget:", 110, 55);
            drawPrice(g, budget.getBudget(), 280, 55, 110);
            drawLabel(g, Color.BLACK, "Remaining Budget:", 110, 115);
            drawPrice(g, budget.getCurrentBudget(), 280, 115, 110);
            ButtonPositioner.positionButton(button, 150, 150, 100, 30);

        }


        private void drawLabel(Graphics g, Color textColor, String label, int x, int y) {
            DrawUIUtils.drawLabel(g, textColor, label, x, y);
        }

        private void drawPrice(Graphics g, double price, int x, int y, int maxWidth) {
            DrawUIUtils.drawPrice(g, price, x, y, maxWidth);
        }
    }

