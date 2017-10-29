package Fehlerbehandlung;

import java.io.IOException;

public class DBWrapper {
	private PoorMansDatabase db;

	public DBWrapper(String filename) throws IOException {
		db = new PoorMansDatabase(filename);
		
	}

	public void saveDate(int key, String value) throws IOException {
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			try {
				db.save(key, value);
				counter = 2;
			} catch (IOException e) {
				e.printStackTrace();
			}
			counter++;
		}
		if (counter == 2) {
			throw new IOException();
		}
	}

	public void loadData(int key) throws IOException {
		int counter =0;
		for (int i = 0; i < 3; i++) {
			try {
				db.load(key);
				counter = 2;
			} catch (IOException e) {
				e.printStackTrace();
			}
			counter++;
		}
		if (counter == 2) {
			throw new IOException();
		}

	}



}