
public class Card
	{
		private int name;
		private String object;
		
		public Card(int n, String o)
		{
			name = n;
			object = o;								
		}
		public int getname()
		{
			return name;
		}
		public void setObject(int name)
		{
			this.name = name;
		}
	public String getObject()
	{
		return object;
	}
	public void setObject(String name)
	{
		this.object = object;
	}
	public String toString()
	{
		return name + "is" + name;
	}
	}

