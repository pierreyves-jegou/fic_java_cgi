# Passage par reference ou par valeur

# Introduction
Dans tous les langages, la question se pose de savoir si les arguements sont passés par référence (i.e pointeur) ou par valeur (copie de la valeur originale)

# Java
En java, lorsque l'on passe des arguments à une méthode, le cas est un peu plus complexe, avec :
- pour les primitives, une copie de la valeur
- pour les Objects, une copie de la référence intiale

# Exemple

```java
import com.cgi.Person;

import java.lang;

public class test {
    Person john = new Person("john", 25);
    Person mary = new Person("mary", 25);

    {
        System.out.println(john.equals(mary));
    }
}
```
Voici ce qui ce passe dans cet exemple : [schéma](../../resources/copie_reference.png)


