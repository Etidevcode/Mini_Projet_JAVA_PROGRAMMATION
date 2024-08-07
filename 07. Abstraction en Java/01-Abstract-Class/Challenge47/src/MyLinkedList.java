public class MyLinkedList implements NodeList{

	private ListItem root = null;

	public MyLinkedList(ListItem root){
		this.root = root;
	}


	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if (this.root == null) {
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(newItem);
			if (comparison < 0) {
				if (currentItem.next() != null) {
					currentItem = currentItem.next();
				} else  {
					currentItem.setNext(newItem);
					return true;
				}
			} else if (comparison > 0) {
				if (currentItem.previous() != null) {
					currentItem = currentItem.previous();
				} else {
					currentItem.setPrevious(newItem);
				}
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		if (item != null) {
			System.out.println("Deleting item " + item.getValue());
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = currentItem.compareTo(item);
			if (comparison == 0) {
				if (currentItem == this.root) {
					this.root = currentItem.next();
			} else  {
				currentItem.previous().setNext(currentItem.next());
				if (currentItem.next() != null) {
					currentItem.next().setPrevious(currentItem.previous());
				}
			}
			return true;
		} else if (comparison < 0) {
				currentItem = currentItem.next();
			} else {
				currentItem = currentItem.previous();
			}
		}
		return false;
	}

	@Override
	public void traverse(ListItem root) {

	}
}
