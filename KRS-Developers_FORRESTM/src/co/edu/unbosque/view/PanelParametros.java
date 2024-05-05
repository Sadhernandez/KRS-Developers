package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelParametros extends JPanel {

	private static final long serialVersionUID = 1L;

	private String[] opcionesTransmision = { "AM", "FM", "Streaming" };
	private String[] opcionesTipo = { "Rock", "Pop", "Reguetón", "Clásica", "Otros" };

	private JComboBox<String> boxTransmision;
	private JComboBox<String> boxTipo;
	private JPanel panel;
	private JPanel panelCampos;
	private JPanel panelSur;
	private JLabel lblTransmision;
	private JLabel lblTipo;
	private JButton butAgregar;
	private JButton butSiguiente;
	private JButton butVolver;

	public static final String AGREGAR = "Agregar";
	public static final String SIGUIENTE = "Siguiente";
	public static final String VOLVER = "Volver";

	public PanelParametros() {

		panel = new JPanel(new BorderLayout());
		panelCampos = new JPanel(new GridLayout(3, 2, 140, 80));
		TitledBorder border = BorderFactory.createTitledBorder("Ingrese los Parametros de su Emisora:");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		lblTransmision = new JLabel("Modo de transmisión:");
		lblTransmision.setFont(new Font("Arial", Font.PLAIN, 16));
		boxTransmision = new JComboBox<>(opcionesTransmision);

		lblTipo = new JLabel("Tipo de música que transmite:");
		lblTipo.setFont(new Font("Arial", Font.PLAIN, 16));
		boxTipo = new JComboBox<>(opcionesTipo);

		panelSur = new JPanel(new GridLayout(1, 3, 10, 30));
		butVolver = new JButton("Volver");
		butVolver.setPreferredSize(new Dimension(180, 20));
		butVolver.setActionCommand(VOLVER);

		butAgregar = new JButton("Agregar");
		butAgregar.setPreferredSize(new Dimension(190, 20));
		butAgregar.setActionCommand(AGREGAR);

		butAgregar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mostrarPropiedades();
			}
		});

		butSiguiente = new JButton("Siguiente");
		butSiguiente.setPreferredSize(new Dimension(190, 20));
		butSiguiente.setActionCommand(SIGUIENTE);

		panelCampos.add(lblTransmision);
		panelCampos.add(boxTransmision);
		panelCampos.add(lblTipo);
		panelCampos.add(boxTipo);
		panelSur.add(butVolver);
		panelSur.add(butAgregar);
		panelSur.add(butSiguiente);

		panel.add(panelCampos, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);
		add(panelSur, BorderLayout.SOUTH);

	}

	private void mostrarPropiedades() {
		String modoTransmision = getModoTransmision();
		String tipoMusica = getTipoMusica();

		String propiedades = """
				Modo de transmisión: %s
				Tipo de música: %s
				""".formatted(modoTransmision, tipoMusica);

		JOptionPane.showMessageDialog(this, propiedades, "Propiedades", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getModoTransmision() {
		return (String) boxTransmision.getSelectedItem();
	}

	public String getTipoMusica() {
		return (String) boxTipo.getSelectedItem();
	}

	public JComboBox<String> getBoxTransmision() {
		return boxTransmision;
	}

	public void setBoxTransmision(JComboBox<String> boxTransmision) {
		this.boxTransmision = boxTransmision;
	}

	public JComboBox<String> getBoxTipo() {
		return boxTipo;
	}

	public void setBoxTipo(JComboBox<String> boxTipo) {
		this.boxTipo = boxTipo;
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

	public JLabel getLblTransmision() {
		return lblTransmision;
	}

	public void setLblTransmision(JLabel lblTransmision) {
		this.lblTransmision = lblTransmision;
	}

	public JLabel getLblTipo() {
		return lblTipo;
	}

	public void setLblTipo(JLabel lblTipo) {
		this.lblTipo = lblTipo;
	}

	public JButton getButAgregar() {
		return butAgregar;
	}

	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}

	public JButton getButSiguiente() {
		return butSiguiente;
	}

	public void setButSiguiente(JButton butSiguiente) {
		this.butSiguiente = butSiguiente;
	}

	public JButton getButVolver() {
		return butVolver;
	}

	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getAgregar() {
		return AGREGAR;
	}

	public static String getSiguiente() {
		return SIGUIENTE;
	}

	public static String getVolver() {
		return VOLVER;
	}

}