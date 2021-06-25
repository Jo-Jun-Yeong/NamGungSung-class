
public class Parc_6_8 {
	 
	 int kind;
	 int num;
		 
	 static int width; 
	 static int height;

	 Parc_6_8(int k, int n) { 
		 kind = k;
		 num = n;
	 }
	 
	 
	 public static void main(String[] args) {
		 Parc_6_8 card = new Parc_6_8(1,1);
	 }//main
}//class 

//- 클래스변수(static변수) : width, height
//- 인스턴스변수 : kind, num
//- 지역변수 : k, n *card*