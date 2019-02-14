package mate.academy.patterns.abstractFactory;

public interface Factory<T> {
    T getSomeFactory(String typeOfFactory);
}
