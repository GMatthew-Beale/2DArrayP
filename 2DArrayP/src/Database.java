import java.util.ArrayList;
import java.util.Collections;
public class Database
	{
		
		
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


for (String s : words)
	{
		System.out.println(s);
	}






		}
	}
