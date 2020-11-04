package Questions;

import java.util.*;

public class FirstCharacter {
    //print the index of the first character, that only appears once
    public static void main(String[] args) {
        System.out.println(firstCharacter("who wants hot watermelon?"));
    }

    public static int firstCharacter(String sentence){
        Character word = 1;
        int index = 0;
        //Create a hashmap with the character and the count
        LinkedHashMap<Character, Integer> list = new LinkedHashMap<>();
        for(int i = 0; i < sentence.length(); i++){
            if(list.containsKey(sentence.charAt(i))) {
                list.put(sentence.charAt(i), list.get(sentence.charAt(i)) + 1);
            } else {
                list.put(sentence.charAt(i), 1);
            }
        }

        //Return the first element with value of 1
        for (Map.Entry<Character, Integer> entry : list.entrySet()) {
            if(entry.getValue() == 1) {
                word = entry.getKey();
                break;
            }
        }
        System.out.println(list);
        System.out.println(word);
        return sentence.indexOf(word);
    }
}
