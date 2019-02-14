package mate.academy.patterns.abstractFactory;

import mate.academy.patterns.abstractFactory.factory.AirplaneFactory;
import mate.academy.patterns.abstractFactory.factory.TrainFactory;

public class AbstractFactory {
    public static Factory getTrainFactory(){
        return new TrainFactory();
    }
    public static Factory getAirplaneFactory(){
        return new AirplaneFactory();
    }
}
