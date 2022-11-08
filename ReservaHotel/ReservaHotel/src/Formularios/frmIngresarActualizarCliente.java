package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.CLIENTE;
import Clases.ESPORADICO;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmIngresarActualizarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtCedulaCliente;
	private JTextField textNombreCompleto;
	private JTextField textEmail;
	private JTextField textYear;
	private String selectDia = "";
	private String selectMes = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmIngresarActualizarCliente frame = new frmIngresarActualizarCliente(false);
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
	public frmIngresarActualizarCliente(boolean actualizar_view) {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmIngresarActualizarCliente.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCedulaCliente = new JTextField();
		txtCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		txtCedulaCliente.setBounds(212, 8, 145, 20);
		contentPane.add(txtCedulaCliente);
		txtCedulaCliente.setColumns(10);
		
		JLabel lblCedulaCliente = new JLabel("Cédula cliente");
		lblCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaCliente.setBounds(20, 11, 113, 14);
		contentPane.add(lblCedulaCliente);
		
		JLabel lblNombreCompleto = new JLabel("Nombre completo");
		lblNombreCompleto.setFont(new Font("Arial", Font.BOLD, 12));
		lblNombreCompleto.setBounds(20, 36, 113, 14);
		contentPane.add(lblNombreCompleto);
		
		textNombreCompleto = new JTextField();
		textNombreCompleto.setFont(new Font("Arial", Font.BOLD, 12));
		textNombreCompleto.setBounds(212, 33, 145, 20);
		contentPane.add(textNombreCompleto);
		textNombreCompleto.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmail.setBounds(20, 59, 49, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Arial", Font.BOLD, 12));
		textEmail.setBounds(212, 56, 145, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setFont(new Font("Arial", Font.BOLD, 12));
		lblFechaDeNacimiento.setBounds(20, 84, 113, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Arial", Font.BOLD, 12));
		lblDia.setBounds(20, 109, 49, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Arial", Font.BOLD, 12));
		lblMes.setBounds(136, 109, 49, 14);
		contentPane.add(lblMes);
		
		JLabel lblYear = new JLabel("Año");
		lblYear.setFont(new Font("Arial", Font.BOLD, 12));
		lblYear.setBounds(237, 109, 49, 14);
		contentPane.add(lblYear);
		
		textYear = new JTextField();
		textYear.setFont(new Font("Arial", Font.BOLD, 12));
		textYear.setBounds(232, 134, 96, 20);
		contentPane.add(textYear);
		textYear.setColumns(10);
		
		if(actualizar_view) {
			JButton btnNewButton = new JButton("Actualizar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ESPORADICO actualizarCliente = new ESPORADICO();
					// Creamos el cliente mediante la clase CLIENTE()
					actualizarCliente.ActualizarCliente(txtCedulaCliente.getText(), textNombreCompleto.getText(), textEmail.getText(), selectDia + "/" + selectMes + "/" + textYear.getText());
					
					JOptionPane.showMessageDialog(null,"Cliente actualizado correctamente");
					frmMenu frame = new frmMenu();
					frame.setVisible(true);
					
					setVisible(false);
				}
			});
			btnNewButton.setBounds(107, 213, 89, 23);
			contentPane.add(btnNewButton);
		} else {
			JButton btnNewButton = new JButton("Guardar");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					ESPORADICO nuevoCliente = new ESPORADICO();
					// Creamos el cliente mediante la clase CLIENTE()
					nuevoCliente.CrearCliente(txtCedulaCliente.getText(), textNombreCompleto.getText(), textEmail.getText(), selectDia + "/" + selectMes + "/" + textYear.getText());
					
					JOptionPane.showMessageDialog(null,"Cliente creado y guardado correctamente");
					frmMenu frame = new frmMenu();
					frame.setVisible(true);
					
					setVisible(false);
				}
			});
			btnNewButton.setBounds(107, 213, 89, 23);
			contentPane.add(btnNewButton);
		}
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frame = new frmMenu();
				frame.setVisible(true);
				
				setVisible(false);
			}
		});
		btnCancelar.setBounds(219, 213, 89, 23);
		contentPane.add(btnCancelar);
		
		JComboBox comboBoxDia = new JComboBox();
		comboBoxDia.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDia = comboBoxDia.getSelectedItem().toString();
			}
		});
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDia.setBounds(20, 134, 77, 22);
		contentPane.add(comboBoxDia);
		
		JComboBox comboBoxMes = new JComboBox();
		comboBoxMes.setFont(new Font("Arial", Font.BOLD, 12));
		comboBoxMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMes = comboBoxMes.getSelectedItem().toString();
			}
		});
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBoxMes.setBounds(125, 133, 84, 22);
		contentPane.add(comboBoxMes);
	}
}
