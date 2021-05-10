package EmployeeWageUCs;

public class EmpWage2 {
	public static void main(String[] args) {
		final int IS_FULL_TIME=1;
	    final int WAGE_PER_HOUR=20;
		final int TOTAL_HRS=8;
		int TOTAL_WAGE;
		
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_FULL_TIME)
		{
			System.out.println("Employee is present");
			TOTAL_WAGE=(WAGE_PER_HOUR*TOTAL_HRS);
			System.out.println(TOTAL_WAGE);
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}

}
