package model;

public class Usuario {
	private String idUsuario;
	private String pass;
	
	
	public Usuario(String idUsuario, String pass) {
		this.idUsuario = idUsuario;
		this.pass = pass;
	}


	public String getIdUsuario() {
		return idUsuario;
	}


	public String getPass() {
		return pass;
	}

	
	
}
