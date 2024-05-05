package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JPanel panelCampos;
	private JPanel panelSur;
	private JButton butPistas;
	private JButton butParrilla;
	private JButton butVolver;

	public static final String PISTAS = "Crear pistas";
	public static final String PARRILLA = "Parrila de Programación";
	public static final String VOLVER = "Volver";

	public PanelEntrada() {
		panel = new JPanel(new BorderLayout());
		panelCampos = new JPanel(new GridLayout(1, 2, 10, 10));

		butPistas = new JButton("Crear pistas");
		butPistas.setPreferredSize(new Dimension(280, 200));
		butPistas.setActionCommand(PISTAS);

		butParrilla = new JButton("Parrilla de Programación");
		butParrilla.setPreferredSize(new Dimension(280, 200));
		butParrilla.setActionCommand(PARRILLA);

		panelSur = new JPanel(new GridLayout(1, 3, 40, 40));

		butVolver = new JButton("Volver");
		butVolver.setPreferredSize(new Dimension(150, 50));
		butVolver.setActionCommand(VOLVER);

		panelCampos.add(butPistas);
		panelCampos.add(butParrilla);
		panelSur.add(butVolver);

		panel.add(panelCampos, BorderLayout.CENTER);

		add(panel, BorderLayout.CENTER);
		add(panelSur, BorderLayout.SOUTH);
	}

	public JButton getButPistas() {
		return butPistas;
	}

	public void setButPistas(JButton butPistas) {
		this.butPistas = butPistas;
	}

	public JButton getButParrilla() {
		return butParrilla;
	}

	public void setButParrilla(JButton butParrilla) {
		this.butParrilla = butParrilla;
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

	public static String getPistas() {
		return PISTAS;
	}

	public static String getParrilla() {
		return PARRILLA;
	}

	public static String getVolver() {
		return VOLVER;
	}

}
