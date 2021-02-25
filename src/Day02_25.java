	public class Day02_25 {
		public static void main(String [] args) {
			Value v1 = new Value(10);
			Value v2 = new Value(10);
			
			if(v1.equals(v2)) {
				System.out.println("v1과 v2는 같습니다");
			}else
				System.out.println("v1과 v2는 다릅니다");
				
			
			System.out.println(v1.equals(v2));
		}
	} 	//public class 
	
	class Value{
		int value; 	//iv
		
		Value(int value){
			this.value = value;
		}
	
		public boolean equals(Object obj) {
			//return this==obj; // 주소비교. 서로다른 객체는 주소가 다르므로 항상 거짓
			// 참조변수의 형변환 전에는 반드시 instanceof로 확인을 해야함.
			// ->
			if(!(obj instanceof Value)) return false; 
							
			Value v = (Value)obj;  		//obj를 Value로 형변환
			
			return this.value==v.value;
		}
	} //Value class
	
	class Person{
		long id;
		
		public boolean eauqls(Object obj)	{
			if(obj instanceof Person)
				return id ==((Person)obj).id;
			else
				return false;
		}
		
		Person(long id){
			this.id = id;
		}
	}	//Person class
		
	//오버라이딩을 한다고 가정하면
	String str1 = new String("abc"); 	//값은 같지만 
	String str2 = new String("abc"); 	//주소는 다르다
	System.out.println(str1.equals(str2)); 	//두개를 비교한다면 true가 출력되고
	System.out.println(str1.hashCode()); 	//이 의미는 
	System.out.println(str2.hashCode()); 	//두개의 hashcode는 같다는 의미이다
	
	//	public String toString() { 	// Object 클래스의 toString()
	//		return getClass()/*설계도객체*/.getName()/*클래스이름*/ + "@"/*위치*/+Integer.toHexString(hashCode()/*객체의 주소*/);
	//	}
	
	//ex
	class Card {
		String kind;
		int number;
		
		Card() {
			this("Spade", 1);
		}
		
		Card(String kind, int number){
			this.kind = kind;
			this.number = number;
		}
	
		public String toString() { 	//toString의 오버라이딩
			return "kind :"+ kind + ", number :" + number;
		} 	//toString을 오버라이딩 해야만 mainmethod에서  객체의 주소값이 아닌 설정한 값이 나온다.
	} //Card class
	
	class Day02_25 {
		public static void main(String [] arg) {
			 System.out.println(new Card().toString());
			 System.out.println(new Card().toString());
			
		}
	} //2nd main method class
	