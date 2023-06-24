package file_handling_demo;

import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File fileFolder = new File("/home/muthu/Downloads/sabaribala.txt");
//		System.out.println(fileFolder.isDirectory()); 
//		System.out.println(fileFolder.isFile());
//		System.out.println(fileFolder.getName());
//		System.out.println(fileFolder.mkdir());
		///-----------------//
//		File fileFolder = new File("/home/ashwini/Documents/ashwini1");
//		System.out.println(fileFolder.isDirectory()); 
//		System.out.println(fileFolder.isFile());
//		System.out.println(fileFolder.getName());
//		System.out.println(fileFolder.mkdir());
//		System.out.println(fileFolder.isDirectory());
		//-------------------make sub directies//

		File fileFolder = new File("/home/ashwini/Documents/balaji/arunkumar/ashwini");
		System.out.println(fileFolder.isDirectory()); 
		System.out.println(fileFolder.isFile());
		System.out.println(fileFolder.getName()); 
		System.out.println(fileFolder.mkdirs()); 
		System.out.println(fileFolder.isDirectory());
		
		
	}

}
