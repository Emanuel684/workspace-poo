package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmConsultarHabitacionRecepcionista extends JFrame {

	private JPanel contentPane;
	private String selectTipoHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultarHabitacionRecepcionista frame = new frmConsultarHabitacionRecepcionista();
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
	public frmConsultarHabitacionRecepcionista() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar foto habitacion");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(213, 11, 334, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("REGRESAR");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(395, 468, 120, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBox.setBounds(46, 116, 164, 22);
		contentPane.add(comboBox);
		
		JLabel lblHabitacionesSencillas = new JLabel("Tipo de habitaci??n");
		lblHabitacionesSencillas.setFont(new Font("Arial", Font.BOLD, 12));
		lblHabitacionesSencillas.setBounds(46, 98, 120, 14);
		contentPane.add(lblHabitacionesSencillas);
		
		JLabel lblFotoHabitacion = new JLabel("Foto habitacion");
		lblFotoHabitacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblFotoHabitacion.setBounds(323, 113, 120, 14);
		contentPane.add(lblFotoHabitacion);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/SIMPLE.png")));
		lblNewLabel_1.setBounds(269, 133, 472, 306);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConsultarFoto = new JButton("CONSULTAR");
		btnConsultarFoto.setForeground(new Color(0, 0, 0));
		btnConsultarFoto.setBackground(new Color(255, 255, 255));
		btnConsultarFoto.setFont(new Font("Arial", Font.BOLD, 12));
		btnConsultarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectTipoHabitacion == "Habitaciones sencilla") {
					
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/SIMPLE.png")));
				} else if(selectTipoHabitacion == "Habitaciones doble") {
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/DOBLE.jpg")));
					
				} else if(selectTipoHabitacion == "Habitaciones matrimonial") {
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/MATRIMONIAL.png")));
					
				}
			}
		});
		btnConsultarFoto.setBounds(256, 468, 129, 23);
		contentPane.add(btnConsultarFoto);
		
		
	}
}
