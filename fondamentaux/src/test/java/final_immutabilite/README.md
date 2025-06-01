# Final vs Immutabilité
## Final
### Introduction

Le mot clef "final" va permettre de limiter l'utilisateur de : 
- des variables / membres de classe / arguments de méthodes
- des méthodes
- des classes

### Final - variables / membres de classe / arguments de méthodes
Une variable ou membre de classe (de type primitifs ou object) ne peut être initialisée qu'une seule fois
- pour un primitif, on ne peut plus modifier la valeur une fois initialisé
- Pour un object, cela implique qu'on ne peut pas réaffacter via l'opérateur "new" une fois l'objet initialisé

Pour les membres de classe, l'ensemble des membres doivent être intialisés en sortie de constructeur

```java


public class test {
  {
    final int age = 18;
    age = 25; // erreur de compile ici

    final com.cgi.model.Person person = new com.cgi.model.Person("john", 25);
    person = new com.cgi.model.Person("aie aie", 10); // erreur de compile ici
  }
}
```

### Final - méthodes
Une méthode marquée "final" ne peut être surchargée dans une classe enfant

### Final - classes
La classe ne peut plus être surchargée. Cas plus rare car pose souvent des problèmes d'extensibilité dans les librairies

# Immutabilité
## Introduction
Un object immutable ne peut être modifié tant au niveau de sa référence mémoire qu'au niveau des données qu'il contient.

## Type Primitif
Le cas des primitifs est simple, un type primitf précédé de l'opérateur "final" est immutable.

## Type Object
Afin de rendre un objet immutable : 
- Marquer la classe comme "final"
- Constructor 
  - Soit créer les constructeurs adaptés
  - soit constructeur privé et création via factory / builder
  - dans tous les cas, faire des (shallow) copies des objects qui sont passés en paramètre 
- Marquer toutes les variables d'instances comme privées et finales
- Ne définissez pas de méthodes setter
- Ne pas autoriser la modification des objets mutables référencés