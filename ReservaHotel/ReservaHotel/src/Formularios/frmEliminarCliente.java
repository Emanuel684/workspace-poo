package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Clases.CLIENTE;

public class frmEliminarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEliminarCliente frame = new frmEliminarCliente();
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
	public frmEliminarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setBounds(164, 113, 109, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cedula cliente");
		lblNewLabel.setBounds(184, 88, 69, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Para eliminar un cliente
				CLIENTE eliminarCliente = new CLIENTE();
				eliminarCliente.EliminarCliente(textCedulaCliente.getText());
				
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
				JOptionPane.showMessageDialog(null,"Cliente eliminado correctamente");
			}
		});
		btnNewButton_1.setBounds(176, 172, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}