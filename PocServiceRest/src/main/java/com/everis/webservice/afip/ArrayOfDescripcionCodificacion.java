//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.17 a las 02:14:16 PM ART 
//


package com.everis.webservice.afip;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDescripcionCodificacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDescripcionCodificacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescripcionCodificacion" type="{ar.gov.afip.dia.serviciosweb.wgesTabRef}DescripcionCodificacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDescripcionCodificacion", propOrder = {
    "descripcionCodificacion"
})
public class ArrayOfDescripcionCodificacion {

    @XmlElement(name = "DescripcionCodificacion", nillable = true)
    protected List<DescripcionCodificacion> descripcionCodificacion;

    /**
     * Gets the value of the descripcionCodificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descripcionCodificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescripcionCodificacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescripcionCodificacion }
     * 
     * 
     */
    public List<DescripcionCodificacion> getDescripcionCodificacion() {
        if (descripcionCodificacion == null) {
            descripcionCodificacion = new ArrayList<DescripcionCodificacion>();
        }
        return this.descripcionCodificacion;
    }

}
