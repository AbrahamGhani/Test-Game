package com.pluralsight.ui;

import com.pluralsight.models.Enemy;
import com.pluralsight.models.Player;

import java.util.Scanner;

public class UserInterface {
    Scanner scanner = new Scanner(System.in);

    public void startGame(){
        while (true){
            System.out.println("please enter your name");
            String player_name = scanner.nextLine();
            Player player = new Player(player_name, 100, 10, 50);

            Enemy enemy = new Enemy("Goblin", 50, 5, 20);

            while(player.getHp() != 0 && enemy.getHp() != 0){
                System.out.println("You have encountered a " + enemy.getName() +"\n" +
                        "Choose what you would like to do. \n" +
                        "1. Fight! \n" +
                        "2. Escape! ");
                int player_encounter_choice = scanner.nextInt();
                scanner.nextLine();

                if (player_encounter_choice == 1){
                    //attack,skills,magic,items
                } else if (player_encounter_choice == 2) {
                    //random chance to escape if successful exit combat end game else force combat and be attacked first
                }


//                player.attack(enemy);
//                System.out.println("enemy current hp is now" + enemy.getHp());


            }



        }
    }



}
