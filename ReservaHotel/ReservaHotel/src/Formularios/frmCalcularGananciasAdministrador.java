package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.HOTEL;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmCalcularGananciasAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textCalcularGanancias;
	private JTextField textYearInicio;
	private JTextField textYearFinal;
	private String selectDiaInicio;
	private String selectMesInicio;
	private String selectMesFinal;
	private String selectDiaFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmCalcularGananciasAdministrador frame = new frmCalcularGananciasAdministrador();
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
	public frmCalcularGananciasAdministrador() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmCalcularGananciasAdministrador.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calcular ganancias");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(266, 11, 235, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblDiaInicio = new JLabel("Dia inicio");
		lblDiaInicio.setFont(new Font("Arial", Font.BOLD, 12));
		lblDiaInicio.setBounds(225, 124, 89, 14);
		contentPane.add(lblDiaInicio);
		
		JLabel lblNewLabel_5 = new JLabel("Mes inicio");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5.setBounds(341, 124, 79, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Año inicio");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6.setBounds(442, 124, 89, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Dia fin");
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_4_1.setBounds(225, 202, 49, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Mes fin");
		lblNewLabel_5_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_5_1.setBounds(341, 202, 49, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Año fin");
		lblNewLabel_6_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_6_1.setBounds(442, 202, 49, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HOTEL calcularGananciasHotel = new HOTEL();
				
				String gananciasTotales = calcularGananciasHotel.CalcularGanancias(selectDiaInicio, selectMesInicio, textYearInicio.getText(), selectDiaFinal, selectMesFinal, textYearFinal.getText());
				
				textCalcularGanancias.setText(gananciasTotales);
			}
		});
		btnNewButton.setBounds(266, 456, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(383, 456, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Las ganancias son:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(225, 272, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		textCalcularGanancias = new JTextField();
		textCalcularGanancias.setFont(new Font("Arial", Font.BOLD, 12));
		textCalcularGanancias.setEnabled(false);
		textCalcularGanancias.setBounds(382, 269, 96, 20);
		contentPane.add(textCalcularGanancias);
		textCalcularGanancias.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDiaInicio = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setToolTipText("Día");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(225, 149, 89, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMesInicio = comboBox_1.getSelectedItem().toString();
			}
		});
		comboBox_1.setToolTipText("Mes");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(330, 149, 90, 22);
		contentPane.add(comboBox_1);
		
		textYearInicio = new JTextField();
		textYearInicio.setFont(new Font("Arial", Font.BOLD, 12));
		textYearInicio.setBounds(435, 150, 96, 20);
		contentPane.add(textYearInicio);
		textYearInicio.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDiaFinal = comboBox_2.getSelectedItem().toString();
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setToolTipText("Día");
		comboBox_2.setBounds(225, 227, 89, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMesFinal = comboBox_1_1.getSelectedItem().toString();
			}
		});
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1_1.setToolTipText("Mes");
		comboBox_1_1.setBounds(330, 227, 90, 22);
		contentPane.add(comboBox_1_1);
		
		textYearFinal = new JTextField();
		textYearFinal.setFont(new Font("Arial", Font.BOLD, 12));
		textYearFinal.setColumns(10);
		textYearFinal.setBounds(430, 227, 96, 20);
		contentPane.add(textYearFinal);
	}
}
