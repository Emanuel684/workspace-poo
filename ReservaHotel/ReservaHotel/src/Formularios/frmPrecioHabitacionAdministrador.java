package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.DOBLE;
import Clases.MATRIMONIAL;
import Clases.SIMPLE;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmPrecioHabitacionAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecioActual;
	private JTextField textNuevoPrecio;
	private String selectTipoHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrecioHabitacionAdministrador frame = new frmPrecioHabitacionAdministrador();
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
	public frmPrecioHabitacionAdministrador() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmPrecioHabitacionAdministrador.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.setForeground(new Color(0, 0, 0));
		btnRegresar.setBackground(new Color(255, 255, 255));
		btnRegresar.setFont(new Font("Arial", Font.BOLD, 11));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnRegresar.setBounds(436, 452, 119, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblTipoDeHabitacion = new JLabel("Tipo de habitación");
		lblTipoDeHabitacion.setForeground(new Color(0, 0, 0));
		lblTipoDeHabitacion.setFont(new Font("Arial", Font.BOLD, 11));
		lblTipoDeHabitacion.setBounds(225, 192, 120, 14);
		contentPane.add(lblTipoDeHabitacion);
		
		JLabel lblTitulo = new JLabel("Precio habitacion");
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(263, 11, 233, 55);
		contentPane.add(lblTitulo);
		
		JButton btnCambiarPrecio = new JButton("CAMBIAR PRECIO");
		btnCambiarPrecio.setForeground(new Color(0, 0, 0));
		btnCambiarPrecio.setBackground(new Color(255, 255, 255));
		btnCambiarPrecio.setFont(new Font("Arial", Font.BOLD, 11));
		btnCambiarPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(selectTipoHabitacion == "Habitaciones sencilla") {
					SIMPLE habitacionSimple = new SIMPLE();
					habitacionSimple.CambiarPrecio(textNuevoPrecio.getText());
					JOptionPane.showMessageDialog(null,"Precio de la habitacion cambiado correctamente");
					
				} else if(selectTipoHabitacion == "Habitaciones doble") {
					DOBLE habitacionDoble = new DOBLE();
					habitacionDoble.CambiarPrecio(textNuevoPrecio.getText());
					JOptionPane.showMessageDialog(null,"Precio de la habitacion cambiado correctamente");
					
				} else if(selectTipoHabitacion == "Habitaciones matrimonial") {
					MATRIMONIAL habitacionMatrimonial = new MATRIMONIAL();
					habitacionMatrimonial.CambiarPrecio(textNuevoPrecio.getText());
					JOptionPane.showMessageDialog(null,"Precio de la habitacion cambiado correctamente");
				}
			}
		});
		btnCambiarPrecio.setBounds(267, 452, 133, 23);
		contentPane.add(btnCambiarPrecio);
		
		JComboBox comboBoxTipoHabitacion = new JComboBox();
		comboBoxTipoHabitacion.setForeground(new Color(0, 0, 0));
		comboBoxTipoHabitacion.setFont(new Font("Arial", Font.BOLD, 11));
		comboBoxTipoHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBoxTipoHabitacion.getSelectedItem().toString();

				if(selectTipoHabitacion == "Habitaciones sencilla") {
					SIMPLE habitacionSimple = new SIMPLE();
					textPrecioActual.setText(habitacionSimple.MostrarPrecioSimple());
				} else if(selectTipoHabitacion == "Habitaciones doble") {
					DOBLE habitacionDoble = new DOBLE();
					textPrecioActual.setText(habitacionDoble.MostrarPrecioDoble());
				} else if(selectTipoHabitacion == "Habitaciones matrimonial") {
					MATRIMONIAL habitacionMatrimonial = new MATRIMONIAL();
					textPrecioActual.setText(habitacionMatrimonial.MostrarPrecioMatrimonial());
				}
				
			}
		});
		comboBoxTipoHabitacion.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBoxTipoHabitacion.setBounds(225, 210, 164, 22);
		contentPane.add(comboBoxTipoHabitacion);
		
		JLabel lblPrecioActual = new JLabel("Precio actual");
		lblPrecioActual.setForeground(new Color(0, 0, 0));
		lblPrecioActual.setFont(new Font("Arial", Font.BOLD, 11));
		lblPrecioActual.setBounds(435, 192, 120, 14);
		contentPane.add(lblPrecioActual);
		
		textPrecioActual = new JTextField();
		textPrecioActual.setForeground(new Color(0, 0, 0));
		textPrecioActual.setFont(new Font("Arial", Font.BOLD, 11));
		textPrecioActual.setEnabled(false);
		textPrecioActual.setBounds(435, 211, 96, 20);
		contentPane.add(textPrecioActual);
		textPrecioActual.setColumns(10);
		
		JLabel lblNuevoPrecio = new JLabel("Nuevo precio");
		lblNuevoPrecio.setForeground(new Color(0, 0, 0));
		lblNuevoPrecio.setFont(new Font("Arial", Font.BOLD, 11));
		lblNuevoPrecio.setBounds(435, 254, 120, 14);
		contentPane.add(lblNuevoPrecio);
		
		textNuevoPrecio = new JTextField();
		textNuevoPrecio.setForeground(new Color(0, 0, 0));
		textNuevoPrecio.setFont(new Font("Arial", Font.BOLD, 11));
		textNuevoPrecio.setColumns(10);
		textNuevoPrecio.setBounds(435, 273, 96, 20);
		contentPane.add(textNuevoPrecio);
	}

}
