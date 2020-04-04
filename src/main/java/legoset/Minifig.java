package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Minifig {

    Minifig(int count, String name) {
        this.name = name;
        this.count = count;
    }

    @XmlAttribute
    private int count;
    @XmlValue
    private String name;
}