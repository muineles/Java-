package org.java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperations {

public static void main(String[] args) throws IOException {
	
// enter location name for where to create the folder	
File file = new File("E:\\File"); 
boolean mkdir = file.mkdir();
System.out.println(mkdir);

//to create folders
File file1 = new File("E:\\File1\\Janani");
boolean mkdirs = file1.mkdirs();
System.out.println(mkdirs);

//to create new file
File file2 = new File("E:\\File1\\Janani\\test.txt");
boolean createNewFile = file2.createNewFile();
System.out.println(createNewFile);

//to check can write the file r not	
boolean canWrite = file2.canWrite();
System.out.println(canWrite);

//to check can read the file r not
boolean canRead = file2.canRead();
System.out.println(canRead);

//to check can execute the file r not
boolean canExecute = file2.canExecute();
System.out.println(canExecute);

//appand to add the data
FileUtils.write(file2, "Hi \nJanani \tKumar");

//appand to add with follows the previous data
FileUtils.write(file2, "\nWelcome to the \tNew World",true);

//to read and print the content of file as string
String readFileToString = FileUtils.readFileToString(file2);
System.out.println(readFileToString);
	
System.out.println("+++++++++++++++++++++++++++");

//to read and print the content of file as List then convert to String
List<String> readLines = FileUtils.readLines(file2);
System.out.println(readLines);
for (String string : readLines) {
	System.out.println(string);
}
}
}
