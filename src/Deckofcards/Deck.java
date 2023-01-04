package Deckofcards;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck{

    private List<Card> deck;

    public Deck(){
        this.deck = new LinkedList<>();
        for (int i = 0; i < Constant.SUIT.length; i++){
            String suit = Constant.SUIT[i];
            for(int j=0; j< Constant.VALUES.length; j++){
                Integer value = Constant.VALUES[j];
                String name = Constant.NAMES[j];
                Card card = new Card(suit,value,name);
                deck.add(card);
            }}
        }

        public void shuffle(){
            //shuffle by picking 1st card and randomly picking a card and swap position. do until all done 
            Random rand = new SecureRandom();

            for(int curr = 0; curr < deck.size(); curr++){
                int toSwap = rand.nextInt(deck.size());
                Card c = deck.get(curr);
                Card d = deck.get(toSwap);
                deck.set(toSwap,c);
                //set is to replace. add is to add into that slot and shift down.
            }
            
        
    }

    @Override
    public String toString() {
        return "Deck [deck=" + deck + "]";
    }
    }
