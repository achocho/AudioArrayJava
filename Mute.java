package Audio;

public class Mute {
public double[] mute(double[] arr1) 
{
	double[] arr=arr1.clone();
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=0;
		
	}
	return arr;
}
}
