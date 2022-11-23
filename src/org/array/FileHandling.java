package org.array;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File loc = new File("C:\\ProjectJava\\Java\\Interface.txt");
		FileUtils.write(loc, "List is an Interface");
		FileUtils.write(loc, "\nSet is an Interface");
		
		List<String> s = FileUtils.readLines(loc);
		System.out.println(s);
		
		for(String x:s)
		{
			System.out.println(x);
		}
		
		
		File loc1 = new File("C:\\ProjectJava\\Java\\Interface1.txt");
		FileUtils.copyFile(loc, loc1);
	}

}
