package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.HABITUAL;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmDescuentoClientesRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;
	private JTextField textDescuentoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDescuentoClientesRecepcionista frame = new frmDescuentoClientesRecepcionista();
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
	public frmDescuentoClientesRecepcionista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(239, 211, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Consultar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HABITUAL descuentoCliente = new HABITUAL();
				String descuento = descuentoCliente.DescuentoCliente(textCedulaCliente.getText());
				
				if(descuento != "0%") {
					JOptionPane.showMessageDialog(null,"Se encontro el cliente");
					textDescuentoCliente.setText(descuento);
				} else {
					JOptionPane.showMessageDialog(null,"No se encuentra el cliente");
				}
				
				/*
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
				*/
			}
		});
		btnNewButton_1.setBounds(121, 211, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Descuento clientes");
		lblNewLabel.setBounds(169, 11, 113, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cedula cliente");
		lblNewLabel_1.setBounds(180, 50, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setBounds(169, 84, 113, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		textDescuentoCliente = new JTextField();
		textDescuentoCliente.setEnabled(false);
		textDescuentoCliente.setColumns(10);
		textDescuentoCliente.setBounds(169, 151, 113, 20);
		contentPane.add(textDescuentoCliente);
		
		JLabel lblNewLabel_1_1 = new JLabel("Descuento");
		lblNewLabel_1_1.setBounds(193, 126, 74, 14);
		contentPane.add(lblNewLabel_1_1);
	}

}
