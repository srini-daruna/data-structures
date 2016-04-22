package com.srini.test;

public class EnumTest
{
	public static void main(String[] args)
	{
		Types choice = Types.AUTINE;
		
		// Enum traversal for getting values
		for(Types s:Types.values())
		{
			System.out.println(s + " " + s.value + " " + s.name);
		}
		
		
		// Enum with Switch
		switch(choice)
		{
		case SPADE : System.out.println(" This is spade value " + choice.getSpade());
			break;
		default: System.out.println(" Not a valid choice ");
				break;
		}


	}

	public enum Types
	{
		// Enums with String and Integer combo as thier values
		SPADE(10, "Srini"),
		HEART(30, "Hello"),
		DIAMOND(20, "How are you"),
		AUTINE(40, " What are you doing");

		private int value;
		private String name;

		Types(int input, String input2)
		{
			this.value = input;
			this.name = input2;
		}
		
		public String getSpade()
		{
			return SPADE.name;
		}
		
		public String getHeart()
		{
			return HEART.name;
		}
		
		public String getAutine()
		{
			return AUTINE.name;
		}
		
		public String getDiamond()
		{
			return DIAMOND.name;
		}
		
	}
}

