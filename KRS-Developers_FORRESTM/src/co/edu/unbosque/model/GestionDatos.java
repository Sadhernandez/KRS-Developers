package co.edu.unbosque.model;

import java.util.ArrayList;

public class GestionDatos {
	private ArrayList<Cancion> canciones;

	public GestionDatos() {
		canciones = new ArrayList<>();
	}

	public void agregarCancion(String nombre, String genero, String autor, String rutaMP3) {
		Cancion cancion = new Cancion(nombre, genero, autor, rutaMP3);
		canciones.add(cancion);
	}

	public ArrayList<String> obtenerRutasMP3() {
		ArrayList<String> rutasMP3 = new ArrayList<>();
		for (Cancion cancion : canciones) {
			rutasMP3.add(cancion.rutaMP3);
		}
		return rutasMP3;
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}
}