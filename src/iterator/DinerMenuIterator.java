package iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
		/*
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
		*/

        // or shorten to
        return items[position++];
    }

    public boolean hasNext() {
		/*
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
		*/

        // or shorten to
        return items.length > position;
    }

   public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("next()를 한번도 호출하지 않은 상태에서는 삭제 불가");
        }

        if (items[position-1] != null) {
            for (int i = position - 1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
   }
}