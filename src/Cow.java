public class Cow extends Animals{
    private String name;
    private float weight;

    public Cow(String name, float weight) {
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
        setWeight(getWeight() + 5);
    }

    @Override
    public void poop() {
        if (Math.random()*10 <= 3) {
            setWeight(getWeight() - 1.5f);
            System.out.println(getClass().getName() + " " + getName() + " pooped");
        }
    }
}
