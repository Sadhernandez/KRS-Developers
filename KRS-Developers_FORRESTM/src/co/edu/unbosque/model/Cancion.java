package co.edu.unbosque.model;

public class Cancion {
	private String nombre;
	private String genero;
	private String autor;
	public String rutaMP3;

	public Cancion(String nombre, String genero, String autor, String rutaMP3) {
		this.nombre = nombre;
		this.genero = genero;
		this.autor = autor;
		this.rutaMP3 = rutaMP3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getRutaMP3() {
		return rutaMP3;
	}

	public void setRutaMP3(String rutaMP3) {
		this.rutaMP3 = rutaMP3;
	}
}