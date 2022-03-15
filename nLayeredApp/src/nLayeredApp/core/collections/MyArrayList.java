package nLayeredApp.core.collections;

public class MyArrayList<T> {
	
	private int defaultSize = 0;
	private Object[] array = new Object[1];
	private Object[] tempArray1;
	private Object[] tempArray2;

	public boolean add(T element) {
		if(defaultSize > -1) {
			this.tempArray1 = new Object[defaultSize];
			this.tempArray1 = this.array;
			defaultSize++;
			this.array = new Object[defaultSize];
			for(int i=0; i < defaultSize-1 ; i++) {
				this.array[i] = tempArray1[i];
			}
		}
		array[defaultSize-1] = element;
		return true;
	}
	
	public int size() {
		return defaultSize;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) array[index];
	}
	
	public boolean contains(T element) {
		for (Object object : array) {
			if(object == element)
				return true;
		}
		return false;
	}
	
	public int indexOf(T element) {
		int index = 0;
		for(index = 0; index < defaultSize; index++) {
			if(array[index]==element) {
				return index;
			}
		}
		return index = -1;
	}
	
	public void set(int index, T element) {
		array[index] = element;
	}
	
	public boolean remove(T element) {
		this.tempArray1 = new Object[indexOf(element)];
		this.tempArray2 = new Object[(array.length-1)-indexOf(element)];
		for(int i=0; i<this.tempArray1.length; i++) {
			this.tempArray1[i] = this.array[i];
		}
		for(int i=0; i<this.tempArray2.length;i++) {
			this.tempArray2[i] = this.array[(this.array.length-1)-i];
		}
		defaultSize--;
		this.array = new Object[defaultSize];
		for(int i=0; i<this.tempArray1.length; i++) {
			this.array[i] = this.tempArray1[i];
		}
		for(int i=0; i<this.tempArray2.length;i++) {
			this.array[(this.array.length-1)-i] = this.tempArray2[i];
		}
		return true;
	}

}
