package maasHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Maa� hesaplama program�.");
		System.out.println("------------------------");
		System.out.print("Personelin ad�n� giriniz: ");
		String name=sc.next();
		
		System.out.print("Personelin maa��n� giriniz: ");
		double sal=sc.nextDouble();
		
		System.out.print("Personelin �al��ma saatini  giriniz: ");
		int workHour=sc.nextInt();
		
		System.out.print("Personelin i�e giri� y�l�n� giriniz: ");
		int hireYear=sc.nextInt();
		
		sc.close();
		
		Employee employee=new Employee(name,sal,workHour,hireYear);
		employee.toString(employee);
		
	}

}
