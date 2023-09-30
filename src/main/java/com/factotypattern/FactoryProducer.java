package com.factotypattern;

import com.factotypattern.female.FemaleFactory;
import com.factotypattern.male.MaleFactory;

/**
 * @author Denis Zolotarev
 */
public class FactoryProducer {
    public static enum HumanFactoryType {
        MALE,
        FEMALE
    }

    public static AbstractFactory getFactory(HumanFactoryType humanFactoryType) {
        if (humanFactoryType.equals(HumanFactoryType.MALE)) {
            return new MaleFactory();
        } else
            return new FemaleFactory();
    }
}
