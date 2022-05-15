package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
	public static void main(String[] args) throws IOException {
		FileReader fileReader
        = new FileReader(
            "E:\\workspaceForEclipse\\OtherProjects\\src\\fileTest.txt");

	    BufferedReader reader = new BufferedReader(fileReader);
	    StringBuffer s = new StringBuffer();
	    long start =  System.currentTimeMillis();
	    String line = reader.readLine();
	    while(line!=null) {
	    	s.append(line);
	    	line = reader.readLine();
	    }
	    System.out.println(System.currentTimeMillis() - start);
	}
}
