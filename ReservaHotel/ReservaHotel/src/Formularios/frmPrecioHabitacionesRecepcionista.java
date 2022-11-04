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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class frmPrecioHabitacionesRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTextField textPrecioActualHabitacion;
	private String selectTipoHabitacion = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrecioHabitacionesRecepcionista frame = new frmPrecioHabitacionesRecepcionista();
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
	public frmPrecioHabitacionesRecepcionista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(215, 206, 89, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBox.setBounds(39, 104, 164, 22);
		contentPane.add(comboBox);
		
		JLabel lblHabitacionesSencillas = new JLabel("Tipo de habitación");
		lblHabitacionesSencillas.setFont(new Font("Arial", Font.BOLD, 12));
		lblHabitacionesSencillas.setBounds(39, 86, 120, 14);
		contentPane.add(lblHabitacionesSencillas);
		
		textPrecioActualHabitacion = new JTextField();
		textPrecioActualHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		textPrecioActualHabitacion.setEnabled(false);
		textPrecioActualHabitacion.setColumns(10);
		textPrecioActualHabitacion.setBounds(249, 105, 96, 20);
		contentPane.add(textPrecioActualHabitacion);
		
		JLabel lblPrecioActual = new JLabel("Precio actual");
		lblPrecioActual.setFont(new Font("Arial", Font.BOLD, 12));
		lblPrecioActual.setBounds(249, 86, 120, 14);
		contentPane.add(lblPrecioActual);
		
		JLabel lblNewLabel = new JLabel("Precio habitacion");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(169, 27, 112, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnConsultarPrecio = new JButton("Consultar");
		btnConsultarPrecio.setFont(new Font("Arial", Font.BOLD, 12));
		btnConsultarPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectTipoHabitacion == "Habitaciones sencilla") {
					SIMPLE habitacionSimple = new SIMPLE();
					textPrecioActualHabitacion.setText(habitacionSimple.MostrarPrecioSimple());
					
				} else if (selectTipoHabitacion == "Habitaciones doble") {
					DOBLE habitacionDoble = new DOBLE();
					textPrecioActualHabitacion.setText(habitacionDoble.MostrarPrecioDoble());
					
				} else if (selectTipoHabitacion == "Habitaciones matrimonial") {
					MATRIMONIAL habitacionMatrimonial = new MATRIMONIAL();
					textPrecioActualHabitacion.setText(habitacionMatrimonial.MostrarPrecioMatrimonial());
				} else {
					textPrecioActualHabitacion.setText(selectTipoHabitacion);
				}
				
			}
		});
		btnConsultarPrecio.setBounds(109, 206, 96, 23);
		contentPane.add(btnConsultarPrecio);
	}
}
