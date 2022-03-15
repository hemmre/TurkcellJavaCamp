package myArrayList;

public class MyArrayList<T> {

	private Object[] tmp;
    private Object[] products;

    public MyArrayList() {
    	
        products = new Object[1];
    }

    public void add(Object product) {
    	
        if (products[0] == null) {
            products[0] = product;
        } else {
        	tmp = products;
            products = new Object[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                products[i] = tmp[i];
            }
            products[products.length - 1] = product;
        }
        
    }

    public void update(int index, Object product) {
    	
        if (index >= products.length) {
            System.out.println("There is no data in the entered index!");
        } else {
            products[index] = product;
        }
        
    }

    public void delete(int index) {
    	
        if (index >= products.length) {
            System.out.println("There is no data in the entered index!");
        } else {
            int y = 0;
            tmp = new Object[products.length - 1];
            for (int i = 0; i < products.length; i++) {
                if (i != index) {
                	tmp[y] = products[i];
                    y++;
                }
            }
            products = tmp;
        }
        
    }

    public void getAll() {
    	
    	for (Object p : products) {
			System.out.print(p+ "\n");
		}
    	
    }
}
