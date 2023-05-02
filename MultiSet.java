package data.structure;

import java.util.*;

public class MultiSet<E>{
    
    private HashMap<E, Integer> elemToCount;

    @SafeVarargs
    public MultiSet(E...elems){
        elemToCount = new HashMap<>();
        for(E elem : elems){
            add(elem);
        }
    }

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

    public int add(E e){
       int count = 1 + (elemToCount.containsKey(e) ? elemToCount.get(e) : 0);
       elemToCount.put(e, count);

        return count;        
    }

    public int getCount(E e){
        return elemToCount.getOrDefault(e, 0);
    }

    public MultiSet<E> intersect(MultiSet<E> set){
        MultiSet<E> intersect = new MultiSet<>();
        for(E i : elemToCount.keySet()){
            if(!set.elemToCount.containsKey(i)){
                continue;
            }
            int cnt1 = getCount(i);
            int cnt2 = set.getCount(i);

            intersect.elemToCount.put(i, Math.min(cnt1, cnt2));
        }
        return intersect;
    }

    public int size(){
        int sum = 0;

        for(E e : elemToCount.keySet()){
            if(elemToCount.containsKey(e)){
                sum += elemToCount.get(e);
            }
        }
        return sum;
    } 

    public int countExcept(Set<E> notCounted){
        int cnt = 0;
        for(Map.Entry<E, Integer> enrty : elemToCount.entrySet()){
            if(!notCounted.contains(enrty.getKey())){
                cnt += enrty.getValue();
            }
        }
        return cnt;
    }
}