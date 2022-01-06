package co.experian.computec.saml.ejb;

import javax.ejb.Remote;

/**
 * EJBSAML local interface
 */
@Remote
public interface EJBSAMLRemote {

	
	/**
	 * 
	 * @param token
	 * @return
	 * @throws Exception
	 */
	 public Boolean validateToken(String token ) throws Exception;
}