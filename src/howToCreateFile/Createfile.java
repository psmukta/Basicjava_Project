package howToCreateFile;

import java.io.File;
import java.io.IOException;

public class Createfile {

	public static void main(String[] args) throws IOException {
		File file=new File("src\\Files.txt");
		file.createNewFile();
		//File directory=new File("Directory\\Chand\\author");
		//directory.mkdir();//will make one directory
		
		//directory.mkdirs();
		//File file=new File("Directory\\Chand\\author\\Files.txt");
							//C:Directory\\Chand\\author\\Files.txt
							//create within C drive 
		//file.createNewFile();
		
		
	}

}
