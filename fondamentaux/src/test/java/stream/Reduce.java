package stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

    @Test
    void reduce1() {

        // Given
        Stream<String> names = Stream.of("john", "alice", "Karime", "stella");

        // L'objectif est de concaténer les éléments de "names" avec le séparator espace.
        String joiningBySpace = null; //TODO

        Assertions.assertEquals("john alice Karime stella", joiningBySpace);
    }

    @Test
    void reduce2() {

        // Given
        Stream<Integer> ages = Stream.empty();

        // L'objectif est de calculer la somme des ages du stream "ages". Si aucune valeur n'est présente dans le stream alors doit retourner "Optional.empty()"
        Optional<Integer> maybeSumAges = null; //TODO

        Assertions.assertEquals(Optional.empty(), maybeSumAges);
    }

    @Test
    void reduce3Advanced() {

        // Given
        Stream<String> names = Stream.of("john", "alice", "Karime", "stella", "pierre-yves");

        // L'objectif est de retourner le nombre de caractère du nom le + long , et 0 si pas de données dans le stream
        Integer maxNameLength = null; //TODO

        Assertions.assertEquals(11, maxNameLength);
    }


}
