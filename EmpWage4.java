package EmployeeWageUCs;

public class EmpWage4 {
public static void main(String[] args) {
	
    final int WAGE_PER_HOUR=20;
	final int TOTAL_HRS=8;
	int TOTAL_WAGE;
	
	int empcheck=(int)Math.floor(Math.random()*10)%3;
	switch(empcheck)
	{
	   case 1:
	    {
		System.out.println("Employee is present");
		TOTAL_WAGE=(WAGE_PER_HOUR*TOTAL_HRS);
		System.out.println(TOTAL_WAGE);
		break;
	    }
	   case 2:
	    {
		System.out.println("Part Time Employee");
		TOTAL_WAGE=(WAGE_PER_HOUR*TOTAL_HRS);
		System.out.println(TOTAL_WAGE);
		break;

	    }
	  default :
	    {
		System.out.println("Employee is absent");
	    }

    }
  }
}
