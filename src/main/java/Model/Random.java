package Model;

import java.util.ArrayList;
import java.util.List;

public class Random {

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
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }
}
