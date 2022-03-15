package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	@Override
	public boolean checkIfRealPerson(Customer customer) throws Exception {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();

		return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
				customer.getDateOfBirth());
	}

}
