import org.code.neighborhood.Painter;

public class GobiTheChickPainter extends PatternPainter {
  
 public GobiTheChickPainter() {
   super();
 }

  public void paintBackground() {
    while(canMove("south")) {
        paintLine("white");
        paint("white");
        changeRow();
  }
    paintLine("white");
    paint("white");
    turnLeft();
  }
  public void moveTillEnd() {
    while (canMove()) {
      move();
  }
    changeRow();
  }
  
  public void changeRow() {
    if (isFacingEast()) {
      turnRight();
      if (canMove()) {
        move();
        turnRight();
      }
    }
      else {
        turnLeft();
        if (canMove()) {
          move();
          turnLeft();
        }
      }
      
  
  }

  public void paintFirst() {
   moveTillEnd();
  }

  public void paintSecond(String color) {
    moveByFive();
    paintByFour(color);
    moveTillEnd();
  }

  public void paintThird() {
    moveByTen();
    moveByFive();
    moveByFour();
    paintByTwo("brown");
    paintByFour("pink");
    move();
    paint("brown");
    moveTillEnd();
  }

  public void paintFourth() {
    move();
    move();
    move();
    move();

    paint("brown");
    paintByThree("pink");
    paintByFour("pink");
    paintByThree("brown");
    moveTillEnd();
  }

  public void paintFifth() {
    moveByTen();
    moveByFour();
    paintByTwo("brown");
    paintByFive("pink");
    paintByFive("pink");
    move();
    paint("brown");
    moveTillEnd();
  }

  public void paintSixth() {
    moveByThree();
    paint("brown");
    paintByThree("pink");
    paintByFive("pink");
    paintByThree("brown");
    paintByFour("brown");
    moveTillEnd();
  }

