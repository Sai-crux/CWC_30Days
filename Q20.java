package cwc30;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q20 {

	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		streamWriter.write("This is printed without using the print statement");
		streamWriter.flush();

	}

}
