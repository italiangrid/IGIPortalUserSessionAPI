package it.italiangrid.portal.security;
/**
 * This context provides information about the current authenticated user
 * in the portal
 * 
 * @author andreaceccanti
 *
 */
public interface AuthenticatedUserContext {

	/**
	 * Returns the current authenticated {@link AuthenticatedUser}.
	 * 
	 * @return
	 */
	AuthenticatedUser getAuthenticatedUser();
	
}
