import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> initalList = new ArrayList<String>();
        List list = new List();
        Word checkedWord;

/*      // Dataset hard
        initalList.add("VOLUNTEER"); //1
        initalList.add("BELIEVING"); //3
        initalList.add("ILLNESSES"); //0
        initalList.add("SOMETHING"); //9 - correct
        initalList.add("CRUMBLING");
        initalList.add("RECOVERED");
        initalList.add("PROCESSOR");
        initalList.add("REPRESSED");
        initalList.add("ISOLATION");
        initalList.add("FEROCIOUS");
        initalList.add("HIGHTOWER");
        initalList.add("TERRIFIED");
        initalList.add("REPELLENT");
        initalList.add("IMPLANTED");
        initalList.add("GODFATHER");
*/
        // Dataset medium
        initalList.add("TUNNEL");
        initalList.add("GROUND");
        initalList.add("SHACKS");
        initalList.add("CHOICE");
        initalList.add("GROWTH");
        initalList.add("SEIZED");
        initalList.add("CRIMES");
        initalList.add("VIPERS");
        initalList.add("DRAWER");
        initalList.add("SHRINE");
        initalList.add("AWHILE");
        initalList.add("ACCESS");
        initalList.add("RANSOM");
        initalList.add("DRIVES");
        initalList.add("SPARED");

        // Fill list with words from initial list
        for (String word : initalList) {
            list.list.add(new Word(word, -1));
        }

        System.out.println("\nFirst try");
        checkedWord = new Word("ACCESS", 1);
        //list.updateWord(checkedWord);
        list.filter(checkedWord);

        // Print resulted list
        for (Word word : list.list) {
            System.out.println(word.text + " " + word.matches);
        }

        System.out.println("\nSecond try");
        checkedWord = new Word("SHACKS", 0);
        //list.updateWord(checkedWord);
        list.filter(checkedWord);

        // Print resulted list
        for (Word word : list.list) {
            System.out.println(word.text + " " + word.matches);
        }
    }
}
