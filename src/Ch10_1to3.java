import java.util.Calendar;

public class Ch10_1to3 {
	public static void main(String [] args) {
		Calendar today = Calendar.getInstance();
//	Q1. 이 해의 년도		
		System.out.println("이 해의 년도	:	"+today.get(Calendar.YEAR));
//	Q2.	이 해의 월(0:1월)		
		System.out.println("이 해의 월	:	"+today.get(Calendar.MONTH));
//	Q3.	이 해의 몇째 주	
		System.out.println("이 해의 몇째 주	:	" + today.get(Calendar.WEEK_OF_YEAR));
//	Q4.	이 달의 몇째 주		
		System.out.println("이 달의 몇째 주	:	" + today.get(Calendar.WEEK_OF_MONTH));
//	Q5.	이 달의 몇일		
		System.out.println("이 달의 몇일	:	" + today.get(Calendar.DAY_OF_MONTH));
//	Q6.	이 달의 몇일		
		System.out.println("이 달의 몇일	:	" + today.get(Calendar.DATE));
//	Q7.	이 해의 몇일		
		System.out.println("이 해의 몇일	:	" + today.get(Calendar.DAY_OF_YEAR));
//	Q8.	요일(1~7 1:일요일)		
		System.out.println("요일(1~7)	:	" + today.get(Calendar.DAY_OF_WEEK));
//	Q9.	이 달의 몇번째 요일()	
		System.out.println("이 달의 몇번째 요일 :	" + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//	Q10.오전_오후	(0 : 오전 / 1 : 오후)
		System.out.println("오전_오후(0 : 오전 / 1 : 오후)	:	"+ today.get(Calendar.AM_PM));
//	Q12.시간(0~12)			
		System.out.println("시간(0~12)	:	" + today.get(Calendar.HOUR));
//	Q13.시간(0~23)		
		System.out.println("시간(0~23)	:	" + today.get(Calendar.HOUR_OF_DAY));
//	Q14.분(0~59)			
		System.out.println("시간(0~23)	:	" + today.get(Calendar.MINUTE));
//	Q15.초(0~59)			
		System.out.println("시간(0~23)	:	" + today.get(Calendar.SECOND));
//	Q16.1000분의 1초(0~999)			
		System.out.println("시간(0~23)	:	" + today.get(Calendar.MILLISECOND));
//	Q17.TimeZone(-12~+12)			
		System.out.println("시간(0~23)	:	" + today.get(Calendar.ZONE_OFFSET));
//	Q18.이 달의 마지막 달			
		System.out.println("이 달의 마지막 달	:	"+ today.getMaximum(Calendar.DAY_OF_MONTH));

	}
//	public static String toString(Calendar today) {
//		return 	today.get(Calendar.YEAR)+ "년" + 
//				today.get(Calendar.MONTH) + "월" +
//				today.get(Calendar.DATE) + "일";
//	}
}
