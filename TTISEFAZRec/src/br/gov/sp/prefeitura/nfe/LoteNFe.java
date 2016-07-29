package br.gov.sp.prefeitura.nfe;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.1 in JDK 6 Generated
 * source version: 2.1
 * 
 */
@WebServiceClient(name = "LoteNFe", targetNamespace = "http://www.prefeitura.sp.gov.br/nfe")
public class LoteNFe extends Service {

	private final static URL LOTENFE_WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL(
					"https://nfe.prefeitura.sp.gov.br/ws/lotenfe.asmx?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		LOTENFE_WSDL_LOCATION = url;
	}

	public LoteNFe(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public LoteNFe() {
		super(LOTENFE_WSDL_LOCATION, new QName(
				"http://www.prefeitura.sp.gov.br/nfe", "LoteNFe"));
	}

	/**
	 * 
	 * @return returns LoteNFeSoap
	 */
	@WebEndpoint(name = "LoteNFeSoap")
	public LoteNFeSoap getLoteNFeSoap() {
		return (LoteNFeSoap) super.getPort(new QName(
				"http://www.prefeitura.sp.gov.br/nfe", "LoteNFeSoap"),
				LoteNFeSoap.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns LoteNFeSoap
	 */
	@WebEndpoint(name = "LoteNFeSoap")
	public LoteNFeSoap getLoteNFeSoap(WebServiceFeature... features) {
		return (LoteNFeSoap) super.getPort(new QName(
				"http://www.prefeitura.sp.gov.br/nfe", "LoteNFeSoap"),
				LoteNFeSoap.class, features);
	}

}