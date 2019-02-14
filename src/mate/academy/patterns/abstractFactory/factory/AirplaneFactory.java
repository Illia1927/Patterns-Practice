package mate.academy.patterns.abstractFactory.factory;

import mate.academy.patterns.abstractFactory.Factory;
import mate.academy.patterns.abstractFactory.airplane.Airplane;
import mate.academy.patterns.abstractFactory.airplane.Boing;
import mate.academy.patterns.abstractFactory.airplane.Mria;

public class AirplaneFactory implements Factory<Airplane> {
    @Override
    public Airplane getSomeFactory(String typeOfFactory) {
        switch (typeOfFactory){
            case "Mria" : return new Mria();
            case "Boing" : return new Boing();
        }
        return null;
    }
}
