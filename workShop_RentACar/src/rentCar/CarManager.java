package rentCar;

public class CarManager implements CarService{

	private CarDao carDao;
	private LogService logService;
	
	public CarManager(CarDao carDao, LogService logService) {
		super();
		this.carDao = carDao;
		this.logService = logService;
	}


	@Override
	public void add(Car car) {
		// TODO Auto-generated method stub
		this.carDao.add(car);
		this.logService.log(car);
		System.out.println("Araba eklendi.");
		System.out.println("\n");
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		this.carDao.update(car);
		this.logService.log(car);
		System.out.println("Araba güncellendi.");
		System.out.println("\n");
	}

	@Override
	public void delete(Car car) {
		// TODO Auto-generated method stub
		this.carDao.delete(car);
		this.logService.log(car);
		System.out.println("Araba silindi.");
		System.out.println("\n");
	}


}
