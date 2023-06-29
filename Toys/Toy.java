package Toy_Shop_project.Toys;

public abstract class Toy {

    protected int id;
    protected String name;

    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
