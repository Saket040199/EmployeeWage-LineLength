package EmployeeWageUCs;

public class EmpWage6 {
	public static void main(String[] args) {
		
	    int WAGE_PER_HOUR=20;
	    int TOTAL_HRS=8;
	    int hr=0;
		int TOTAL_WAGE_PER_DAY=0;;
		int i=0;
		int salary=0;
	
		while(i<20 && hr<100)
		{
		
		if(Math.floor(Math.random()*10)%2==1.0)
		{
			System.out.println("Employee is present");
			
			TOTAL_WAGE_PER_DAY=(WAGE_PER_HOUR*TOTAL_HRS);
			salary=TOTAL_WAGE_PER_DAY+salary;
			
			
		}
		
		else
		{
			System.out.println("Employee is absent");
			TOTAL_WAGE_PER_DAY=TOTAL_HRS*0;
			
		}
		i=i+1;
	
		}
		System.out.println("Total salary of month\n"+salary);
		

	
	}
}
