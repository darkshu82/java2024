
public class Ex07 {
  public static void main(String[] args) {
    
    GraphicCard gc = new GraphicCard();
    gc.process();
    System.out.println("GraphicCard : " + gc);
    
    Game g1 = new Game();
    g1.playGame1(gc);
//    g2.playGame2(gc);
//    g3.playGame3(gc);
        
    gc = new Amd();
    System.out.println("Amd : " + gc);
    gc.process();
//    g1.playGame1((Amd)gc);
    g1.playGame2((Amd)gc);
//    g1.playGame3((Amd)gc);

    gc = new Nvidia();
    System.out.println("Nvidia : " + gc);
    gc.process();
//    g1.playGame1((Nvidia)gc);
//    g1.playGame2((Nvidia)gc);
    g1.playGame3((Nvidia)gc);
    
    GraphicCard[] arrGC = new GraphicCard[4];
    arrGC[0] = new GraphicCard();
    arrGC[1] = new Amd();
    arrGC[2] = new GraphicCard();
    arrGC[3] = new Nvidia();
    
    for(GraphicCard gc2 : arrGC) {
      gc.process();
    }
    
  }

}

class Game{
  
  void playGame1(GraphicCard card) {
    card.process();
  }

  void playGame2(Amd card) {
    card.process();
  }

  void playGame3(Nvidia card) {
    card.process();
  } 
}




class GraphicCard{
  int memory;
  public void process() {
    System.out.println("그래픽 처리");
  }
  public String toString() {
    return "GraphicCard";
  }
}

class Amd extends GraphicCard {
  @Override
  public void process() {
    System.out.println("AMD 그래픽 처리");
  }
  public String toString() {
    return "Amd";
  }
}

class Nvidia extends GraphicCard {
  @Override
  public void process() {
    System.out.println("NVDIA 그래픽 처리");
  }
  public String toString() {
    return "Nvdia";
  }
}

