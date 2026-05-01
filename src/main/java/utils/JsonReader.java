
package utils;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader {

	// This object helps convert JSON into Java objects
	private static ObjectMapper mapper = new ObjectMapper();

	// This method reads JSON file and returns data as a List
	public static <T> List<T> readJsonListFromResources(String fileName, Class<T[]> clazz) {

		try {
			// Load file from resources/testdata folder
			InputStream input = JsonReader.class.getClassLoader().getResourceAsStream("testdata/" + fileName);

			if (input == null) {
				throw new RuntimeException("File not found: " + fileName);
			}

			T[] dataArray = mapper.readValue(input, clazz); // Convert JSON into Java array
			return Arrays.asList(dataArray); // Convert array into List and return

		} catch (Exception e) {

			throw new RuntimeException("Error reading JSON file: " + fileName, e);
		}
	}
}