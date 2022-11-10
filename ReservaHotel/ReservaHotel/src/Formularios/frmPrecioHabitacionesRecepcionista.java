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
import java.awt.Toolkit;
import java.awt.Color;

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
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmPrecioHabitacionesRecepcionista.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btnRegresar.setBounds(388, 461, 89, 23);
		contentPane.add(btnRegresar);
		
		JComboBox comboBoxTipoHabitacion = new JComboBox();
		comboBoxTipoHabitacion.setBackground(new Color(255, 255, 255));
		comboBoxTipoHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxTipoHabitacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBoxTipoHabitacion.getSelectedItem().toString();
			}
		});
		comboBoxTipoHabitacion.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBoxTipoHabitacion.setBounds(215, 229, 164, 22);
		contentPane.add(comboBoxTipoHabitacion);
		
		JLabel lblTipoDeHabitacion = new JLabel("Tipo de habitación");
		lblTipoDeHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblTipoDeHabitacion.setBounds(215, 211, 120, 14);
		contentPane.add(lblTipoDeHabitacion);
		
		textPrecioActualHabitacion = new JTextField();
		textPrecioActualHabitacion.setToolTipText("Precio actual");
		textPrecioActualHabitacion.setEnabled(false);
		textPrecioActualHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		textPrecioActualHabitacion.setColumns(10);
		textPrecioActualHabitacion.setBounds(425, 230, 96, 20);
		contentPane.add(textPrecioActualHabitacion);
		
		JLabel lblPrecioActual = new JLabel("Precio actual");
		lblPrecioActual.setFont(new Font("Arial", Font.BOLD, 12));
		lblPrecioActual.setBounds(425, 211, 120, 14);
		contentPane.add(lblPrecioActual);
		
		JLabel lblTitulo = new JLabel("Precio habitacion");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(259, 11, 218, 38);
		contentPane.add(lblTitulo);
		
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
		btnConsultarPrecio.setBounds(282, 461, 96, 23);
		contentPane.add(btnConsultarPrecio);
	}
}
