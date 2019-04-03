public class Main {
    public static void main(String[] args) {

        SearchTree linkedList = new SearchTree(null);
        linkedList.traverse(linkedList.getRoot());

        String stringData = "1 5 7 9";
        String [] data = stringData.split(" ");
        for(String s : data){
             linkedList.addItems(new Node(s));
        }
        linkedList.traverse(linkedList.getRoot() );
       
    }
}
