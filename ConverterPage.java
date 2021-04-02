import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterPage {
    //components and fields
    private JPanel mainPanel;
    private JPanel displayPanel;
    private JLabel toLabel;
    private JTextField fromTextField;
    private JTextField toTextField;
    private JComboBox fromComboBox;
    private JLabel resultLabel;
    private JButton convertButton;
    private JButton clearButton;
    private JPanel fromPanel;
    private JPanel toPanel;
    private JLabel displayLabel;
    private JLabel miniLabel;
    private JComboBox toComboBox;
    private DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    private DefaultComboBoxModel<String> model2 = new DefaultComboBoxModel<>();

    //Constructor
    public ConverterPage() {
        JFrame homeFrame = new JFrame("Currency Converter");
        homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeFrame.setSize(600, 500);
        homeFrame.setVisible(true);
        homeFrame.add(mainPanel);
        Calculations c = new Calculations();

        //Add currencies
        model.addElement("US Dollars");
        model.addElement("Yen");
        model.addElement("Euros");
        model.addElement("Pesos");
        model.addElement("Pounds");

        model2.addElement("US Dollars");
        model2.addElement("Yen");
        model2.addElement("Euros");
        model2.addElement("Pesos");
        model2.addElement("Pounds");

        //set comboboxes to models
        fromComboBox.setModel(model);
        fromComboBox.setMaximumRowCount(5);

        toComboBox.setModel(model2);
        toComboBox.setMaximumRowCount(5);

        //Action listener to get info from combo box
        fromComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == fromComboBox) {
                   String type = (String) fromComboBox.getSelectedItem();
                }
            }
        });

        //Action listener to get info from combo box
        toComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == toComboBox) {
                  String yee  = (String) toComboBox.getSelectedItem();
                }
            }
        });

        //Action listener to reset values in textboxes and labels
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fromTextField.setText("0");
                resultLabel.setText("0");
                miniLabel.setText("Perform a conversion:");
                displayLabel.setText("Convert");
            }
        });

        //Action listener to perform the conversion
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double end;
                String help;
                String bihh;

                //top label display
                String topLabelInfo = fromTextField.getText();
                bihh = (String) fromComboBox.getSelectedItem();
                miniLabel.setText(topLabelInfo + " " +  bihh + " is equivalent to:" );

               //bottom label display
               String bih = (String) toComboBox.getSelectedItem();

                if (bihh.equalsIgnoreCase("US Dollars")) {

                    double result = Double.parseDouble(fromTextField.getText());
                    end = c.doConversionUS(bih, result);
                    help = result + " USD is " + end  + " " + bih;
                    resultLabel.setText(help);
                    displayLabel.setText(end + " " + bih);
                }
                else if (bih.equalsIgnoreCase("Yen")) {
                    double result2 = Double.parseDouble(fromTextField.getText());
                    end = c.doConversionYen(bih, result2);
                    help = result2 + " Yen is " + end  + " " + bih;
                    resultLabel.setText(help);
                    displayLabel.setText(end + " " + bih);
                }
                else if (bih.equalsIgnoreCase("Euros")) {
                   double  result3 = Double.parseDouble(fromTextField.getText());
                    end = c.doConversionUS(bih, result3);
                     help = result3 + " Euros is " + end +" " + bih;
                    resultLabel.setText(help);
                    displayLabel.setText(end + " " + bih);
                }
                else if (bih.equalsIgnoreCase("Pesos")) {
                   double result4 = Double.parseDouble(fromTextField.getText());
                    end = c.doConversionPeso(bih, result4);
                    help = result4 + " Pesos is " + end +" " + bih;
                    resultLabel.setText(help);
                    displayLabel.setText(end + " " + bih);
                }
                else if  (bih.equalsIgnoreCase("Pounds")) {
                   double result5 = Double.parseDouble(fromTextField.getText());
                    end = c.doConversionUS(bih, result5);
                    help = result5 + " Pounds is " + end +" " + bih;
                    resultLabel.setText(help);
                    displayLabel.setText(end + " " + bih);
                }
            }
        });
    }
}
