package com.bridgelabz.deck_of_cards;

import java.util.Random;

public class DeckOfCards {
    static String suit[] = {"H", "S", "D", "C"};
    static String rank[] = {"ace","2","3","4","5","6","7","8","9","10","jac","queen","king"};
    static String deck[] = new String[52];
    static Random random = new Random();
    static String player1[] = new String[9];
    static String player2[] = new String[9];
    static String player3[] = new String[9];
    static String player4[] = new String[9];
    public static void main(String[] args) {


        for(int i=0; i<deck.length; i++){
            deck[i] = rank[i%13]+suit[i/13];
//            System.out.println(deck[i]);
        }
        for(int i=0; i<deck.length; i++){
            int index = random.nextInt(52);
            String temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
//        for (String u: deck){
//            System.out.println(u);
//        }
//        for(int i=0; i<52; i++){
//            System.out.println(deck[i]);
//        }
        player1();
        System.out.println("-------------------");
        System.out.println("Player1 cards");
        for(String p1 : player1){
            System.out.println(p1);
        }
        System.out.println("-------------------");
        player2();
        System.out.println("Player2 cards");
        for(String p2 : player2){
            System.out.println(p2);
        }
        System.out.println("-------------------");
        player3();
        System.out.println("Player3 cards");
        for(String p3 : player3){
            System.out.println(p3);
        }
        System.out.println("-------------------");
        player4();
        System.out.println("Player4 cards");
        for(String p4 : player4){
            System.out.println(p4);
        }
        System.out.println("-------------------");

    }
    public static void player1(){
        int i = 0;
        while(i<9){
            int pos = random.nextInt(52);
            if(deck[pos] != null){
                player1[i] = deck[pos];
                deck[pos] = null;
                i++;
            }//end if
        }//end while
    }//end player1()
    public static void player2(){
        int i = 0;
        while(i<9){
            int pos = random.nextInt(52);
            if(deck[pos] != null){
                player2[i] = deck[pos];
                deck[pos] = null;
                i++;
            }//end if
        }//end while
    }//end player2()
    public static void player3(){
        int i = 0;
        while(i<9){
            int pos = random.nextInt(52);
            if(deck[pos] != null){
                player3[i] = deck[pos];
                deck[pos] = null;
                i++;
            }//end if
        }//end while
    }//end player3()
    public static void player4(){
        int i = 0;
        while(i<9){
            int pos = random.nextInt(52);
            if(deck[pos] != null){
                player4[i] = deck[pos];
                deck[pos] = null;
                i++;
            }//end if
        }//end while
    }//end player4()
}//end class
