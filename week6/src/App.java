import java.util.jar.Attributes.Name;

public class App {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Players player1 = new Players("Player A");
        Players player2 = new Players("Player B");

        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            }
            else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Cards flipped1 = player1.flip();
            Cards flipped2 = player2.flip();

            System.out.print(player1.getName() + " has drawn a ");
            flipped1.describe();
            System.out.print(player2.getName() + " has drawn a ");
            flipped2.describe();


            if (flipped1.getValue() > flipped2.getValue()) {
                System.out.println(player1.getName() + " wins this round!!");
                player1.incrementScore();
            }
            else {
                System.out.println(player2.getName() + " wins this round!!");
                player2.incrementScore();
            }

        }
        System.out.println(player1.getName() + " has scored:" + player1.getScore() + " points");
        System.out.println(player2.getName() + " has scored:" + player2.getScore() + " points");

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " has won the game");
        }
        else if (player1.getScore() == player2.getScore()) {
            System.out.println(player1.getName() + " and " + player2.getName() + " have ended with a tie... guess nobody wins. Try again!");
        }
        else {
            System.out.println(player2.getName() + " has won the game ");
        }

    }
}