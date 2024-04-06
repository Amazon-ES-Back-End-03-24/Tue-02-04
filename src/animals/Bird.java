package animals;

import interfaces.Flier;

public class Bird extends Animal implements Flier {
    @Override
    String sayHello() {
        return "Tweet";
    }

    @Override
    public boolean flying() {
        return true;
    }
}
