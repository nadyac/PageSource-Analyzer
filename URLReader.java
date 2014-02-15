/**
*	Read the source code and html of a webpage. I don't have a practical use for this yet, but I'll find one soon enough.
*/

import java.net.URL;
import java.util.Scanner;
import java.io.*;

public class URLReader{


	public static void main(String[] args) throws IOException{

		try{
			//URLobj myURL = new URLobj();

			System.out.println("Type in a URL in www.something.com format");
			Scanner scanUrl= new Scanner(System.in);
			String string= "http://" + scanUrl.nextLine();
			
			//System.out.println("The URL entered is " + string);

			URL url = new URL(string);
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			
			while ((line = in.readLine()) != null){

				System.out.println(line);
			}
		 in.close();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}

}