package legoset;

import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws JAXBException {
        LegoSet legoSet = new LegoSet();
        Weight weight = new Weight("kg", 0.89);
        List<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        weight.setValue(0.89);

        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        legoSet.setMinifigs(minifigs);
        legoSet.setWeight(weight);
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        legoSet.setNumber("75211");

        JAXBHelper.toXML(legoSet, System.out);

        System.out.println(legoSet.toString());
    }

}