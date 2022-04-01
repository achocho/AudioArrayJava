package Audio;
import java.util.*;
public class Normalize {
 double[] Normalized(double[] arr1) 
{
	
	double[] arr=arr1.clone();
	double Max=Integer.MIN_VALUE;
	double Min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++) 
{
	if(Max<arr[i]) 
	{
		Max=arr[i];
	}
	if(Min>arr[i]) 
	{
		Min=arr[i];
		
	}
}
for(int i=0;i<arr.length;i++) {
arr[i]=(double)2*(arr[i]-Min)/(Max-Min)-1;
}


	return arr;
}
}
