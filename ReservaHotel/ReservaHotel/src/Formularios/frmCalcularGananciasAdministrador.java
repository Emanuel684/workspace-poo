package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class frmCalcularGananciasAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textCalcularGanacias;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calcular ganancias");
		lblNewLabel.setBounds(155, 11, 130, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Dia");
		lblNewLabel_4.setBounds(49, 36, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Mes");
		lblNewLabel_5.setBounds(165, 36, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Año");
		lblNewLabel_6.setBounds(266, 36, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_4_1 = new JLabel("Dia");
		lblNewLabel_4_1.setBounds(49, 114, 49, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Mes");
		lblNewLabel_5_1.setBounds(165, 114, 49, 14);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Año");
		lblNewLabel_6_1.setBounds(266, 114, 49, 14);
		contentPane.add(lblNewLabel_6_1);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(96, 229, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(213, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Las ganancias son:");
		lblNewLabel_1.setBounds(49, 184, 133, 14);
		contentPane.add(lblNewLabel_1);
		
		textCalcularGanacias = new JTextField();
		textCalcularGanacias.setEnabled(false);
		textCalcularGanacias.setBounds(206, 181, 96, 20);
		contentPane.add(textCalcularGanacias);
		textCalcularGanacias.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDiaInicio = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setToolTipText("Día");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(49, 61, 89, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMesInicio = comboBox_1.getSelectedItem().toString();
			}
		});
		comboBox_1.setToolTipText("Mes");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(154, 61, 90, 22);
		contentPane.add(comboBox_1);
		
		textYearInicio = new JTextField();
		textYearInicio.setBounds(259, 62, 96, 20);
		contentPane.add(textYearInicio);
		textYearInicio.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDiaFinal = comboBox_2.getSelectedItem().toString();
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setToolTipText("Día");
		comboBox_2.setBounds(49, 139, 89, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectMesFinal = comboBox_1_1.getSelectedItem().toString();
			}
		});
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1_1.setToolTipText("Mes");
		comboBox_1_1.setBounds(154, 139, 90, 22);
		contentPane.add(comboBox_1_1);
		
		textYearFinal = new JTextField();
		textYearFinal.setColumns(10);
		textYearFinal.setBounds(254, 139, 96, 20);
		contentPane.add(textYearFinal);
	}
}
