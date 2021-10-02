import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegraDeTresGUI extends JFrame {
    private JPanel mainPanel;
    private JTextField num1;
    private JTextField num2;
    private JTextField num3;
    private JButton calcular;
    private JLabel resultado;

    public RegraDeTresGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pega os numeros
                //realiza os calculos
                //dá o valor final
                int resf = (int)((Double.parseDouble(num2.getText()))*
                        (int)(Double.parseDouble(num3.getText())) /  (int)(Double.parseDouble(num1.getText())));
                resultado.setText(resf + " é seu resultado.");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new RegraDeTresGUI("Regra de Tres");
        frame.setVisible(true);
    }
}
