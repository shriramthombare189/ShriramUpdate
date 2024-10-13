import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySwingApp {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Sample GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Create components
        JLabel label1 = new JLabel("Enter Name:");
        JTextField textField1 = new JTextField(15);
        
        JLabel label2 = new JLabel("Enter Age:");
        JTextField textField2 = new JTextField(15);
        
        JButton submitButton = new JButton("Submit");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        
        // Set GridBagLayout constraints and add components
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(label1, gbc);

        gbc.gridx = 1;
        frame.add(textField1, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(label2, gbc);

        gbc.gridx = 1;
        frame.add(textField2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(submitButton, gbc);

        gbc.gridy = 3;
        frame.add(new JScrollPane(resultArea), gbc);

        // Add action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String age = textField2.getText();
                resultArea.setText("Name: " + name + "\nAge: " + age);
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}
