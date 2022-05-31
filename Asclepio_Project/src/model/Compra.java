package model;

public class Compra {
	
	private int id_compra;
	private String fecha_compra;
	private double importe;
	private int id_usuario;
	private int id_stock;
	private int cantidad;
	private int numero_pedido;
	
	public Compra(int id_compra, String fecha_compra, double importe, int id_usuario, int id_stock, int cantidad, int numero_pedido) {
		this.id_compra = id_compra;
		this.fecha_compra = fecha_compra;
		this.importe = importe;
		this.id_usuario = id_usuario;
		this.id_stock = id_stock;
		this.cantidad = cantidad;
		this.numero_pedido = numero_pedido;
	}

	public int getId_compra() {
		return id_compra;
	}

	public String getFecha_compra() {
		return fecha_compra;
	}

	public double getImporte() {
		return importe;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public int getId_stock() {
		return id_stock;
	}

	public int getCantidad() {
		return cantidad;
	}

	public int getNumero_pedido() {
		return numero_pedido;
	}
	
	
	
	
}
