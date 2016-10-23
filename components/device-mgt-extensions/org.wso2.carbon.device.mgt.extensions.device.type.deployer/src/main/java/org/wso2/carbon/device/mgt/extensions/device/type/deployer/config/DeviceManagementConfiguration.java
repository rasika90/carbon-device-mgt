/*
 *   Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */
package org.wso2.carbon.device.mgt.extensions.device.type.deployer.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceManagementConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceManagementConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ManagementRepository" type="{}ManagementRepository"/>
 *         &lt;element name="PushNotificationConfiguration" type="{}PushNotificationConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */

//@XmlType(name = "DeviceManagementConfiguration", propOrder = {
//    "deviceType",
//    "managementRepository",
//    "pushNotificationConfiguration"
//})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DeviceManagementConfiguration")
public class DeviceManagementConfiguration {

    @XmlElement(name = "DeviceType", required = true)
    protected String deviceType;
    @XmlElement(name = "ManagementRepository", required = true)
    protected ManagementRepository managementRepository;
    @XmlElement(name = "PushNotificationConfiguration", required = true)
    protected PushNotificationConfiguration pushNotificationConfiguration;

    private DeviceManagementConfiguration() {
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the managementRepository property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementRepository }
     *     
     */
    public ManagementRepository getManagementRepository() {
        return managementRepository;
    }

    /**
     * Sets the value of the managementRepository property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementRepository }
     *     
     */
    public void setManagementRepository(ManagementRepository value) {
        this.managementRepository = value;
    }

    /**
     * Gets the value of the pushNotificationConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationConfiguration }
     *     
     */
    public PushNotificationConfiguration getPushNotificationConfiguration() {
        return pushNotificationConfiguration;
    }

    /**
     * Sets the value of the pushNotificationConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationConfiguration }
     *     
     */
    public void setPushNotificationConfiguration(PushNotificationConfiguration value) {
        this.pushNotificationConfiguration = value;
    }

}
