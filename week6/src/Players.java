import java.util.ArrayList;
import java.util.List;

public class Players {

    private List<Cards> hand = new ArrayList<Cards>();
    private int score;
    private String name;

    public Players() {
        score = 0;
    }
    public Players(String name) {
        this.name = name;
        score = 0;
    }
    public void describe() {
        System.out.println(name + " has " + score + " points ");
        System.out.println(name + " hand: ");
        for (Cards card : hand) {
            card.describe();
        }
    }
    public Cards flip() {
        return hand.remove(0);
    }
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    public void incrementScore() {
        score++;
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
}


