package myArrayList;

public class Main {

	public static void main(String[] args) {

		 MyArrayList<String> myArrayList = new MyArrayList<String>();
	       
	     myArrayList.add("Engin");
	     myArrayList.add("Emre");
	     myArrayList.add("Ahmet");
	     myArrayList.add("Serdar");
	     myArrayList.delete(3);
	        
	     myArrayList.update(0,"Ayþe");
	        
	     myArrayList.getAll();
	        
	    }

	}


