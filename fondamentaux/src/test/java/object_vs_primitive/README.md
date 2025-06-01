# Object vs Primitive

## Introduction
Il existe 2 types stockés dans la JVM : 
- Object
- Primitive

## Référence
https://www.baeldung.com/java-primitives-vs-objects

## Pq les primitifs
Les primitifs prennent moins d'espace mémoire que leur équivalent Object. Ex :
boolean – 1 bit
byte – 8 bits
short, char – 16 bits
int, float – 32 bits
long, double – 64 bits

Les primitfs, dans le cas classique où ils sont utilisés dans une méthode, sont accéder plus rapidement par la JVM que les Objets (stockés dans la stack trace [+d'info](https://www.baeldung.com/java-stack-heap))

## A chaque primitif correspondant une équivalence Objet
- Exemple de correspondance object :
- Boolean – 128 bits
- Byte – 128 bits
- Short, Character – 128 bits
- Integer, Float – 128 bits
- Long, Double – 192 bits

## Conversion automatique des primitfs <=> Object
La JVM transforme automatiquement lorsque nécessaire les types primitfs <=> les types Objects (Autoboxing)
Attention, certain pitfall sont à connaitre.

## Identification de l'adresse mémoire
Contrairement à d'autres langages, Java ne vous permet pas de connaitre quelle est l'adresse mémoire physique. 
On peut uniquement savoir si 2 références d'object pointent au même endroit grace à l'opérateur '=='