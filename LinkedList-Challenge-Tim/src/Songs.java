public class Songs {
    private String name;
    private int duration;

    public Songs(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getTitle(){
        return name;
    }

    public String toString(){
        return this.name + " :"+duration;
    }
}
