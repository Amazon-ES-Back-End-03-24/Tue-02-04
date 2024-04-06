package buildings;

import interfaces.Builder;

public abstract class Building implements Builder {
    abstract void buildFoundation();

    private void buildWindows() {
        System.out.println("Building windows");
    }
}
