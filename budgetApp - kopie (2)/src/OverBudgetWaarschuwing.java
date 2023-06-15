import javax.swing.JOptionPane;

public class OverBudgetWaarschuwing{

    public void CheckBudgetisOnder0(double currentBudget) {
        if (currentBudget < 0) {
            JOptionPane.showMessageDialog(null, "Waarschuwing je bent over je budget!");
        }
    }

}
