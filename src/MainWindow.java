import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Formatter;

public class MainWindow extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1;
    private JLabel label;
    private JLabel label_2;
    private JLabel label_4;
    private JFormattedTextField formattedTextField1;
    private JTextField textField2;
    private JRadioButton Radio1;
    private JRadioButton Radio2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JCheckBox check;
    private JTextField textField4;
    private JSlider slider1;
    private JList list1;
    private JSpinner spinner1;
    private JLabel label1;
    private JLabel label_1;
    private JLabel label_3;
    private JLabel label_5;
    private JLabel label2;
    private JLabel label_6;
    private JLabel label_7;
    private JLabel label_8;
    private JLabel label_9;
    private JLabel label10;

    public MainWindow(){
        super("Регистрационное коно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        this.button1.addActionListener(new MyButtonListener());
    }

    private String M_ZH(){
        String s;
        if(Radio1.isSelected() && !Radio2.isSelected()) s = "мужской";
        else if(!Radio1.isSelected() && Radio2.isSelected()) s = "женский";
        else s = "неопределен";
        return s;
    }
    private String Color(){
        String s;
        if(check.isSelected()) s = check.getText();
        else s = comboBox2.getSelectedItem().toString();
        return s;
    }
    private class MyButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Formatter formatter = new Formatter();
            formatter.format("ФИО: %s\nВозраст: %d\nПол: %s\nНомер телефона: %s\nПочта: %s\n\nКличка: %s\nВид: %s\n" +
                    "Рост: %d\nЦвет: %s\nЛюбимые игрушки: %s", textField1.getText(), spinner1.getValue(), M_ZH(),
                    formattedTextField1.getText(), textField2.getText(), textField3.getText(),
                    comboBox1.getSelectedItem(), slider1.getValue(), Color(), list1.getSelectedValue());
            JOptionPane.showMessageDialog(MainWindow.this, formatter);
            System.exit(0);
        }
    }
}
