import java.util.Calendar;
public class Ch10_5 {

	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6))-1 ;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
			int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6))-1 ;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
			
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();

			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);
			System.out.println(date1.getTimeInMillis()-date2.getTimeInMillis()/(24*24*60*1000f));
			diff = (int)((date1.getTimeInMillis())-(date1.getTimeInMillis())/(24*24*60*1000));
		}
		catch(Exception e){
			diff = 0;
		}
		return diff;
	} 	//getDayDiff

	public static void main(String[] args) {
	System.out.println(getDayDiff("20010103", "20010101"));
	
	} //main 
} //class 
	
//		//ch10-4, 5	 Calendar클래스 - 예제 2, 3
//		Calendar d1 = Calendar.getInstance();
//		
//		System.out.println(d1.getTimeInMillis());
//		//현재 년도 월 일 시간이 표시됨
//		
//		//clear() 사용시 필드를 초기화
//		d1.clear(); 					// 모든 필드 초기화
//		System.out.println(d1.getTimeInMillis());
//		
//		//clear(in field)는 시,분,초를 초기화
//		d1.clear(Calendar.HOUR);	//시간 초기화
//		System.out.println(d1.getTimeInMillis());
//		d1.clear(Calendar.MINUTE);	//분 초기화
//		System.out.println(d1.getTimeInMillis());
//		d1.clear(Calendar.SECOND); 	//초 초기화
//		System.out.println(Calendar.SECOND);
