package Formularios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Clases.HABITACION;

import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class frmListadoHabitacionesRecepcionista extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmListadoHabitacionesRecepcionista frame = new frmListadoHabitacionesRecepcionista();
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
	public frmListadoHabitacionesRecepcionista() {
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial", Font.BOLD, 12));
		setTitle("Hotel Gestor");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(frmListadoHabitacionesRecepcionista.class.getResource("/Imagenes/cliente.png")));
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
		btnRegresar.setBounds(377, 479, 89, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("Consultar habitaciones");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(346, 25, 160, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 54, 658, 387);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		table.setFont(new Font("Arial", Font.BOLD, 12));
		scrollPane.setViewportView(table);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setToolTipText("");
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setModel(new DefaultTableModel(
				new HABITACION().HabitacionesDisponibles(),
			new String[] {
				"N\u00FAmero habitacion", "Tipo habitacion", "Disponible", "N\u00FAmero reserva"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, String.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
	}
}
