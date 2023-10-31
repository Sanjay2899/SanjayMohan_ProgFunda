package com.gradedproject.q2;

import java.util.Scanner;

public class FindXpowerNUsingRecursion {
	
	public static int FindXpowerN(int base,int power)
	{
		if(power==0)
		{
			return 1;
		}
		else
		{
			
			return base*FindXpowerN(base,power-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int base=sc.nextInt();
		System.out.print("Enter the power N: ");
		int power=sc.nextInt();
		System.out.println("X power N is: "+FindXpowerN(base,power));
	}

}
