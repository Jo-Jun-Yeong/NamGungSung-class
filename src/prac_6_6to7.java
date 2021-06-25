import java.*;
//------------------------------------------------------------
//[6-6]두 점의 거리를 계산하는 getDistance()를 완성하시오.
//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
//------------------------------------------------------------
//[6-7] 문제6-6에서 작성한 클래스메서드 
//getDistance()를 MyPoint클래스의 인스턴스메서드로 정의하시오.
//------------------------------------------------------------
class Mypoint {
	int x; 
	int y;
	
	Mypoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	double getDistance(int x1, int y1) {
		this.x=x;
		this.y=y;
		
		double A = (x1-x)*(x1-x);
		double B = (y1-y)*(y1-y);
		
		double sqrt = Math.sqrt(A+B);
		return  sqrt;
		
	}
}

public class prac_6_6to7 {
	
	public static void main(String[] args) {
		
		Mypoint p = new Mypoint(1,1);
		
		System.out.println(p.getDistance(2,2));
		
	} 		//main method
}		//class 



	
