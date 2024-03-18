package quiz;

public class Quiz__TV {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.getTvInfo();
		tv1.channelUp();;
		tv1.powerButton();
		tv1.getTvInfo();
		tv1.channelUp();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
	}
}
	
class TV { 								//멤버변수
	static final int MAX_VOLUME = 100;
	static final int MIN_VOLUME = 0;
	static final int MAX_CHANNEL = 300;
	static final int MIN_CHANNEL = 1;
	public int channel;
	public int  volume;
	public boolean power;
	public int preChannel;

	public TV() {						//생성자
		this.channel = 7;
		this.volume = 20;
	}

	public TV(int channel, int volume, boolean power, int preChannerl) {
		super();
		this.channel = channel;
		this.volume = volume;
		this.power = power;
		this.preChannel = preChannerl;
	}
	public void powerButton() {				//전원 power값이 t면 f f면 t로 변환
		power = !power;
	}
	public void channelUp () {								//다음 채널로 이동
		if(!power) {
			System.out.println("전원이 꺼져있습니다");
			return;		
		} 
		preChannel = channel;
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		System.out.println(channel+"ch");
	}
	public void channelDown () {							//이전 채널로 이동
		if(!power) {
			System.out.println("전원이 꺼져있습니다");
			return;		
		} 
		preChannel = channel;
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
		System.out.println(channel+"ch");
	}
	
	public void prevChannel () {								//다음 채널로 이동
		if(!power) {
			System.out.println("전원이 꺼져있습니다");
			return;		
		} else if (preChannel==0) {
			System.out.println("이전 채널이 없음");
			return;
		}
		int temp = channel;
		channel = preChannel;
		preChannel = temp;
		
		getTvInfo();
	}
	

	boolean moveChannel(int ch) {						
		if(!power) {
			System.out.println("전원이 꺼져있습니다");
			return false;		
		} 
		if(ch>MIN_CHANNEL && ch<MAX_CHANNEL) {
			preChannel = channel;
			channel = ch;
			System.out.println(ch+"ch");
			return true;
		}else {
			System.out.println("재널이 존재하지 않음");
			return false;
			
		}
	}
	
	public void volumeUp () {								//volume 값 1만큼 증가
		if(!power) {
			System.out.println("전원이 꺼져있습니다.");
			return; 										//void에서 리턴을 만나면 메소드종료
		} else if (volume == MAX_VOLUME){ 					//볼륨 정보 확인
			System.out.println("이미 최대 볼륨입니다.");
		}
		volume++;
		System.out.println("현재 볼륨은 :" + volume+ "입니다.");
	}
	public void volumedown () {
		if(!power) {
			System.out.println("전원이 꺼져있습니다.");
			return; 										//void에서 리턴을 만나면 메소드종료
		} else if (volume == MIN_VOLUME){ 					//볼륨 정보 확인
			System.out.println("이미 최소 볼륨입니다.");
		}
		volume--;
		System.out.println("현재 볼륨은 :" + volume+ "입니다.");
	}
	
	public void getTvInfo() {
		System.out.println("전원 " + power);
		System.out.println("채널 " + channel );
		System.out.println("볼륨 " + volume);
		System.out.println("저장된 이전 채널 " + preChannel);
	
	}

}
	
	
	
	
	

	
	
	

