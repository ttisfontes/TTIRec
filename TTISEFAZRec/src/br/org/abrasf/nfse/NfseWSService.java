package br.org.abrasf.nfse;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

import com.sun.tools.internal.ws.processor.model.Response;

import br.com.taragona.nfe.xmlgenerator.XMLGenerator;
import br.org.abrasf.nfse.semfazonline.esquemas.Cabecalho;
import br.org.abrasf.nfse.semfazonline.esquemas.ConsultarNfseServicoTomadoEnvio;
import br.org.abrasf.nfse.semfazonline.esquemas.ConsultarNfseServicoTomadoEnvio.PeriodoEmissao;
import br.org.abrasf.nfse.semfazonline.esquemas.TcCpfCnpj;
import br.org.abrasf.nfse.semfazonline.esquemas.TcIdentificacaoConsulente;
import br.org.abrasf.nfse.semfazonline.esquemas.TcIdentificacaoPrestador;
import br.org.abrasf.nfse.semfazonline.esquemas.TcIdentificacaoTomador;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.1 in JDK 6 Generated
 * source version: 2.1
 * 
 */
@WebServiceClient(name = "NfseWSService", targetNamespace = "http://nfse.abrasf.org.br", wsdlLocation = "http://www.semfazonline.com/nfse/NfseWSService?wsdl")
public class NfseWSService extends Service {

	private final static URL NFSEWSSERVICE_WSDL_LOCATION;

	static {
		URL url = null;
		try {
			url = new URL("http://www.semfazonline.com/nfse/NfseWSService?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		NFSEWSSERVICE_WSDL_LOCATION = url;
	}

	public NfseWSService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public NfseWSService() {
		super(NFSEWSSERVICE_WSDL_LOCATION, new QName(
				"http://nfse.abrasf.org.br", "NfseWSService"));
	}

	/**
	 * 
	 * @return returns Nfse
	 */
	@WebEndpoint(name = "nfseSOAP")
	public Nfse getNfseSOAP() {
		return (Nfse) super.getPort(new QName("http://nfse.abrasf.org.br",
				"nfseSOAP"), Nfse.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns Nfse
	 */
	@WebEndpoint(name = "nfseSOAP")
	public Nfse getNfseSOAP(WebServiceFeature... features) {
		return (Nfse) super.getPort(new QName("http://nfse.abrasf.org.br",
				"nfseSOAP"), Nfse.class, features);
	}

	public static void main(String[] args) {
		NfseWSService service = new NfseWSService();
		Nfse port = service.getNfseSOAP();

		XMLGenerator gen = new XMLGenerator(
				"br.org.abrasf.nfse.semfazonline.esquemas");

		ConsultarNfseServicoTomadoEnvio consulta = new ConsultarNfseServicoTomadoEnvio();

		// ////////////////////////////
		TcIdentificacaoConsulente cons = new TcIdentificacaoConsulente();
		cons.setInscricaoMunicipal("14231069");
		TcCpfCnpj cc = new TcCpfCnpj();
		cc.setCpf("56802110172");
		cons.setCpfCnpj(cc);
		consulta.setConsulente(cons);

		// ///////////////////////////
		TcIdentificacaoTomador toma = new TcIdentificacaoTomador();
		toma.setInscricaoMunicipal("14231069");
		TcCpfCnpj cc2 = new TcCpfCnpj();
		cc2.setCpf("56802110172");
		toma.setCpfCnpj(cc2);
		consulta.setTomador(toma);

		// ///////////////////////////

		TcIdentificacaoPrestador pres = new TcIdentificacaoPrestador();
		pres.setInscricaoMunicipal("14231069");
		TcCpfCnpj cc3 = new TcCpfCnpj();
		cc3.setCpf("56802110172");
		pres.setCpfCnpj(cc3);
		// consulta.setPrestador(pres);

		// ///////////////////////////
		consulta.setPagina(1);
		PeriodoEmissao emissao = new PeriodoEmissao();

		GregorianCalendar c = new GregorianCalendar();
		c.setTime(Calendar.getInstance().getTime());
		XMLGregorianCalendar d2 = null;
		try {
			d2 = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		emissao.setDataInicial(d2);
		emissao.setDataFinal(d2);
		consulta.setPeriodoEmissao(emissao);

		Input parameters = new Input();
		String xmlcabecalho = "";
		Cabecalho head = new Cabecalho();
		head.setVersao("2.00");
		head.setVersaoDados("2.00");

		try {
			xmlcabecalho = gen.toXMLString(head);
		} catch (Exception e) {
			e.printStackTrace();
		}

		parameters.setNfseCabecMsg(xmlcabecalho);

		String xmlconsulta = "";
		try {
			xmlconsulta = gen.toXMLString(consulta);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("xmlconsulta: " + xmlconsulta);
		parameters.setNfseDadosMsg(xmlconsulta);
		Output rr = port.consultarNfseServicoTomado(parameters);
		System.out.println(rr.getOutputXML());
	}
}
