
package io.elastic.dnb.jaxws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewsCategoryTextEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NewsCategoryTextEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Awards"/>
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="Earnings Release"/>
 *     &lt;enumeration value="Executive Activity"/>
 *     &lt;enumeration value="Executive Announcement"/>
 *     &lt;enumeration value="Executive Quote"/>
 *     &lt;enumeration value="Expansion"/>
 *     &lt;enumeration value="Financial News"/>
 *     &lt;enumeration value="Funding"/>
 *     &lt;enumeration value="Management Change"/>
 *     &lt;enumeration value="Merger and Acquisition"/>
 *     &lt;enumeration value="New Alliance"/>
 *     &lt;enumeration value="New Product"/>
 *     &lt;enumeration value="Reduction"/>
 *     &lt;enumeration value="Regulation or Litigation"/>
 *     &lt;enumeration value="Restructure"/>
 *     &lt;enumeration value="Wins"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NewsCategoryTextEnum")
@XmlEnum
public enum NewsCategoryTextEnum {

    @XmlEnumValue("Awards")
    AWARDS("Awards"),
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),
    @XmlEnumValue("Earnings Release")
    EARNINGS_RELEASE("Earnings Release"),
    @XmlEnumValue("Executive Activity")
    EXECUTIVE_ACTIVITY("Executive Activity"),
    @XmlEnumValue("Executive Announcement")
    EXECUTIVE_ANNOUNCEMENT("Executive Announcement"),
    @XmlEnumValue("Executive Quote")
    EXECUTIVE_QUOTE("Executive Quote"),
    @XmlEnumValue("Expansion")
    EXPANSION("Expansion"),
    @XmlEnumValue("Financial News")
    FINANCIAL_NEWS("Financial News"),
    @XmlEnumValue("Funding")
    FUNDING("Funding"),
    @XmlEnumValue("Management Change")
    MANAGEMENT_CHANGE("Management Change"),
    @XmlEnumValue("Merger and Acquisition")
    MERGER_AND_ACQUISITION("Merger and Acquisition"),
    @XmlEnumValue("New Alliance")
    NEW_ALLIANCE("New Alliance"),
    @XmlEnumValue("New Product")
    NEW_PRODUCT("New Product"),
    @XmlEnumValue("Reduction")
    REDUCTION("Reduction"),
    @XmlEnumValue("Regulation or Litigation")
    REGULATION_OR_LITIGATION("Regulation or Litigation"),
    @XmlEnumValue("Restructure")
    RESTRUCTURE("Restructure"),
    @XmlEnumValue("Wins")
    WINS("Wins");
    private final String value;

    NewsCategoryTextEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NewsCategoryTextEnum fromValue(String v) {
        for (NewsCategoryTextEnum c: NewsCategoryTextEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
