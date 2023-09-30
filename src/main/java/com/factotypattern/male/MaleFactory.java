package com.factotypattern.male;

import com.factotypattern.AbstractFactory;
import com.factotypattern.Human;

/**
 * @author Denis Zolotarev
 */
public class MaleFactory implements AbstractFactory {
    public Human getPerson(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст не может меньше и равным нулю");
        } else if (age <= KidBoy.MAX_AGE) {
            return new KidBoy();
        } else if (age <= TeenBoy.MAX_AGE) {
            return new TeenBoy();
        } else
            return new Man();
    }
}
