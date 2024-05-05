package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.controller.Controller;

public class Fachada {

	private Reproductor usuario;
	private GestionMP3 archivoMP3;
	private GestionDatos gestionDatos;
	private List<String> rutasParrilla;

	public Fachada(Controller controller) {
		this.usuario = new Reproductor();
		this.archivoMP3 = new GestionMP3();
		this.gestionDatos = new GestionDatos();
		this.rutasParrilla = new ArrayList<>();
	}

	public void reproducirArchivo(String rutaArchivo) {
		try {
			usuario.reproducir(rutaArchivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> obtenerRutasMP3() {
		return gestionDatos.obtenerRutasMP3();
	}

	public void detenerReproduccion() {
		usuario.detener();
	}

	public void seleccionarArchivo() {
		archivoMP3.seleccionarArchivo();
	}

	public String obtenerRutaArchivoSeleccionado() {
		if (!archivoMP3.getArchivosMP3().isEmpty()) {
			return archivoMP3.getArchivosMP3().get(0);
		}
		return null;
	}

	public void agregarCancion(String nombre, String genero, String autor) {
		String rutaMP3 = obtenerRutaArchivoSeleccionado();
		gestionDatos.agregarCancion(nombre, genero, autor, rutaMP3);
	}

	public Reproductor getUsuario() {
		return usuario;
	}

	public void setUsuario(Reproductor usuario) {
		this.usuario = usuario;
	}

	public GestionMP3 getArchivoMP3() {
		return archivoMP3;
	}

	public void setArchivoMP3(GestionMP3 archivoMP3) {
		this.archivoMP3 = archivoMP3;
	}

	public ArrayList<Cancion> getListaCanciones() {
		return gestionDatos.getCanciones();
	}

	public void agregarRutaParrilla(String ruta) {
		rutasParrilla.add(ruta);
	}

	public void reproducirParrilla() {
		for (String ruta : rutasParrilla) {
			reproducirArchivo(ruta);
		}
		rutasParrilla.clear();
	}

}