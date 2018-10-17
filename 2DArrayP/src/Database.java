import java.util.ArrayList;
import java.util.Collections;

public class Database
	{

		public static void main(String[] args)
			{
			//	test();
				addWords();
			}

		

		static String screen[][] = new String[2][7];
		static String answers[][] = new String[2][7];

		static ArrayList<String> words = new ArrayList<String>();

		public static void addWords()
			{
				words.add("Dog");
				words.add("Cat");
				words.add("Cow");
				words.add("Pig");
				words.add("Rat");
				words.add("Bat");
				words.add("Bee");
				words.add("Dog");
				words.add("Cat");				
				words.add("Cow");
				words.add("Pig");
				words.add("Rat");
				words.add("Bat");
				words.add("Bee");

				Collections.shuffle(words);
				int index = 0;
				for (int row = 0; row < 2; row++)
					{
						for (int col = 0; col < 7; col++)
							{
								answers[row][col] = words.get(index);

								index++;
							}
					}
			}
				
				
				
				
				public static void test()
					{
				for (int row = 0; row < 2; row++)
					{
						for (int col = 0; col < 7; col++)
							{
								System.out.print(answers[row][col] + "   ");
							}
					//	index++;
						System.out.println();
					}

			}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