  public void paintSeventh() {
    moveByTen();
    move();
    paintByOne("brown");
    paintByThree("coral");
    paintByFour("coral");
    paintByThree("brown");
    paintByFive("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintEighth() {
    move();
    paintByOne("brown");
    paintByTwo("pink");
    paintByOne("brown");
    paintByOne("pink");
    paintByTwo("brown");
    paintByTen("coral");
    paintByOne("coral");
    paintByThree("brown");
    paintByFour("brown");
    moveTillEnd();
  }

  public void paintNinth() {
    moveByTwo();
    paintByTwo("brown");
    paintByThree("pink");
    paintByFour("pink");
    paintByFive("brown");
    paintByThree("coral");
    paintByFive("coral");
    paintByTwo("brown");
    paintByTwo("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTenth() {
    move();
    paintByOne("brown");
    paintByTwo("pink");
    paintByOne("brown");
    paintByFive("coral");
    paintByOne("coral");
    paintByThree("brown");
    paintByTen("pink");
    paintByFour("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintEleventh() {
    move();
    paintByOne("brown");
    paintByTen("pink");
    paintByFive("pink");
    paintByTwo("pink");
    paintByTwo("brown");
    paintByFour("coral");
    paintByOne("brown");
    paintByTwo("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwelfth() {
    move();
    paintByOne("brown");
    paintByTwo("pink");
    paintByOne("brown");
    paintByTwo("coral");
    paintByTwo("brown");
    paintByFive("pink");
    paintByTen("brown");
    paintByFive("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintThirteenth() {
    paintByOne("brown");
    paintByFour("pink");
    paintByOne("brown");
    paintByTen("LemonChiffon");
    paintByThree("brown");
    paintByFour("pink");
    paintByFive("brown");
    moveTillEnd();
  }

  public void paintFourteenth() {
    moveByFour();
    paintByOne("brown");
    paintByFour("pink");
    paintByTwo("brown");
    paintByTen("LemonChiffon");
    paintByFour("LemonChiffon");
    paintByOne("brown");
    paintByTwo("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintFifteenth() {
    moveByTwo();
    paintByThree("brown");
    paintByTen("LemonChiffon");
    paintByFive("LemonChiffon");
    paintByOne("LemonChiffon");
    paintByOne("brown");
    paintByFour("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintSixteenth() {
    moveByTwo();
    paintByOne("brown");
    paintByFour("pink");
    paintByOne("brown");
    paintByTen("LemonChiffon");
    paintByFive("LemonChiffon");
    paintByTwo("LemonChiffon");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintSeventeenth() {
    moveByThree();
    paintByOne("brown");
    paintByFive("LemonChiffon");
    paintByThree("LemonChiffon");
    paintByFive("brown");
    paintByFive("LemonChiffon");
    paintByOne("LemonChiffon");
    paintByOne("brown");
    paintByFour("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintEightteenth() {
    move();
    paintByOne("brown");
    paintByThree("pink");
    paintByOne("brown");
    paintByTwo("LemonChiffon");
    paintByTwo("brown");
    paintByTwo("LemonChiffon");
    paintByOne("brown");
    paintByFive("GoldenRod");
    paintByOne("brown");
    paintByTwo("LemonChiffon");
    paintByTwo("brown");
    paintByThree("LemonChiffon");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintNineteenth() {
    moveByThree();
    paintByOne("brown");
    paintByThree("LemonChiffon");
    paintByTwo("brown");
    paintByTwo("LemonChiffon");
    paintByOne("brown");
    paintByFive("GoldenRod");
    paintByOne("brown");
    paintByTwo("LemonChiffon");
    paintByTwo("brown");
    paintByTwo("LemonChiffon");
    paintByOne("brown");
    paintByFour("pink");
    paintByOne("brown");
    moveTillEnd();    
  }

  public void paintTwentieth() {
    paintByOne("brown");
    paintByThree("pink");
    paintByOne("pink");
    paintByFive("LemonChiffon");
    paintByThree("LemonChiffon");
    paintByFive("brown");
    paintByFive("LemonChiffon");
    paintByThree("LemonChiffon");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentyFirst() {
    moveByFour();
    paintByOne("brown");
    paintByTen("LemonChiffon");
    paintByTen("LemonChiffon");
    paintByOne("brown");
    paintByThree("pink");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentySecond() {
    move();
    paintByThree("brown");
    move();
    paintByOne("brown");
    paintByTen("LemonChiffon");
    paintByFive("LemonChiffon");
    paintByFour("LemonChiffon");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentyThird() {
    moveByFour();
    paintByOne("brown");
    paintByTen("LemonChiffon");
    paintByFive("LemonChiffon");
    paintByFour("LemonChiffon");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentyFourth() {
    moveByFive();
    paintByTwo("brown");
    paintByOne("LemonChiffon");
    paintByTwo("brown");
    paintByTen("LemonChiffon");
    paintByOne("LemonChiffon");
    paintByTwo("brown");
    paintByOne("LemonChiffon");
    paintByTwo("brown");
    moveTillEnd();
  }

  public void paintTwentyFifth() {
    moveByThree();
    paintFoot();
    paintByFive("LemonChiffon");
    paintByFour("LemonChiffon");
    paintFoot();
    moveTillEnd();
  }

  public void paintTwentySixth() {
    moveByFour();
    paintFoot();
    paintByFive("LemonChiffon");
    paintByFour("LemonChiffon");
    paintFoot();
    moveTillEnd();
  }

  public void paintTwentySeventh() {
    moveByThree();
    paintByOne("brown");
    paintByFive("GoldenRod");
    paintByOne("brown");
    paintByFive("LemonChiffon");
    paintByFour("LemonChiffon");
    paintByOne("brown");
    paintByFive("GoldenRod");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentyEighth() {
    moveByFive();
    paintByOne("brown");
    paintByThree("GoldenRod");
    paintByThree("brown");
    paintByFive("LemonChiffon");
    paintByTwo("LemonChiffon");
    paintByThree("brown");
    paintByThree("GoldenRod");
    paintByOne("brown");
    moveTillEnd();
  }

  public void paintTwentyNinth(String color) {
    moveByFive();
    paintByThree(color);
    moveByThree();
    paintByFive(color);
    paintByTwo(color);
    moveByThree();
    paintByThree(color);
    moveTillEnd();    
  }

  public void backToBegin() {
        while (canMove("west")) {
      move();
      if (!canMove()) {
        turnLeft();
  }
        }
    turnLeft();
    turnLeft();
  }
/*===============================

         LIST OF THE TOOL

  ===============================
*/
  public void moveByTwo() {
    move();
    move();
  }

  public void moveByThree() {
    move();
    move();
    move();
  }

  public void moveByFour() {
    move();
    move();
    move();
    move();
  }

  public void moveByFive() {
    move();
    move();
    move();
    move();
    move();
  }

  public void moveByTen() {
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
  }

  public void paintByOne(String color) {
    move();
    paint(color);
  }
  
  public void paintByTwo(String color) {
    move();
    paint(color);
    move();
    paint(color);
  }

  public void paintByThree(String color)  {
    move();
    paint(color);
    move();   
    paint(color);
    move();
    paint(color);
  }
  public void paintByFour(String color)  {
    move();
    paint(color);
    move();   
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  public void paintByFive(String color) {
    move();
    paint(color);
    move();   
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }

  public void paintByTen(String color) {

    move();
    paint(color);
    move();   
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();   
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
  }
  public void paintFoot() {
    paintByOne("brown");
    paintByTwo("GoldenRod");
    paintByOne("brown");
    paintByTwo("GoldenRod");
    paintByOne("brown");
  }
}
