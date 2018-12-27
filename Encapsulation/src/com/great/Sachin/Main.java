package com.great.Sachin;

import java.security.spec.EncodedKeySpec;

public class Main {
    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.health=20;
//        player.fullname="Sam";
//        player.weapon="war";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthReamaing());
//
//        damage = 11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthReamaing());

        EnhancedPlayer eplayer=new EnhancedPlayer("Sam",100,"Sword");
        System.out.println("Health of the player is : " + eplayer.getHealth());
    }

}





