import java.util.*;

public class Nam_prac {
	public static void main(String [] args) {
//		Q2. 사과를 담을 바구니의 갯수를 계산하는 코드
		
		//code
		
//		int NumOfApple = 123; 	//사과의 수
//		int SizeOfBucket = 10;	//바구니의 크기(바구니에 담을수 있는 사과의 갯수)
//		int NumOfBucket = NumOfApple / SizeOfBucket;	//모든 사과를 담는데 필요한 바구니의 수
//		
//		System.out.println("바구니의 수 : " + NumOfBucket);
//		----------------------------------------------------------------
		
//		Q3.아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.
//		삼항 연산 자를 이용해서 (1)에 알맞은 코드를 넣으시오
		
		//code
		
//		int num = 10;
//		if (num > 0) {
//			System.out.println("양수");
//		}
//		else if (num < 0 ) {
//			System.out.println("음수");
//		}
//		else System.out.println("0");
//
//		System.out.println(  );
		
//		----------------------------------------------------------------		
//		Q4. 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
//		만일 변수 num 의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. 
//		(1)에 알맞은 코드를 넣으시오.
		
//		//code
		
//		int num = 456; 
//		
//		System.out.println( (int)(Math.floor(num/100)*100) );
		
//		----------------------------------------------------------------		
//		Q5.아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
//		만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
//		(1)에 알맞은 코드를 넣으시오.
		
		//code
		
//		int num = 333;
//		System.out.println( (int)(Math.floor(num/10)*10)+1 );
		
//		----------------------------------------------------------------		
//		Q6.아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 
//		예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이 다. 19의 경우 20이고, 81의 경우 90이 된다. 
//		30에서 24를 뺀 나머지는 6이기 때문에 변 수 num의 값이 24라면 6을 결과로 얻어야 한다. 
//		(1)에 알맞은 코드를 넣으시오.
		
		//code
		
//		int num = 24;
//		System.out.println( Math.abs(num-100 )% 10 );
		
//		----------------------------------------------------------------		
//		Q7.아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 
//		변환공식이 'C = 5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 
//		단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
//		(Math.round()를 사용하지 않고 처리할 것)
		
		//code
		
//		int fahrenheit = 100;
//
//		float celcius = (float) Math.ceil((5.0 / 9.0) * (fahrenheit - 32)*100)/100;
//		 
//		System.out.println("Fahrenheit:"+fahrenheit); 
//		System.out.println("Celcius:"+celcius);

//		----------------------------------------------------------------		
//		Q8.아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		
//		code
		
//		byte a = 10; 
//		byte b = 20; 
//		byte c = (byte) (a + b);
//		
//		char ch = 'A'; 
//		ch = (char) (ch + 2);
//		float f = (float)(3.0 / 2.0);
//		long l = 3000 * 3000 * 3000L;
//		float f2 = 0.1f; double d = 0.1;
//		boolean result = d!=f2;
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);

//		----------------------------------------------------------------		
//		Q9.음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 
//		숫자일 때만 변수 b 의 값이 true가 되도록 하는 코드이다. 
//		(1)에 알맞은 코드를 넣으시오.
		
//		code
		

		char ch = '@';
		boolean b = (!(ch >= 'a' && 
						ch <= 'Z'&& 
						ch>0	&& 
						ch<0	&&
						ch==0) 
					? true: false )   ;
		
		System.out.println(b);
		} //main
} //class 
