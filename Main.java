package Audio;

public class Main {

	public static void main(String[] args) {
      Normalize nom=new Normalize();
      Mute mute=new Mute();
      Average av=new Average();
      Max max=new Max();
      Anomaly an=new Anomaly(3);
      Denoise den=new Denoise(4,0.5);
      double[] arr= {-5,2,3,-4,10,12};
      
     double[] normalized= nom.Normalized(arr);
     for(int i=0;i<normalized.length;i++) 
     {
    	 System.out.println(normalized[i]); 
     }
 
     
     an.anomaly(arr);
      den.anomaly(arr);
      double Max=max.Max(arr);
      System.out.println(Max);
     double[] muted=mute.mute(arr);
     for(int i=0;i<muted.length;i++) 
     {
    	 System.out.println(muted[i]);
    	 
     }
      double aver=av.Avg(arr);
      System.out.println(aver);
      
     

	}

}
