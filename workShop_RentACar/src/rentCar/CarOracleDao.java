package rentCar;

public class CarOracleDao implements CarDao{

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+" Oracle'a eklendi.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+" Oracle'da güncellendi.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+" Oracle'dan silindi.");
	}

}
