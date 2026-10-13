public class FlashCard {
    private String term;
    private String description;
    private boolean nailedIt = false;

    public FlashCard(String term, String description, boolean status) {
        this.term = term;
        this.description = description;
        this.nailedIt = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription (String text) {
        description = text;
    }

    public boolean getStatus() {
        return nailedIt;
    }

    public String getTerm() {
        return term;
    }

    public void setNailedIt(boolean nailedIt) {
        this.nailedIt = nailedIt;
    }

    @Override
    public String toString() {
        return this.term + ", " + this.description + ", " + this.nailedIt;
    }


}
