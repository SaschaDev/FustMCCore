package net.fusemc.core.configuration;

import net.fusemc.core.server.NetworkSettings;
import net.fusemc.core.server.ServerSettings;
import net.fusemc.core.server.ServerTypes;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class Configuration {

    public static Document loadDocument(String url) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        return documentBuilderFactory.newDocumentBuilder().parse(new URL(url).openStream());
    }

    public static Object getSetting(Configurations configurations, ConfigurationElements configurationElements) {
        try {
            Document document = loadDocument("http://localhost/configurations/" + configurations.getConfigurationName());
            document.getDocumentElement().normalize();

            switch (configurationElements) {
                case NETWORKSETTINGS:
                    NodeList network = document.getElementsByTagName(configurationElements.getElementType());
                    Node node = network.item(0);
                    NetworkSettings networkSettings = null;

                    if(node.getNodeType() == Node.ELEMENT_NODE){
                        Element element = (Element) node;
                        networkSettings = new NetworkSettings();

                        networkSettings.setHideServer(Boolean.parseBoolean(element.getElementsByTagName("HideServer").item(0).getTextContent()));
                        networkSettings.setJoinPermissions(element.getElementsByTagName("JoinPermissions").item(0).getTextContent());
                        networkSettings.setMaxPlayers(Integer.parseInt(element.getElementsByTagName("MaxPlayers").item(0).getTextContent()));
                        networkSettings.setServerTypes(ServerTypes.valueOf(element.getElementsByTagName("ServerType").item(0).getTextContent()));
                    }
                    return networkSettings;
                case SERVERSETTINGS:
                    NodeList server = document.getElementsByTagName(configurationElements.getElementType());
                    Node nserver = server.item(0);
                    ServerSettings serverSettings = null;

                    if(nserver.getNodeType() == Node.ELEMENT_NODE){
                        Element element = (Element) nserver;
                        serverSettings = new ServerSettings();
                        serverSettings.setMotd(element.getElementsByTagName("MOTD").item(0).getTextContent());
                        serverSettings.setWhitelist(Boolean.parseBoolean(element.getElementsByTagName("Whitelist").item(0).getTextContent()));

                    }
                        return serverSettings;
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }

        return null;
    }
}
