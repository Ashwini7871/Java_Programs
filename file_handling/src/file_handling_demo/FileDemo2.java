package file_handling_demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		File file = new File("/home/ashwini/Documents/ashu.txt");
//		FileWriter pen = new FileWriter(file);
//		pen.write("siva \n");
//		pen.write("praveen ");
//		pen.write("amalraj ");
//		pen.flush();
//		pen.close();
		
		//add information
		File file = new File("/home/ashwini/Documents/ashu.txt");
//		FileWriter pen = new FileWriter(file,true);//defalut:false
////		pen.write("ashu \n");
////		pen.write("sabari ");
////		pen.write("ajitha ");
////		pen.flush();
////		pen.close();
//		//----------------------//
//		
//		BufferedWriter bufWriter = new BufferedWriter(pen);
//		
//		bufWriter.write("ajitha ");
//		bufWriter.newLine();
//		bufWriter.write("sabaribala");
//		bufWriter.newLine();
//		bufWriter.write("yogesh balaji ");
//		bufWriter.newLine();
//		bufWriter.flush();
//		bufWriter.close();
		
		
		/*filereader*/
		
		FileReader reader = new FileReader(file);//input = writer
//		System.out.println(reader.read());
//		int i = reader.read();
//	while(i!=-1) {
//		
//		char ch = (char)i;
//		System.out.print(ch);
//		i = reader.read();
		
		/*bufferdreader*/
		BufferedReader bufReader = new BufferedReader(reader);
		String i = bufReader.readLine();
		int no_of_lines=0;
		int no_of_letters=0;
		while(i!=null)
		{
		System.out.println(i+" "+i.length());
		no_of_letters=no_of_letters+i.length();
		i = bufReader.readLine();
		no_of_lines++;
		}
		System.out.println(no_of_lines);
		System.out.println(no_of_letters);

	}
		
	

}

