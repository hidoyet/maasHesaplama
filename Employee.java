package maasHesaplama;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	double tax() {
		if(this.salary<=1000) {
			
			return this.salary;				
		}
		if(this.salary>1000) {
			
			return this.salary*1.03;
		}
		return 0;
	}
	int bonus() {
		if(workHours>40) {
			return (workHours-40)*30;
			
		}
		return 0;
	}
	double raiseSalary() {
		if(2021-hireYear<10) {
			return salary*1.05;			
		}
		if(2021-hireYear>9&&2021-hireYear<20) {
			return salary*1.1;
		}
		if(2021-hireYear>=20) {
			return salary*1.15;
		}
		return 0;
	}
	public void toString(Employee employee) {
		System.out.println("Adý: "+this.name);
		System.out.println("Maaþý: "+this.salary);
		System.out.println("Çalýþma saati: "+this.workHours);
		System.out.println("Baþlangýç yýlý: "+this.hireYear);
		System.out.println("Vergi: "+employee.tax());
		System.out.println("Bonus: "+employee.bonus());
		System.out.println("Maaþ artýþý: "+employee.raiseSalary());
		System.out.println("Vergi ve bonuslar ile maaþ: "+(salary+employee.tax()+employee.bonus()));
		System.out.println("Toplam maaþ: "+(salary+employee.raiseSalary()));
	}
	
	
	
}
