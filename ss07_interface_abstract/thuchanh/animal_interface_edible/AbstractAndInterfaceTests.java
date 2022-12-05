package ss07_interface_abstract.thuchanh.animal_interface_edible;
import ss07_interface_abstract.thuchanh.animal_interface_edible.animal.Animal;
import ss07_interface_abstract.thuchanh.animal_interface_edible.animal.Chicken;
import ss07_interface_abstract.thuchanh.animal_interface_edible.animal.Tiger;
import ss07_interface_abstract.thuchanh.animal_interface_edible.edible.Edible;
import ss07_interface_abstract.thuchanh.animal_interface_edible.fruit.Apple;
import ss07_interface_abstract.thuchanh.animal_interface_edible.fruit.Fruit;
import ss07_interface_abstract.thuchanh.animal_interface_edible.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(((Chicken) edibler).howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
