package heritage;

import com.cgi.model.Animal;
import com.cgi.model.AnimalFood;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InheritanceCovarianceReturningTypeTest {

    // L'objectif est de récupérer ce que mange les animaux (récupérer des types d'objets different)
    // via l'utilisation du polymorphisme.
    // On va surcharger la méthode com.cgi.model.Animal.getFood dans une nouvelle class "Ant"


// TO: A supprimer pour les tests
    class AntFood extends AnimalFood {
        public AntFood() {
            super("termites");
        }
    }

    public class Ant extends Animal {
        public String description = "une fourmie";

        public AntFood getFood(){
            return new AntFood();
        }
    }

    @Test
    public void quelAnimalMangeQuoi() {
        Animal animal = new Animal();


        //TODO: décommenter cette ligne
         Ant ant = new Ant();
        System.out.println(ant.description);
        assertEquals("something", animal.getFood().getName());

        //TODO: décommenter cette ligne
        //assertEquals("termites", ant.getFood().getName());


    }

}
