import java.util.ArrayList;

/**
 * Created by tperebeynosov on 07/04/2017.
 */
public class List {
    ArrayList<Word> list = new ArrayList<>();

    public ArrayList<Word> getList() {
        return list;
    }

    public void setList(ArrayList<Word> list) {
        this.list = list;
    }

    public void filter(Word checkedWord) {
        // Filter list to remove wrong words
        list.removeIf(word -> {
            if (word.countMatches(checkedWord.text) == (checkedWord.matches)) {
                word.matches = checkedWord.matches;
                return false;
            }
            return true;
        });
    }

    public void updateWord(Word checkedWord) {
        // Set matches count to element in list
        list.replaceAll(word -> {
            if (word.text == checkedWord.text) {
                return checkedWord;
            } else {
                return word;
            }
        });
    }
}
