package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import db.AccesoDB;
import model.Compra;

public class CompraPersistencia {
private AccesoDB acceso;
	
	public CompraPersistencia() {
		acceso = new AccesoDB();
	}
	
	public ArrayList<Compra> getTodasComras() {
		ArrayList<Compra> compras = new ArrayList<Compra>();
	
		String query = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;

		try {
			con = this.acceso.getConnection();
			
			query = "SELECT ID_COMPRA, FECHA_COMPRA, IMPORTE, ID_USUARIO, ID_STOCK, CANTIDAD, NUMERO_PEDIDO FROM COMPRA";
			pstmt = con.prepareStatement(query);
			rslt = pstmt.executeQuery();
			
			
			while (rslt.next()) {
				int id_compra = rslt.getInt("ID_COMPRA");
				String fecha_compra = rslt.getString("FECHA_COMPRA");
				double importe = rslt.getDouble("IMPORTE");
				int id_usuario = rslt.getInt("ID_USUARIO");
				int id_stock = rslt.getInt("ID_STOCK");
				int cantidad = rslt.getInt("CANTIDAD");
				int numero_pedido = rslt.getInt("NUMERO_PEDIDO");				
				
				Compra compra = new Compra(id_compra, fecha_compra, importe, id_usuario, id_stock, cantidad, numero_pedido);
				compras.add(compra);
			}
						
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return compras;
	}
}
