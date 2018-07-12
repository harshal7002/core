package File;

import java.io.FileOutputStream;
import java.util.Scanner;

public class fileeout {
    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("testout.txt");    
	             Scanner sc=new Scanner(System.in);
	             String s=sc.nextLine();
	             byte b[]=s.getBytes();  
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }
	           catch(Exception e)
	           {
	        	   	System.out.println(e);
	        }    
    }
}
