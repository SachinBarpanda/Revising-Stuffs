public class MyLinkedList implements  NodeList {
    private listItem root = null;

    @Override
    public listItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItems(listItem newItems) {
        if(this.root==null){
            this.root=newItems;
            return true;
        }

        listItem currntItem = this.root;
        while(currntItem!=null){
            int comparision=(currntItem.compareTo(newItems));
            if(comparision<0){
                if(currntItem.moveNext()!=null){
                    currntItem=currntItem.moveNext();
                }
                else {
                    currntItem.setNextItem(newItems);
                    newItems.setPreviousItem(currntItem);
                    return true;
                }

            }else if(comparision>0){
                if(currntItem.movePrevious()!=null){
                    currntItem.movePrevious().setNextItem(newItems);
                    newItems.setPreviousItem(currntItem.movePrevious());
                    newItems.setNextItem(currntItem);
                    currntItem.setPreviousItem(newItems);
                }
                else{
                    newItems.setNextItem(this.root);
                    this.root.setPreviousItem(newItems);
                    this.root=newItems;
                }
                return true;
            }else
                System.out.println(newItems.getValue()+" already their !");
            return false;
        }


        return false;
    }

    @Override
    public boolean removeItems(listItem items) {
        if(items!=null){
            System.out.println("Deleting item "+items.getValue());
        }
        listItem currentItem = this.root;
        while( currentItem!=null){
            int compare = currentItem.compareTo(items);
            if(compare==0){
                if(currentItem==this.root){
                    this.root=currentItem.moveNext();
                }else{
                    currentItem.movePrevious().setNextItem(currentItem.moveNext());
                    if(currentItem.moveNext() !=null){
                        currentItem.moveNext().setPreviousItem(currentItem.movePrevious());
                    }
                }
                return true;
            }
            else if(compare<0){
                currentItem=currentItem.moveNext();
            }
            else return false;
        }

        return false;
    }

    @Override
    public void traverse(listItem root) {

        if(root==null){
            System.out.println("List is empty");
        }
        else {
            while(root!=null){
                System.out.println(root.getValue());
                root = root.moveNext();
            }
        }
    }

    public MyLinkedList(listItem root) {
        this.root = root;
    }
}
