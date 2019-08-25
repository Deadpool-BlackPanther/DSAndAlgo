public class Main
{
    
    
	public static void main(String[] args) {
		int arr[] = {2,5,3,6,1};
	    int xor1=arr[0];
	    int xor2=1;
	    for(int i=1;i<arr.length;i++)
	    {
	        xor1^=arr[i];
	    }
	    for (int i=2;i<7;i++)
	    {
	        xor2^=i;
	    }
	    int ans=xor1^xor2;
		System.out.print("Ans is"+ans);
	}
}
