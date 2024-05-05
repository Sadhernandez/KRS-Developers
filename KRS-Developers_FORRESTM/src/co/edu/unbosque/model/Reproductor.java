package co.edu.unbosque.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Reproductor {

	private Player player;

	public Reproductor() {
		super();

	}

	public void reproducir(String rutaArchivo) throws FileNotFoundException, JavaLayerException {
		FileInputStream fis = new FileInputStream(rutaArchivo);
		player = new Player(fis);
		new Thread(() -> {
			try {
				player.play();
			} catch (JavaLayerException e) {
				e.printStackTrace();
			}
		}).start();
	}

	public void detener() {
		if (player != null) {
			player.close();
		}
	}

	public Player getPlayer() {
		return player;
	}
}
