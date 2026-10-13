public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        FileIO io = new FileIO();
        TextUI ui = new TextUI();


        io.readData("data/flashcards.csv", deck);
        //deck.displayAllCards();

        boolean running = true;
        deck.displayNextCard();
        while (running) {
            int choice = ui.promptNumeric("1. Flip\n2. Next\n3. Quit");
            switch (choice) {
                case 1 -> {
                    deck.flipCard();
                    deck.runSubMenu();
                }
                case 2 -> deck.displayNextCard();
                case 3 -> running = false;
                default -> System.out.println("Du skal vælge et tal mellem 1 og 3! Prøv igen!");
            }
        }
        //TODO: Gør det muligt at gå tilbage i flashcards
        //TODO: Vælge om man kunne den eller ikke, som man kan få en score på til sidst.


        //TODO: sørg for at vi kan få fat i ArrayListen med flashcard objekter.
        io.writeData("data", deck);
    }
}
