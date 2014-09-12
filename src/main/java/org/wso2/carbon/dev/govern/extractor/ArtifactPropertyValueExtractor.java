package org.wso2.carbon.dev.govern.extractor;

/*
 *
 * @author Pubudu Dissanayake : pubudud@wso2.com  on 01/04/2014.
 */

public interface IPropertyExtractor {
	/**
	 *   This method will extract all necessary artifact properties, which contained artifact's
	 * username and password ( will be secured using SecureVault ).
	 */
    public void xmlExtractor();

}
