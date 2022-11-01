package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.CLIENTE;
import Clases.HABITUAL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmDescuentoClientesAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;
	private String selectDescuentoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDescuentoClientesAdministrador frame = new frmDescuentoClientesAdministrador();
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
	public frmDescuentoClientesAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Descuento clientes");
		lblNewLabel.setBounds(162, 11, 102, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula del\r\n cliente");
		lblNewLabel_1.setBounds(69, 51, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setBounds(69, 76, 108, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Descuento");
		lblNewLabel_2.setBounds(212, 51, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Aplicar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HABITUAL descuentoCliente = new HABITUAL();
				descuentoCliente.DescuentoCliente(textCedulaCliente.getText(), selectDescuentoCliente);
				
				JOptionPane.showMessageDialog(null,"Descuento aplicado correctamente");
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(95, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(216, 199, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDescuentoCliente = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%"}));
		comboBox.setToolTipText("Porcentaje");
		comboBox.setBounds(212, 75, 102, 22);
		contentPane.add(comboBox);
	}
}
