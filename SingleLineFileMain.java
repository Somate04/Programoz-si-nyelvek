package text.to.numbers;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class SingleLineFileMain{
    public static void main(String[] args){
        try{
            System.out.println(SingleLineFile.addNumbers("file.txt"));
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader("multiline.txt"))){
            String b;
            while((b = br.readLine()) != null){
                System.out.println(b);
            }
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}