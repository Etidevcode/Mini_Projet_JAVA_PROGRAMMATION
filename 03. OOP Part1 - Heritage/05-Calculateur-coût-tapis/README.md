# Calculateur de coût de tapis

+ **The Carpet Company** vous a demandé de rédiger une application permettant de calculer le prix de la moquette pour les pièces rectangulaires. Pour calculer le prix, vous multipliez la surface du sol (largeur par longueur) par le prix au mètre carré de moquette. Par exemple, la superficie du sol qui mesure 12 mètres de long et 10 mètres de large est de 120 mètres carrés. Recouvrir le sol d'un tapis qui coûte 8 dollars le mètre carré coûterait 960 dollars.

1. Écrivez une classe avec le nom Floor. La classe a besoin de deux champs (variables d'instance) avec une largeur de nom et une longueur de type double.

+ La classe doit avoir un constructeur avec des paramètres de largeur et de longueur de type double et elle doit initialiser les champs.

+ Si le paramètre de largeur est inférieur à 0, il doit définir la valeur du champ de largeur sur 0, si le paramètre de longueur est inférieur à 0, il doit définir la valeur du champ de longueur sur 0.

**Écrivez les méthodes suivantes (méthodes d'instance) :**


+ Méthode nommée getArea sans aucun paramètre, elle doit renvoyer la zone calculée (largeur * longueur).


2. Écrivez une classe intitulée Tapis. La classe a besoin d'un champ (variable d'instance) avec un nom coût de type double.

+ La classe doit avoir un constructeur avec un paramètre cost de type double et elle doit initialiser le champ.

+ Si le paramètre de coût est inférieur à 0, il doit définir la valeur du champ de coût sur 0.

**Écrivez les méthodes suivantes (méthodes d'instance) :**

+ Méthode nommée getCost sans aucun paramètre, elle doit renvoyer la valeur du champ de coût



3. Écrivez une classe avec le nom Calculatrice. La classe a besoin de deux champs (variables d'instance) avec le nom floor de type Floor et carpet de type Carpet.

+ La classe doit avoir un constructeur avec des paramètres floor de type Floor et carpet de type Carpet et elle doit initialiser les champs.

**Écrivez les méthodes suivantes (méthodes d'instance) :**

+ Méthode nommée getTotalCost sans aucun paramètre, elle doit renvoyer le coût total calculé pour recouvrir le sol d'un tapis.



**EXEMPLE DE TEST**

```
Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
```


**SORTIE**

```
total= 38.5
total= 36.45
```




**REMARQUE** : Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE** : Au total, vous devez écrire 3 cours.

**REMARQUE** : assurez-vous de placer chaque classe dans son propre fichier. Voir les onglets à gauche.

**REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.