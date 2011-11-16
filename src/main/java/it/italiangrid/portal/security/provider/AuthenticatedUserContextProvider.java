package it.italiangrid.portal.security.provider;

import it.italiangrid.portal.security.AuthenticatedUserContext;

/**
 * This interface is implemented by providers who give access to the authenticated user context
 * information in the portal.
 * 
 * @author andreaceccanti
 *
 */
public interface AuthenticatedUserContextProvider {

	/**
	 * @return the {@link AuthenticatedUserContext}, or <code>null</code> if no
	 * {@link AuthenticatedUserContext} is defined.
	 */
	public AuthenticatedUserContext getAuthenticatedUserContext();
}
