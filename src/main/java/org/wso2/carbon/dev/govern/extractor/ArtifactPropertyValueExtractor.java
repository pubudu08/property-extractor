package org.wso2.carbon.dev.govern.extractor;

/*
 *
 * @author Pubudu Dissanayake : pubudud@wso2.com  on 01/04/2014.
 */

import org.wso2.carbon.dev.govern.extractor.exception.GenericArtifactException;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;

public interface ArtifactPropertyValueExtractor {
	/**
	 * This method will extract all necessary artifact properties, which contained artifact's
	 * username and password ( will be secured using SecureVault ).
	 *
	 * @throws IOException
	 * @throws XMLStreamException
	 */
	public void performSuperUserXMLPropertyExtraction() throws GenericArtifactException;

}
