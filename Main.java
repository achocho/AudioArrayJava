package Audio;

public class Main {

	public static void main(String[] args) {
      Normalize nom=new Normalize();
      Mute mute=new Mute();
      Average av=new Average();
      Max max=new Max();
      Anomaly an=new Anomaly(3);
      Denoise den=new Denoise(3,2);
      double[] arr= {1,2,10,5,6,8};
      
    // double[] normalized= nom.Normalized(arr);
     //an.anomaly(arr);
      //den.anomaly(arr);
      //double Max=max.Max(arr);
     //double[] muted=mute.mute(arr);
      //double aver=av.Avg(arr);
      
     

	}

}
