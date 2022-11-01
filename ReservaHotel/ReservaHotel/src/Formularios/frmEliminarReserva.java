package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.RESERVACION;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEliminarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField textNumeroReserva;
	private JTextField textCedulaCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEliminarReserva frame = new frmEliminarReserva();
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
	public frmEliminarReserva() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eliminar reserva");
		lblNewLabel.setBounds(161, 11, 80, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número de la reserva");
		lblNewLabel_1.setBounds(71, 56, 119, 14);
		contentPane.add(lblNewLabel_1);
		
		textNumeroReserva = new JTextField();
		textNumeroReserva.setBounds(71, 81, 96, 20);
		contentPane.add(textNumeroReserva);
		textNumeroReserva.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Cédula del cliente");
		lblNewLabel_2.setBounds(230, 56, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setBounds(224, 81, 96, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RESERVACION eliminarReservacion = new RESERVACION();
				eliminarReservacion.EliminarReserva(textNumeroReserva.getText(), textCedulaCliente.getText());
				
				// Navegamos al menu
				JOptionPane.showMessageDialog(null,"Reserva eliminada correctamente");
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
				
			}
		});
		btnNewButton.setBounds(41, 170, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Imprimir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RESERVACION imprimirReserva = new RESERVACION();
				imprimirReserva.ImprimirReserva(textNumeroReserva.getText(), textCedulaCliente.getText());
				
				// Navegamos al menu
				JOptionPane.showMessageDialog(null,"Impresión correctamente");
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(156, 170, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Navegamos al menu
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(276, 170, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
