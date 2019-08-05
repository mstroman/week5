package lastday;

import java.util.Scanner;

public class pink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner code =  new Scanner(System.in);
		int tokens= 10;
		String golf="play mini golf 8 tokens";
		String sodatoss= " play soda toss for 5 tokens";
		String knockdown="play knock down for 3 tokens";
		String facepaint= "face paint 15 tokens";
		String bouncehouse= "bounce house free";
		
		String name="";
		String candy= new String();
		System.out.println("welcome to wows carnival");
		
	System.out.println("age limit");
	for(int x=10; x <=40; x++ ) {
		System.out.println(x);
	}
		
		System.out.println("enter your name");
		name = code.nextLine();
		
		System.out.println("please enter your token number " + name);
		code.nextLine();
		
		  if (tokens >= 30) {
		    	 System.out.println("these are your choices");
		    	System.out.println(golf);
		    	System.out.println(sodatoss);
		    	System.out.println(knockdown);
		    	System.out.println(facepaint);
		    	System.out.println(bouncehouse);
		    	
		     }
		
		  if(tokens >= 30)
		  System.out.println(" these are your choices");
		  System.out.println(golf);
		  System.out.println(sodatoss);
		  System.out.println(knockdown);
		  System.out.println(facepaint);
		  System.out.println(bouncehouse);
		
			}
	

}
