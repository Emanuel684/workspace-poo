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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(223, 207, 89, 23);
		contentPane.add(btnNewButton);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setColumns(10);
		textCedulaCliente.setBounds(155, 61, 108, 20);
		contentPane.add(textCedulaCliente);
		
		textNumeroHabitacion = new JTextField();
		textNumeroHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroHabitacion.setColumns(10);
		textNumeroHabitacion.setBounds(20, 61, 108, 20);
		contentPane.add(textNumeroHabitacion);
		
		JLabel lblNewLabel_1 = new JLabel("Número habitacion");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 36, 108, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cédula del cliente");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(155, 36, 102, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblCrearReserva = new JLabel("Crear reserva");
		lblCrearReserva.setFont(new Font("Arial", Font.BOLD, 12));
		lblCrearReserva.setBounds(178, 11, 141, 14);
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
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDia = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(20, 153, 77, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4.setBounds(20, 128, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de comienzo");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(20, 103, 113, 14);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMes = comboBox_1.getSelectedItem().toString();
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(125, 152, 84, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(136, 128, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Arial", Font.BOLD, 12));
		textYear.setColumns(10);
		textYear.setBounds(232, 153, 96, 20);
		contentPane.add(textYear);
		
		JLabel lblNewLabel_6 = new JLabel("Año");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(227, 128, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Número de días");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(292, 36, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		textNumeroDias = new JTextField();
		textNumeroDias.setFont(new Font("Arial", Font.BOLD, 12));
		textNumeroDias.setColumns(10);
		textNumeroDias.setBounds(292, 61, 96, 20);
		contentPane.add(textNumeroDias);
		
		
	}

}
