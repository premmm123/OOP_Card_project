/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjavafx;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PREMz ,Pollapatronum
 */
public class Deck {
    private ArrayList<Card> deck;
    
    /*@Constructor
    Append the Card to deck ArrayList Obj.
    */
    public Deck() {
        deck = new ArrayList<Card>();
    }
    
    public Deck(boolean b){
        if(b){
            deck = new ArrayList<Card>();
            String face[] = {"clubs","diamonds","hearts","spades",};
            String suit[] = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
            int n = 0;
            for(String s : suit){
                for(String f : face){
                    deck.add(new Card(f, s, ++n));
                }
            }
        }
    }
    
    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }
        
    //getter, setter
    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    /*@method
    This method will shuffle the deck ArrayList Obj.
    */
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    public void sortDeck(){
        Collections.sort(deck);
    }
    
    /*@method
    This method will do fist in-out logic form deck ArrayList Obj.
    */
    public Card draw(){
        if(deck.size() > 0) 
            return deck.remove(0);
        else                
            return null;
    }
    
    public int getSize(){
        return deck.size();
    }
    
    public void addCard(Card card){
        deck.add(card);
    }

    @Override
    public String toString() {
        this.sortDeck();
        return deck+" ";
    }
    
    /*
    *
    *
    +++++++++++++++++For Bot+++++++++++++++++++
    *
    *
    */
    public void botDropCard(ArrayList<Card> bot){
        int size = bot.size();
        System.out.println(size);
        //bot.remove(0);
        //System.out.print(bot.get(1).getSuit());
        for(int i = 0;i<size-1;i++){
            System.out.println("++Size "+size+" i "+i);
            if(i+1 == size-1) break;
            else{
                for(int j = i+1; j< size; j++){
                    size = bot.size();
                    System.out.println("Size "+size+" j "+j);
                    if(bot.get(i).getSuit().equals(bot.get(j).getSuit())){    
                        bot.remove(i);
                        bot.remove(j);
                        break;
                        //System.out.println("bot : "+bot);
                    }
                }
            }
        }
        /*for(int i = 0;i<size-1;i++){
        System.out.println(i);
            for(int j = size-1;j>i+1;j--){
                if(bot.get(i).getSuit() == bot.get(j).getSuit()){
                   System.out.println(bot.remove(i).getSuit());
                   System.out.println(bot.remove(j).getSuit());
                   break;
                }
            }
        }*/
    }
    
    
}
