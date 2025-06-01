# Constructeur & bloc d'initialisation & bloc d'initialisation static
## Introduction
- Le(s) constructeur(s) permet(tent) d'initialiser l'instance de l'objet
- Le(s) bloc(s) static(s) permettent d'initialiser la classe (exécuter 1 seule fois pendant le class loading)
- Le(s) bloc(s) d'initialisation (non static) sont utilisés à l'initialisation de l'instance. Chaque bloc d'initialisation est copié dans le(s) constructeur(s)  

## Exemple

```java
import java.time.LocalDateTime;

class Example {

    // Bloc d'intialisation static
    static {
        Number[] choices = {1, 3, 4};
    }

    // Bloc d'initialisation (non static)
    {
        LocalDateTime localDateTime = LocalDateTime.now();
    }
}
```

## Différence entre les blocs d'initialisation static ou non static

| Static Block      | Instance Initializer Block|
| ----------- | ----------- |
| It executes during class loading      | It executes during class instantiation       |
| It can only use static variables	   | It can use static or non-static (instance variables).        |
| It can not use this		   | It can use this        |
| It executes only once during the entire execution of the program when the class loads into the memory	   | It can run many times whenever there is a call to the constructor        |

## Ordre d'éxecution
- **bloc d'initialisation static & variable static** depuis la classe parente la plus haut jusqu'à la classe en cours de classe loading. Pour une même classe, dans l'ordre d'affichage
- **bloc d'initialisation non static & membre de classe & constructeur** depuis la classe parente la plus haut jusqu'à la classe en cours d'instanciation : 
  - initialisation de(s) membre(s) 
  - appel au constructeur mais où le bloc d'initialisation aura été inséré par la compileur

## Constructeur
- Une classe peut contenir plusieurs constructeurs surchargés, à condition que la signature de chacun soit distincte.
- Le compilateur insère un constructeur sans argument par défaut si aucun constructeur n'est déclaré.
- Si un constructeur appelle this(), il doit s'agir de la première ligne du constructeur.
- Java n'autorise pas les appels cycliques de constructeurs.