package agile.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private int a;
	private int b;
	
	public App(){
		
	}
    public static void main( String[] args ) throws IOException
    {
    	App myapp = new App();
    	//int sum = myapp.sum(2,5);
    	System.out.println("Please enter first number"+"\n");
    	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    	
    	int a = Integer.valueOf(bufferRead.readLine()).intValue();
    	System.out.println("Please enter second number" + "\n");
    	BufferedReader bufferRead1 = new BufferedReader(new InputStreamReader(System.in));
 	    
 	    int b = Integer.valueOf(bufferRead1.readLine()).intValue();
 	    bufferRead.close();
 	    bufferRead1.close();
 	    int sum = myapp.sum(a,b);
        System.out.println( "Sum is =" + sum );
    }
    
     public int sum (int a, int b){
    	return a+b;
    }
     
     
}
