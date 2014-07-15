
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataServerUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passwordExpired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sandbox" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="serverUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="upgradeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upgradeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userInfo" type="{urn:tooling.soap.sforce.com}GetUserInfoResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResult", propOrder = {
    "metadataServerUrl",
    "passwordExpired",
    "sandbox",
    "serverUrl",
    "sessionId",
    "upgradeMessage",
    "upgradeURL",
    "userId",
    "userInfo"
})
public class LoginResult {

    @XmlElement(required = true)
    protected String metadataServerUrl;
    protected boolean passwordExpired;
    protected boolean sandbox;
    @XmlElement(required = true)
    protected String serverUrl;
    @XmlElement(required = true)
    protected String sessionId;
    protected String upgradeMessage;
    protected String upgradeURL;
    @XmlElement(required = true)
    protected String userId;
    protected GetUserInfoResult userInfo;

    /**
     * Gets the value of the metadataServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataServerUrl() {
        return metadataServerUrl;
    }

    /**
     * Sets the value of the metadataServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataServerUrl(String value) {
        this.metadataServerUrl = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     */
    public boolean isPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     */
    public void setPasswordExpired(boolean value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the sandbox property.
     * 
     */
    public boolean isSandbox() {
        return sandbox;
    }

    /**
     * Sets the value of the sandbox property.
     * 
     */
    public void setSandbox(boolean value) {
        this.sandbox = value;
    }

    /**
     * Gets the value of the serverUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerUrl() {
        return serverUrl;
    }

    /**
     * Sets the value of the serverUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerUrl(String value) {
        this.serverUrl = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the upgradeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeMessage() {
        return upgradeMessage;
    }

    /**
     * Sets the value of the upgradeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeMessage(String value) {
        this.upgradeMessage = value;
    }

    /**
     * Gets the value of the upgradeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeURL() {
        return upgradeURL;
    }

    /**
     * Sets the value of the upgradeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeURL(String value) {
        this.upgradeURL = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetUserInfoResult }
     *     
     */
    public GetUserInfoResult getUserInfo() {
        return userInfo;
    }

    /**
     * Sets the value of the userInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserInfoResult }
     *     
     */
    public void setUserInfo(GetUserInfoResult value) {
        this.userInfo = value;
    }

}
