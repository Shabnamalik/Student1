/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        int i=0;
        Card[] c = new Card[7];
        
        Scanner Card1= new Scanner (System.in);
        System.out.println("Enter the card value : "+Card1);
        
        Scanner Suit1 = new Scanner(System.in);
        System.out.println("Enter the card value: "+Suit1);
        
        for (int i=0; i<Card.length; i++)
        {
            c[i] = new Card();
            c[i].setValue((int)(Math.random()*7+1));
            c[i].setSuit(Card.SUITS[(int)(Math.random()*3+1)]);
            
            if(Card1==Suit1){
                System.out.println("Card is lucky for you");
                
            }
            else{
                System.out.println("Card is unlucky for you");
            }
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
