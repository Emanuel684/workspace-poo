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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Consultar foto habitacion");
		lblNewLabel.setBounds(152, 11, 164, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				setVisible(false);
			}
		});
		btnNewButton.setBounds(227, 229, 105, 23);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBox.setBounds(37, 85, 164, 22);
		contentPane.add(comboBox);
		
		JLabel lblHabitacionesSencillas = new JLabel("Tipo de habitación");
		lblHabitacionesSencillas.setBounds(37, 67, 120, 14);
		contentPane.add(lblHabitacionesSencillas);
		
		JLabel lblFotoHabitacion = new JLabel("Foto habitacion");
		lblFotoHabitacion.setBounds(281, 67, 120, 14);
		contentPane.add(lblFotoHabitacion);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/piton.png")));
		lblNewLabel_1.setBounds(227, 87, 179, 114);
		contentPane.add(lblNewLabel_1);
		
		JButton btnConsultarFoto = new JButton("Consultar");
		btnConsultarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(selectTipoHabitacion == "Habitaciones sencilla") {
					
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/cliente.png")));
				} else if(selectTipoHabitacion == "Habitaciones doble") {
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/codigo.png")));
					
				} else if(selectTipoHabitacion == "Habitaciones matrimonial") {
					lblNewLabel_1.setIcon(new ImageIcon(frmConsultarHabitacionRecepcionista.class.getResource("/Imagenes/programacion.png")));
					
				}
			}
		});
		btnConsultarFoto.setBounds(112, 229, 105, 23);
		contentPane.add(btnConsultarFoto);
		
		
	}
}
