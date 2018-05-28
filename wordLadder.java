import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;


public class wordLadder {


    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int count = 0;
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);


        return count;

    }


    public static void main(String[] args) {
        wordLadder ladder = new wordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> sList = Arrays.asList("hot","dot","dog","lot","log");
        ladder.ladderLength(beginWord, endWord, sList);
    }


}
