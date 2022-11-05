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

public class frmMenu extends JFrame {

	private JPanel contentPane;

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
		
		JMenu mnNewMenu = new JMenu("Cliente");
		mnNewMenu.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ingresar");
		mntmNewMenuItem.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarCliente frmIngresarCliente = new frmIngresarActualizarCliente(false);
				frmIngresarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Actualizar");
		mntmNewMenuItem_4.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarCliente frmIngresarCliente = new frmIngresarActualizarCliente(true);
				frmIngresarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Eliminar");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarCliente frmEliminarCliente = new frmEliminarCliente();
				frmEliminarCliente.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Reserva");
		mnNewMenu_1.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Crear");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarReserva frmIngresarActualizarReserva = new frmIngresarActualizarReserva(false);
				frmIngresarActualizarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Actualizar");
		mntmNewMenuItem_5.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIngresarActualizarReserva frmIngresarActualizarReserva = new frmIngresarActualizarReserva(true);
				frmIngresarActualizarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Eliminar");
		mntmNewMenuItem_3.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEliminarReserva frmEliminarReserva = new frmEliminarReserva();
				frmEliminarReserva.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Recepcionista");
		mnNewMenu_2.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Listado habitaciones");
		mntmNewMenuItem_6.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmListadoHabitacionesRecepcionista frmListadoHabitacionesRecepcionista = new frmListadoHabitacionesRecepcionista();
				frmListadoHabitacionesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Precio habitaciones");
		mntmNewMenuItem_8.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrecioHabitacionesRecepcionista frmPrecioHabitacionesRecepcionista = new frmPrecioHabitacionesRecepcionista();
				frmPrecioHabitacionesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Descuento clientes");
		mntmNewMenuItem_9.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDescuentoClientesRecepcionista frmDescuentoClientesRecepcionista = new frmDescuentoClientesRecepcionista();
				frmDescuentoClientesRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Consultar habitancion");
		mntmNewMenuItem_10.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmConsultarHabitacionRecepcionista frmConsultarHabitacionRecepcionista = new frmConsultarHabitacionRecepcionista();
				frmConsultarHabitacionRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Estimado precio");
		mntmNewMenuItem_11.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEstimadoPrecioRecepcionista frmEstimadoPrecioRecepcionista = new frmEstimadoPrecioRecepcionista();
				frmEstimadoPrecioRecepcionista.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_3 = new JMenu("Administrador");
		mnNewMenu_3.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Precio habitacion");
		mntmNewMenuItem_7.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrecioHabitacionAdministrador frmPrecioHabitacionAdministrador = new frmPrecioHabitacionAdministrador();
				frmPrecioHabitacionAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Descuento clientes");
		mntmNewMenuItem_12.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDescuentoClientesAdministrador frmDescuentoClientesAdministrador = new frmDescuentoClientesAdministrador();
				frmDescuentoClientesAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Calcular ganancias");
		mntmNewMenuItem_13.setFont(new Font("Arial", Font.BOLD, 12));
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCalcularGananciasAdministrador frmCalcularGananciasAdministrador = new frmCalcularGananciasAdministrador();
				frmCalcularGananciasAdministrador.setVisible(true);
				
				// Cerramos la ventana actual
				setVisible(false);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_13);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Creado por Emanuel Acevedo Muñoz");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 466, 259, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("V 0.0.0");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(727, 466, 49, 14);
		contentPane.add(lblNewLabel_2);
	}
}
