package JavaActivity4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		File file = FileUtils.getFile("C://DINESH US BACK UP/Dineshauto.txt");
		
		boolean filecreate = file.createNewFile();
		
		if (filecreate) {
			
			System.out.println("new file created successfuly");
		}else {
			System.out.println("File already exist");
		}
		
		String readfile = FileUtils.readFileToString(file, "UTF8");
		
		System.out.println("Data in file: "+ readfile);
		
		File destdir = FileUtils.getFile("C://DINESH US BACK UP/DINESH_Document");
		FileUtils.copyFileToDirectory(file, destdir);
		
		File newfile = FileUtils.getFile(destdir, "Dineshauto.txt");	
		String datainnewfile = FileUtils.readFileToString(newfile, "UTF8");
		
		System.out.println("Data in New file : "+ datainnewfile);
		
		
	}

}
