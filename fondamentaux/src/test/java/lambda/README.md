# Lambda

## Introduction
- Objectif des lambdas : amener la programmation fonctionnelle en Java
- Programmation fonctionnelle : pouvoir passer en argument ou retourner une fonction (élimine beaucoup de code «boilerplate» / très expressif)
- L'utilisation de lambda est prépondérante dans les streams et correspond à une programmation souvent plus moderne
- Cas d’utilisation
  - En tant que développeur «de code générique», je définis mon enchainement de traitements où les parties «variables» sont représentées sous forme de «@FonctionalInterface»
  - En tant que développeur «utilisateur», j’utilise les fonctions proposées en fournissant des lambdas correspondant aux «@FonctionalInterface» attendues

## Référence
- https://www.jmdoudoux.fr/java/dej/chap-lambdas.htm#lambdas-2
- https://www.baeldung.com/java-8-functional-interfaces

# Exemple
A la place du programme **impératif** suivant :
![img.png](img.png)

On aura une version plus expressive et simple en ajoutant de la programmation fonctionnelle : 
![img_2.png](img_2.png)

## Fonctionnement
Les expressions lambdas sont toujours liées à une [@FunctionalInterface](https://www.baeldung.com/java-8-functional-interfaces)

## Functional interface
En reprenant l'exemple précédent, on voit que la méthode "forEach" prend en paramètre une interface fonctionnelle : 
```text
list.forEach(Consumer<? super T> action)
```
- une interface fonctionnelle est simplement une interface qui ne possède qu'une méthode abstraite.
- c'est cette méthode que nous allons exprimer via l'expression lambda
- une interface fonctionnelle peut cependant avoir des méthodes "static" ou "default" (voir par exemple l'interface fonctionnelle (Fontion.class)[https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html)
- Même si l'annotation @FonctionalInterface n'est pas obligatoire, il est fortement conseillé de l'indiquer afin d'obtenir des erreurs de compilation en cas de développement futures érronés

## Lambda expression
Le contrat d'interface étant défini par la @FonctionalInterface, nous allons voir la syntax permettant d'écrire la lambda associé.

En prenant l'exemple de l'expression lambda suivante : 
```text 
(s1, s2) -> { 
    var total = s1 + s2;
    return total % 2;
} 
```
- La syntaxe d'une expression lambda est composée de trois parties :
  - un ensemble de paramètres, d'aucun à plusieurs
  - l'opérateur ->
  - le corps de la fonction

### Les paramètres
- Lorsque plusieurs paramètres sont fournis ils doivent être entourés par des paraenthèses comme dans l'exemple
- Si un seul paramètre est fourni on peut ommetre les paranthèses (ex : s -> s + 10)
- La plupart du temps, le type des paramètres est inférés par la compilateur. Dans le cas où 1 des paramètres n'est pas inféré, il faut alors spécifier chacun des types des paramètres
  - (String s, t) -> KO
  - (String s, Integer t) -> OK
- Lorsque zéro paramètre en en entrée, on utilise la syntaxe suivante () -> ...
- Des annotations peuvent précédent le(s) paramètre(s). Dans ce cas, obligation d'utiliser les parenthèses et de préciser le type
  - Ex : 
  ```text
  (@NonNull String s, @NonNull String s2) -> 
  ```

### Le corps de la fonction
- Si une seule instruction, il n'est pas nécessaire d'entourer avec les accolades et de préciser le return
  - ex : s -> s.toString()
- Sinon accolade plus mot clef "return"

### Pour aller plus loin
Voir la slide de certification [CGI_FIC_Java_study_guide_lambdas.pptx](../../resources/CGI_FIC_Java_study_guide_lambdas.pptx)