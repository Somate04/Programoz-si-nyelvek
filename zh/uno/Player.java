package uno;

import java.util.*;

public class Player{
    private String name;
    private List<uno.util.Card> hand;
    private Game game;

    public Player(String n, List<uno.util.Card> h, Game g){
        this.name = n;
        this.hand = h;
        this.game = g;
    }

    public String getName(){
        return name;
    }

    public List<uno.util.Card> getHand(){
        return hand;
    }

    public void addToHand(List<uno.util.Card> c){
        for(uno.util.Card card : c){
            hand.add(card);
        }
    }

    public void removeFromHand(int n){
        int i = 0;
        while(i < hand.size() && n > 0){
            hand.remove(i);
            n--;
            i++;
        }
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        int i = 1;
        for(uno.util.Card c : hand){
            str.append(i);
            if(c.isPlayableOver(game.currentCard)){
                str.append("*");
            }
            str.append("=");
            str.append(c.color);
            str.append(" ");
            if(c.type == uno.util.CardType.VALUE){
                str.append(c.value);
            }
            else{
                str.append(c.type);
            }
            str.append(" ");
        }
        return "Player " + name + str;
    }
}