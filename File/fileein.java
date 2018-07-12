/**
 * @author Harshal
 * inputstream,file read,duplicate,unique and word count
 */
package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class fileein {
	public static void main(String[] args) throws FileNotFoundException
	{
		try {
			FileInputStream fin=new FileInputStream("testout.txt");
			int i=0,cout=0;
			StringBuilder sb=new StringBuilder();
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
				sb.append((char)i);
			}
			
//			String s=sb.toString();
//			if(s.charAt(0)!=' ')
//			{
//					cout++;
//			}
//			for(i=0;i<s.length()-1;i++)
//			{
//				if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
//				{
//					cout++;
//				}
//			}
			System.out.println();
//			System.out.println("no of words:"+cout);
			
			String[] s1=sb.toString().split("[-!~\\s]+");
			Set<String> unq=new HashSet<String>();
			ArrayList<String> words=new ArrayList<String>();
			
			for(String w:s1)
			{
				unq.add(w);
				words.add(w);
			}
			
			System.out.println(words);
			System.out.println("no of words: "+words.size());
			System.out.println("no of unique words");
			System.out.println(unq);
			
			fin.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
