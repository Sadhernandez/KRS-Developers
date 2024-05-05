package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;

	private PanelEntrada panelEntrada;
	private PanelInicio panelInicio;
	private PanelCrearPistas panelCrear;
	private PanelParrilla panelParrilla;
	private PanelParametros panelParametros;

	public View(Controller controller) {
		setSize(650, 330);
		setResizable(false);
		setTitle("ForrestM");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		panelInicio = new PanelInicio();
		panelEntrada = new PanelEntrada();
		panelCrear = new PanelCrearPistas(controller);
		panelParrilla = new PanelParrilla();
		panelParametros = new PanelParametros();

		add(panelInicio, BorderLayout.CENTER);

		panelInicio.getButIniciar().addActionListener(e -> mostrarPanelParametros());
		panelParametros.getButVolver().addActionListener(e -> mostrarPanelInicio());
		panelParametros.getButSiguiente().addActionListener(e -> mostrarPanelEntrada());
		panelEntrada.getButVolver().addActionListener(e -> mostrarPanelEntradaParametros());
		panelEntrada.getButPistas().addActionListener(e -> mostrarPanelCrear());
		panelEntrada.getButParrilla().addActionListener(e -> mostrarPanelParrilla());
		panelCrear.getButVolver().addActionListener(e -> mostrarPanelEntradaCrear());
		panelParrilla.getButVolver().addActionListener(e -> mostrarPanelParrillaEntrada());

		panelParrilla.getButreproducir().addActionListener(e -> {
			controller.reproducirParrilla();
		});

		panelParrilla.getButdetener().addActionListener(e -> {
			controller.detenerReproduccion();
		});

		panelParrilla.getButañadiraparrilla().addActionListener(e -> {
			String rutaArchivo = controller.obtenerRutaArchivoSeleccionado();
			if (rutaArchivo != null) {
				controller.agregarRutaParrilla(rutaArchivo);
			} else {
				JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún archivo.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		});
	}

	private void mostrarPanelInicio() {
		getContentPane().remove(panelParametros);
		add(panelInicio, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelParametros() {
		getContentPane().remove(panelInicio);
		add(panelParametros, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelEntrada() {
		getContentPane().remove(panelParametros);
		add(panelEntrada, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelEntradaParametros() {
		getContentPane().remove(panelEntrada);
		add(panelParametros, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelCrear() {
		getContentPane().remove(panelEntrada);
		add(panelCrear, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelEntradaCrear() {
		getContentPane().remove(panelCrear);
		add(panelEntrada, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelParrilla() {
		getContentPane().remove(panelEntrada);
		add(panelParrilla, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	private void mostrarPanelParrillaEntrada() {
		getContentPane().remove(panelParrilla);
		add(panelEntrada, BorderLayout.CENTER);
		revalidate();
		repaint();
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, "Canción ingresada exitosamente!", "Información",
				JOptionPane.INFORMATION_MESSAGE);
	}

	public void actualizarListaCanciones(ArrayList<String> nombresCanciones) {
		DefaultListModel<String> modeloCanciones = new DefaultListModel<>();
		for (String nombre : nombresCanciones) {
			modeloCanciones.addElement(nombre);
		}
		panelParrilla.getListaCanciones().setModel(modeloCanciones);
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public PanelParametros getPanelParametros() {
		return panelParametros;
	}

	public void setPanelParametros(PanelParametros panelParametros) {
		this.panelParametros = panelParametros;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelInicio getPanelInicio() {
		return panelInicio;
	}

	public void setPanelInicio(PanelInicio panelInicio) {
		this.panelInicio = panelInicio;
	}

	public PanelCrearPistas getPanelCrear() {
		return panelCrear;
	}

	public void setPanelCrear(PanelCrearPistas panelCrear) {
		this.panelCrear = panelCrear;
	}

	public PanelParrilla getPanelParrilla() {
		return panelParrilla;
	}

	public void setPanelParrilla(PanelParrilla panelParrilla) {
		this.panelParrilla = panelParrilla;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}