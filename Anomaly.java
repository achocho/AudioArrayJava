package Audio;

public class Anomaly {
int S;
Anomaly(int S)
{
	this.S=S;
}


public void anomaly(double[] arr) 
{
	double[] temp=new double[S];
for(int i=0;i<arr.length;i++) 
{
	int tm=0;
	for(int j=i;j<S;j++) 
	{
		
		
	   temp[tm]=arr[j];
	   tm++;
		
	}
for(int j=0;j<temp.length-1;j++) 
{
	for(int z=0;z<temp.length-1;z++) 
	{
		double num1=temp[j];
		double num2=temp[j+1];
		if(num1>num2) 
		{
			temp[j]=num2;
			temp[j+1]=num1;
			
		}
		
	}
}
double med=0;
if(temp.length%2==0) 
{
double mid1=temp[temp.length/2];
double mid2=temp[(temp.length/2)-1];
med=(double)(mid1+mid2)/2;
}else 
{
	med=(int)temp[temp.length/2];
}
double max=0;
for(int j=0;j<temp.length;j++) 
{
	if(max<temp[j]) 
	{
		max=temp[j];
		
	}
}

if(max/2>=med) 
{
	for(int j=0;j<temp.length;j++) 
	{
		System.out.print(temp[j]+" ");
		
	}
	System.out.println();
	
}
	if(S<arr.length) {
	S++;
	}
	else 
	{
		
		break;
	}
}

	
}
}
