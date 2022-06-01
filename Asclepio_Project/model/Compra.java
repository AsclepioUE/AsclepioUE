package model;

public class Compra {
	private String idCompra;
	private String fechaCompra;
	private double importe;
	private String idUsuario;
	private String idStock;
	private int cantidad;
	private int numeroPedido;
	
	
	public Compra(String idCompra, String fechaCompra, double importe, String idUsuario, String idStock, int cantidad,
			int numeroPedido) {
		this.idCompra = idCompra;
		this.fechaCompra = fechaCompra;
		this.importe = importe;
		this.idUsuario = idUsuario;
		this.idStock = idStock;
		this.cantidad = cantidad;
		this.numeroPedido = numeroPedido;
	}


	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", fechaCompra=" + fechaCompra + ", importe=" + importe + ", idUsuario="
				+ idUsuario + ", idStock=" + idStock + ", cantidad=" + cantidad + ", numeroPedido=" + numeroPedido
				+ "]";
	}


	public String getIdCompra() {
		return idCompra;
	}


	public String getFechaCompra() {
		return fechaCompra;
	}


	public double getImporte() {
		return importe;
	}


	public String getIdUsuario() {
		return idUsuario;
	}


	public String getIdStock() {
		return idStock;
	}


	public int getCantidad() {
		return cantidad;
	}


	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	
	
	
}
