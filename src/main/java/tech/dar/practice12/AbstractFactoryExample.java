package tech.dar.practice12;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        AbstractFactory factory1 = new SovietFactory();
        Client client1 = new Client(factory1);
        client1.execute();

        AbstractFactory factory2 = new AmericanFactory();
        Client client2 = new Client(factory2);
        client2.execute();
    }
}

class Client {
    private Pen pen;
    private Pencil pencil;

    Client(AbstractFactory factory) {
        pen = factory.createPen();
        pencil = factory.createPencil();
    }

    void execute() {
        pencil.interact(pen);
    }
}

interface AbstractFactory {
    Pen createPen();

    Pencil createPencil();
}

interface Pen {
    void interact(Pencil b);
}

interface Pencil {
    void interact(Pen a);
}

class SovietFactory implements AbstractFactory {

    @Override
    public Pen createPen() {
        return new SharikPen();
    }

    @Override
    public Pencil createPencil() {
        return new ProstoiPencil();
    }
}

class AmericanFactory implements AbstractFactory {

    @Override
    public Pen createPen() {
        return new GelevyiPen();
    }

    @Override
    public Pencil createPencil() {
        return new ColorPencil();
    }
}

class SharikPen implements Pen {
    @Override
    public void interact(Pencil b) {
        System.out.println(this.getClass().getName() + " interacts with " + b.getClass().getName());
    }
}

class ProstoiPencil implements Pencil {

    @Override
    public void interact(Pen a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }

}

class GelevyiPen implements Pen {
    @Override
    public void interact(Pencil b) {
        System.out.println(this.getClass().getName() + " interacts with " + b.getClass().getName());
    }
}

class ColorPencil implements Pencil {

    @Override
    public void interact(Pen a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }

}