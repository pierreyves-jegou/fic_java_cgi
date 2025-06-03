package generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterListElementsTest {


    class FilterListElements{

        public static List<Object> filterList(List<Object> originalList, Predicate<Object> predicate) {
            List <Object> filteredList = new ArrayList<>();

            for (Object element: originalList) {
                if (predicate.test(element)) {
                    filteredList.add(element);
                }
            }

            return filteredList;
        }


        public static List<Object> filterNumberList(List<Object> originalList, Predicate<Object> predicate) {
            List <Object> filteredList = new ArrayList<>();

            for (Object element: originalList) {
                if (predicate.test(element)) {
                    filteredList.add(element);
                }
            }

            return filteredList;
        }



    }


    @Test
    void testIt(){

        // TODO uncomment me

//        //Given
//        List<Integer> integers = List.of(1, 2, 3, 4);
//
//        // L'objectif ici
//        Assertions.assertEquals(List.of(1, 2, 3), FilterListElements.filterList(integers, i -> i <= 3));
    }


    @Test
    void testLowerBounded(){

        // TODO uncomment me

//        // Given
//        List<Integer> integers = List.of(1, 2, 3, 4);
//        List<Float> floats = List.of(1f, 2f, 3f, 4f);
//        Predicate<Number> predicate = i -> i.doubleValue() <= 3d;
//
//
//        // L'objectif ici est de pouvoir passer une liste qui étend Number et d'avoir un super prédicat
//        Assertions.assertEquals(List.of(1, 2, 3), FilterListElements.filterNumberList(integers, predicate));
//        Assertions.assertEquals(List.of(1f, 2f, 3f), FilterListElements.filterNumberList(floats, predicate));
    }

}
