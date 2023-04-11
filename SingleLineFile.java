package text.to.numbers;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class SingleLineFile{
    public static int addNumbers(String filename) throws IOException{
        int sum = 0;
        try(FileReader fr = new FileReader(filename); BufferedReader br = new BufferedReader(fr);){
            String line = br.readLine();
            String[] splitted = line.split(" ");
            for(String str : splitted){
                try{
                    sum += Integer.parseInt(str);
                } catch (NumberFormatException e){
                    System.err.println(str);
                }
            }
        }
        catch(NullPointerException e){
            System.err.println("Szar pointer!");
        }
        return sum;
    }
}