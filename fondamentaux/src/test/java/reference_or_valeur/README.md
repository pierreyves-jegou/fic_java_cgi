# Passage par reference ou par valeur

# Introduction
Dans tous les langages, la question se pose de savoir si les arguments d'une méthode sont passés par référence (i.e pointeur) ou par valeur (copie de la valeur originale)

# Java
En java, lorsque l'on passe des arguments à une méthode, le cas est un peu plus complexe, avec :
- pour les primitives, une copie de la valeur
- pour les Objects, **une copie de la référence** intiale

# Paramètre de méthode type "Object"

```java
import com.cgi.model.Person;

import java.lang;

public class test {
    Person john = new Person("john", 25);
    Person mary = new com.cgi.model.Person("mary", 25);

    {
        System.out.println(john.equals(mary));
    }
}
```
Voici ce qui ce passe dans cet exemple : [schéma](../../resources/copie_reference_object.png)

Les impacts : 
- si on modifie un des membres (ex "Person.name") de la classe passée en paramètre celui-ci sera bien modifié 
- si on réaffecte avec un "new" l'objet précédemment passé en paramètre de la méthode, l'object passé dans la méthode existe tjs est n'est pas modifié, on créer simplement un 2 object
# Paramètre de méthode type "Primitif"
```java
class Test {
    int a = 10, b = 10;

    public void sum(int a, int b){ a = 28; }

    public static void main(String[] args) {
        Test t = new Test();
        t.sum(10, 10);
        System.out.println(t.a);
    }
}
```
Les primitifs sont copiés par valeur et ce programme affichera donc "10".

