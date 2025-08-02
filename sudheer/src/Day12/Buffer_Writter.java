package Day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter br=new BufferedWriter(new FileWriter("java.txt",true));
		br.write("hello world everyone ");
		br.newLine();
		br.close();
		System.out.println("successfully");

	}

}