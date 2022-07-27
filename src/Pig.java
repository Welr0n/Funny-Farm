public class Pig extends Animals {
    private String name;
    private float weight;

    public Pig(String name, float weight) {
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
        setWeight(getWeight() + 2);
    }

    @Override
    public void poop() {
        if (Math.random()*10 <= 5) {
            setWeight(getWeight() - 1);
            System.out.println(getClass().getName() + " " + getName() + " pooped");
        }
    }
}
