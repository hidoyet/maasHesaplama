package maasHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Maaþ hesaplama programý.");
		System.out.println("------------------------");
		System.out.print("Personelin adýný giriniz: ");
		String name=sc.next();
		
		System.out.print("Personelin maaþýný giriniz: ");
		double sal=sc.nextDouble();
		
		System.out.print("Personelin çalýþma saatini  giriniz: ");
		int workHour=sc.nextInt();
		
		System.out.print("Personelin iþe giriþ yýlýný giriniz: ");
		int hireYear=sc.nextInt();
		
		sc.close();
		
		Employee employee=new Employee(name,sal,workHour,hireYear);
		employee.toString(employee);
		
	}

}
