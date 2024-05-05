package co.edu.unbosque.view;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import co.edu.unbosque.controller.Controller;

public class PanelCrearPistas extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField txtNombre;
	private JTextField txtGenero;
	private JTextField txtAutor;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblAutor;
	private JLabel lblMp3;
	private JPanel panel;
	private JPanel panelCampos;
	private JPanel panelSur;
	private JButton butAgregar;
	private JButton butVolver;
	private JButton agregarMP3;

	public static final String AGREGAR = "Agregar";
	public static final String VOLVER = "Volver";
	public static final String AGREGARMP3 = "AgregarMP3";

	private Controller controller;

	public PanelCrearPistas(Controller controller) {
		this.controller = controller;

		panel = new JPanel(new BorderLayout());
		panelCampos = new JPanel(new GridLayout(4, 2, 280, 49));
		TitledBorder border = BorderFactory.createTitledBorder("Ingrese los datos de su canción:");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		lblNombre = new JLabel("Nombre de la canción:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNombre = new JTextField();
		txtNombre.setForeground(Color.BLACK);

		lblGenero = new JLabel("Genero Musical:");
		lblGenero.setFont(new Font("Arial", Font.PLAIN, 16));
		txtGenero = new JTextField();
		txtGenero.setForeground(Color.BLACK);

		lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Arial", Font.PLAIN, 16));
		txtAutor = new JTextField();
		txtAutor.setForeground(Color.BLACK);

		lblMp3 = new JLabel("Nombre MP3:");
		lblMp3.setFont(new Font("Arial", Font.PLAIN, 16));
		agregarMP3 = new JButton("Agregar MP3");
		agregarMP3.setPreferredSize(new Dimension(20, 20));
		agregarMP3.setActionCommand(AGREGARMP3);

		panelSur = new JPanel(new GridLayout(1, 2, 40, 40));

		butVolver = new JButton("Volver");
		butVolver.setPreferredSize(new Dimension(200, 20));
		butVolver.setActionCommand(VOLVER);

		butAgregar = new JButton("Agregar");
		butAgregar.setPreferredSize(new Dimension(200, 20));
		butAgregar.setActionCommand(AGREGAR);

		panelCampos.add(lblNombre);
		panelCampos.add(txtNombre);
		panelCampos.add(lblGenero);
		panelCampos.add(txtGenero);
		panelCampos.add(lblAutor);
		panelCampos.add(txtAutor);
		panelCampos.add(lblMp3);
		panelCampos.add(agregarMP3);
		panelSur.add(butVolver);
		panelSur.add(butAgregar);

		panel.add(panelCampos, BorderLayout.CENTER);

		add(panel, BorderLayout.CENTER);
		add(panelSur, BorderLayout.SOUTH);

		butAgregar.addActionListener(e -> {
			String nombre = txtNombre.getText().trim();
			String genero = txtGenero.getText().trim();
			String autor = txtAutor.getText().trim();

			if (nombre.isEmpty() || genero.isEmpty() || autor.isEmpty()) {
				// Mostrar un mensaje indicando que se deben ingresar los datos
				JOptionPane.showMessageDialog(this, "Por favor, ingrese los datos de la canción.", "Datos incompletos",
						JOptionPane.WARNING_MESSAGE);
			} else {
				// Agregar la canción y mostrar el mensaje de éxito
				controller.agregarCancion(nombre, genero, autor);
			}
		});

		agregarMP3.addActionListener(e -> {
			controller.seleccionarArchivo();
		});
	}

	public JButton getButVolver() {
		return butVolver;
	}

	public void setButVolver(JButton butVolver) {
		this.butVolver = butVolver;
	}

	public static String getVolver() {
		return VOLVER;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtGenero() {
		return txtGenero;
	}

	public void setTxtGenero(JTextField txtGenero) {
		this.txtGenero = txtGenero;
	}

	public JTextField getTxtAutor() {
		return txtAutor;
	}

	public void setTxtAutor(JTextField txtAutor) {
		this.txtAutor = txtAutor;
	}

	public JButton getAgregarMP3() {
		return agregarMP3;
	}

	public void setAgregarMP3(JButton agregarMP3) {
		this.agregarMP3 = agregarMP3;
	}

	public static String getAgregarmp3() {
		return AGREGARMP3;
	}

	public JButton getButAgregar() {
		return butAgregar;
	}

	public void setButAgregar(JButton butAgregar) {
		this.butAgregar = butAgregar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getAgregar() {
		return AGREGAR;
	}

}