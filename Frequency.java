/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    
    
	public static void main(String[] args) {
		String arr = "Hello";
		int val =0;
		int numArr[] = new int[123];
		
		for(int i=0;i<length(arr);i++)
		{
		    numArr[arr[i]]+=1;
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
	    System.out.print("value"+ch);
	}
}
