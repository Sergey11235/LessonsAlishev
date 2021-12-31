package Lesson48;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());
    }
}
//        Season season = Season.AUTUMN;
//        Animal animal = Animal.CAT;
//        System.out.println(animal.name());

//        Animal frog = Animal.valueOf("FROG");
//        System.out.println(frog.getTranslation());


//        Animal animal = Animal.DOG;
//        System.out.println(animal);
//        switch (animal) {
//            case CAT:
//                System.out.println("It's a cat");
//                break;
//            case DOG:
//                System.out.println("It's a dog");
//                break;
//            default:
//                System.out.println("It's not an animal!");
//        }

//        Season season = Season.WINTER;
//        System.out.println(season.getTemperature());

        // Object -> Enum -> Season

//        System.out.println(season.getClass());

//        switch(season) {
//            case SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//        }

/*    private static final int DOG = 0;
    private static final int CAT = 1;
    private static final int FROG = 2;


    public static void main(String[] args) {
        int animal = DOG;

        switch(animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal!");
        }
    }*/
