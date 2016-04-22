package utils.com.srini; 

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {

	public static void main(String args[])
	{
		String[] arr = {"Bad", "Good", "Ugly"};
		Comparator<String> s = new Comparator<String>()
				{

					@Override
					public int compare(String arg0, String arg1) {
						return arg1.charAt(0) - arg0.charAt(0);
					}
			
				};
				
		Arrays.sort(arr, s);
		System.out.println(" Words are " + arr[0]);
		
	}
}
