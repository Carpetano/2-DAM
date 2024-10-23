package exercises;

import java.io.*;

public class RunReturnArgumentsAddedUp {

	public static void main(String[] args) {
		
		
		ProcessBuilder builder = new ProcessBuilder("java", "exercises.ReturnArgumentsAddedUp", "3", "5");
		
		// Path of the directory where the .classes are
		File directory = new File("./bin");
		builder.directory(directory);
		
		try {
			
			Process process = builder.start();

			try (InputStream stream = process.getInputStream()) {
				
				System.out.print("> Program Output: ");
				int c;
				while((c = stream.read()) != -1) {
					System.out.print((char) c);
				}
				
			}
			
			int returnCode = process.waitFor();
			
			System.out.println("> Program Return Code: " + returnCode);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
