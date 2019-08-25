/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
     
	public static void main(String[] args) {
		String arr = "Hekko";
		int val =0;
		int numArr[] = new int[123];
		
		for(int i=0;i<arr.length();i++)
		{
		    int x=arr.charAt(i);
		    System.out.print(x+" ");
		    numArr[x]+=1;
		}
			int max=0;
	    for(int i=65;i<123;i++)
	    {
	        if (numArr[i] > max)
	        {
	            val=i;
	            max = numArr[i];
	        }
	    }
	    char ch = (char)val;
	    System.out.print("value "+ch);
	}
}
