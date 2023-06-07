package data;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {


		File f = new File("C:\\QA\\Testing\\temp1.txt");
		f.createNewFile();
		
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("This is 1st line");
		out.newLine();
		
		out.write("This is 2nd line");
		out.newLine();
		
		out.write("This is 3rd line");
		out.newLine();
		
		out.write("This is 4th line");
		out.flush();
		
		FileReader r = new FileReader(f);
		BufferedReader rd =  new BufferedReader(r);
		
		/*
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		*/
		
		String x;
		int i = 0;
		while((x = rd.readLine()) != null) {
			System.out.println(x);
			i++;
		}
		System.out.println("number of Line:" +i);
		

	}

}
