package ss07_interface_abstract.thuchanh.animal_interface_edible.animal;

import ss07_interface_abstract.thuchanh.animal_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
