package za.ac.cputweekassignment;

public class MainDriver {


    public static void main(String[] args)
    {
        Animal animal =new LivingAnimal();
        animal.describe();

        animal =new LegDecorator(animal);
        animal.describe();

        animal =new WingDecorator(animal);
        animal.describe();

        animal =new GrowlDecorator(animal);
        animal =new GrowlDecorator(animal);
        animal.describe();

    }

}
