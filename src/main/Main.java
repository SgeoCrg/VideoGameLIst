package main;

import data.Company;
import data.PCVideoGame;
import data.VideoGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Company comp1 = new Company("Konami", 1980);
        Company comp2 = new Company("Ultimate", 1979);
        VideoGame game1 = new VideoGame("Commando", "Arcade", 19.95f, comp1);
        VideoGame game2 = new VideoGame("Saboteur", "Plataform", 15.95f, comp2);
        VideoGame game3 = new VideoGame("Gauntlet", "Arcade", 21.90f, comp1);
        PCVideoGame game4 = new PCVideoGame("Empires","Strategy", 19.95f, 4600, 23000, comp2);
        PCVideoGame game5 = new PCVideoGame("Might and magic", "Role", 11.90f, 4600, 12000, comp2);
        VideoGame expensive = new VideoGame("","",0, comp1);
        List<VideoGame> list = new ArrayList<>();
        list.add(game1);
        list.add(game2);
        list.add(game3);
        list.add(game4);
        list.add(game5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            if (expensive.getPrice() < list.get(i).getPrice()) {
                expensive = list.get(i);
            }
        }
        System.out.println("The expensive game is: " + expensive.toString());
        // show the more uses company
        //print "counter"
    }
}
/*
3.1.2.1. Go back to exercise 2.6.4.1 of unit 6. Replace the video game array in main method with a
        generic ArrayList . Then, add some video games to the list (either VideoGame or PCVideoGame
        objects), explore and show the list with a for and ask the user to:
        Search video games by title: the user will type a title and then the program will show all the video
        games whose title contains the typed text (ignoring case).
        Remove a video game from the list: the user will type the index of the video game to be removed,
        and if the index is valid, the video game in that index will be removed.
        3.1.2.2. Sort previous list by price in ascending order using Collections.sort and the appropriate
        comparing method. Do this step before printing the list in the screen.*/