package aa;

public class aa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] suits={"Spades", "Hearts", "Diamonds", "Clubs"};
      String[] numbers= {"Ace", "2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King"};
      int card=(int)(Math.random()*52);
      String suit=suits[card/13];
      String number=numbers[card%13];
      System.out.println("The card you pick is "+suit+" of "+number);
	}

}
