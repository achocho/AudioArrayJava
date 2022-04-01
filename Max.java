package Audio;

public class Max {
double Max(double[] arr1) 
{
	double[] arr=arr1.clone();
	double max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) 
	{
		if(max<arr[i]) 
		{
			max=arr[i];
		}
	}
	return max;
}
}
