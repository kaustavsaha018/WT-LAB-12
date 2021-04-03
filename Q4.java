import java.io.*;

public class Q4{
 
	public static void main(String[] args){
 
		try{
			FileReader fr = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("output.txt", true);
			
			int s;
			
			while((s = br.read()) != -1) { 	
				fw.write((char)s); 						
				fw.flush();
			}
			br.close();
			fw.close();
            
			System.out.println("File copied successfully!");
		} 
		catch(IOException e){
			e.printStackTrace();
		}
	}
}