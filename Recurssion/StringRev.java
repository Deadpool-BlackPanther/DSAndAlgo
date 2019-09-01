
public class StringRev {

	static String StringRevRecursion(String str) {
		
		if(str.length()==1)
		{
			return str;
		}
		
		if(str.charAt(0)!=str.charAt(str.length()-1))
		{
			return null; 
		}
		else
			return str.substring(1,str.length()-1) + str.charAt(0);
			
	} 
	
	public static void main(String [] args)
	{
		String rev = StringRevRecursion("MARtM");
		
		System.out.print(rev);
		
	}

}
