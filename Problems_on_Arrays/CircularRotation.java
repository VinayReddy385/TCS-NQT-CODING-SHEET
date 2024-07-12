package Problems_on_Arrays;
import java.util.*;
public class CircularRotation {
    	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter n to rotate");
	    int n=sc.nextInt();
	    System.out.println("enter k to rotate");
	    int k=sc.nextInt();
	    System.out.println("enter array elements");
	    int []arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<k;i++){
	        int temp=arr[0];
	        for(int j=0;j<n-1;j++){
	            arr[j]=arr[j+1];
	        }
	        arr[n-1]=temp;
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]);
	    }
	}
}
