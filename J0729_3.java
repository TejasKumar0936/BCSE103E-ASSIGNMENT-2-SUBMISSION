import java.util.Scanner;
public class J0729_3  
{  
	public static void main(String args[]){ 
        int a,b, gcd = 1;
        System.out.println("Enter first variable: ");
        Scanner myObj1 = new Scanner(System.in);
        a = myObj1.nextInt();  
        System.out.println("Enter second variable: ");
        Scanner myObj2 = new Scanner(System.in);
        b = myObj2.nextInt(); 
		for(int i = 1; i <= a && i <= b; ++i)   
		{  
			if(a % i == 0 && b % i == 0)  
				gcd = i;  
		}  
		int lcm = (a * b) / gcd;  
		System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);  
	}  
}  
