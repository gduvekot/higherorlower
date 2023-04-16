package inleveropdracht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class KaartSpel {
    public static void main(String[] args) {
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            deck.add(i);
        }
       
        String soort1 = ("harten");
        String soort2 = ("ruiten");
        String soort3 = ("schoppen");
        String soort4 = ("klaver");

        String[] array={soort1,soort2,soort3,soort4};

        Random rndm=new Random();
        Collections.shuffle(deck);
        
        int currentCard = deck.remove(0);
        System.out.println("De Kaart is:");
        if (currentCard == 13)
        	System.out.println("Aas");
        if (currentCard == 1)
        	System.out.println("Twee");
        if (currentCard == 2)
        	System.out.println("Drie");
        if (currentCard == 3)
        	System.out.println("Vier");
        if (currentCard == 4)
        	System.out.println("Vijf");
        if (currentCard == 5)
        	System.out.println("Zes");
        if (currentCard == 6)
        	System.out.println("Zeven");
        if (currentCard == 7)
        	System.out.println("Acht");
        if (currentCard == 8)
        	System.out.println("Negen");
        if (currentCard == 9)
        	System.out.println("Tien");
        if (currentCard == 10)
        	System.out.println("Boer"); 
        if (currentCard == 11)
        	System.out.println("Vrouw");
        if (currentCard == 12)
        	System.out.println("Koning");
        System.out.println("van " + array[rndm.nextInt((array.length-1))]);

        Scanner scanner = new Scanner(System.in);
        int points = 0;
		while (!deck.isEmpty()) {
			System.out.println("");
            System.out.print("Is de volgende (h/l)?: ");
            String guess = scanner.nextLine();

            int nextCard = deck.remove(0);
            System.out.println("");
            if (nextCard == 13)
            	System.out.println("Aas");
            if (nextCard == 1)
            	System.out.println("Twee");
            if (nextCard == 2)
            	System.out.println("Drie");
            if (nextCard == 3)
            	System.out.println("Vier");
            if (nextCard == 4)
            	System.out.println("Vijf");
            if (nextCard == 5)
            	System.out.println("Zes");
            if (nextCard == 6)
            	System.out.println("Zeven");
            if (nextCard == 7)
            	System.out.println("Acht");
            if (nextCard == 8)
            	System.out.println("Negen");
            if (nextCard == 9)
            	System.out.println("Tien");
            if (nextCard == 10)
            	System.out.println("Boer"); 
            if (nextCard == 11)
            	System.out.println("Vrouw");
            if (nextCard == 12)
            	System.out.println("Koning");
            System.out.println("van " + array[rndm.nextInt((array.length-1))]);

            if ((guess.equals("h") && nextCard > currentCard) || (guess.equals("l") && nextCard < currentCard)) {
            	System.out.println("Correct!");
                points++;
                System.out.println("Je hebt nu " + points + " punten");
            } else {
                System.out.println("Incorrect!");
                break;
            }

            currentCard = nextCard;
        }
		System.out.println("");
        System.out.println("Game over");
        System.out.println("Eindstand is: " + points + " punten");
    }
}