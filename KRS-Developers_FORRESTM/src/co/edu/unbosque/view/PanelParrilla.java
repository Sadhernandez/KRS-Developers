package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PanelParrilla extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JPanel panelCampos;
	private JPanel panelSur;
	private JScrollPane scrolPane;
	private JList<String> listaCanciones;
	private JButton butVolver;
	private JButton butreproducir;
	private JButton butdetener;
	private JButton butañadiraparrilla;
	private DefaultListModel<String> modeloParrilla;
	private JList<String> listaParrilla;

	public static final String VOLVER = "Volver";
	public static final String REPRODUCIR = "Reproducir";
	public static final String DETENER = "Detener";
	public static final String AÑADIRAPARRILLA = "Añadir a Parrilla";

	public PanelParrilla() {
		setLayout(null);

		listaCanciones = new JList<>();
		scrolPane = new JScrollPane(listaCanciones);
		scrolPane.setViewportBorder(
				new TitledBorder(null, "Lista de canciones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrolPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrolPane.setToolTipText("lista de canciones");
		scrolPane.setBounds(34, 30, 162, 243);
		add(scrolPane);

		modeloParrilla = new DefaultListModel<>();
		listaParrilla = new JList<>(modeloParrilla);
		JScrollPane scrollPaneParrilla = new JScrollPane(listaParrilla);
		scrollPaneParrilla.setViewportBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Parrilla",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPaneParrilla.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneParrilla.setToolTipText("Parrilla");
		scrollPaneParrilla.setBounds(454, 30, 162, 243);
		add(scrollPaneParrilla);

		butdetener = new JButton("Detener");
		butdetener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butdetener.setBounds(335, 60, 109, 50);
		add(butdetener);

		butreproducir = new JButton("Reproducir\r\n");
		butreproducir.setBounds(206, 60, 109, 50);
		add(butreproducir);

		butañadiraparrilla = new JButton("Añadir a Parrilla");
		butañadiraparrilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cancionSeleccionada = listaCanciones.getSelectedValue();
				if (cancionSeleccionada != null) {
					modeloParrilla.addElement(cancionSeleccionada);
				}
			}
		});
		butañadiraparrilla.setBounds(247, 135, 162, 50);
		add(butañadiraparrilla);

		butVolver = new JButton("Volver");
		butVolver.setBounds(247, 196, 162, 50);
		add(butVolver);
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getPanelCampos() {
		return panelCampos;
	}

	public void setPanelCampos(JPanel panelCampos) {
		this.panelCampos = panelCampos;
	}

	public JPanel getPanelSur() {
		return panelSur;
	}

	public void setPanelSur(JPanel panelSur) {
		this.panelSur = panelSur;
	}

	public JScrollPane getScrolPane() {
		return scrolPane;
	}

	public void setScrolPane(JScrollPane scrolPane) {
		this.scrolPane = scrolPane;
	}

	public JList<String> getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(JList<String> listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public JButton getButVolver() {
		return butVolver;
	}

	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}

	public JButton getButreproducir() {
		return butreproducir;
	}

	public void setButreproducir(JButton butreproducir) {
		this.butreproducir = butreproducir;
	}

	public JButton getButdetener() {
		return butdetener;
	}

	public void setButdetener(JButton butdetener) {
		this.butdetener = butdetener;
	}

	public JButton getButañadiraparrilla() {
		return butañadiraparrilla;
	}

	public void setButañadiraparrilla(JButton butañadiraparrilla) {
		this.butañadiraparrilla = butañadiraparrilla;
	}

	public DefaultListModel<String> getModeloParrilla() {
		return modeloParrilla;
	}

	public void setModeloParrilla(DefaultListModel<String> modeloParrilla) {
		this.modeloParrilla = modeloParrilla;
	}

	public JList<String> getListaParrilla() {
		return listaParrilla;
	}

	public void setListaParrilla(JList<String> listaParrilla) {
		this.listaParrilla = listaParrilla;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getVolver() {
		return VOLVER;
	}

	public static String getReproducir() {
		return REPRODUCIR;
	}

	public static String getDetener() {
		return DETENER;
	}

	public static String getAñadiraparrilla() {
		return AÑADIRAPARRILLA;
	}

}