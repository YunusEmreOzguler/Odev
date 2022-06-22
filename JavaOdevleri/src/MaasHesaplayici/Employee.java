package MaasHesaplayici;

public class Employee {

	   	String name;
	    double salary;
	    int workHours;
	    int hireYear;
	    
	    Employee(String name,double salary,int workHours, int hireYear){
	        this.name=name;
	        this.salary=salary;
	        this.workHours=workHours;
	        this.hireYear=hireYear;
	    }

	    double tax(){
	        double taxPrice=0;
	        if(this.salary>1000){
	            taxPrice=this.salary*0.03;
	            }
	        return taxPrice;
	    }

	    double bonus(){
	        double bonusIncome =0;
	        if(this.workHours>40){
	            bonusIncome =(this.workHours-40)*30;
	        }
	        return bonusIncome;
	    }

	    double raiseSalary() {
	        int workYear = (2022 - this.hireYear);
	        double raise=0;
	        if (workYear < 10) {
	            raise =  this.salary * 0.05;
	        }
	        if (workYear > 9 && workYear < 20) {
	            raise = this.salary * 0.1;
	        }
	        if (workYear > 19) {
	            raise= this.salary * 0.15;
	        }
	        return raise;
	    }

		@Override
		public String toString() {
			return "Employee Name = " + name + "\nSalary = " + salary + "\nWork Hours = " + workHours + "\nHire Year = "
					+ hireYear + "\nTax = " + tax() + "\nBonus = " + bonus() + "\nRaise Salary = " + raiseSalary() + "\nAfter Tax And Bonus, Salary = " 
					+ (salary + bonus()-tax()) + "\nNew Salary = " + (salary + bonus()-tax() + raiseSalary());
		}
}
