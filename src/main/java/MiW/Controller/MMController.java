package MiW.Controller;

import MiW.Model.Random;

public class MMController {

    public int guesses;
    public int muerto;
    public int herido;
    public String answer;


    public MMController(){
        answer = Random.generate();
    }

    public boolean validate(String guess){
        muerto=0;
        herido=0;
        guesses++;

        for(int i=0; i<=3; i++){
            if(guess.charAt(i)==answer.charAt(i))
                muerto++;
            else if(answer.contains(guess.charAt(i)+""))
                herido++;
        }

        if(muerto==4){
            return true;
        }else{
            return false;
        }
    }
}
