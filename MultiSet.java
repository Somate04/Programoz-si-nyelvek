package data.structure;

import java.util.*;

public class MultiSet<E>{
    
    private HashMap<E, Integer> elemToCount;

    public MultiSet(ArrayList<E> ls){
        for(E i : ls){
            if(!elemToCount.containsKey(i)){
                elemToCount.put(i, 1);
            }
            else{
                elemToCount.put(i, elemToCount.get(i) + 1);
            }
        }
        
    }

    public void add(E e){
        if(!elemToCount.containsKey(e)){
            elemToCount.put(e, 1);
        }
        else{
            elemToCount.put(e, elemToCount.get(e) + 1);
        }
    }

    public int getCount(E e){
        if(elemToCount.containsValue(e)){
            return elemToCount.get(e);
        }
        else{
            return 0;
        }
    }

    public MultiSet<E> intersect(MultiSet<E> set){
        MultiSet<E> intersection = new MultiSet<E>();
        for( i : elemToCount){
            if(set.containsKey(i) && set.get(i) <= elemToCount.get(i)){
                intersection.put(i, set.get(i));
            }
            else if(set.containsKey(i) && set.get(i) > elemToCount.get(i))
                intersection.put(i, elemToCount.get(i));
        }
        return intersection;
    }

    public int size(){
        return 0;
    } 
}