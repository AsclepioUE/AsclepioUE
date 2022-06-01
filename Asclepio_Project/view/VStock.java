package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;

public class VStock extends JPanel{
	
	static final int ALTO = 600;
	static final int ANCHO = 950;
	public static final String BTN_VOLVER = "Volver";
	public static final String BTN_SALIR = "Salir";
	
	private static final String NOMBRE = "Nombre";
	private static final String CODIGO = "Código";
	private static final String PRECIO = "Precio";
	private static final String CANTIDAD = "Cantidad";
	private static final String REPONER = "Reponer";
	private DefaultTableModel tModel;
	private JTextField textField;
	private JTable tblStock;
	private JScrollPane scrollPane;
	private JButton btnsSalir;
	private JButton btnVolver;
	
	public VStock() {
		setForeground(Color.BLACK);
		init();
	}

	private void init() {
		setLayout(null);
		setSize(ANCHO,ALTO);
		
		JLabel lblStock = new JLabel("STOCK");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblStock.setBounds(404, 33, 141, 44);
		add(lblStock);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(226, 109, 459, 35);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblBusqueda = new JLabel("Busqueda:");
		lblBusqueda.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBusqueda.setBounds(106, 109, 110, 35);
		add(lblBusqueda);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 185, 872, 377);
		add(scrollPane);
		
		tblStock = new JTable();
		scrollPane.setViewportView(tblStock);
		
		btnsSalir = new JButton(BTN_SALIR);
		btnsSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnsSalir.setBounds(855, 10, 85, 21);
		add(btnsSalir);
		
		btnVolver = new JButton(BTN_VOLVER);
		btnVolver.setBounds(10, 11, 85, 21);
		add(btnVolver);
		centrarVentana();
		
		configurarTabla();
		
	}
	
	private void configurarTabla() {
		tModel = new DefaultTableModel() { 
			public boolean isCellEditable(int row, int colum) {
				return false; 
			}
		};
		
			tblStock.setModel(tModel);
		
			tModel.addColumn(NOMBRE);
			tModel.addColumn(CODIGO); 
			tModel.addColumn(PRECIO); 
			tModel.addColumn(CANTIDAD); 
			tModel.addColumn(PRECIO); 
			

			tblStock.getColumn(NOMBRE).setPreferredWidth(75);
			tblStock.getColumn(CODIGO).setPreferredWidth(75);
			tblStock.getColumn(PRECIO).setPreferredWidth(75);
			tblStock.getColumn(CANTIDAD).setPreferredWidth(75);
			tblStock.getColumn(REPONER).setPreferredWidth(75);
			
		
	}

	public void hacerVisible(boolean b) {
		
		scrollPane.setVisible(b);
	}
	
	private void centrarVentana() {
		setPreferredSize(new Dimension(ANCHO, ALTO));      
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();                   
		Dimension ventana = this.getPreferredSize();                      
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
			
	}
}
