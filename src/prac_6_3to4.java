
public class prac_6_3to4 {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no =1;
		s.kor = 100; 
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름:"+s.name); 
		System.out.println("총점:"+s.getTotal()); 
		System.out.println("평균:"+s.getAverage());

	}

}

class Student{
	String name; 	//학생이름
	int ban;		//반
	int no;			//번호
	int kor;		//국어점수
	int eng;		//영어점수
	int math;		//수학점수
	
	int getTotal(){ 	
//		국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
		int total = kor+eng+math;
		return total;
	}
	
	float getAverage() {
//		총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다. 
//		소수점 둘째자리에서 반올림할 것.
		
		float Aver = (float)(Math.round(getTotal())/3.0*100.0);
		Aver = (float)(Math.round(Aver)/100.0);
		return Aver;
	}
	
}
