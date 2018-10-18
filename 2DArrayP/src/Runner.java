import java.util.Scanner;

public class Runner
	{
		public static String screen[][] = new String[2][7];

		public static void main(String[] args)
		{
			screen();
		}
			{
				Database.addWords();
				Scanner userInput = new  Scanner(System.in);
				System.out.println("Enter Name to Play");
				String name = userInput.nextLine();
				System.out.println("Hello," + name + "!" + " Match the cards");
				
System.out.println("                             A1       A2      A3      A4      A5      A6     A7");
System.out.println("                         :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println(screen[1][1]+screen[1][2]+screen[1][3]+screen[1][4]+screen[1][5]+screen[1][6]+screen[1][7]                                                   );
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println("                         :       :       :       :       :       :       :       :");	
System.out.println("                         :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println(screen[2][1]+screen[2][2]+screen[2][3]+screen[2][4]+screen[2][5]+screen[2][6]+screen[2][7]                                                   );
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println("                         :       :       :       :       :       :       :       :");
System.out.println("                         :-------:-------:-------:-------:-------:-------:-------:");
System.out.println("                             B1      B2      B3      B4       B5      B6      B7");

System.out.println("Enter two of the card names Example: A1 A2");
String firstChoice = userInput.nextLine();
// add spaces inbetween the syso look it up 
int row = 0;
int col = 0;
String rowInput = "";


rowInput= firstChoice.substring(0,1);
rowInput = rowInput.toLowerCase();

if (rowInput.equals("a"))
	{
		row=0;
	}
 	

 	

 	if ( rowInput.equals("b"))
 		{
 			row=0;
 		}
 	 	 col = Integer.parseInt(firstChoice.substring(1,2));

			}
public static void screen()
	{
		
	}
		
	}