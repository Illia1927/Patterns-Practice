package mate.academy.patterns;

import mate.academy.patterns.abstractFactory.AbstractFactory;
import mate.academy.patterns.abstractFactory.Factory;
import mate.academy.patterns.abstractFactory.train.Tarpan;
import mate.academy.patterns.abstractFactory.train.Train;
import mate.academy.patterns.adapter.AdapterJavaToDatabase;
import mate.academy.patterns.adapter.Database;
import mate.academy.patterns.prototype.Human;
import mate.academy.patterns.prototype.HumanFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Prototype Pattern : ");
        Human original = new Human(20, "Illia");
        System.out.println(original);

        Human copy = (Human)original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        Human humanOne = factory.makeCopy();
        System.out.println(humanOne);

        factory.setPrototype(new Human(18, "Maria"));
        Human humanTwo = factory.makeCopy();
        System.out.println(humanTwo);

        System.out.println("--------------------------------------------");

        System.out.println("Abstract Factory pattern : ");
        Factory<Train> trainFactory = AbstractFactory.getTrainFactory();
        Tarpan tarpanEkp1 = new Tarpan();
        tarpanEkp1.setName("Ekp-1");
        tarpanEkp1.setType("Passenger");
        Train tarpan = trainFactory.getSomeFactory("Tarpan");
        System.out.println(tarpanEkp1.toString());

        System.out.println("--------------------------------------------");

        System.out.println("Adapter pattern : ");
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.select();
        database.update();
        database.delete();

        System.out.println("--------------------------------------------");
    }
}
