import java.io.*;

public class Q11{
	public static String capitalizeEachWord(String str){  
		String words[]=str.split("\\s");  
		String capitalizeEachWord="";  
		for(String w:words){  
			String first=w.substring(0,1);  
			String afterfirst=w.substring(1);  
			capitalizeEachWord+=first.toUpperCase()+afterfirst+" ";  
		}  
		return capitalizeEachWord.trim();  
	}  
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("myNewFile.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String s;
			String temp="";
			
			while((s = br.readLine()) != null) { 	
				temp=temp+s; 						
			}
			br.close();
			
			FileWriter fw = new FileWriter("myNewFile.txt");
			
			fw.write(capitalizeEachWord(temp));
			fw.flush();
			fw.close();
            
			System.out.println("Each word of File is Successfully Copied!");
		} 
		catch(IOException e){
			e.printStackTrace();
		}
	}
}