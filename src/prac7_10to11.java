/*MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 
 * 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 
 * 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 
 * getter와 setter메서드를 추가하라.
 * 
 * 문제7-10에서 작성한 MyTv2클래스에 
 * 이전 채널(previous channel)로 이동하는 기능의 메서드를 추가해서 
 * 실행결과와 같은 결과를 얻도록 하시오.
[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
 * */
class MyTv2{
	private boolean isPowerOn; 
	private int channel; 
	private int volume;
	private int befor;
	final int MAX_VOLUME = 100; 
	final int MIN_VOLUME = 0; 
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1;
	
	/*
	(1) 알맞은 코드를 넣어 완성하시오.
	*/
	
	public boolean isPowerOn(){
		this.isPowerOn=true;
		return true;
	}
	
	public void setChannel(int channel) {
		befor=this.channel;
		
		if(channel<MIN_CHANNEL || channel > MAX_CHANNEL) 
			return;
//		befor = this.channel;
		this.channel=channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME ||volume>MIN_VOLUME)
		return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		
		return volume;
	}
	
	public void gotoPrevChannel() {
		this.channel = befor;
		setChannel(befor);
		
	}
	
}


public class prac7_10to11 {

	public static void main(String[] args) {
		//Q.10
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		
		System.out.println("");
		
		//Q.11
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());

	}

}
