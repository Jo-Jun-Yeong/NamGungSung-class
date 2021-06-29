
/*
 * 	메서드명	: isNumber 
 * 	기 능 	:주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 			모두 숫자로만 이루어져 있으면 true를 반환하고,그렇지 않으면 false를 반환한다.
 * 		  	만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
	반환타입 	: boolean 
	매개변수 	: String str - 검사할 문자열
	
*/
public class prac_6_22 {
	/*
	  	(1) isNumber 메서드를 작성하시오.
	*/
	static boolean isNumber(String aaa) {
		boolean number = aaa==null ? false : true;
			
			for(int i = 0; i<aaa.length(); i++) {
				
				if((aaa.charAt(i)>='0')&&(aaa.charAt(i)<='9'))  number = true;
				else if((aaa.charAt(i)>'a')|| (aaa.charAt(i)<'z')&&(aaa.charAt(i)>'A')||(aaa.charAt(i)<'Z')) number = false ;
				else if(aaa.charAt(i)==' ') number = false;
				else if(String.valueOf(aaa.charAt(i))==null) number = false;
				else number = false;
				
				System.out.println(aaa.charAt(i) +" : "+ number);	
			}//for

		return number;
	}
	
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));

	}
	
}
