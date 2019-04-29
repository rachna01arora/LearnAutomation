package javaprogrammes;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int num;
		System.out.println("Enter integer number");
		
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		//if no is divisible by 2 then its is even no else it is odd
		if(num%2==0){
			System.out.println("it is even no");
		}
		else{
			System.out.println("it is odd no");
		}

	}

}
