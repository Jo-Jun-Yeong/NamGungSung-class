//
//public class prac_6_18 {
//	/*변수의 종류
//	 * 1. 인스턴스 변수
//	 * 	- static변수, 로컬변수 모두 호출이 가능하다.
//	 * 2. static 변수
//	 * 	- 고유 성질변수, 다른 인스턴스변수, 로컬변수호출이 안된다.
//	 * 3. 로컬 변수
//	 * 	- 1, 2 번을 제외한 변수 보통 메소드 안에서 생성되어서 
//	 * 	 메소드가 실행 될때 생성되고 메소드의 역할이 끝나면 자동으로 제거되는 변수
//	 */
//	
//int iv = 10;
//static int cv = 20;
//
//int iv2 = cv;
//static int cv2 = iv; 			//A라인
//	//A라인 : static 변수는 인스턴스 변수를 할당 해 올 수 없다.
//
//static void staticmethod1() {
//	System.out.println(cv);
//	System.out.println(iv); 	//B라인
//	//B라인 : static 메서드에서는 인스턴스 변수를 사용할 수 없다.
//	//		사용하기 위해서는 인스턴스변수 객체를 생성후 사용해야 한다.
//} 	//staticmethod()
//
//void instancemethod1() {
//	System.out.println(cv); 	
//	System.out.println(iv); 	//C라인	
//	//C라인 : 인스턴스변수는 static변수가 아닌이상 어느 곳에서  호출할 수 있다.
//	
//}	//instancemethod()
//
//static void staticmethod2() {
//	staticmethod1();
//	instancemethod1();			//D라인	
//	// D라인 : static method또한 인스턴스메소드를 호출 할 수 없다.
//}	//staticmethod2()
//
//void instanceMethod2() {
//	staticmethod1();			//E라인
//	// E라인 : 인스턴스 메소드는 static메소드를 호출 할 수 있다.
//	instancemethod1();
//}
//
//}