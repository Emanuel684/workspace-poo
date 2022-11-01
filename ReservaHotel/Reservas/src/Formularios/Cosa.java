package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Cosa extends JFrame {

	private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cosa frame = new Cosa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cosa() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Ingrese nombre de usuario:");
        lblNewLabel.setBounds(20, 21, 149, 14);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Ingrese clave:");
        lblNewLabel_1.setBounds(20, 61, 125, 14);
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(179, 18, 225, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(179, 58, 225, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JButton btnNewButton = new JButton("Aceptar");
        btnNewButton.setBounds(178, 89, 89, 23);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Cancelar");
        btnNewButton_1.setBounds(315, 89, 89, 23);
        contentPane.add(btnNewButton_1);
    }

}
