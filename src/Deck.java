import java.util.ArrayList;

public class Deck {
    private ArrayList<FlashCard> cards = new ArrayList<>();
    private int count = 0;
    private FlashCard currentCard;
    private TextUI ui;

    public void addCard(FlashCard fc) {
        this.cards.add(fc);
    }

    public ArrayList<FlashCard> getCards() {
        return cards;
    }

    public void displayAllCards() {
        for (FlashCard fc : cards) {
            System.out.println(fc);
        }
    }

    public void displayNextCard() {
        currentCard = cards.get(count);
        System.out.println("*****************");
        System.out.println(currentCard.getTerm());
        System.out.println("*****************");
        count++;
    }

    public void flipCard() {
        System.out.println("-----------------");
        System.out.println(currentCard.getDescription());
        System.out.println("-----------------");
    }

    public void markCard() {
        currentCard.setNailedIt(true);
    }

    public void editCard() {

    }

    public void understood() {
        int input = ui.promptNumeric("Did you get it correct?");
        if (input == 1) System.out.println("Good!");
        else if (input == 2) System.out.println("Then you have to learn it!");
        else {
            System.out.println("You have to choose between 1 or 2!");
            understood();
        }
    }

    public void runSubMenu() {
        int input = ui.promptNumeric("1. Edit flashcard\n2. Mark as nailed");
        if(input == 1) editCard();
        else if (input == 2) markCard();
        else {
            System.out.println("You have to choose between 1 or 2!");
        }

    }
}
