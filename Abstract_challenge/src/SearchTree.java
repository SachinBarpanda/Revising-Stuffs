public class SearchTree implements NodeList {

    private listItem root = null;

    public SearchTree(listItem root) {
        this.root = root;
    }

    @Override
    public listItem getRoot() {
        return this.root;
    }


    @Override
    public boolean addItems(listItem newItem) {
        if (this.root == null) {
            // the tree was empty, so our item becomes the head of the tree
            this.root = newItem;
            return true;
        }

        // otherwise, start comparing from the head of the tree
        listItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.moveNext() != null) {
                    currentItem = currentItem.moveNext();
                } else {
                    // there's no node to the right, so add at this point
                    currentItem.setNextItem(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currentItem.movePrevious() != null) {
                    currentItem = currentItem.movePrevious();
                } else {
                    // there's no node to the left, so add at this point
                    currentItem.setPreviousItem(newItem);
                    return true;
                }
            } else {
                // equal, so don't add
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        // we can't actually get here, but Java complains if there's no return
        return false;
    }

    @Override
    public boolean removeItems(listItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        listItem currentItem = this.root;
        listItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.moveNext();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.movePrevious();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }


    private void performRemoval(listItem item, listItem parent) {
        // remove item from the tree
        if (item.moveNext() == null) {
            // no right tree, so make parent point to left tree (which may be null)
            if (parent.moveNext() == item) {
                // item is right child of its parent
                parent.setNextItem(item.movePrevious());
            } else if (parent.movePrevious() == item) {
                // item is left child of its parent
                parent.setPreviousItem(item.movePrevious());
            } else {
                // parent must be item, which means we were looking at the root of the tree
                this.root = item.movePrevious();
            }
        } else if (item.movePrevious() == null) {
            // no left tree, so make parent point to right tree (which may be null)
            if (parent.moveNext() == item) {
                // item is right child of its parent
                parent.setNextItem(item.moveNext());
            } else if (parent.movePrevious() == item) {
                // item is left child of its parent
                parent.setPreviousItem(item.moveNext());
            } else {
                // again, we are deleting the root
                this.root = item.moveNext();
            }
        } else {
            // neither left nor right are null, deletion is now a lot trickier!
            // From the right sub-tree, find the smallest value (i.e., the leftmost).
            listItem current = item.moveNext();
            listItem leftmostParent = item;
            while (current.movePrevious() != null) {
                leftmostParent = current;
                current = current.movePrevious();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted).
                item.setNextItem(current.moveNext());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null).
                leftmostParent.setPreviousItem(current.moveNext());
            }
        }
    }

    @Override
    public void traverse(listItem root) {
        // recursive method
        if (root != null) {
            traverse(root.movePrevious());
            System.out.println(root.getValue());
            traverse(root.moveNext());
        }

    }
}
