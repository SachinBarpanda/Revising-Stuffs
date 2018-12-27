package com.great.Sachin;

public class EnhancedPlayer {
    private String fullname;
    private int hitpoint =100;
    private String weapon;

    public EnhancedPlayer(String fullname, int health, String weapon) {
        this.fullname = fullname;
        if(health > 0 && health < 100){
            this.hitpoint = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        hitpoint =this.hitpoint -damage;
        if(this.hitpoint <=0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitpoint;
    }
}
