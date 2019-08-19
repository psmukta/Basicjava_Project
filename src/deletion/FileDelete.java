package deletion;

import java.io.File;
import java.io.IOException;

public class FileDelete {

	public static void main(String[] args) throws IOException {
		File file=new File("src\\file.txt");
		file.createNewFile();
		if(file.delete()) {
			System.out.println("delete");
		}
		else {
			System.out.println("error will deleted");
		}
	}

}
