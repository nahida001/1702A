package colourblindness;

import java.util.Scanner;
public class Colourblindness {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        String s1=sc.next();
	        String s2=sc.next();
	        s1=s1.replace('G','B');
	        s2=s2.replace('G','B');
	        if(s1.equals(s2))
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }  
    }
    
}
