import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGUI extends JFrame implements ActionListener {
    private JTextField display;
    private double num1, num2, resultado;
    private String operador;

    public CalculadoraGUI() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4));

        String[] botoes = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "×",
            "C", "0", "=", "÷"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 18));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.matches("[0-9]")) {
            display.setText(display.getText() + comando);
        } else if (comando.matches("[+\\-×÷]")) {
            num1 = Double.parseDouble(display.getText());
            operador = comando;
            display.setText("");
        } else if (comando.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                switch (operador) {
                    case "+": resultado = num1 + num2; break;
                    case "-": resultado = num1 - num2; break;
                    case "×": resultado = num1 * num2; break;
                    case "÷":
                        if (num2 == 0) throw new ArithmeticException("Divisão por zero");
                        resultado = num1 / num2;
                        break;
                }
                display.setText(String.valueOf(resultado));
            } catch (ArithmeticException ex) {
                display.setText("Erro: " + ex.getMessage());
            } catch (NumberFormatException ex) {
                display.setText("Entrada inválida");
            }
        } else if (comando.equals("C")) {
            display.setText("");
            num1 = num2 = resultado = 0;
            operador = null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculadoraGUI().setVisible(true);
        });
    }
}
