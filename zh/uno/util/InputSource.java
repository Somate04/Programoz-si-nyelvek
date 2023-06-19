package uno.util;

import java.util.*;
import java.io.*;

public class InputSource{
    public final boolean isInteractive;
    private java.io.BufferedReader br;
    private int[] inputs;
    private int inputIdx;
    public static final int DONE = -1;

    public InputSource(boolean b, int... n){
        isInteractive = b;
        if(isInteractive){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        else{
            inputs = n;
        }
    }

    public int getNextInput(){
        if(isInteractive){
            try{
                String input = br.readLine();
                if(input == "done"){
                    return DONE;
                }
                return Integer.parseInt(input);
            }
            
            catch (IOException e){
                System.out.println("Szar");
            }
            
        }
        return inputs[inputIdx];
    }
}
