/**
*	Read the source code and html of a webpage. I don't have a practical use for this yet, but I'll find one soon enough.
*/
import java.net.URL;
import java.util.Scanner;
import java.io.*; //includes File, FileWriter

public class URLReader{

	public static void main(String[] args) throws IOException{
		try{
			File outFile = new File("websource.html");
			//-----------------------
			//If file DNE, create it
			//-----------------------
			if(!outFile.exists()){
				outFile.createNewFile();
			}
			//-----------------------------
			//URLobj myURL = new URLobj();
			//-----------------------------
			System.out.println("Type in a URL in www.something.com format");
			Scanner scanUrl= new Scanner(System.in);
			String string= "http://" + scanUrl.nextLine();
			//--------------------------------------------------------
			//Take user input as the URL name for the new URL object. 
			//Read the URL's source contents object using BufferedReader
			//----------------------------------------------------------
			URL url = new URL(string);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			//------------------------------------------------------
			//Make BufferedWriter to write URL source to output file
			//------------------------------------------------------
			FileWriter fw = new FileWriter(outFile.getAbsoluteFile());
			BufferedWriter output = new BufferedWriter(fw);
			//---------------------------------------------------
			//Read the lines of source, write them to output file
			//---------------------------------------------------
			while ((line = in.readLine()) != null){
				System.out.println(line);
				output.write(line);
			}
		//------------------------------
		//Close the reader and writer.
		//------------------------------
		 in.close();
		 output.close();
		 //Catch clause
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("An error occurred with the output file or while reading the URL");
		}		
	}
}