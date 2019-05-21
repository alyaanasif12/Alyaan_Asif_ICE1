//*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagami
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        System.out.println("7 cards Generating");
           
        for (int i=0; i<magicHand.length; i++)
        {
            
            Card c = new Card();
          
            c.setSuit(Card.SUITS[c.getRandomSuit()]);
            c.setValue(c.getRandomVal());
            magicHand[i] =c;
            
            System.out.println(magicHand[i].getSuit() + "\n" + magicHand[i].getValue());
                   
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the suit  ");
        String suit = sc.nextLine();
        System.out.println("Enter a value");
        int val = sc.nextInt();
        
        boolean found = false;
        for(int i =0;i<magicHand.length; i++) {
            if(val == Card[i].getValue() && suit.equalsIgnoreCase(Card[i].getSuit())) {
                found = true;
                break;
            }
            
        }
   
           if(found) { 
               System.out.println("Youre Matching card");
           }
    }
    
}