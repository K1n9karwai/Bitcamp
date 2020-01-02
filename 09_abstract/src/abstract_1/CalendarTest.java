package abstract_1;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	private int year;
	private int month;
	private int endDate;
	private int startDate;
	
	Calendar cal = Calendar.getInstance();
	
	public CalendarTest() {
		Scanner scan = new Scanner(System.in);

		System.out.print("년도 입력 : ");
		this.year = scan.nextInt();
		System.out.print("월 입력 : ");
		this.month = scan.nextInt();
		
		calculator();
		display();
	}
	
	public void calculator() {
		
		cal.set(this.year, this.month-1, 1);
		
		this.endDate = cal.getActualMaximum(Calendar.DATE);
		this.startDate = cal.get(Calendar.DAY_OF_WEEK);
	
	}
	
	public void display() {
		System.out.println("=============== " + this.year + "년 " + this.month + "월 달력 ===============" );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int j=1; j<this.startDate; j++) {
			System.out.print("\t");
		}
		for(int i=1; i<=this.endDate; i++) {
			cal.set(Calendar.DATE, i);
			int today = cal.get(cal.DAY_OF_WEEK);
			System.out.print(i + "\t");
			if(today%7==0) {
				System.out.println();
			}
		}
		
	}

}
