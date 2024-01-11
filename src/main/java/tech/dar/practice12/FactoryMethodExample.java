package tech.dar.practice12;

interface Pet {
}

class Cat implements Pet {
}

class Dog implements Pet {
}

abstract class Aist {
    public abstract Pet factoryMethod();
}

class CatCreator extends Aist {
    @Override
    public Cat factoryMethod() {
        return new Cat();
    }
}

class DogCreator extends Aist {
    @Override
    public Dog factoryMethod() {
        return new Dog();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        // an array of creators
        Aist[] aists = {new CatCreator(), new DogCreator()};
        // iterate over creators and create products
        for (Aist aist : aists) {
            Pet pet = aist.factoryMethod();
            System.out.printf("Created {%s}\n", pet.getClass());
        }
    }
}