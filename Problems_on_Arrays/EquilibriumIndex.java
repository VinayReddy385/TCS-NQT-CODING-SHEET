package Problems_on_Arrays;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int j=1;j<n-1;j++){
	        int rsum=arr[0];
	        for(int r=1;r<j;r++){
	            rsum+=arr[r];
	        }
	        int lsum=0;
	        for(int l=j+1;l<n;l++){
	            lsum+=arr[l];
	        }
	        if(lsum==rsum){
	            System.out.println(j);
	        }
	    }
	}
       
}
