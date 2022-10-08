package eliminar_caracter;

public class Eliminar_Caracter {

	/**
	 * Funcion que recibe un String XML y desde que indice se eliminara el caracter
	 * encontrado en el XML
	 * 
	 * @param cadena
	 * @param indice
	 * @return xml
	 */
	public static String DeleteCaracterXML(String cadena, Integer indice) {
		String xml = "";

		for (int i = 0; i < cadena.length(); i++) {
			if (indice - 1 != i) {
				xml += cadena.charAt(i);
			}
		}

		return xml;
	}

	/**
	 * Funcion que recibe String de XML y automaticamente se le asigna el valor predeterminado
	 * que se debe quitar
	 * 
	 * @param cadena
	 * @return xml
	 */
	public static String DeleteCaracterXML(String cadena) {
		String xml = "";

		if (cadena.charAt(0) == '?') {
			xml = cadena.substring(1, cadena.length());
		}

		return xml;
	}

	public static void main(String[] args) {
		String xmlEmitido;

		xmlEmitido = "?<?xml version='1.0'>" + "<Tests xmlns='http://www.adatum.com'>"
				+ "<Test TestId='0001' TestType='CMD'>" + "<Name>Convert number to string</Name>"
				+ "<CommandLine>Examp1.EXE</CommandLine>" + "<Input>1</Input>" + "<Output>One</Output>" + "</Test>"
				+ "</Tests>";

		System.out.println(String.format(("Formato de XML recibido: %s"), xmlEmitido));

		System.out.println(String.format(("\nForma dinamica: %s"), DeleteCaracterXML(xmlEmitido, 1)));
		System.out.println(String.format(("Forma estatica: %s"), DeleteCaracterXML(xmlEmitido)));

	}
}
