package org.APCSLowell;
import java.util.ArrayList;
import java.util.List;
// FRQ: https://secure-media.collegeboard.org/digitalServices/pdf/ap/ap16_frq_computer_science_a.pdf
public class RandomStringChooser {
    private String[] words;
    private ArrayList<String> word;

    public RandomStringChooser(String[] listy){
        words = listy;
        word = new ArrayList<String>();
        for(int i = 0; i < words.length;i++){
            word.add(words[i]);
        }
    }
    public String getNext(){
        if(word.size() > 0){
            int r = (int)(Math.random()*word.size());
            return word.remove(r);
        }
        else{
            return "NONE";
        }
        
    }
}
