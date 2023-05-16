package action.user;

public class MultiDimensionalPoint implements Scalable, Undoable{
    private int[] coordinates;
    private int[] lastCoordinates;

    public int[] getCoordinates(){
        return coordinates;
    }
    public int[] getLastCoordinates(){
        return lastCoordinates;
    }

    public MultiDimensionalPoint(int... coordinates){
        this.coordinates = coordinates;
        this.lastCoordinates = coordinates;
    }

    public int get(int i){
        return coordinates[i];
    }

    public void set(int x, int y){
        this.lastCoordinates = coordinates;
        this.coordinates[x] = y;
    }

    @Override
    public void scale(int x){
        this.lastCoordinates = coordinates;
        for(int c : coordinates){
            this.coordinates[c] += x;
        }
    }

    private void saveToLast(){

    }

    @Override
    public void undoLast(){
        this.coordinates = lastCoordinates;
    }
}   