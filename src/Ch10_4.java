import java.util.Calendar;

public class Ch10_4 {

	public static void main(String[] args) {
		 // 요일은 1부터 시작하기 때문에 DAY_OF_WEEK[0]은 비워두었다.
		final String [] Calendar = {"","일","월","화","수","목","금","토"};
		
		
		Calendar date1 = java.util.Calendar.getInstance(); 
		Calendar date2 = java.util.Calendar.getInstance();
		
		//	month의 경우 0부터 시작하기 떄문에 4월인 경우 3으로 해야한다.
		// Q1. date1은 2019년 4월 29일 이고 "월요일"이다.
		date1.set(2019, 4, 29);
		System.out.println("date1은 "+toString(date1)+"이고 " + "월요일 입니다.");
		
		// Q2. 오늘(date2)은 2021년 5월18일 화요일 입니다
		System.out.println("오늘(date2)은 "+toString(date2)+ "이고 "+Calendar[date2.DAY_OF_WEEK]+"요일 입니다");
		
		// Q3. 그 날(date1)로 부터 지금(date2)까지 ""초가 지났고
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) /1000 ; 	// 초단위 계산
		System.out.println("그 날(date1)로 부터 지금(date2)까지 "+ difference +"초가 지났고");
		// Q4. 일(day)로 계산하면 ""일 입니다.
		System.out.println("일(day)로 계산하면 " + (difference / (60 * 60 *24)) +"일 입니다" );
		
		//---------------------------------------------------------------------------------------------------//

	}

		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR)+"년"+ 
					date.get(Calendar.MONTH)+"월" +
					date.get(Calendar.DATE) + "일";
		}
		
		
		
		
}
