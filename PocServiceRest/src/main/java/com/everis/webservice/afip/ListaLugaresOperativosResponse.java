//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.04.13 a las 01:02:28 PM ART 
//


package com.everis.webservice.afip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListaLugaresOperativosResult" type="{ar.gov.afip.dia.serviciosweb.wgesTabRef}LugaresOperativos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaLugaresOperativosResult"
})
@XmlRootElement(name = "ListaLugaresOperativosResponse")
public class ListaLugaresOperativosResponse {

    @XmlElement(name = "ListaLugaresOperativosResult")
    protected LugaresOperativos listaLugaresOperativosResult;

    /**
     * Obtiene el valor de la propiedad listaLugaresOperativosResult.
     * 
     * @return
     *     possible object is
     *     {@link LugaresOperativos }
     *     
     */
    public LugaresOperativos getListaLugaresOperativosResult() {
        return listaLugaresOperativosResult;
    }

    /**
     * Define el valor de la propiedad listaLugaresOperativosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link LugaresOperativos }
     *     
     */
    public void setListaLugaresOperativosResult(LugaresOperativos value) {
        this.listaLugaresOperativosResult = value;
    }

}
