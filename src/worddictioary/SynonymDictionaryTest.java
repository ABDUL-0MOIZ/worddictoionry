
package worddictioary;

import entity.SynonymDictionary;
import java.util.*;

public class SynonymDictionaryTest {
    public static void main(String[] args) {
        SynonymDictionary sd = new SynonymDictionary();
        
        List<String> synonyms = Arrays.asList("happy", "joyful", "elated");
        sd.insertWord("joy", synonyms);
        
        sd.searchWord("joy");
        
        sd.deleteWord("joy");
        
        sd.updateWord("joy", Arrays.asList("pleased", "content"));
        
        sd.searchWord("joy");
    }
}
