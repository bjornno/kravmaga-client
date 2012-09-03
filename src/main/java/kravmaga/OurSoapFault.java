package kravmaga;

import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;

import java.util.Iterator;
import java.util.Locale;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;

/*
* Utterly awesome code!
*/
public class OurSoapFault implements SOAPFault {
    @Override
    public void setFaultCode(Name name) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultCode(QName qName) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultCode(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Name getFaultCodeAsName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public QName getFaultCodeAsQName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getFaultSubcodes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAllFaultSubcodes() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void appendFaultSubcode(QName qName) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultCode() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultActor(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultActor() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultString(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultString(String s, Locale locale) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultString() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Locale getFaultStringLocale() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasDetail() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Detail getDetail() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Detail addDetail() throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getFaultReasonLocales() throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getFaultReasonTexts() throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultReasonText(Locale locale) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addFaultReasonText(String s, Locale locale) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultNode() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultNode(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getFaultRole() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFaultRole(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(Name name) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(QName qName) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(String s) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(String s, String s1) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(String s, String s1, String s2) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addChildElement(SOAPElement soapElement) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeContents() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addTextNode(String s) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addAttribute(Name name, String s) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addAttribute(QName qName, String s) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement addNamespaceDeclaration(String s, String s1) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAttributeValue(Name name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAttributeValue(QName qName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getAllAttributes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getAllAttributesAsQNames() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getNamespaceURI(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getNamespacePrefixes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getVisibleNamespacePrefixes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public QName createQName(String s, String s1) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Name getElementName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public QName getElementQName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement setElementQName(QName qName) throws SOAPException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAttribute(Name name) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeAttribute(QName qName) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean removeNamespaceDeclaration(String s) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getChildElements() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getChildElements(Name name) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterator getChildElements(QName qName) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setEncodingStyle(String s) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getEncodingStyle() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getTagName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAttribute(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAttribute(String s, String s1) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAttribute(String s) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Attr getAttributeNode(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Attr setAttributeNode(Attr attr) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Attr removeAttributeNode(Attr attr) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public NodeList getElementsByTagName(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAttributeNS(String s, String s1) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setAttributeNS(String s, String s1, String s2) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeAttributeNS(String s, String s1) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Attr getAttributeNodeNS(String s, String s1) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Attr setAttributeNodeNS(Attr attr) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public NodeList getElementsByTagNameNS(String s, String s1) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasAttribute(String s) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasAttributeNS(String s, String s1) throws DOMException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public TypeInfo getSchemaTypeInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setIdAttribute(String s, boolean b) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setIdAttributeNS(String s, String s1, boolean b) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setIdAttributeNode(Attr attr, boolean b) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getValue() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setValue(String s) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setParentElement(SOAPElement soapElement) throws SOAPException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public SOAPElement getParentElement() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void detachNode() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void recycleNode() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getNodeName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getNodeValue() throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setNodeValue(String s) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public short getNodeType() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node getParentNode() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public NodeList getChildNodes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node getFirstChild() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node getLastChild() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node getPreviousSibling() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node getNextSibling() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public NamedNodeMap getAttributes() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Document getOwnerDocument() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node insertBefore(Node node, Node node1) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node replaceChild(Node node, Node node1) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node removeChild(Node node) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node appendChild(Node node) throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasChildNodes() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Node cloneNode(boolean b) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void normalize() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSupported(String s, String s1) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getNamespaceURI() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getPrefix() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setPrefix(String s) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getLocalName() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean hasAttributes() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getBaseURI() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public short compareDocumentPosition(Node node) throws DOMException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getTextContent() throws DOMException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setTextContent(String s) throws DOMException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isSameNode(Node node) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String lookupPrefix(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDefaultNamespace(String s) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String lookupNamespaceURI(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isEqualNode(Node node) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getFeature(String s, String s1) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object setUserData(String s, Object o, UserDataHandler userDataHandler) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object getUserData(String s) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
