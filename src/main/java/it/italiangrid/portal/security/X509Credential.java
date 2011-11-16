package it.italiangrid.portal.security;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/**
 * 
 * An X.509 credential in the portal context. 
 * 
 * @author andreaceccanti
 *
 */
public interface X509Credential {
	
	
	/**
	 * Returns the subject (as a string) for the first certificate
	 * in the user certificate chain.
	 * 
	 * @return 
	 */
	public String getSubjectString();
	
	
	/**
	 * Returns the subject (as a string) of the issuer certificate for
	 * the first certificate in the user certificate chain.
	 * 
	 * @return
	 */
	public String getIssuerString();	
	
	/**
	 * Returns the first certificate in the user certificate chain.
	 * It is equivalent to <code>getCertificateChain()[0]</code>.
	 * 
	 * @return the user {@link X509Certificate}
	 */
	public X509Certificate getCertificate();
	
	/**
	 * Returns the certificate chain part of this credential.
	 * 
	 * @return the user {@link X509Certificate} chain
	 */
	public X509Certificate[] getCertificateChain();
	
	
	/**
	 * Returns the private key linked to this {@link X509Credential}.
	 * 
	 * @return this credential's {@link PrivateKey}, <code>null</code> if no {@link PrivateKey} is available
	 */
	public PrivateKey getPrivateKey();
	
	
	/**
	 * Returns <code>true</code> if this credential holds an X.509 proxy certificate.
	 * 
	 * @return <code>true</code> if this credential is a proxy credential.
	 */
	public boolean isProxyCredential();
	
	
}
