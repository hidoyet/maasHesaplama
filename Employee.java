package maasHesaplama;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee() {
		
	}
	
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
			
			return this.salary*0.03;
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
			return salary*0.05;			
		}
		if(2021-hireYear>9&&2021-hireYear<20) {
			return salary*0.1;
		}
		if(2021-hireYear>=20) {
			return salary*0.15;
		}
		return 0;
	}
	public void toString(Employee employee) {
		System.out.println("-----------------------");
		System.out.println("Adý: "+this.name);
		System.out.println("Maaþý: "+this.salary);
		System.out.println("Çalýþma saati: "+this.workHours);
		System.out.println("Baþlangýç yýlý: "+this.hireYear);
		System.out.println("Vergi: "+employee.tax());
		System.out.println("Bonus: "+employee.bonus());
		System.out.println("Maaþ artýþý: "+employee.raiseSalary());
		System.out.println("Vergi ve bonuslar ile maaþ: "+(salary-employee.tax()+employee.bonus()));
		System.out.println("Toplam maaþ: "+(salary+employee.raiseSalary()-employee.tax()+employee.bonus()));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	
	
	
}
