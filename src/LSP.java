abstract class Bird {
    void fly() {
        System.out.println("I am flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("I am flying fast");
    }
}

class Ostrich extends Bird {

}