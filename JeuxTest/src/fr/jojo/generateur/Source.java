package fr.jojo.generateur;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Source {
	protected static List<String> lstSource = new ArrayList<String>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s = new Source();
		try {
			s.loadSource();
			System.out.println("lst" + lstSource.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void loadSource() throws IOException, FileNotFoundException {
		
		Properties properties = new Properties();
		
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("source.properties" );
		
		try {
			properties.load(inputStream);
			
		} catch (IOException e) {
			System.out.println("Unable to load config file.");
			e.printStackTrace();
		} finally {
			inputStream.close();
		}

		int size = new Integer(properties.getProperty("source.nb", "0"));
		for (int i=1;i<=size; i++) {
			lstSource.add(properties.getProperty("source."+i, null));
		}
	}
}
