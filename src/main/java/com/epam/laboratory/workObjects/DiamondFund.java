//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.06.29 at 10:53:26 PM MSK
//


package com.epam.laboratory.workObjects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Gem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numberOfFaces" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="preciousness" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="transparency">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "gem"
})
@XmlRootElement(name = "DiamondFund")
public class DiamondFund {

    @XmlElement(name = "Gem")
    @JsonProperty("Gem")
    protected List<DiamondFund.Gem> gem;

    /**
     * Gets the value of the gem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiamondFund.Gem }
     *
     *
     */
    public List<DiamondFund.Gem> getGem() {
        if (gem == null) {
            gem = new ArrayList<DiamondFund.Gem>();
        }
        return this.gem;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numberOfFaces" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="preciousness" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="transparency">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "color",
            "id",
            "name",
            "numberOfFaces",
            "origin",
            "preciousness",
            "transparency",
            "value"
    })
    public static class Gem {

        @XmlElement(required = true)
        protected String color;
        protected int id;
        @XmlElement(required = true)
        protected String name;
        protected byte numberOfFaces;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(required = true)
        protected String preciousness;
        protected byte transparency;
        protected float value;

        public Gem() {
        }

        public Gem(String color, int id, String name, byte numberOfFaces, String origin, String preciousness, byte transparency, float value) {
            this.color = color;
            this.id = id;
            this.name = name;
            this.numberOfFaces = numberOfFaces;
            this.origin = origin;
            this.preciousness = preciousness;
            this.transparency = transparency;
            this.value = value;
        }

        /**
         * Gets the value of the color property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getColor() {
            return color;
        }

        /**
         * Sets the value of the color property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setColor(String value) {
            this.color = value;
        }

        /**
         * Gets the value of the id property.
         *
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         *
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the numberOfFaces property.
         *
         */
        public byte getNumberOfFaces() {
            return numberOfFaces;
        }

        /**
         * Sets the value of the numberOfFaces property.
         *
         */
        public void setNumberOfFaces(byte value) {
            this.numberOfFaces = value;
        }

        /**
         * Gets the value of the origin property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the preciousness property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPreciousness() {
            return preciousness;
        }

        /**
         * Sets the value of the preciousness property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPreciousness(String value) {
            this.preciousness = value;
        }

        /**
         * Gets the value of the transparency property.
         *
         */
        public byte getTransparency() {
            return transparency;
        }

        /**
         * Sets the value of the transparency property.
         *
         */
        public void setTransparency(byte value) {
            this.transparency = value;
        }

        /**
         * Gets the value of the value property.
         *
         */
        public float getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         *
         */
        public void setValue(float value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Gem{" +
                    "color='" + color + '\'' +
                    ", id=" + id +
                    ", name='" + name + '\'' +
                    ", numberOfFaces=" + numberOfFaces +
                    ", origin='" + origin + '\'' +
                    ", preciousness='" + preciousness + '\'' +
                    ", transparency=" + transparency +
                    ", value=" + value +
                    '}';
        }
    }

}
