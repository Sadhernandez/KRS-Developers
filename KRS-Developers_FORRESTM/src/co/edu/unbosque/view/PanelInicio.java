package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelInicio extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel panel;
	private JPanel panelCampos;
	private JLabel lblTitulo;
	private JButton butIniciar;
	private JButton butSalir;

	public static final String INICIAR = "Iniciar";

	public PanelInicio() {

		panel = new JPanel(new BorderLayout());
		panelCampos = new JPanel(new GridLayout(3, 1, 10, 10));

		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		lblTitulo = new JLabel("ForrestM", SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 24));

		butIniciar = new JButton("Iniciar");
		butIniciar.setPreferredSize(new Dimension(400, 80));
		butIniciar.setActionCommand(INICIAR);

		butSalir = new JButton("Salir");
		butSalir.setPreferredSize(new Dimension(400, 80));
		butSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		panelCampos.add(lblTitulo);
		panelCampos.add(butIniciar);
		panelCampos.add(butSalir);

		panel.add(panelCampos, BorderLayout.CENTER);
		add(panel, BorderLayout.CENTER);

	}

	public JButton getButIniciar() {
		return butIniciar;
	}

	public void setButIniciar(JButton butIniciar) {
		this.butIniciar = butIniciar;
	}

	public JButton getButSalir() {
		return butSalir;
	}

	public void setButSalir(JButton butSalir) {
		this.butSalir = butSalir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getIniciar() {
		return INICIAR;
	}

}
