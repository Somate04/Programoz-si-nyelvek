package uno;
import uno.util.*;
import java.util.*;

public class Game{

    protected LinkedList<uno.util.Card> deck;
    protected List<Player> players;
    protected uno.util.Card currentCard;
    protected int currentPlayerIdx;
    protected boolean isForward;
    protected boolean isOn;
    protected uno.util.InputSource inputSource;

    public Game(int n, uno.util.InputSource ip, String... s){
        if(players.size() < 2){
            throw new NotEnoughPlayersException(players.size());
        }
        inputSource = ip;
        initDeck();
        initPlayers(players.size());
    }

    public List<Player> getPlayers(){
        return players;
    }

    private void initDeck(){
        deck = new LinkedList<>();
        for(CardType ct : CardType.values()){
            for(Color color : Color.values()){
                if(ct == CardType.VALUE){
                    for( int i = 1; i < 10; i++){
                        deck.add(new Card(color, ct, i));
                    }
                }
                else{
                    deck.add(new Card(color, ct, 0));
                    deck.add(new Card(color, ct, 0));
                }
            }
        }
        if(inputSource.isInteractive){
            Collections.shuffle(deck);
        }
        Collections.shuffle(deck, new java.util.Random(12345));

    }

    private void initPlayers(int n, String... s){
        for(int i = 0; i < n; i++){
            players.add(new Player(s[i], drawCards(6), this));
        }
    }

    private List<uno.util.Card> drawCards(int n){
        LinkedList<uno.util.Card> temp = new LinkedList<>();
        for(int i = 0; i < n; i++){
            temp.add(deck.get(i));
        }      
        return temp;
    }

    public static void main(String[] arg){
        uno.util.InputSource ip = new uno.util.InputSource(true);
        Game game = new Game(3, ip, arg);


    }

    public void playNext(){}

    public int getNextPlayerIdx(){
        return 0;
    }

    private void currentPlayerDrawCard(){}

    public Player getCurrentPlayer(){
        return null;
    }

    private void interactiveMsg(String s){}

    private void useCardEffect(){}
}