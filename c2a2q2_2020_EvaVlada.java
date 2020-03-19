package c2a2q2_2020_EvaVlada.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class c2a2q2_2020_EvaVlada {

	public static void main(String[] args) throws FileNotFoundException {


		/**
		 * 
		 * Write a program (c2a2q2_2020_StudentName.java) that reads each line in a file,
		 *  reverses its lines, and writes them to another file. 
		 * @throws FileNotFoundException 
		 * 
		 */
		
			
	      String inputFileName="input.txt";
	      String outputFileName="CreatedFile2.txt";
	     
		
		 ArrayList<String> content = readFile(inputFileName);
		 
		ArrayList<String> out = writeFile(outputFileName, content);
		
	    
	      }
	//reads file into console line by line
	
		public static ArrayList<String> readFile(String inputFileName) throws FileNotFoundException
		{
			
			File inputFile= new File(inputFileName);
			Scanner in= new Scanner(inputFile);
			// use ArrayList to read the file
			ArrayList<String> readFile = new ArrayList<String>();

	        while (in.hasNextLine()) {

	           String currentLine = in.nextLine();
	        System.out.println(currentLine);
	            readFile.add(currentLine);

	        }
			
	        in.close();
			
	       return readFile;
			}
		
		//writes the file into a new text file after reverses it
			
		public static ArrayList<String> writeFile(String outputfilename, ArrayList<String> content) throws FileNotFoundException {

	        File doc = new File(outputfilename);

	        PrintWriter out = new PrintWriter(doc);
//reverse the lines

	        for (int i = content.size() - 1; i >= 0; i--) {

	        	
	          String currentLine = content.get(i);
	          
	            out.write(currentLine+System.lineSeparator());  // use System.LineSeparator() to write them line by line

	        }
	        out.close();
			return content;

	    }		

	}


