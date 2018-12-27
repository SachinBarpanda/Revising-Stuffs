package com.great.Sachin;

public class Room extends House {
    private String Keyboard;
    private Laptop Leno;
    private  String Wardrobe;
    private int walls;
    private int MusicSystem;
    private  int sofa;
    private int cupboard;

    public Room(String Keyboard, Laptop leno, String wardrobe, int walls, int MusicSystem
            , int sofa, int cupboard){
        super("Blue One",5,2);
        this.Keyboard=Keyboard;
        this.Leno = leno;
        this.Wardrobe=wardrobe;
        this.walls=walls;
        this.cupboard=cupboard;
        this.MusicSystem=MusicSystem;
        this.sofa=sofa;
    }

    public String getKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(String keyboard) {
        Keyboard = keyboard;
    }

    public void setLeno(Laptop leno) {
        Leno = leno;
    }

    public String getWardrobe() {
        return Wardrobe;
    }

    public void setWardrobe(String wardrobe) {
        Wardrobe = wardrobe;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public void setMusicSystem(int musicSystem) {
        MusicSystem = musicSystem;
    }

    public int getSofa() {
        return sofa;
    }

    public void setSofa(int sofa) {
        this.sofa = sofa;
    }

    public int getCupboard() {
        return cupboard;
    }

    public void setCupboard(int cupboard) {
        this.cupboard = cupboard;
    }


    public Laptop getLeno() {
        return Leno;
    }

    public int getMusicSystem() {
        return MusicSystem;
    }
}
