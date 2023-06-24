package file_handling_demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file_obj = new File("/home/ashwini/Documents/ashwini.txt");
//		file_obj.createNewFile();
//		System.out.println(file_obj.createNewFile());

		System.out.println(file_obj.exists());//return:boolean
		System.out.println(file_obj.lastModified());
		Date dd = new Date(file_obj.lastModified());
		System.out.println(dd);
		System.out.println(dd.getDay());//deprecatedd-->this is not in latest version in java
	}

}
