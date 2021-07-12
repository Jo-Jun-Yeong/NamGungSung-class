import java.text.*;


public class Nam_10 {

	public static void main(String[] args) {
//		 ch10-9 형식화 클래스
//		숫자와 날자를 원하는 형식으로 String 형식으로 반환
		
//		형식 문자열에서 숫자와 문자를 뽑아내는 형식으로 반환
		DecimalFormat df = new DecimalFormat("#,###.##");
		double date = 1234567.89;
		String result = df.format(date);
		System.out.println(result);
		
//		ch10-10	DecimalFormat 
//		숫자를 형식화 할 때 사용(숫자 -> 문자열)
//		기호		의미	
//		0		10진수(값이 없을때는 0)
//		#		10진수
//		E		지수기호
		double number = 1234.567;
		DecimalFormat a = new DecimalFormat("#.####E0");
		String b = a.format(number);
		System.out.println(b);
//		특정형식의 문자열을 숫자로변환할 때도 사용함(형식 문자열 -> 숫자)
		DecimalFormat df2 = new DecimalFormat("#,###.##E0");
		Number num = df2.parse("1,234,567.89");
		double d=num.doubleValue();

	}
		

}
