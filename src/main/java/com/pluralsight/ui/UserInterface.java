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
            Player player = new Player(player_name, 100, 10,10, 50);

            Enemy enemy = new Enemy("Goblin", 50, 5, 20);

            encounter(player, enemy);

        }
    }


    public void encounter(Player _player, Enemy _enemy){
        while(_player.getHp() != 0 && _enemy.getHp() != 0){
            System.out.println("You have encountered a " + _enemy.getName() +"\n" +
                    "Choose what you would like to do. \n" +
                    "1. Fight! \n" +
                    "2. Escape! ");
            int player_encounter_choice = scanner.nextInt();
            scanner.nextLine();

            if (player_encounter_choice == 1){
                //for now only attacks the enemy once then goes back to reprompt the start of the encounter but still saves the new hp
                _player.attack(_enemy);
                System.out.println("enemy current hp is now" + _enemy.getHp());

            } else if (player_encounter_choice == 2) {
                // for now just exits the program but will make it give  random chance to escape later
                System.exit(0);
            }




        }


    }




}
