import java.io.*;
public class Q10{
    public static void main(String[] args){
        try{
            FileInputStream fis1 = new FileInputStream("binFile1.txt");
            FileInputStream fis2 = new FileInputStream("binFile2.txt");
            int pos=1,i=0,j=0;
            while( (i=fis1.read())!=-1 && (j=fis2.read())!=-1 ){
                if(i!=j){
                    System.out.println("The Two files differ at position: "+pos);
                    break;
                }
                else{
                    pos++;
                }      
            }
            fis1.close();
            fis2.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}