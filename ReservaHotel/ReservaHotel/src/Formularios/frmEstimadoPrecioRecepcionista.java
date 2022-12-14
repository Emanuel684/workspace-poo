package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.RESERVACION;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmEstimadoPrecioRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTextField textCalculado;
	private JTextField textCedulaCliente;
	private JTextField textNumeroNoches;
	private String selectTipoHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEstimadoPrecioRecepcionista frame = new frmEstimadoPrecioRecepcionista();
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
	public frmEstimadoPrecioRecepcionista() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmEstimadoPrecioRecepcionista.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 11, 126, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblCedulaCliente = new JLabel("C??dula cliente");
		lblCedulaCliente.setForeground(new Color(0, 0, 0));
		lblCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaCliente.setBounds(226, 134, 83, 14);
		contentPane.add(lblCedulaCliente);
		
		JButton btnPrecioEstimado = new JButton("PRECIO ESTIMADO");
		btnPrecioEstimado.setBackground(new Color(255, 255, 255));
		btnPrecioEstimado.setForeground(new Color(0, 0, 0));
		btnPrecioEstimado.setFont(new Font("Arial", Font.BOLD, 12));
		btnPrecioEstimado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RESERVACION estimarReservacion = new RESERVACION();
				String PrecioEstimado = estimarReservacion.EstimarReservacion(selectTipoHabitacion, textCedulaCliente.getText(), textNumeroNoches.getText());
				
				textCalculado.setText(PrecioEstimado);
				
			}
		});
		btnPrecioEstimado.setBounds(289, 462, 190, 23);
		contentPane.add(btnPrecioEstimado);
		
		JLabel lblPrecioEstimado = new JLabel("El precio estimado es de:");
		lblPrecioEstimado.setForeground(new Color(0, 0, 0));
		lblPrecioEstimado.setFont(new Font("Arial", Font.BOLD, 12));
		lblPrecioEstimado.setBounds(226, 314, 166, 14);
		contentPane.add(lblPrecioEstimado);
		
		textCalculado = new JTextField();
		textCalculado.setForeground(new Color(0, 0, 0));
		textCalculado.setFont(new Font("Arial", Font.BOLD, 12));
		textCalculado.setEnabled(false);
		textCalculado.setBounds(402, 311, 96, 20);
		contentPane.add(textCalculado);
		textCalculado.setColumns(10);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setForeground(new Color(0, 0, 0));
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setBounds(226, 159, 117, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JLabel lblTipoHabitacion = new JLabel("Tipo habitaci??n");
		lblTipoHabitacion.setForeground(new Color(0, 0, 0));
		lblTipoHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblTipoHabitacion.setBounds(226, 190, 105, 14);
		contentPane.add(lblTipoHabitacion);
		
		JLabel lblNumeroDeNoches = new JLabel("N??mero de noches");
		lblNumeroDeNoches.setForeground(new Color(0, 0, 0));
		lblNumeroDeNoches.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumeroDeNoches.setBounds(385, 134, 126, 14);
		contentPane.add(lblNumeroDeNoches);
		
		textNumeroNoches = new JTextField();
		textNumeroNoches.setForeground(new Color(0, 0, 0));
		textNumeroNoches.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroNoches.setText("");
		textNumeroNoches.setBounds(385, 159, 105, 20);
		contentPane.add(textNumeroNoches);
		textNumeroNoches.setColumns(10);
		
		JComboBox comboBoxTipoHabitacion = new JComboBox();
		comboBoxTipoHabitacion.setForeground(new Color(0, 0, 0));
		comboBoxTipoHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxTipoHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBoxTipoHabitacion.getSelectedItem().toString();
			}
		});
		comboBoxTipoHabitacion.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBoxTipoHabitacion.setBounds(226, 214, 166, 22);
		contentPane.add(comboBoxTipoHabitacion);
		
		JLabel lblEstimarPrecio = new JLabel("Estimar precio");
		lblEstimarPrecio.setFont(new Font("Arial", Font.BOLD, 24));
		lblEstimarPrecio.setBounds(289, 15, 209, 47);
		contentPane.add(lblEstimarPrecio);
	}
}
