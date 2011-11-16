package it.italiangrid.portal.security;
/**
 * 
 * Represents an authenticated user in the portal context.
 * 
 *
 */
public interface AuthenticatedUser {

		
	/**
	 * Returns the default user certificate credential as stored in the portal certificate repository.
	 * 
	 * @return the user {@link X509Credential}
	 */
	public X509Credential getCertificate();
	
	
	/**
	 * Returns the user proxy certificate credential as stored in the portal certificate repository.
	 * 
	 * @return the user proxy {@link X509Credential}
	 */
	public X509Credential getProxyCertificate();
	
	
}
