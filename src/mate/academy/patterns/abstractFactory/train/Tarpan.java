package mate.academy.patterns.abstractFactory.train;

public class Tarpan implements Train {

    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Tarpan{" +
                " name : " + name +
                ", type : " + type + "}";
    }
}
