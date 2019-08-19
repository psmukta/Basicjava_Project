package howToCreateFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class WriteInTheFile {

	public static void main(String[] args) {
		File file=new File("stadyeasy");
		file.mkdir();
		file=new File("stadyeasy\\text.txt");
		/*try {
			file.createNewFile();
			System.out.println("created");
		}
		catch(IOException e) {
			System.out.println("error");

		}*/

		try (BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){ //this try creation of buffered writer
			bw.write("ewu");
			bw.newLine();
			bw.write("djid");
			bw.newLine();
			bw.write("wer");
			bw.newLine();
			System.out.println("writing completed");

		}
		catch(IOException e) {
			System.out.println("error occured while  writing the file ");
		}

	}

}
