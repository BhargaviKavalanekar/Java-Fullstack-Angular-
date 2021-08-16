
import java.util.Scanner;

public class Q9_StudentMarks {

	    public static void main(String args[])
	    {
	    	int i,n;
		
			float [] s1=new float[3];
			float [] s2=new float[3];
			float [] s3=new float[3];
			float [] sum=new float[3];
			float [] avg=new float[3];
			
			
	          for(i=0;i<3;i++)
	          {
	        	  Scanner s=new Scanner(System.in);
	        	  System.out.println("Enter marks of student "+(i+1));
	        	  s1[i]=s.nextFloat();
	        	  s2[i]=s.nextFloat();
	        	  s3[i]=s.nextFloat();  
	          }
	          
	          for(i=0;i<3;i++)
	          {
	        	  sum[i]=s1[i]+s2[i]+s3[i];
	        	 // System.out.println("Marks Student" + i+1 "Total marks " +sum[i]);
	        	  avg[i]=sum[i]/3;
	        	  System.out.println(i+1 + " Average marks " +avg[i]);
	        	  
	          }
	          
	          //total and average scored in each subject
	          sum[0]=s1[0]+s1[1]+s1[2];
	          avg[0]=sum[0]/3;
	          
	          System.out.println(" Total marks of subject 1 " +sum[0]);
	          
	          System.out.println(" Average marks of subject 1 " +avg[0]);
	          
	          sum[1]=s2[0]+s2[1]+s2[2];
	          avg[1]=sum[1]/3;
	          
	          System.out.println(" Total marks of subject 2 " +sum[1]);
	          
	          System.out.println(" Average marks of subject 2 " +avg[1]);
	          
	          sum[2]=s3[0]+s3[1]+s3[2];
	          avg[2]=sum[2]/3;
	          
	          System.out.println(" Total marks of subject 3 " +sum[2]);
	          
	          System.out.println(" Average marks of subject 3 " +avg[2]);
	          
	          
	    }
}



