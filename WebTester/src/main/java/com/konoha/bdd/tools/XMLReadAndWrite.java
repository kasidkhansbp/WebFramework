package com.konoha.bdd.tools;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLReadAndWrite {

	public static XMLReadAndWrite xmlReader = new XMLReadAndWrite();
	static DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	static DocumentBuilder builder;

	static {
		try {
			builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}

	Document document;

	public XMLReadAndWrite() {

	}

	public void createXML() {

	}

	public void initiateXML() throws ParserConfigurationException, SAXException, IOException {
		File input = new File("kasid.xml");
		Document document = (Document) builder.parse(input);
		document.getDocumentElement().normalize();
	}

	public String getValue(String ParentNode, String childNode) throws Exception {
		// initiateXML();
		File input = new File("kasid.xml");
		Document document = (Document) builder.parse(input);
		document.getDocumentElement().normalize();
		// Get the parent Node
		NodeList nList1 = document.getElementsByTagName(ParentNode);
		// Get the child nodes of the Parent Node in a nodelist
		NodeList nList = nList1.item(0).getChildNodes();
		for (int i = 0; i < nList.getLength(); i++) {
			if (nList.item(i).getNodeType() == Node.ELEMENT_NODE) {
				if (nList.item(i).getNodeName() == childNode) {
					return nList.item(i).getTextContent();
				}
			}
		}
		return null;
	}
}
