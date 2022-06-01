package asclepio.view;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PCarrito extends JPanel {
	
	public static final int ALTO = 600;
	public static final int ANCHO = 800;
	
	public static final String BTN_COMPRAR = "COMPRAR";
	public static final String BTN_ELIMINAR = "ELIMINAR";
	public static final String BTN_VOLVER = "VOLVER";
	
	private JScrollPane scrollPane;
	private JTable tbCarrito;
	private DefaultTableModel tModel;
	private JButton btnComprar;
	private JButton btnEliminar;
	private JTextField txtPago;
	private JButton btnVolver;
	
	public PCarrito() {
		init();
	}

	private void init() {
		
		setLayout(null);
		
		JLabel lblCarrito = new JLabel("CARRITO");
		lblCarrito.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarrito.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCarrito.setBounds(225, 33, 349, 35);
		add(lblCarrito);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(64, 125, 672, 381);
		add(scrollPane);
		
		tbCarrito = new JTable();
		tbCarrito.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(tbCarrito);
		
		//LOS BOTONES ESTÁN EN LA MISMA POSICIÓN, PARA QUE CUANDO
		// UN PRODUCTO SEA SELECCIONADO, EL BOTÓN COMPRAR SE CAMBIARÁ AL 
		// DE ELIMINAR (PONIENDO VISIBLE UNO E INVISIBLE OTRO)
		btnComprar = new JButton(BTN_COMPRAR);
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnComprar.setBounds(285, 527, 229, 48);
		add(btnComprar);
		
		btnEliminar = new JButton(BTN_ELIMINAR);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnEliminar.setBounds(285, 527, 229, 48);
		add(btnEliminar);
		btnEliminar.setVisible(false);
		
		txtPago = new JTextField();
		txtPago.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPago.setBounds(632, 506, 104, 35);
		add(txtPago);
		txtPago.setColumns(10);
		txtPago.setEditable(false);
		
		btnVolver = new JButton(BTN_VOLVER);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVolver.setBounds(10, 11, 85, 21);
		add(btnVolver);
		/* txtBusqueda = new JTextField();
        txtBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtBusqueda.setBounds(226, 109, 459, 35);
        add(txtBusqueda);
        txtBusqueda.setColumns(10);
		 * */
		centrarVentana();
		configurarTabla();
		
	}
	
	private void configurarTabla() {
		tModel = new DefaultTableModel() {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		tModel = (DefaultTableModel) tbCarrito.getModel();
		
		tModel.addColumn("CANTIDAD");
		tModel.addColumn("PRODUCTO");
		tModel.addColumn("PRECIO");
		
		tbCarrito.getColumn("CANTIDAD").setPreferredWidth(50);
		tbCarrito.getColumn("PRODUCTO").setPreferredWidth(150);
		tbCarrito.getColumn("PRECIO").setPreferredWidth(50);
	}
	
	/*public void rellenarTabla(ArrayList<Producto> listaProductos) {
		
	}*/
	
	private void centrarVentana() {
		setPreferredSize(new Dimension(ANCHO, ALTO));
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension ventana = this.getPreferredSize();
		setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
