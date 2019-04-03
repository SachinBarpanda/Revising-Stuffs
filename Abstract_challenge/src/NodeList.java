public interface NodeList {
    listItem getRoot();
    boolean addItems(listItem newItems);
    boolean removeItems(listItem items);
    void traverse(listItem root);
}
