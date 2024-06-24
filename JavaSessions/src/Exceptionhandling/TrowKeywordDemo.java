package Exceptionhandling;

public class TrowKeywordDemo {

	public static void main(String[] args) throws StringisNullExcept {

		String s1 = null;
		
		if (s1==null)
		{
			throw new StringisNullExcept ("String object is null");
		}
	}

}
