package rentCar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car(1,"i30",new Brand(1,"BMW"),new Color(1,"Blue"));
		Car car1 = new Car(1,"i40",new Brand(1,"BMW"),new Color(1,"Black"));
		
		CarManager manager= new CarManager(new CarMsSqlDao(),new DataBaseLogger());
		manager.add(car);
		manager.add(car1);
		manager.delete(car1);
		manager.update(car1);

	}

}
