package rentCar;

public class DataBaseLogger implements LogService{

	@Override
	public void log(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+" Data Base e loglandý");
		
	}

}
