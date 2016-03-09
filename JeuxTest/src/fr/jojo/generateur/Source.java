package fr.jojo.generateur;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Source {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s = new Source();
		try {
			s.loadSource();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void loadSource() throws IOException, FileNotFoundException {
		// test resssource bundle ok 
		/*
		Locale locale = new Locale("fr", "FR");
		ResourceBundle messages = ResourceBundle.getBundle("test", locale);
		
		System.out.println(messages.getString("source_1"));
		*/
		
		// test Properties ok
		Properties properties = new Properties();
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test_fr.properties" );
		
		try {
			properties.load(inputStream);
			
		} catch (IOException e) {
			System.out.println("Unable to load config file.");
			e.printStackTrace();
		} finally {
			inputStream.close();
		}

		System.out.println(properties.getProperty("source_1", "no-source"));
	}
}
