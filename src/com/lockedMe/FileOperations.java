package com.lockedMe;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class FileOperations {
	 public static void CreateFolder(String folderName) {
	        File file = new File(folderName);
	        // If folder doesnot exist then create
	        if (!file.exists()) {
	            file.mkdirs();
	        }
	    }
	    public static void writefile(String filename, String content) throws IOException {
	        File file = new File("Main/" + filename);
	        FileWriter writer = new FileWriter(file);
	        writer.write(content);
	        writer.close();
	    }
	    public static void  createNewFile(String filename) throws IOException {
	        File file = new File("Main/" + filename);
	        Scanner sc = new Scanner(System.in);
	        try {
	            if (file.createNewFile()) {
	                System.out.println(filename + " " + "created succesfully");
	                System.out.println("Would you like to add content in the file? (Y/N)");
	                char input = sc.nextLine().charAt(0);
	                switch (input) {
	                    case 'Y':
	                    case 'y':
	                        System.out.println("\n\n Add content and press enter\n");
	                        String content = sc.nextLine();
	                        writefile(filename, content);
	                        System.out.println("\nContent written to file " + filename);
	                        break;
	                    default:
	                        System.out.println("ok");
	                }
	            } else {
	                System.out.println("file Already Exist");
	                System.out.println("\n\n Add content and press enter\n");
	                String content = sc.nextLine();
	                appendFile(filename, content);
	                System.out.println("\nContent written to file " + filename);

	            }
	        } 
	        catch (Exception ex) {
	            System.out.println("Failed to create file " + filename);
	        }
	    }
	    public static void appendFile(String filename, String content) throws IOException {
	        File f1 = new File("Main/" +filename);
	        if (f1.exists()) {
	            File file = new File("Main/" + filename);
		    	FileWriter fr = new FileWriter(file, true);
		    	BufferedWriter br = new BufferedWriter(fr);
		    	br.write(content);
		    	br.close();
		    	fr.close();      
	            System.out.println("Data Append");
	        } 
	      
	    }
	    public static void displayFile(String fileName, String path) {
	        String fileListNames = new String();
	        fileListNames=FileOperations.searchFile(path, fileName);
	        if (fileListNames.isEmpty()) {
	            System.out.println("\n\n** Couldn't find any file with given file name \"" + fileName + "\" ** \n\n");
	        }else {
	            System.out.println("\n\nFound file at below location(s):");
	            System.out.println(fileListNames);
	        }
	    }
	    public static String searchFile(String path, String fileName) {
	        File dir = new File(path);
	        File[] files = dir.listFiles();
	        List<File> filesList = Arrays.asList(files);
	        String result=new String();

	        if (files != null && files.length > 0) {
	            for (File file : filesList) {

	                if (file.getName().equals(fileName)) {
	                   return result=file.getAbsolutePath().toString();
	                }
	            }
	        }
	        return result;
	    }

	    public static void deleteFile(String filename) {

	        File currFile = new File("Main/");
	        File[] files = currFile.listFiles();
	        boolean present=false;
	        if (files != null && files.length > 0) {
	            
	            for (File file : files) {
	                String fileName = file.getName() + " at " + file.getAbsolutePath();
	                if (file.isDirectory()) {
	                    deleteFile(file.getAbsolutePath());
	                }
	                if (file.getName().equals(filename)) {
	                    present=true;
	                    if (file.delete()) {
	                        System.out.println(fileName + " deleted successfully");
	                    } else {
	                        System.out.println("Failed to delete " + filename);
	                    }
	                }
	            }
	            if(!present)
	            {
	                System.out.println("File is not present");
	            }
	        }
	    }

	    public void RetrivingfilesInAscOrder() {
	        File directoryPath = new File("Main/");
	        String contents[] = directoryPath.list();
	        System.out.println("List of files and directories in the specified directory:");
	        Collections.sort(Arrays.asList(contents));
	        for (int i = 0; i < contents.length; i++) {
	            System.out.println(contents[i]);
	        }
	    }
}


	
	    


