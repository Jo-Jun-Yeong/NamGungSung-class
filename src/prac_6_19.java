
public class prac_6_19 {
	// [6-19] 다음 코드의 실행 결과를 예측하여 적으시오.

	public static void change(String str) { 
		str += "456";
	}
	
	public static void main(String[] args) {
		
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:"+str);
	}
	//  main에서 선언한 str에 "ABC123"이 들어가고
	//	"ABC123"이 출력 된 후
	//	change(str)메서드를 통해 "ABC123"에 "456"이 합쳐져
	// "ABC123456"이 출력된다
	
//	해설 : change에 있는 str은 main에 있는 str과 다른 str이며 따라서
//		chagne(str)에서는 (String은 내용변경이 불가능 하므로) 
//		새로운 주소에 "456"이 붙어 "ABC123456"이 저장되지만
//		("After change:"+ str)에서는 main의 str이 출력이 되어"ABC123"이 출력된다
}
