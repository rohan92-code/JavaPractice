

import java.util.*;
import java.lang.*;
import java.io.*;
// Thread class

class ThreadDemo extends Thread{
    public void run(){
        
        try{
            
          System.out.println("The Thread " +  Thread.currentThread().getId() + " is running");
          
        }catch(Exception e){
            
            System.out.println("Exception " + e);            
        }
        
    }
}

class Test
{
    
	public static void main (String[] args) throws java.lang.Exception
	{   
	    
	    for(int i = 0 ; i < 5; i++){
		ThreadDemo t = new ThreadDemo();
		t.start();
	}
}

}

-------------------------------------------------------------------------------------------------------------------------------



// runnable

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class ThreadDemo implements Runnable{
    public void run(){
        
        try{
            
          System.out.println("The Thread " +  Thread.currentThread().getId() + " is running");
          
        }catch(Exception e){
            
            System.out.println("Exception " + e);            
        }
        
    }
}

class Test
{
    
    
	public static void main (String[] args) throws java.lang.Exception
	{   
	    
	    for(int i = 0 ; i < 5; i++){
	        ThreadDemo d = new ThreadDemo();
		    Thread t = new Thread(d);
		    t.start();
	}
}

}



