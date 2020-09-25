package exception;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		  // Prompt the user to enter two integers
		 System.out.print("Nhap 2 so: ");
		
		try {
			int number1 = input.nextInt();
		
		 int number2 = input.nextInt();
		
		System.out.println(number1 + " / " + number2 + " is " +
		 (number1 / number2));
		} catch(ArithmeticException a) {
			System.out.println("k duoc chia cho 0");
		}
		}
	}

