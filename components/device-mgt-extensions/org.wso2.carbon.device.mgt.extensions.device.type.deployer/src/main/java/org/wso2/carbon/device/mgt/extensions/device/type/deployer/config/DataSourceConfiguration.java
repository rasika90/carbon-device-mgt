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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSourceConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JndiLookupDefinition" type="{}JndiLookupDefinition"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceConfiguration", propOrder = {
    "jndiLookupDefinition"
})
public class DataSourceConfiguration {

    @XmlElement(name = "JndiLookupDefinition", required = true)
    protected JndiLookupDefinition jndiLookupDefinition;

    /**
     * Gets the value of the jndiLookupDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JndiLookupDefinition }
     *     
     */
    public JndiLookupDefinition getJndiLookupDefinition() {
        return jndiLookupDefinition;
    }

    /**
     * Sets the value of the jndiLookupDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiLookupDefinition }
     *     
     */
    public void setJndiLookupDefinition(JndiLookupDefinition value) {
        this.jndiLookupDefinition = value;
    }

}
