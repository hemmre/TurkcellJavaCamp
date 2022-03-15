package rentCar;

public class FileLogger implements LogService{

	@Override
	public void log(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+" File a loglandý");
		
	}

}
