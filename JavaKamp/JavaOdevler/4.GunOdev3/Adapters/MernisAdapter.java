package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User4;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User4 user) {
		KPSPublicSoap tc = new KPSPublicSoapProxy();
		boolean dogruMu = false;
		try {
			dogruMu = tc.TCKimlikNoDogrula(Long.parseLong(user.getNationaltyId()), user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return dogruMu;
	}
	

}
