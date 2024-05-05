package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import co.edu.unbosque.model.Cancion;
import co.edu.unbosque.model.Fachada;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener {

	private View view;
	private Fachada fachada;

	public Controller() {
		view = new View(this);
		fachada = new Fachada(this);
		view.setVisible(true);
		view.getPanelParrilla().getButreproducir().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fachada.reproducirParrilla();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.getPanelInicio();
	}

	public String obtenerRutaArchivoSeleccionado() {
		return fachada.obtenerRutaArchivoSeleccionado();
	}

	public void reproducirArchivo(String rutaArchivo) {
		fachada.reproducirArchivo(rutaArchivo);
	}

	public void detenerReproduccion() {
		fachada.detenerReproduccion();
	}

	public void seleccionarArchivo() {
		fachada.seleccionarArchivo();
	}

	public void agregarCancion(String nombre, String genero, String autor) {
		fachada.agregarCancion(nombre, genero, autor);
		view.escribirMensaje("Canción ingresada exitosamente");
		view.actualizarListaCanciones(obtenerNombresCanciones());
	}

	public void obtenerRutasMP3() {
		fachada.obtenerRutasMP3();
	}

	public ArrayList<String> obtenerNombresCanciones() {
		ArrayList<String> nombresCanciones = new ArrayList<>();
		for (Cancion cancion : fachada.getListaCanciones()) {
			nombresCanciones.add(cancion.getNombre());
		}
		return nombresCanciones;
	}

	public void agregarRutaParrilla(String ruta) {
		fachada.agregarRutaParrilla(ruta);
	}

	public void reproducirParrilla() {
		fachada.reproducirParrilla();

	}

}