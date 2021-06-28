
public class Prac_6_10to17 {

	public static void main(String[] args) {

	} // main


//class Marine { 
	//6-9
//	int x = 0, y = 0; // Marine의 위치좌표(x,y) 
//	int hp = 60; // 현재 체력
//	static int weapon = 6; // 공격력
//	static int armor = 0; // 방어력
//
//	static void weaponUp() {
//		weapon++;
//	}
//
//	static void armorUp() {
//		armor++;
//	}
//
//	void move(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
	
//	-------------------------------------------------
//	[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
//		a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
//		b. 생성자는 객체를 생성하기 위한 것이다. 
		// 객체의 생성을 위한 연산자는 new이다.
//		c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
//		d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다. 
//		e. 생성자는 오버로딩 할 수 없다.
		//생성자도 오버로딩이 가능하여 같은 클래스에서도 여러개의 생성자를 정의할 수 있다.
//	M,A : e
//	R.A : b,e

//	-------------------------------------------------
//	[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오) 
//		a. 객체 자신을 가리키는 참조변수이다.
//		b. 클래스 내에서라면 어디서든 사용할 수 있다.
		//클래스 맴버(static)에서는 사용할 수 없다
//		c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
//		d. 클래스 메서드 내에서는 사용할 수 없다. //b와 같은 내용
//	A : b, d
//	R,A : b
	

//	-------------------------------------------------
//	[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오) 
//		a. 메서드의 이름이 같아야 한다.
//		b. 매개변수의 개수나 타입이 달라야 한다.
//		c. 리턴타입이 달라야 한다. //리턴타입은 상관없다
//		d. 매개변수의 이름이 달라야 한다.
//	A : c
//	R,A : c, d
	
//	-------------------------------------------------
//	[6-13]  다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
//	long add(int a, int b) {return a+b;}
//1.
//	long add(int x, int y) { return x+y;}
//2.
//	long add(long a, int b) {return (int)(a+b);}
//3.
//	long add(long a, long b) {return a+b;}
//4.
//	int add(byte a, byte b) { return a+b;}
//	M,A : b,c,d
//	R,A : b,c,d
	

//	-------------------------------------------------
//	[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
//		a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. 
//		b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
//		c.초기화 블럭보다 생성자가 먼저 수행된다.			//초기화 블럭이 먼저 수행된다.
//		d.명시적 초기화를 제일 우선적으로 고려해야 한다. 			
//		e.클래스변수보다 인스턴스변수가 먼저 초기화된다. 	//클래스 변수가 먼저 수행된다.
//	A : 잘 모르겠음
//	R.A	:c, e
//	해설 : 클래스변수는 클래스가 처음 메모리에 로딩 될 때, 
//		자동으로 초기화되므로 인스턴스 변수보다 먼저 초기화 된다.
//		생성자는 초기화 블럭이 수행된 다음에 수행된다.

//	-------------------------------------------------
//	[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은? 
//		a. 기본값-명시적초기화-초기화블럭-생성자
//		b. 기본값-명시적초기화-생성자-초기화블럭
//		c. 기본값-초기화블럭-명시적초기화-생성자
//		d. 기본값-초기화블럭-생성자-명시적초기화
//	A : a 잘 모르겠음
//	R.A : a
//	해설 : 각 변수들의 초기화 순서.
//	클래스 변수의 초기화 시점 : 클래스가 초음으로 로딩될 때 한번 초기화 한다.
//	인스턴스 변수의 초기화 시점 : 인스턴스가 생성될 때마다 인스턴스 변수를 초기화 한다.
	//
//	클래스 변수의 초기화	순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
//	인스턴스 변수의 초기화 순서 :  기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
	
//	-------------------------------------------------
//	[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
//		a. 자동 초기화되므로 별도의 초기화가 필요없다. //return값이 필요하다.
//		b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
//		c. 매서드의 매개변수로 선언된 변수도 지역변수이다. 	// 잘 모르겠음
//		d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
//		e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다. //b와 같은 내용
//	A : a, c?
//	R.A : a, c
//	헤설 :
//		1.	지역변수는 자동으로 초기화 되지 않기 떄문에 사용하기 전에 반드시 적절한 값으로 초기화 해줘야 한다,
//		2.	지역변수는 해당 블럭이나 메서드가 종료되면 소멸 되므로 메모리 부담이없다.
//		3.	힙(heap)영역에서는 인스턴스(인스턴스변수가)생성되는 영역이고,
//			지역변수는	호출스택(call steak)에서 생성된다,

//	-------------------------------------------------
//	[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
//            println
//            method1
//            method2
//            main
//		a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
//		b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.  
//		c. method2메서드를 호출한 것은 main메서드이다.
//		d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
//		e. main-method2-method1-println의 순서로 호출되었다.
//		f. 현재 실행중인 메서드는 println 뿐이다.
//	A : d
//	R.A : b
//	-------------------------------------------------
}//class 
//	-------------------------------------------------