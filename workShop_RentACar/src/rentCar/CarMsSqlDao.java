package rentCar;

public class CarMsSqlDao implements CarDao{

	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+"  MsSql'e eklendi.");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+"  MsSql'de güncellendi.");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		System.out.println(car.getName()+"  MsSql'den silindi.");
	}

}
