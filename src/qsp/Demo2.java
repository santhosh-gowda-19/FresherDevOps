package qsp;

import org.testng.annotations.Test;

public class Demo2 {

		@Test
		public void reverse() {
		String name="veena";
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		}
		

	

}
