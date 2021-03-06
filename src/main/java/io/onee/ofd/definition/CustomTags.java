//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.3.2 生成的
// 请访问 <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.04.21 时间 04:53:53 PM CST
//


package io.onee.ofd.definition;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomTag" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SchemaLoc" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
 *                   &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="NameSpace" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "", propOrder = {
    "customTag"
})
@XmlRootElement(name = "CustomTags")
public class CustomTags {

    protected List<CustomTag> customTag;

    /**
     * Gets the value of the customTag property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTag property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTag().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTag }
     *
     *
     */
    @XmlElement(name = "CustomTag", type = CustomTag.class)
    public List<CustomTag> getCustomTag() {
        if (customTag == null) {
            customTag = new ArrayList<CustomTag>();
        }
        return this.customTag;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SchemaLoc" type="{http://www.ofdspec.org/2016}ST_Loc" minOccurs="0"/&gt;
     *         &lt;element name="FileLoc" type="{http://www.ofdspec.org/2016}ST_Loc"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="NameSpace" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(name = "", propOrder = {
        "schemaLoc",
        "fileLoc"
    })
    public static class CustomTag {

        protected String schemaLoc;
        protected String fileLoc;
        protected String nameSpace;

        /**
         * 获取schemaLoc属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "SchemaLoc")
        @XmlSchemaType(name = "anyURI")
        public String getSchemaLoc() {
            return schemaLoc;
        }

        /**
         * 设置schemaLoc属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSchemaLoc(String value) {
            this.schemaLoc = value;
        }

        /**
         * 获取fileLoc属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlElement(name = "FileLoc", required = true)
        @XmlSchemaType(name = "anyURI")
        public String getFileLoc() {
            return fileLoc;
        }

        /**
         * 设置fileLoc属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFileLoc(String value) {
            this.fileLoc = value;
        }

        /**
         * 获取nameSpace属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        @XmlAttribute(name = "NameSpace", required = true)
        public String getNameSpace() {
            return nameSpace;
        }

        /**
         * 设置nameSpace属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNameSpace(String value) {
            this.nameSpace = value;
        }

    }

}
