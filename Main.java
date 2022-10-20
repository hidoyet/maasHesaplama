package maasHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Maaş hesaplama programı.");
		System.out.println("------------------------");
		System.out.print("Personelin adını giriniz: ");
		String name=sc.next();
		
		System.out.print("Personelin maaşını giriniz: ");
		double sal=sc.nextDouble();
		
		System.out.print("Personelin çalışma saatini  giriniz: ");
		int workHour=sc.nextInt();
		
		System.out.print("Personelin işe giriş yılını giriniz: ");
		int hireYear=sc.nextInt();
		
		sc.close();
		
		Employee employee=new Employee(name,sal,workHour,hireYear);
		employee.toString(employee);
		
	}

}
