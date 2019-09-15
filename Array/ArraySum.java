
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {4,4,5,5,88,90,90,99,99};
		
		for(int i=0;i<arr.length-1;i+=2)
		{
			if(arr[i]!=arr[i+1])
			{
				System.out.println(arr[i]);
				i--;
			}
		}
	}

}
