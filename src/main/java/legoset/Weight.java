package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Weight {

    public Weight() {};

    public Weight(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }
    @XmlAttribute
    private String unit;
    @XmlValue
    private double value;
}