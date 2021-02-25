import java.util.Objects;

//	public class Day02_25 {
//		public static void main(String [] args) {
//			Value v1 = new Value(10);
//			Value v2 = new Value(10);
//			
//			if(v1.equals(v2)) {
//				System.out.println("v1과 v2는 같습니다");
//			}else
//				System.out.println("v1과 v2는 다릅니다");
//				
//			
//			System.out.println(v1.equals(v2));
//		}
//	} 	//public class 
//	
//	class Value{
//		int value; 	//iv
//		
//		Value(int value){
//			this.value = value;
//		}
//	
//		public boolean equals(Object obj) {
//			//return this==obj; // 주소비교. 서로다른 객체는 주소가 다르므로 항상 거짓
//			// 참조변수의 형변환 전에는 반드시 instanceof로 확인을 해야함.
//			// ->
//			if(!(obj instanceof Value)) return false; 
//							
//			Value v = (Value)obj;  		//obj를 Value로 형변환
//			
//			return this.value==v.value;
//		}
//	} //Value class
//	
//	class Person{
//		long id;
//		
//		public boolean eauqls(Object obj)	{
//			if(obj instanceof Person)
//				return id ==((Person)obj).id;
//			else
//				return false;
//		}
//		
//		Person(long id){
//			this.id = id;
//		}
//	}	//Person class
//		
//	//오버라이딩을 한다고 가정하면
//	String str1 = new String("abc"); 	//값은 같지만 
//	String str2 = new String("abc"); 	//주소는 다르다
//	System.out.println(str1.equals(str2)); 	//두개를 비교한다면 true가 출력되고
//	System.out.println(str1.hashCode()); 	//이 의미는 
//	System.out.println(str2.hashCode()); 	//두개의 hashcode는 같다는 의미이다
//	
//	//	public String toString() { 	// Object 클래스의 toString()
//	//		return getClass()/*설계도객체*/.getName()/*클래스이름*/ + "@"/*위치*/+Integer.toHexString(hashCode()/*객체의 주소*/);
//	//	}
	
	//ex
	class Card {
		String kind;
		int number;
		
		Card() {
			this("Spade", 1);
		} 	//Card의 생성자 dfault값을 경우 Spade와 1이 자동으로 반환된다.
		
		Card(String kind, int number){
			this.kind = kind;
			this.number = number;
		} 	//Card의 생성자, 호출시 매개변수의 "String",int 를 반환하여 출력한다.
	
		//Object클래스의 toString()의 오버라이딩
		public String toString() { 	
			return "kind :"+ kind + ", number :" + number;
		} 	//toString을 오버라이딩 해야만 mainmethod에서  객체의 주소값이 아닌 설정한 값이 나온다.
		
		
		
		public boolean equals(Object obj) {
			if(!(obj instanceof Card))
				return false;
			
			Card c = (Card)obj;
			return this.kind.equals(c.kind) && this.number == c.number;
		} 	// equals의 오버라이딩
		
		public int hashCode() {
			return Objects.hash(kind, number); //가변인자는 매개변수 갯수가 정해져있지않음
		} 	//hashCode()의 오버라이딩
		
	} //Card class
	
	class Day02_25 {
		public static void main(String [] arg) {
 			Card c1 = new Card();
 			Card c2 = new Card();
 			
 			System.out.println(c1.equals(c2)); //equlas()또한 Object메소드이기떄문에 오버라이딩해야됨 
			 System.out.println(new Card().toString());
			 System.out.println(new Card().toString());
			 
			 System.out.println(c1.hashCode());
			 System.out.println(c2.hashCode()); //hashCode() 오버라이딩 안하면 값이 다르게나온다
		} //main method
	} //2nd main method class
	