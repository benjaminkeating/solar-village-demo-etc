package gov.permit.structural;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class ResidentialStructuralPermit {
	@WebMethod()
	public int submitPermitRequest(String name) {
		int n = 0;
	    System.out.println("Submitting structural permit request '" + name + "', returning '" + n + "'");
	    return n;
	}

	@WebMethod()
	public String getPermitStatus(int n) {
		String status = "APPROVED";
	    System.out.println("Getting structural permit status for  '" + n + "', returning '" + status + "'");
	    return status;
	}
}
