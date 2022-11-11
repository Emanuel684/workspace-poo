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
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

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
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmEliminarCliente.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setBounds(331, 242, 122, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);

		JLabel lblCedulaCliente = new JLabel("Cedula cliente");
		lblCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaCliente.setBounds(344, 217, 109, 14);
		contentPane.add(lblCedulaCliente);

		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);

				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnRegresar.setBounds(10, 11, 89, 23);
		contentPane.add(btnRegresar);

		JButton btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setBackground(new Color(255, 255, 255));
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setFont(new Font("Arial", Font.BOLD, 12));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Para eliminar un cliente
				CLIENTE eliminarCliente = new CLIENTE();
				eliminarCliente.EliminarCliente(textCedulaCliente.getText());

				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);

				// Cerramos la ventana actual
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
			}
		});
		btnEliminar.setBounds(331, 457, 122, 23);
		contentPane.add(btnEliminar);
		
		JLabel lblEliminarCliente = new JLabel("Eliminar cliente");
		lblEliminarCliente.setFont(new Font("Arial", Font.BOLD, 24));
		lblEliminarCliente.setBounds(295, 11, 199, 38);
		contentPane.add(lblEliminarCliente);
	}
}
