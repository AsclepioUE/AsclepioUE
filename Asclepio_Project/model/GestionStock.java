package model;

public class GestionStock {
	private String idUsuario;
	private String idProducto;
	private String fechaGestion;
	private int cantidad;
	
	
	public GestionStock(String idUsuario, String idProducto, String fechaGestion, int cantidad) {
		this.idUsuario = idUsuario;
		this.idProducto = idProducto;
		this.fechaGestion = fechaGestion;
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "GestionStock [idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", fechaGestion=" + fechaGestion
				+ ", cantidad=" + cantidad + "]";
	}


	public String getIdUsuario() {
		return idUsuario;
	}


	public String getIdProducto() {
		return idProducto;
	}


	public String getFechaGestion() {
		return fechaGestion;
	}


	public int getCantidad() {
		return cantidad;
	}
	
	
	
}
