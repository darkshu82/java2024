package j_20240701;


// 9 장 3 번
// 265 page
interface Player{
	void play();
}

class BaseBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("야구선수가 야구를 합니다");
	}
}

class FootBallPlayer implements Player{
	@Override
	public void play() {
		System.out.println("축구선수가 축구를 합니다");
	}
}


//9 장 4 번
//266 page
interface Tv{
void turnOn();
}

public class Ex02 {
	public static void main(String[] args) {
		// 4 번
		// Anonymous Class (익명 클래스)
		Tv tv1 = new Tv() {
			        @Override
			        public void turnOn() {
			        	System.out.println("Tv 를 켭니다");
			        }			
            };
		
		tv1.turnOn();
		
		// 3 번
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		Ex02.playGame(p1);
		playGame(p2);
	}
	public static void playGame(Player p) {
		p.play();
	}
}












