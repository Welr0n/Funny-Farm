public class Chicken extends Animals {
    private String name;
    private float weight;

    public Chicken(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(getClass().getName() + " " + getName() + " eating");
        setWeight(getWeight() + 0.5f);
    }

    @Override
    public void poop() {
        setWeight(getWeight() - 0.2f);
        System.out.println(getClass().getName() + " " + getName() + " pooped");
    }
}
