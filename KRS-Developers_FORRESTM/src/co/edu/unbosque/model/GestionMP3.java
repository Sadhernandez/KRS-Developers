package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GestionMP3 {

	private static List<String> archivosMP3 = new ArrayList<>();

	public static void seleccionarArchivo() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setMultiSelectionEnabled(true);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos MP3", "mp3");
		fileChooser.setFileFilter(filter);
		int returnValue = fileChooser.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File[] selectedFiles = fileChooser.getSelectedFiles();
			for (File file : selectedFiles) {
				archivosMP3.add(file.getAbsolutePath());
			}
		}
	}

	public static List<String> getArchivosMP3() {
		return archivosMP3;
	}
}