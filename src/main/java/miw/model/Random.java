package miw.model;

import java.util.ArrayList;
import java.util.List;

public class Random {

    private Random() {
        throw new IllegalStateException("Utility class");
    }

    public static String generate(){
        String sh = shuffle("ARVZBN");
        return sh.substring(0, 4);
    }

    private static String shuffle(String input){
        List<Character> characters = new ArrayList<>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(!characters.isEmpty()){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }
}
