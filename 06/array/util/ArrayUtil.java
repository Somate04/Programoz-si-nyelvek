package array.util;


public class ArrayUtil{


    public void ArrayUtil(){}

    public static int max(int[] max){
        if(max.length == 0) return 0;
        int maxv = Integer.MIN_VALUE;
        for(int i = 0; i < max.length; i++){
            if(max[i] > maxv){
                maxv = max[i];
            }
        }
        return maxv;
    }
    public static int max2(int[] max2){
        if(max2.length == 0) return 0;
        int maxv = Integer.MIN_VALUE;
        for(int i = 0; i < max2.length; i++){
            maxv = (max2[i] > maxv ? max2[i] : maxv);
            
        }
        return maxv;
    }
    public static int max3(int[] max3){
        if(max3.length == 0) return 0;
        int maxv = Integer.MIN_VALUE;
        for(int i = 1; i < max3.length; i++){
            maxv = Math.max(max3[i-1], max3[i]);
        }


        return maxv;
    }
    public static int max4(int[] max4){
        if(max4.length == 0)return 0;
        int maxv = Integer.MIN_VALUE;
        for(int i : max4){
            if (i > maxv){
                maxv = i;
            }
        }
        return maxv;
    }
    public static int[] minMax(int[] minMax){
        return minMax;
    }
}