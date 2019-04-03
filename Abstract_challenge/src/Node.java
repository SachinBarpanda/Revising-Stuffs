public class Node extends listItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    public listItem moveNext() {
        return this.nextItem;
    }

    @Override
    public listItem movePrevious() {
        return this.previousItem;
    }

    @Override
    public listItem setNextItem(listItem nextItem) {
        this.nextItem=nextItem;
        return this.nextItem;
    }

    @Override
    public listItem setPreviousItem(listItem previousItem) {
        this.previousItem=previousItem;
        return this.previousItem;
    }

    @Override
    public int compareTo(listItem name) {
        if(name!=null){
            return ((String)super.getValue()).compareTo((String)name.getValue());
        }
        else
            return -1;
    }
}
