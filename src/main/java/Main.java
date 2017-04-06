import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList <String> initalList = new ArrayList<String>();
        ArrayList<Word> list = new ArrayList<Word>();

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

        for (String word : initalList){
            list.add(new Word(word, -1));
        }

        String bestWord = "SOMETHING";
        for (Word word : list){
            word.matches = word.countMatches(bestWord);
        }

        Collections.sort(list, new Comparator<Word>() {
            public int compare(Word o1, Word o2) {
                if (o1.matches == o2.matches){return 0;}
                else {
                    if (o1.matches < o2.matches){return 1;}
                    else {return -1;}
                }
            }
        });

        for (Word word : list){
            System.out.println(word.text + " " + word.matches);
        }
    }
}
