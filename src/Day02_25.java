//	public class Day02_25 {
//		public static void main(String [] args) {
//			Value v1 = new Value(10);
//			Value v2 = new Value(10);
//			
//			if(v1.equals(v2)) {
//				System.out.println("v1�� v2�� �����ϴ�");
//			}else
//				System.out.println("v1�� v2�� �ٸ��ϴ�");
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
//			//return this==obj; // �ּҺ�. ���δٸ� ��ü�� �ּҰ� �ٸ��Ƿ� �׻� ����
//			// ���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���� �ؾ���.
//			// ->
//			if(!(obj instanceof Value)) return false; 
//							
//			Value v = (Value)obj;  		//obj�� Value�� ����ȯ
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
//	//�������̵��� �Ѵٰ� �����ϸ�
//	String str1 = new String("abc"); 	//���� ������ 
//	String str2 = new String("abc"); 	//�ּҴ� �ٸ���
//	System.out.println(str1.equals(str2)); 	//�ΰ��� ���Ѵٸ� true�� ��µǰ�
//	System.out.println(str1.hashCode()); 	//�� �ǹ̴� 
//	System.out.println(str2.hashCode()); 	//�ΰ��� hashcode�� ���ٴ� �ǹ��̴�
//	
//	//	public String toString() { 	// Object Ŭ������ toString()
//	//		return getClass()/*���赵��ü*/.getName()/*Ŭ�����̸�*/ + "@"/*��ġ*/+Integer.toHexString(hashCode()/*��ü�� �ּ�*/);
//	//	}
	
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
	
		public String toString() { 	//toString�� �������̵�
			return "kind :"+ kind + ", number :" + number;
		} 	//toString�� �������̵� �ؾ߸� mainmethod����  ��ü�� �ּҰ��� �ƴ� ������ ���� ���´�.
	} //Card class
	
	class Day02_25 {
		public static void main(String [] arg) {
			 System.out.println(new Card().toString());
			 System.out.println(new Card().toString());
			
		}
	} //2nd main method class
	