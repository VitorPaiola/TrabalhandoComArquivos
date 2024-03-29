package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {
			System.out.println(file);
		}
		// Cria uma subpasta, a partir de uma pasta
		boolean sucess = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + sucess);
		
		sc.close();

	}
// folder: pasta		files: arquivos
}
