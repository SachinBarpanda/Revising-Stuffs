package com.great.Sachin;

public class Player {
    public String fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health=this.health-damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }
    public int healthReamaing(){
        return this.health;
    }
}
