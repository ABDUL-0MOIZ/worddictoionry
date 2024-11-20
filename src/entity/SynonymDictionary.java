package entity;

import java.util.*;

public class SynonymDictionary {
    private HashMap<String, List<String>> dictionary;

    public SynonymDictionary() {
        dictionary = new HashMap<>();
    }

    public void insertWord(String word, List<String> synonyms) {
        if(dictionary.containsKey(word)) {
            List<String> existingSynonyms = dictionary.get(word);
            for(String synonym : synonyms) {
                if(!existingSynonyms.contains(synonym)) {
                    existingSynonyms.add(synonym);
                }
            }
        } else {
            dictionary.put(word, new ArrayList<>(synonyms));
        }
    }

    public void searchWord(String word) {
        if(dictionary.containsKey(word)) {
            System.out.println("Synonyms for " + word + ": " + dictionary.get(word));
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    public void deleteWord(String word) {
        if(dictionary.containsKey(word)) {
            dictionary.remove(word);
            System.out.println("Word '" + word + "' has been removed from the dictionary.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }

    public void updateWord(String word, List<String> newSynonyms) {
        if(dictionary.containsKey(word)) {
            dictionary.put(word, new ArrayList<>(newSynonyms));
            System.out.println("Synonyms for '" + word + "' have been updated.");
        } else {
            System.out.println("Word not found in the dictionary.");
        }
    }
}
