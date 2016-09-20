package gov.permit.electric;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class ResidentialElectricPermit {
	@WebMethod()
	public int submitPermitRequest(String name) {
		int n = 0;
	    System.out.println("Submitting electric permit request '" + name + "', returning '" + n + "'");
	    return n;
	}

	@WebMethod()
	public String getPermitStatus(int n) {
		String status = "APPROVED";
	    System.out.println("Getting electric permit status for  '" + n + "', returning '" + status + "'");
	    return status;
	}
}
