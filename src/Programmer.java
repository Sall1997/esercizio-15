public class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    Programmer (String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    public void drinkCoffee() {
        System.out.println("Espresso is the secret!");
    }

    public void printDetails() {
        System.out.println(name+ " is a " + age + "-yo programmer");
    }

    public void hasGlasses() {
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}
