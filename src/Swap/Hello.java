package Swap;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hello {
  public static void main(String args[]){
	  try{
		   // PrintWriter writer = new PrintWriter("example3.txt", "UTF-8");
		   // System.out.println(new File("example.txt").getAbsolutePath());
	  Scanner in = new Scanner(System.in);
	  int S[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};//51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80};//,81,82,83,84,85};//new int[75];//{21.2,99.35,103.0,201.6,673.0};	//This is your superset
	  /*for(int i=0;i<75;i++){
		  S[i]=in.nextInt();
	  }*/
	  //int  S[]={21,22,23,24};
	  int n=20,j=1;
	  long target=111110;
	  long sum;
	  long startTime=System.currentTimeMillis();
	  double nSub = Math.pow(2, n);//1<<n;
	     for(long i=0; i<nSub; i++){
	     	  //System.out.print("{ ");
	    	 sum=0;
	          for(int k=0; k<n; k++){
	               //if the k-th bit is set
	               if( ((1<<k) & i)!=0){
	                    System.out.print(S[k]+" ");
	                    sum=sum+S[k];
	                    //writer.print(S[k]);
	                    //System.out.print(" ");
	               } 
	          }
	          //writer.print("()");
	          //writer.println(j++);//.print("(j++)");
	          //writer.println();
	          if(sum==target){
	        	  System.out.println("Found");
	        	  return;
	          }
	          System.out.println("()" +j++);
	     }
	     long endTime=System.currentTimeMillis();
	     System.out.println("\n\n" +(endTime-startTime)+"ms");
	     System.out.println(new File("example3.txt").getAbsolutePath());
	  }catch(Exception e){
		  System.out.println(e);
	  }
	System.out.println("Not found");  
  }
}
