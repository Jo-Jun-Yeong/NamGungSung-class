
public class Nam_prac_5 {
	public static void main(String [] args) {
//		----------------------------------------------------------------		
//		Q5-1 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명 하시오.
//			a. int[] arr[]; 	//배열의 이름에 []를 붙여서 틀
//		    b. int[] arr = {1,2,3,}; 	//O
//		    c. int[] arr = new int[5]; 	//O 배열이 5개인 배열arr
//		    d. int[] arr = new int[5]{1,2,3,4,5}; 	//배열 선언이 잘못됨
//		    e. int arr[5]; 				//배열 선언이 잘못됨
//		    f. int[] arr[] = new int[3][]; 	//이중 배열 선언이 잘못됨
											// 정답임
		//정답 : d, e
		
//		----------------------------------------------------------------		
//		Q5-2 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
//		 int[][] arr = 
//			 {
//				 { 5,5,5,5,5},
//				 { 10, 10, 10},
//				 { 20, 20, 20, 20}, { 30, 30}
//			 };
//		 // A : 4
////		 	정답 : 2
////		 	배열은 0부터 시작이기 때문에 arr[3]은 {30, 30}이 해당 되므로 정답은 2이다
//		 }
		 
//		----------------------------------------------------------------		
//		Q5-3 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		
//		-> code
		
//			int [] arr = {10, 20, 30, 40, 50};
//			int sum = 0;
//			
//			for(int i=0; i<arr.length; i++) {
//				sum = sum+arr[i];
//				System.out.println("sum ["+i+"]: "+sum );
//			}
//			
//			System.out.println("sum : "+sum );
//		----------------------------------------------------------------		
//		Q5-4 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		
//		 int[][] arr = {
//				
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//				
//				int total = 0; 
//				float average = 0;
//				
//				for(int i = 0; i<arr.length; i++) {
//					for(int j = 0; j< arr[i].length; j++) {
//						total = total + arr[i][i];
//					}
//				}
//				average = total/(float)(arr.length*arr[0].length);
//				
//				System.out.println("total="+total);
//				System.out.println("average="+average);
//		----------------------------------------------------------------		
//		Q5-5 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 
//			(1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		
//		int[] ballArr = {1,2,3,4,5,6,7,8,9}; 
//		
//		int[]ball3 =new int[3];
//		
//		// 배열 ballArr의 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복 
//		
//		for(int x=0;x < 20;x++) {
//			
//		int i = (int)(Math.random() * ballArr.length);
//		int j = (int)(Math.random() * ballArr.length); 
//		int tmp=0;
//		tmp = ballArr[i];
//		ballArr[i] = ballArr[j];
//		ballArr[j] = tmp;
//		
////		System.out.print(ballArr[j]);		
//		} 	//for
//		
//		
//		ball3[0] = ballArr[0]; 
//		ball3[1] = ballArr[1]; 
//		ball3[2] = ballArr[2]; 
//		
//		
//		for(int i=0;i<ball3.length;i++) { 
//			System.out.print(ball3[i]);		
//		} 	//for
//		----------------------------------------------------------------		
//		Q-6 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
//		변 수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하 라. 
//		단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. 
//		(1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		
//		-> code
		
//		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다. 
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		
//		System.out.println("money="+money);
//		
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.println(coinUnit[i]+"원 : "+money/coinUnit[i]+"개");
//			money = money%coinUnit[i];
//		}	//for
//		----------------------------------------------------------------		
//		Q5-7 문제 5-6에 동전의 개수를 추가한 프로그램이다. 
//			커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
//			보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 
//			지불할 돈이 충분히 있으면, 거스름돈을 지불 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
//			(1)에 알맞은 코드를 넣 어서 프로그램을 완성하시오.
		
//		-> code
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120"); 
			System.exit(0);
			} 	//if
			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다. 
		
			int money = Integer.parseInt(args[0]);
			
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수 
			
			for(int i=0;i<coinUnit.length;i++) {
				int coinNum = 0;
				
				/* (1) 아래의 로직에 맞게 코드를 작성하시오.
				1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다. 
				2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
				3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
				 */
				
				//1
				
				
//				//2
				
				if(coin[i] < money%coinUnit[i])
				{ 	//동전이 부족할 때
					
					money = money-(coinUnit[i]*coin[i]); 		//거스름 돈
					
					coin[i] = coin[i]-coin[i]; 	//거스름돈의 갯수
					coinNum = 0; 	//동전의 갯수
							
				} 	//if
				
				else(coin[i] > money%coinUnit[i]) 	/6월 10일 왜 오류가 나는거지?
				{ 	//동전이 충분할 때
					
					money = money%coinUnit[i];
					coin[i]--; 
					coinNum = money/coinUnit[i]; 	//동전의 갯수
					
				}	//else
				
				System.out.println(coinUnit[i]+"원: "+coinNum);
				System.out.println(money);
			} //for
			
			
			if(money > 0) {
				System.out.println("거스름돈이 부족합니다."); 
				System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) { 
				System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
//		----------------------------------------------------------------		
		
	}		//main
}			//class
