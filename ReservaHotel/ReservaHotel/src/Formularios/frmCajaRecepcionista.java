package Formularios;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Clases.RESERVACION;

public class frmCajaRecepcionista extends JFrame {

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
					frmCajaRecepcionista frame = new frmCajaRecepcionista();
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
	public frmCajaRecepcionista() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmEliminarReserva.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Caja clientes");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(279, 11, 209, 47);
		contentPane.add(lblTitulo);
		
		JLabel lblNumeroDeReserva = new JLabel("Número de la reserva");
		lblNumeroDeReserva.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumeroDeReserva.setBounds(249, 216, 149, 14);
		contentPane.add(lblNumeroDeReserva);
		
		textNumeroReserva = new JTextField();
		textNumeroReserva.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroReserva.setBounds(249, 241, 116, 20);
		contentPane.add(textNumeroReserva);
		textNumeroReserva.setColumns(10);
		
		JLabel lblCedulaDelCliente = new JLabel("Cédula del cliente");
		lblCedulaDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaDelCliente.setBounds(408, 216, 125, 14);
		contentPane.add(lblCedulaDelCliente);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setBounds(408, 241, 102, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JButton btnPagar = new JButton("PAGAR");
		btnPagar.setBackground(new Color(255, 255, 255));
		btnPagar.setForeground(new Color(0, 0, 0));
		btnPagar.setFont(new Font("Arial", Font.BOLD, 12));
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RESERVACION eliminarReservacion = new RESERVACION();
				eliminarReservacion.PagarReserva(textNumeroReserva.getText(), textCedulaCliente.getText());
				
				// Navegamos al menu
				JOptionPane.showMessageDialog(null,"Reserva cancelada correctamente");
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
				
			}
		});
		btnPagar.setBounds(217, 447, 102, 23);
		contentPane.add(btnPagar);
		
		JButton btnImprimir = new JButton("IMPRIMIR");
		btnImprimir.setForeground(new Color(0, 0, 0));
		btnImprimir.setBackground(new Color(255, 255, 255));
		btnImprimir.setFont(new Font("Arial", Font.BOLD, 12));
		btnImprimir.addActionListener(new ActionListener() {
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
		btnImprimir.setBounds(345, 447, 110, 23);
		contentPane.add(btnImprimir);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBackground(new Color(255, 255, 255));
		btnCancelar.setForeground(new Color(0, 0, 0));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Navegamos al menu
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnCancelar.setBounds(478, 447, 102, 23);
		contentPane.add(btnCancelar);
	}

}
