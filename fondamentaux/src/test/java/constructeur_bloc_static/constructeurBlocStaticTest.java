package constructeur_bloc_static;


import java.util.ArrayList;
import java.util.List;

class A {

    static Integer staticNumber = 1;
    List<String> choices = new ArrayList<>();
    Integer intField = 2;

    static {
        staticNumber = 2;
        System.out.println("A : static bloc / staticNumber = " + staticNumber);
    }

    {
        choices.add("A_1");
        choices.add("A_2");
        intField = 3;
        System.out.println("A : bloc initialiser / choices = " + choices);
    }

    public A() {
        choices.add("A_3");
        System.out.println("A: constructor / choices = " + choices);
    }
}

class B extends A {

    static {
        staticNumber = 3;
        System.out.println("B : static bloc / staticNumber = " + staticNumber);
    }


    {
        choices.add("B_1");
        choices.add("B_2");
        intField = 4;
        System.out.println("B : bloc initialiser / choices = " + choices);
    }

    public B() {
        choices.add("B_3");
        System.out.println("B: constructor / choices = " + choices);
        System.out.println("B: intField = " + intField);
    }

}


public class constructeurBlocStaticTest {

    public static void main(String[] args) {
        // Quel sera l'ordre d'initialisation (i.e la valeur de 'staticNumber' & 'choices'
        B b = new B();
    }


}
