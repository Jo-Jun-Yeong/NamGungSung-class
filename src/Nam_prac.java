import java.util.*;

public class Nam_prac {
	public static void main(String [] args) {
//		Q2. 사과를 담을 바구니의 갯수를 계산하는 코드
		
		//->
		
//		int NumOfApple = 123; 	//사과의 수
//		int SizeOfBucket = 10;	//바구니의 크기(바구니에 담을수 있는 사과의 갯수)
//		int NumOfBucket = NumOfApple / SizeOfBucket;	//모든 사과를 담는데 필요한 바구니의 수
//		
//		System.out.println("바구니의 수 : " + NumOfBucket);
//		----------------------------------------------------------------
		
//		Q3.아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다.
//		삼항 연산 자를 이용해서 (1)에 알맞은 코드를 넣으시오
		
		//->
		
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
		
//		//->
		
//		int num = 456; 
//		
//		System.out.println( (int)(Math.floor(num/100)*100) );
		
//		----------------------------------------------------------------		
//		Q5.아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
//		만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
//		(1)에 알맞은 코드를 넣으시오.
		
		//->
		
//		int num = 333;
//		System.out.println( (int)(Math.floor(num/10)*10)+1 );
		
//		----------------------------------------------------------------		
//		Q6.아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하는 코드이다. 
//		예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이 다. 19의 경우 20이고, 81의 경우 90이 된다. 
//		30에서 24를 뺀 나머지는 6이기 때문에 변 수 num의 값이 24라면 6을 결과로 얻어야 한다. 
//		(1)에 알맞은 코드를 넣으시오.
		
		//->
		
//		int num = 24;
//		System.out.println( Math.abs(num-100 )% 10 );
		
//		----------------------------------------------------------------		
//		Q7.아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 
//		변환공식이 'C = 5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 
//		단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
//		(Math.round()를 사용하지 않고 처리할 것)
		
		//->
		
//		int fahrenheit = 100;
//
//		float celcius = (float) Math.ceil((5.0 / 9.0) * (fahrenheit - 32)*100)/100;
//		 
//		System.out.println("Fahrenheit:"+fahrenheit); 
//		System.out.println("Celcius:"+celcius);

//		----------------------------------------------------------------		
//		Q8.아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		
//		->
		
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
		
//		->
		
//		char ch ='z';
//		boolean b =
//					(
//					(ch >= 'a' && ch <= 'z')||
//					(ch >= 'A' && ch <= 'Z')||
//					(ch >='0' && ch <='9')
//											) 
//						? true : false;
		
//		if((ch >= 'a' && ch <= 'z')|| 
//			(ch >= 'A'&& ch <= 'Z')|| 
//			(ch >='0' && ch <= '9') 
//			){
//			System.out.println(true);
//		}
//		else 
//			System.out.println(false);
//		
//		System.out.println(b);
		
//		----------------------------------------------------------------		
//		Q9.[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 
//		문자 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경한다. 
//		문자코드는 소문자가 대문자보다 32만큼 더 크다. 
//		예를 들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. 
//		(1)~(2)에 알맞은 코드를 넣으시오.
		
//		->
//		char ch = 'A';
//		char d = (char) ((ch>='A' && ch<='Z') ? (ch + ' ') : ch);
//		
//		System.out.println("ch:"+ch); 
//		System.out.println("ch to lowerCase:"+d);
		
//		----------------------------------------------------------------		
//		Q9.
//		int x=9;
////		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
//		if(10<=x && 20>=x) 
//			System.out.println("1. : " + true);
//		
////		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
//		char ch2='1';
//		if(ch2 !=' '&& ch2 !='	')
//			System.out.println("2. : " + true);
//
////		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
//		char ch3 = 'x';
//		if(ch3=='x' && ch3 =='X') 
//			System.out.println("3. : "+true);
//		
////		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
//		char ch4 = '8';
//		if(ch4>='0' && '9'>=ch4) 
//			System.out.println("4. : "+true);
//		
////		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
//		char ch5 = 's';
//		if((ch5>='a' && 'z'>= ch5)||(ch5>='A' && 'Z'>= ch5)) 
//			System.out.println("5. : "+true);
////		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
////		않을 때 true인 조건식
//		int year = 400;
//		if(year%400 == 0 ||(year % 4 ==0 && year % 4 != 0) )
//			System.out.println("6. : "+ true);
////		7. boolean형 변수 powerOn가 false일 때 true인 조건식 
//		boolean powerOn = false;
//		if(powerOn == false) System.out.println("7. : "+true);
////		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
//		String str = "yes";
//		if(str.equals("yes")) System.out.println("8. : "+true);
		
//		----------------------------------------------------------------		
//		Q4-2 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
		
//		->
		
//		int sum=0;
//		for(int i = 1; i<=20; i++) {
//			
//			if(!(i%2==0 && i%3==0)) {
//				sum += i;
//			}
//			System.out.println("sum : "+sum);
//		}
//		----------------------------------------------------------------		
//		Q4-3 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.	
//		 	 1(0+1) 	3(1+2)   6(3+3)  10(6+4) 15 21 28 36 45 55
		
//		->
		
//		int a = 1;
//		for(int i = 1; i <=10; i++) {
//			a= a+i;
//			
//
//			System.out.println("sum["+(i)+"]"+(a-1));
//		}//for1
	
//		----------------------------------------------------------------		
//		Q4-4 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
//			몇까지 더해야 총합이 100이상이 되는지 구하시오.
//		->
		
//		int i = 1, sum=1;
//		while(sum<=100) {
//			sum = i+(-(i+1));
//			sum = sum +(i+2);
//			System.out.println("sum ["+i+"] : "+sum);
//			i++;
//		}
		
//		----------------------------------------------------------------		
//		Q4-5 다음의 for문을 while문으로 변경하시오.
		
//		->
		
//		for(int i=0; i<=10; i++) { 
//			for(int j=0; j<=i; j++)
//				System.out.print("*");
//		}
//		System.out.println();
//		System.out.println("첫번째");
//		
//		
//		int a = 0; 
//		while(a <=10) {
//			
//			int b = 0;
//			while(b<=a) {
//				System.out.print("*");
//				b++;
//			}	//while 2
//			
//			a++;
//		} 	//while 1
//		System.out.println();
//		System.out.println("두번째");
		
//		----------------------------------------------------------------		
//		Q4-6 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.
//		int a = (int)(Math.random()*6+1);
//		int b = (int)(Math.random()*6+1);
		
//		int c = 0;
//		for(int i = 1; i<7; i++) {
//			for(int j = 1; j<7; j++) {
//				c  = i+j;
//				if (c ==6) {
//					System.out.println(i+"+"+j+"=6" );
//				}
//			} 	//for2
//		} 	//for1
		
//		----------------------------------------------------------------		
//		Q4-7 Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라. 
//		(1)에 알맞은 코드를 넣으시오.
		
//		-> code
		

//		int value = (int)(Math.random()*6+1);
//		System.out.println("value:"+value);
//		
		
		
//		----------------------------------------------------------------		
//		Q4-8방정식 2x+4y=10의 모든 해를 구하시오.
//		단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
		
//		-> code
//		int x, y;
//		System.out.println("2x+4y=10 의 모든 해");
//		System.out.println("->");
//		for(int i = 0; i<=10; i++) { 		//x
//			for(int j = 0; j<=10; j++) { 	//y
//				
//				
//				if((2*i)+(4*j) == 10){
//					System.out.println("x = "+ i);
//					System.out.println("y = "+ j);
//					System.out.println();					
//				} 	//if
//				
//			} 	//for1
//		} 	//for2
		
//		----------------------------------------------------------------		
//		Q4-숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코 드를 완성하라. 
//		만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되 어야 한다. 
//		(1)에 알맞은 코드를 넣으시오.
//		[Hint] String클래스의 charAt(int i)을 사용
		
//		-> code
		
//		String str = "12345";
//		int sum = 0;
//		
//		char ch = '0';
//		
//		System.out.println("str.length() : "+ str.length());
//		System.out.println();
//		
//		for(int i =0; i<str.length(); i++) {
//			
//			sum = sum + (str.charAt(i)-'0');
//			
//			System.out.println("charAt["+i+"] : "+str.charAt(i));
//			System.out.println("sum["+i+"] : "+sum);
//			System.out.println();
//		}
		
//		----------------------------------------------------------------		
//		Q4-10 int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
//		만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//		(1) 에 알맞은 코드를 넣으시오.
//		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
		
//		-> code
//		
		int num = 12345;
		int sum = 0;
		
		for(int i = 1; i <=(int)(Math.log10(num)+1); i++) {
			num = ((num%(10^i))/10^(i-1));
			System.out.println("num ["+i+"]: "+num);
			sum += num;
			System.out.println("sum : "+sum);
		}
		System.out.println("sum : "+sum);
		
		
		
		
//		----------------------------------------------------------------		
//		Q
//		----------------------------------------------------------------		
//		Q
//		----------------------------------------------------------------		
//		Q
//		----------------------------------------------------------------		
//		Q
		
		
		
		
		} //main

} //class 
