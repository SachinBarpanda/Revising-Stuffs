public abstract class listItem {
    public Object value;

    public listItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public listItem nextItem=null;
    public listItem previousItem=null;

    public abstract listItem moveNext();
    public abstract listItem movePrevious();

    public abstract listItem setNextItem(listItem nextItem);

    public abstract listItem setPreviousItem(listItem previousItem);

    public abstract int compareTo(listItem name);
} 
