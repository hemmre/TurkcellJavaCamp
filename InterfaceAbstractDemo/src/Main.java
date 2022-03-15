import Adapters.MernisServiceAdapter;
import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Huseyin", "Emre", 1999 , "189455678910");

		neroCustomerManager.save(customer);

	}

}