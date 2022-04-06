package com.lti.exp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex8_TryWithResEx {

	public static void main(String[] args) {

		//before java 7	
	BufferedReader br = null;

		try {

			String line;

			br = new BufferedReader(new FileReader("D:\\IOStreamFiles\\testfile.txt"));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} finally
		{
			try {
				if (br != null)
				br.close();// before java 7 
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}	
		// after jdk7  try with resource 
		//finally is no longer required. 
		//The file /db connection will be closed automatically after try block.
// All classes implementing java.lang.AutoCloseable interface can be used inside the try-with-resources construct.
		try (BufferedReader br1 = new BufferedReader(new FileReader("D:\\IOStreamFiles\\testfile.txt")))
		{

			String line;

			while ((line = br1.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/* can declare multiple resources inside try 
try(  FileInputStream input = new FileInputStream("file.txt");
BufferedInputStream bufferedInput = new BufferedInputStream(input)
)
You can also implement the java.lang.AutoCloseable 
interface in your own classes, 
and use them with the try-with-resources construct.

public class MyAutoClosable implements AutoCloseable {
    public void doIt() {
        System.out.println("MyAutoClosable doing it!");
    }
    @Override
    public void close() throws Exception {
     System.out.println("MyAutoClosable closed!");
    }
}
*/

