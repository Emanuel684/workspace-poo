package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.RESERVACION;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmIngresarActualizarReserva extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;
	private JTextField textNumeroHabitacion;
	private JTextField textYear;
	private JTextField textNumeroDias;
	private String selectDia = "";
	private String selectMes = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmIngresarActualizarReserva frame = new frmIngresarActualizarReserva(false);
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
	public frmIngresarActualizarReserva(boolean actualizar_view) {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmIngresarActualizarReserva.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnCancelar.setBounds(223, 207, 89, 23);
		contentPane.add(btnCancelar);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setColumns(10);
		textCedulaCliente.setBounds(171, 61, 108, 20);
		contentPane.add(textCedulaCliente);
		
		textNumeroHabitacion = new JTextField();
		textNumeroHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroHabitacion.setColumns(10);
		textNumeroHabitacion.setBounds(20, 61, 108, 20);
		contentPane.add(textNumeroHabitacion);
		
		JLabel lblNumeroHabitacion = new JLabel("Número habitacion");
		lblNumeroHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumeroHabitacion.setBounds(20, 36, 141, 14);
		contentPane.add(lblNumeroHabitacion);
		
		JLabel lblCedulaDelCliente = new JLabel("Cédula del cliente");
		lblCedulaDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaDelCliente.setBounds(171, 36, 141, 14);
		contentPane.add(lblCedulaDelCliente);
		
		JLabel lblCrearReserva = new JLabel("Crear reserva");
		lblCrearReserva.setFont(new Font("Arial", Font.BOLD, 24));
		lblCrearReserva.setBounds(341, 11, 141, 14);
		contentPane.add(lblCrearReserva);
		
		if(actualizar_view) {
			JButton btnNewButton_2 = new JButton("Actualizar");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Actualizamos la reserva
					RESERVACION actualizarReservacion = new RESERVACION();
					actualizarReservacion.ActualizarReservacion(selectDia + "/" + selectMes + "/" + textYear.getText(), textNumeroDias.getText(), textCedulaCliente.getText(), textNumeroHabitacion.getText());
					
					// Navegamos al menu
					JOptionPane.showMessageDialog(null,"Reserva actualizada correctamente.");
					frmMenu frmMenu = new frmMenu();
					frmMenu.setVisible(true);
					
					// Cerramos la ventana actual
					setVisible(false);
				}
			});
			btnNewButton_2.setBounds(97, 207, 89, 23);
			contentPane.add(btnNewButton_2);
		} else {
			JButton btnNewButton_1_1 = new JButton("Crear");
			btnNewButton_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Creamos la nueva reserva
					RESERVACION nuevaReserva = new RESERVACION();
					nuevaReserva.IngresarReservacion(selectDia + "/" + selectMes + "/" + textYear.getText(), textNumeroDias.getText(), textCedulaCliente.getText(), textNumeroHabitacion.getText());
					
					// Navegamos al menu
					JOptionPane.showMessageDialog(null,"Reserva creada correctamente.");
					frmMenu frmMenu = new frmMenu();
					frmMenu.setVisible(true);
					
					// Cerramos la ventana actual
					setVisible(false);
				}
			});
			btnNewButton_1_1.setBounds(97, 207, 89, 23);
			contentPane.add(btnNewButton_1_1);
		}
		
		
		JComboBox comboBoxDias = new JComboBox();
		comboBoxDias.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxDias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDia = comboBoxDias.getSelectedItem().toString();
			}
		});
		comboBoxDias.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDias.setBounds(20, 153, 77, 22);
		contentPane.add(comboBoxDias);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Arial", Font.BOLD, 12));
		lblDia.setBounds(20, 128, 49, 14);
		contentPane.add(lblDia);
		
		JLabel lblFechaDeComienzo = new JLabel("Fecha de comienzo");
		lblFechaDeComienzo.setFont(new Font("Arial", Font.BOLD, 12));
		lblFechaDeComienzo.setBounds(20, 103, 113, 14);
		contentPane.add(lblFechaDeComienzo);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMes = comboBoxMes.getSelectedItem().toString();
			}
		});
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMes.setBounds(125, 152, 84, 22);
		contentPane.add(comboBoxMes);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Arial", Font.BOLD, 12));
		lblMes.setBounds(136, 128, 49, 14);
		contentPane.add(lblMes);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Arial", Font.BOLD, 12));
		textYear.setColumns(10);
		textYear.setBounds(232, 153, 96, 20);
		contentPane.add(textYear);
		
		JLabel lblYear = new JLabel("Año");
		lblYear.setFont(new Font("Arial", Font.BOLD, 12));
		lblYear.setBounds(227, 128, 49, 14);
		contentPane.add(lblYear);
		
		JLabel lblNumeroDeDias = new JLabel("Número de días");
		lblNumeroDeDias.setFont(new Font("Arial", Font.BOLD, 12));
		lblNumeroDeDias.setBounds(325, 36, 102, 14);
		contentPane.add(lblNumeroDeDias);
		
		textNumeroDias = new JTextField();
		textNumeroDias.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroDias.setColumns(10);
		textNumeroDias.setBounds(325, 61, 96, 20);
		contentPane.add(textNumeroDias);
		
		
	}
}
