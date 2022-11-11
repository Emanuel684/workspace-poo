package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.CLIENTE;
import Clases.HABITUAL;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmDescuentoClientesAdministrador extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;
	private String selectDescuentoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDescuentoClientesAdministrador frame = new frmDescuentoClientesAdministrador();
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
	public frmDescuentoClientesAdministrador() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmDescuentoClientesAdministrador.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Descuento clientes");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(263, 11, 262, 38);
		contentPane.add(lblTitulo);
		
		JLabel lblCedulaDelCliente = new JLabel("Cedula del\r\n cliente");
		lblCedulaDelCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaDelCliente.setBounds(252, 153, 108, 14);
		contentPane.add(lblCedulaDelCliente);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setBounds(252, 178, 108, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setFont(new Font("Arial", Font.BOLD, 12));
		lblDescuento.setBounds(395, 153, 77, 14);
		contentPane.add(lblDescuento);
		
		JButton btnAplicar = new JButton("APLICAR");
		btnAplicar.setForeground(new Color(0, 0, 0));
		btnAplicar.setBackground(new Color(255, 255, 255));
		btnAplicar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HABITUAL descuentoCliente = new HABITUAL();
				descuentoCliente.DescuentoCliente(textCedulaCliente.getText(), selectDescuentoCliente);
				
				JOptionPane.showMessageDialog(null,"Descuento aplicado correctamente");
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnAplicar.setBounds(266, 454, 111, 23);
		contentPane.add(btnAplicar);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBackground(new Color(255, 255, 255));
		btnRegresar.setForeground(new Color(0, 0, 0));
		btnRegresar.setFont(new Font("Arial", Font.BOLD, 12));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		btnRegresar.setBounds(387, 454, 110, 23);
		contentPane.add(btnRegresar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectDescuentoCliente = comboBox.getSelectedItem().toString();
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0%", "5%", "10%", "15%", "20%", "25%", "30%", "35%", "40%", "45%", "50%", "55%", "60%", "65%", "70%", "75%", "80%", "85%", "90%", "95%", "100%"}));
		comboBox.setToolTipText("Porcentaje");
		comboBox.setBounds(395, 177, 102, 22);
		contentPane.add(comboBox);
	}
}
