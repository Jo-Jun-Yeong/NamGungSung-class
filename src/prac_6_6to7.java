import java.*;
//두 점의 거리를 계산하는 getDistance()를 완성하시오.
//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
//------------------------------------------------------------
public class prac_6_6to7 {
	
	//두점 ()와()간의 거리를 구한다
//	Math.sqrt( (x2-x1)^2+(y2-y1)^2 )
	static double getDistance(int x, int y, int x1, int y1) {
		double A = (x1-x)*(x1-x);
		double B = (y1-y)*(y1-y);
		double sqrt = Math.sqrt(A+B);
		return  sqrt;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(getDistance(1,1,2,2));
		System.out.println();
		
	} 		//main method
}		//class 



	
