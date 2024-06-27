package j_20240627;

public class Ex07 {
	
	public static void main(String[] args) {
		
		// 221 page
		
		GraphicCard gc = new GraphicCard();
		System.out.println("GraphicCard : " + gc);
		gc.process();

		Game g1 = new Game();
		System.out.println("GraphicCard : " + gc);
		g1.playGame1(gc);
		//g1.playGame2((Amd)gc);
		//g1.playGame3((Nvidia)gc);
		
		gc = new Amd();
		System.out.println("Amd : " + gc);
		gc.process();
		g1.playGame1(gc);
		g1.playGame2((Amd)gc);
		// g1.playGame3((Nvidia)gc);
		
		gc = new Nvidia();
		System.out.println("Nvidia : " + gc);
		gc.process();
		g1.playGame1(gc);
		// g1.playGame2((Amd)gc);
		g1.playGame3((Nvidia)gc);	
		
		System.out.println("=====================");
		
		GraphicCard[] arrGC = new GraphicCard[4];
		arrGC[0] = new GraphicCard();
		arrGC[1] = new Amd();
		arrGC[2] = new GraphicCard();
		arrGC[3] = new Nvidia();
		
		for(GraphicCard gc2 : arrGC) {
			gc2.process();
		}
		
	}
}

// 223 page
class Game{
	
	// playGame1 메소드는 GraphicCard 카드를 갖고 게임할 수 있음
	//           메소드는 Amd 카드를 갖고 게임할 수 있음
	//           메소드는 Nvidia 카드를 갖고 게임할 수 있음
	void playGame1(GraphicCard card) {
		card.process();
	}
	
	// playGame2 메소드는 Amd 카드만 갖고 게임할 수 있음
	void playGame2(Amd card) {
		card.process();
	}
	
	// playGame3 메소드는 Nvidia 카드만 갖고 게임할 수 있음
	void playGame3(Nvidia card) {
		card.process();
	}
	
}

class GraphicCard{
	int memory;
	public void process() {
		System.out.println("그래픽 처리");
	}
	@Override
	public String toString() {
	  return "GraphicCard";
	}
}

class Amd extends GraphicCard{
	@Override
	public void process() {
		System.out.println("Amd 그래픽 처리");
	}
	@Override
	public String toString() {
	  return "Amd";
	}
}

class Nvidia extends GraphicCard{
	@Override
	public void process() {
		System.out.println("Nvidia 그래픽 처리");
	}
	@Override
	public String toString() {
	  return "Nvidia";
	}
}







