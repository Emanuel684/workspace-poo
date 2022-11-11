package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class frmMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCedula;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
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
	public frmMenu() {
		setResizable(false);
		setTitle("Hotel Gestor");
		setFont(new Font("Arial", Font.BOLD, 12));
		setForeground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmMenu.class.getResource("/Imagenes/cliente.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setForeground(new Color(0, 0, 0));
		mnCliente.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnCliente);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ingresar");
		mntmNewMenuItem.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarCliente frmIngresarCliente = new frmIngresarActualizarCliente(false);
				frmIngresarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnCliente.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Actualizar");
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarCliente frmIngresarCliente = new frmIngresarActualizarCliente(true);
				frmIngresarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnCliente.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar");
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarCliente frmEliminarCliente = new frmEliminarCliente();
				frmEliminarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnCliente.add(mntmNewMenuItem_1);
		
		JMenu mnReserva = new JMenu("Reserva");
		mnReserva.setForeground(new Color(0, 0, 0));
		mnReserva.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnReserva);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Crear");
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarReserva frmIngresarActualizarReserva = new frmIngresarActualizarReserva(false);
				frmIngresarActualizarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnReserva.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Actualizar");
		mntmNewMenuItem_5.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_5.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarReserva frmIngresarActualizarReserva = new frmIngresarActualizarReserva(true);
				frmIngresarActualizarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnReserva.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminar");
		mntmNewMenuItem_3.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarReserva frmEliminarReserva = new frmEliminarReserva();
				frmEliminarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnReserva.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Caja");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmListadoHabitacionesRecepcionista frmListadoHabitacionesRecepcionista = new frmListadoHabitacionesRecepcionista();
				frmListadoHabitacionesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mntmNewMenuItem_14.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_14.setFont(new Font("Arial", Font.BOLD, 12));
		mnReserva.add(mntmNewMenuItem_14);
		
		JMenu mnRecepcionista = new JMenu("Recepcionista");
		mnRecepcionista.setForeground(new Color(0, 0, 0));
		mnRecepcionista.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnRecepcionista);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Listado habitaciones");
		mntmNewMenuItem_6.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_6.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmListadoHabitacionesRecepcionista frmListadoHabitacionesRecepcionista = new frmListadoHabitacionesRecepcionista();
				frmListadoHabitacionesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnRecepcionista.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Precio habitaciones");
		mntmNewMenuItem_8.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_8.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrecioHabitacionesRecepcionista frmPrecioHabitacionesRecepcionista = new frmPrecioHabitacionesRecepcionista();
				frmPrecioHabitacionesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnRecepcionista.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Descuento clientes");
		mntmNewMenuItem_9.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_9.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDescuentoClientesRecepcionista frmDescuentoClientesRecepcionista = new frmDescuentoClientesRecepcionista();
				frmDescuentoClientesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnRecepcionista.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Consultar habitancion");
		mntmNewMenuItem_10.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_10.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConsultarHabitacionRecepcionista frmConsultarHabitacionRecepcionista = new frmConsultarHabitacionRecepcionista();
				frmConsultarHabitacionRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnRecepcionista.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Estimado precio");
		mntmNewMenuItem_11.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_11.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEstimadoPrecioRecepcionista frmEstimadoPrecioRecepcionista = new frmEstimadoPrecioRecepcionista();
				frmEstimadoPrecioRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnRecepcionista.add(mntmNewMenuItem_11);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		mnAdministrador.setForeground(new Color(0, 0, 0));
		mnAdministrador.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnAdministrador);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Precio habitacion");
		mntmNewMenuItem_7.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_7.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrecioHabitacionAdministrador frmPrecioHabitacionAdministrador = new frmPrecioHabitacionAdministrador();
				frmPrecioHabitacionAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnAdministrador.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Descuento clientes");
		mntmNewMenuItem_12.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_12.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDescuentoClientesAdministrador frmDescuentoClientesAdministrador = new frmDescuentoClientesAdministrador();
				frmDescuentoClientesAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnAdministrador.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Calcular ganancias");
		mntmNewMenuItem_13.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_13.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalcularGananciasAdministrador frmCalcularGananciasAdministrador = new frmCalcularGananciasAdministrador();
				frmCalcularGananciasAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnAdministrador.add(mntmNewMenuItem_13);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreadoPor = new JLabel("Creado por Emanuel Acevedo Muñoz");
		lblCreadoPor.setFont(new Font("Arial", Font.BOLD, 12));
		lblCreadoPor.setBounds(10, 466, 259, 14);
		contentPane.add(lblCreadoPor);
		
		JLabel lblVersion = new JLabel("V 0.0.0");
		lblVersion.setFont(new Font("Arial", Font.BOLD, 12));
		lblVersion.setBounds(727, 466, 49, 14);
		contentPane.add(lblVersion);
		
		textFieldCedula = new JTextField();
		textFieldCedula.setFont(new Font("Arial", Font.BOLD, 12));
		textFieldCedula.setBounds(508, 139, 158, 31);
		contentPane.add(textFieldCedula);
		textFieldCedula.setColumns(10);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Arial", Font.BOLD, 12));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(508, 215, 158, 31);
		contentPane.add(textFieldPassword);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(546, 80, 89, 31);
		contentPane.add(lblNewLabel);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBackground(new Color(255, 255, 255));
		btnIngresar.setFont(new Font("Arial", Font.BOLD, 12));
		btnIngresar.setForeground(new Color(0, 0, 0));
		btnIngresar.setBounds(519, 301, 127, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblNewLabel_1 = new JLabel("BIENVENID@");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(102, 157, 214, 96);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setBackground(new Color(255, 255, 255));
		lblCedula.setForeground(new Color(0, 0, 0));
		lblCedula.setFont(new Font("Arial", Font.BOLD, 12));
		lblCedula.setBounds(509, 122, 157, 14);
		contentPane.add(lblCedula);
		
		JLabel lblPassword = new JLabel("Contraseña");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBackground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Arial", Font.BOLD, 12));
		lblPassword.setBounds(508, 193, 158, 14);
		contentPane.add(lblPassword);
	}
}
