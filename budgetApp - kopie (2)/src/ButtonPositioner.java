import javax.swing.*;
import java.awt.*;

public class ButtonPositioner {
    public static void positionButton(JButton button, int x, int y, int width, int height) {
        button.setBounds(x, y, width, height);
    }
}
