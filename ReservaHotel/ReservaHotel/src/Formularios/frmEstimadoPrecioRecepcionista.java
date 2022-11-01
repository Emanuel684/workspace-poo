package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.RESERVACION;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class frmEstimadoPrecioRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTextField textCalculado;
	private JTextField textCedulaCliente;
	private JTextField textNumeroNoches;
	private String selectTipoHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEstimadoPrecioRecepcionista frame = new frmEstimadoPrecioRecepcionista();
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
	public frmEstimadoPrecioRecepcionista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Cédula cliente");
		lblNewLabel.setBounds(83, 58, 83, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Precio estimado");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RESERVACION estimarReservacion = new RESERVACION();
				String PrecioEstimado = estimarReservacion.EstimarReservacion(selectTipoHabitacion, textCedulaCliente.getText(), textNumeroNoches.getText());
				
				textCalculado.setText(PrecioEstimado);
				
			}
		});
		btnNewButton_1.setBounds(147, 229, 139, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("El precio estimado es de:");
		lblNewLabel_1.setBounds(52, 186, 166, 14);
		contentPane.add(lblNewLabel_1);
		
		textCalculado = new JTextField();
		textCalculado.setEnabled(false);
		textCalculado.setBounds(228, 183, 96, 20);
		contentPane.add(textCalculado);
		textCalculado.setColumns(10);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setBounds(83, 83, 117, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tipo habitación");
		lblNewLabel_2.setBounds(83, 114, 105, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Número de noches");
		lblNewLabel_3.setBounds(242, 58, 126, 14);
		contentPane.add(lblNewLabel_3);
		
		textNumeroNoches = new JTextField();
		textNumeroNoches.setText("");
		textNumeroNoches.setBounds(242, 83, 105, 20);
		contentPane.add(textNumeroNoches);
		textNumeroNoches.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectTipoHabitacion = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Habitaciones sencilla", "Habitaciones doble", "Habitaciones matrimonial"}));
		comboBox.setBounds(83, 138, 166, 22);
		contentPane.add(comboBox);
	}
}
