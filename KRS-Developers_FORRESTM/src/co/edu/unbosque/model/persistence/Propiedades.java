package co.edu.unbosque.model.persistence;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

	private Properties prop = new Properties();
	private String archivoProp = "";

	public String leerPropiedades() {
		String linea = "";

		try {
			prop.load(new FileInputStream(archivoProp));

			prop.list(System.out);

			linea += "Modo de transmision :" + prop.getProperty("ModoTransmision") + "\n";
			linea += "Tipo de musica : " + prop.getProperty("TipoMusica") + "\n";
			linea += "Titulo de la ventana" + prop.getProperty("TituloVentana");

		} catch (IOException e) {

			e.printStackTrace();
		}

		return linea;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoProp() {
		return archivoProp;
	}

	public void setArchivoProp(String archivoProp) {
		this.archivoProp = archivoProp;
	}

}
