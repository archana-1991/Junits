package junits;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AssertionsExamples {
	@Test
	@Tag("Regression")
	public void tes1() {
		String str1="Simplilearn";
		String str2="Simplilearn";
		String str3="Simplilearn1";
		String str4=null; 
		
		boolean flag=true;
		boolean flag1=false;
		
		int i=5;
		int j=8;
		
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one", "two","three"};
		
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("Nikil");
		list1.add("yuki");
		list1.add("rama");
		
		
		Assertions.assertEquals(str1, str2);
		Assertions.assertNotEquals(str1, str3);
		Assertions.assertNull(str4);
		Assertions.assertNotNull(str2);
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);
		
		Assertions.assertTrue(i<j);
		Assertions.assertFalse(i>j);
		
		Assertions.assertArrayEquals(expectedArray,resultArray);
		Assertions.assertFalse(list1.contains("Swadhin"));
		
		Assertions.assertEquals(3,list1.size());
		
	}

}
