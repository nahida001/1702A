
package javaapplication103;

import java.util.Scanner;

public class JavaApplication103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
        while(t-->0){
         int n=sc.nextInt();
        int even=0,odd=0;
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         if(arr[i]%2!=0){
         odd++;
             }
         else{
            even++;     
        }
         }
             if(even==n||(odd==n&&n%2==0)){
             System.out.println("NO");
             
             }
         else{
             System.out.println("YES");
             }
        
        }
    }
    
}
