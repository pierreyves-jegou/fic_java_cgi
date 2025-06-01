# Inheritance

## Introduction
L'héritage permet de spécifier un comportement commun et implémenter des spécialisations pour chaque type de sous objets.

Java permet l'héritage d'une (et une seule) classe parente (contrairement aux interfaces).
Les notions abordés ici : 
- override des méthodes & covariance
- override des membres
- hiding static méthodes & static membres

## Référence
[baeldung](https://www.baeldung.com/java-inheritance)

## Définitions
- **Type covariant** : se rapportent aux types de retour des méthodes des sous-classes. Dans une relation covariante, le type de retour d'une méthode d'une sous-classe peut être un sous-type du type de retour de la même méthode de la super-classe.
- **Type contravariant** : Les types contravariants, quant à eux, se rapportent aux paramètres des méthodes des sous-classes. Dans une relation contravariante, les types de paramètres d'une méthode d'une sous-classe peuvent être des supertypes des types de paramètres de la même méthode de la superclasse. Cela permet d'accepter des types plus généraux comme paramètres dans les sous-classes, favorisant ainsi la flexibilité et le polymorphisme.

## override des méthodes & covariance
Liste des vérifications effectuées par la compilateur pour surcharger une méthode : 
- Le type de retour de la classe enfant doit être le même que la classe parent ou covariant 
- La méthode de la classe enfant doit avoir les mêmes paramètres que la méthode de la classe mère (on peut s'appuyer sur des interfaces pour plus de souplesse si besoin)
- La méthode de la classe enfant doit être au moins aussi accessible que la méthode de la classe mère (protected , public)
- La méthode de la classe enfant ne peut pas déclarer une exception vérifiée qui est nouvelle ou plus large que la classe de toute exception déclarée dans la méthode de la classe mère.

## Polymorphisme
TODO : rappel global du polymorphisme avec qq cas d'usage 

## Hiding static méthodes & static membres
Une méthode static surchargée dans la classe enfant prend le dessus (cache) la méthode de la classe parente
Il en va de même pour les membres statics.
