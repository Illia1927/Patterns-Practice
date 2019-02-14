package mate.academy.patterns.abstractFactory.factory;

import mate.academy.patterns.abstractFactory.Factory;
import mate.academy.patterns.abstractFactory.train.HyundaiRotem;
import mate.academy.patterns.abstractFactory.train.Tarpan;
import mate.academy.patterns.abstractFactory.train.Train;

public class TrainFactory implements Factory<Train> {
    @Override
    public Train getSomeFactory(String typeOfFactory) {
        switch (typeOfFactory){
            case "Tarpan" : return new Tarpan();
            case "HyundaiRotem" : return new HyundaiRotem();
        }
        return null;
    }
}
