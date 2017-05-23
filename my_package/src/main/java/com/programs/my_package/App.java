package com.programs.my_package;
import java.util.Scanner;
import com.programs.my_package.Programs;
public class App implements Programs {
	public void fibo(){
		int a=0, b=1, c, i, count=10;
	    System.out.println(a);
	    System.out.println(b);
	    for(i=2;i<count;++i){
	    	c=a+b;
	    	System.out.println(" " +c);
	    	a=b;
	    	b=c;
	    	
	    }
	    	
	      		
			}
	public void npowerm() {
		int base,power,result=1;
			Scanner sc= new Scanner(System.in);
		System.out.println("enter the base");
		base=sc.nextInt();
		System.out.println("enter the ");
		power=sc.nextInt();
		if(base>0&&power==0)
		{
			result=1;
		}
		else if(base==0&&power>=1)
		{
			result=0;
		}
		else{
			for(int i=1;i<=power;i++)
			{
				result=result*base;
			}
		}
		System.out.println("result  " +result);
		
		
	} 
	public void nfact() {
		int n, fact = 1;
		Scanner a= new Scanner(System.in);
		System.out.println("enter the value of n");
		n=a.nextInt();
		for(int i=1;i<=n;i++){
			fact=fact*i;
			
		}
		System.out.println("The factorial of n:" +fact);
	}

	public static void main(String[] args){
		App A = new App() ;
		A.fibo();
		A.npowerm();
		A.nfact();
	}

	
	}


