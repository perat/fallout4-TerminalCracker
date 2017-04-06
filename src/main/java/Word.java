public class Word {
    public String text;
    public int matches;

    public Word(String value, int matches) {
        this.text = value;
        this.matches = matches;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public String getValue() {
        return text;
    }

    public void setValue(String value) {
        this.text = value;
    }

    public int countMatches(String word2) {
        int matches = 0;
        for (int i = 0; i < word2.length(); i++){
            if (this.text.charAt(i) == word2.charAt(i)){
                matches++;
            }
        }
        return matches;
    }

}
