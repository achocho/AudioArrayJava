package Audio;

public class Average {
double Avg(double[] arr1) 
{
	double[] arr=arr1.clone();
	int sum=0;
	for(int i=0;i<arr.length;i++) 
	{
		sum+=arr[i];
		
	}
	return (double)sum/arr.length;
}
}
