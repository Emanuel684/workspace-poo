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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(261, 214, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblHabitacionesSencillas = new JLabel("Tipo de habitación");
		lblHabitacionesSencillas.setFont(new Font("Arial", Font.BOLD, 11));
		lblHabitacionesSencillas.setBounds(36, 51, 120, 14);
		contentPane.add(lblHabitacionesSencillas);
		
		JLabel lblNewLabel = new JLabel("Precio habitacion");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel.setBounds(167, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Cambir precio");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
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
		btnNewButton_1.setBounds(92, 214, 133, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 11));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBox.getSelectedItem().toString();

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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBox.setBounds(36, 69, 164, 22);
		contentPane.add(comboBox);
		
		JLabel lblPrecioActual = new JLabel("Precio actual");
		lblPrecioActual.setFont(new Font("Arial", Font.BOLD, 11));
		lblPrecioActual.setBounds(246, 51, 120, 14);
		contentPane.add(lblPrecioActual);
		
		textPrecioActual = new JTextField();
		textPrecioActual.setFont(new Font("Arial", Font.BOLD, 11));
		textPrecioActual.setEnabled(false);
		textPrecioActual.setBounds(246, 70, 96, 20);
		contentPane.add(textPrecioActual);
		textPrecioActual.setColumns(10);
		
		JLabel lblNuevoPrecio = new JLabel("Nuevo precio");
		lblNuevoPrecio.setFont(new Font("Arial", Font.BOLD, 11));
		lblNuevoPrecio.setBounds(246, 113, 120, 14);
		contentPane.add(lblNuevoPrecio);
		
		textNuevoPrecio = new JTextField();
		textNuevoPrecio.setFont(new Font("Arial", Font.BOLD, 11));
		textNuevoPrecio.setColumns(10);
		textNuevoPrecio.setBounds(246, 132, 96, 20);
		contentPane.add(textNuevoPrecio);
	}

}
