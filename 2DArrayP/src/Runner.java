import java.util.Scanner;

public class Runner
	{
		
		public static void main(String[] args)
			{
				Database.addWords();
				Scanner userInput = new  Scanner(System.in);
				System.out.println("Enter Name to Play");
				String name = userInput.nextLine();
				System.out.println("Hello," + name + "!" + " Match the cards");
				
System.out.println("             A1       A2      A3      A4      A5      A6     A7");
System.out.println("          :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println(" 		" 				   		   				     	       );
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :       :       :       :       :       :       :       :");	
System.out.println("          :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :       :       :       :       :       :       :       :");
System.out.println("          :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("             B1      B2      B3      B4       B5      B6      B7");

System.out.println("Enter two of the card names Example: A1 A2");
String firstChoice = userInput.nextLine();

 



			}

		
	}