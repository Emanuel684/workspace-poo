package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.HABITUAL;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmDescuentoClientesRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTextField textCedulaCliente;
	private JTextField textDescuentoCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDescuentoClientesRecepcionista frame = new frmDescuentoClientesRecepcionista();
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
	public frmDescuentoClientesRecepcionista() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmDescuentoClientesRecepcionista.class.getResource("/Imagenes/cliente.png")));
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
		btnRegresar.setBounds(409, 461, 89, 23);
		contentPane.add(btnRegresar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(0, 0, 0));
		btnConsultar.setFont(new Font("Arial", Font.BOLD, 12));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HABITUAL descuentoCliente = new HABITUAL();
				String descuento = descuentoCliente.DescuentoCliente(textCedulaCliente.getText());
				
				if(descuento != "0") {
					JOptionPane.showMessageDialog(null,"Se encontro el cliente");
					textDescuentoCliente.setText(descuento);
				} else {
					JOptionPane.showMessageDialog(null,"No se encuentra el cliente");
				}
				
				/*
				frmMenu frmMenu = new frmMenu();
				frmMenu.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
				*/
			}
		});
		btnConsultar.setBounds(291, 461, 97, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblTitulo = new JLabel("Descuento clientes");
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
		lblTitulo.setBounds(262, 11, 226, 43);
		contentPane.add(lblTitulo);
		
		JLabel lblCedulaCliente = new JLabel("Cedula cliente");
		lblCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedulaCliente.setBounds(336, 99, 87, 14);
		contentPane.add(lblCedulaCliente);
		
		textCedulaCliente = new JTextField();
		textCedulaCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textCedulaCliente.setBounds(325, 133, 113, 20);
		contentPane.add(textCedulaCliente);
		textCedulaCliente.setColumns(10);
		
		textDescuentoCliente = new JTextField();
		textDescuentoCliente.setFont(new Font("Arial", Font.BOLD, 12));
		textDescuentoCliente.setEnabled(false);
		textDescuentoCliente.setColumns(10);
		textDescuentoCliente.setBounds(325, 200, 113, 20);
		contentPane.add(textDescuentoCliente);
		
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setFont(new Font("Arial", Font.BOLD, 12));
		lblDescuento.setBounds(349, 175, 74, 14);
		contentPane.add(lblDescuento);
	}

}
