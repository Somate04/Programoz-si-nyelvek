package uno.util;

import java.util.*;

public class Card{
    public final Color color;
    public final CardType type;
    public final int value;

    public Card(Color c, CardType t, int v){
        this.color = c;
        this.type = t;
        if(t == CardType.VALUE){
            this.value = v;
        }
        else{
            this.value = 0;
        }
    }

    public boolean isPlayableOver(Card c){
        if(c.type != CardType.VALUE){
            return c.color == color;
        }
        return (c.color == color) || (c.value == value);
    }
    @Override
    public String toString(){
        if(type == CardType.VALUE){
            return color + " " + value;
        }
        return color + " " + type;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Card)){
            return false;
        }
        Card card = (Card)o;
        if(color == card.color && type == card.type && value == card.value){
            return true;
        }
        return false;
        
    }

    @Override
    public int hashCode(){
        return Objects.hash(color, type, value);
    }
}