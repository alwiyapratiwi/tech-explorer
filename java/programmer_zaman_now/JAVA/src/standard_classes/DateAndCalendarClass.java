package standard_classes;


import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date tanggal = new Date(22764664444L);
		System.out.println(tanggal);
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2000);
		calendar.set(Calendar.MONTH, Calendar.JUNE);
		calendar.set(Calendar.DAY_OF_MONTH, 27);
		calendar.set(Calendar.HOUR_OF_DAY, 10);
		calendar.set(Calendar.MINUTE, 27);
		calendar.set(Calendar.SECOND, 27);
		calendar.set(Calendar.MILLISECOND, 27);
		
		Date result = calendar.getTime();
		System.out.println(result);

	}

}
