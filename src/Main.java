import animals.Cat;
import drinks.Beer;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // interfacesAndAbstractClasses();
        // bigDecimal();
        // beers();
        // humans();
    }

    private static void humans() {
        Human human1 = new Human("Perico","01/01/2011", 31,false);
        System.out.println(human1.isOver18());
        System.out.println(human1.getAge());
        human1.setAge(17);
        System.out.println(human1.isOver18());
    }

    private static void beers() {
        Beer beer1 = new Beer(true);
        System.out.println(beer1.getIsAlcoholic());
        beer1.setIsAlcoholic(false);
        System.out.println(beer1.getIsAlcoholic());
    }

    private static void bigDecimal() {
        //BigDecimal

        double total = 1.0/3;
        System.out.println(total);

        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal divisionBigDecimal = num1.divide(num2, 20, RoundingMode.HALF_EVEN);
        BigDecimal multiplicationBigDecimal = num1.multiply(num2);

        System.out.println(divisionBigDecimal);
        System.out.println(multiplicationBigDecimal.setScale(2,RoundingMode.HALF_DOWN));
    }

    private static void interfacesAndAbstractClasses() {
        Cat.salute();
        Cat catOne = new Cat(1,false);
        catOne.printHasClaws();

        int[] ages = {1, 2, 3};

        //arrays
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(catOne);
        catList.add(new Cat(3,true));
        Cat accessCatOne = catList.getFirst();
        Cat accessCatTwo = catList.get(1);
    }
}