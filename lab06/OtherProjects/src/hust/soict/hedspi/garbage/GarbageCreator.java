package hust.soict.hedspi.garbage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
	    FileReader fileReader
        = new FileReader(
            "E:\\workspaceForEclipse\\OtherProjects\\src\\fileTest.txt");

	    BufferedReader reader = new BufferedReader(fileReader);
	    String s = "";
		long start =  System.currentTimeMillis();
		System.out.println("abc");
		String line = reader.readLine();
		while (line!=null) {
			s += line;
			line = reader.readLine();
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
