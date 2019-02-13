package assign_pacage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet_Count {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\eclipse\\Projects\\Apex\\Assiagnment\\TextFile.txt");
		FileInputStream fs = new FileInputStream(f);
		InputStreamReader is = new InputStreamReader(fs);
		
		BufferedReader br = new BufferedReader(is);
		
		String l;
		
		int count = 0;
		
		while( (l = br.readLine())!="null")
         { 
			
        	 if (l.equals ("a"))
        		 
        	 {
        		 count=l.length();
        	 
        	 }
        		 
        	 
         }	
			
		
		System.out.println("No of char a are " + count );
		}
		
		

	}

