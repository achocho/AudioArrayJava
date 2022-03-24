package Audio;

public class Mute {
public double[] mute(double[] arr) 
{
	for(int i=0;i<arr.length;i++) 
	{
		arr[i]=0;
		
	}
	return arr;
}
}
