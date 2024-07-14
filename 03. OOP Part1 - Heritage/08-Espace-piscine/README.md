# Espace piscine

+ **The Swimming Company** vous a demandé de rédiger une application permettant de calculer le volume de piscines de forme cubique.



1. Écrivez une classe avec le nom Rectangle. La classe a besoin de deux champs (variable d'instance) avec une largeur et une longueur de nom toutes deux de type double.

+ La classe doit avoir un constructeur avec des paramètres de largeur et de longueur tous deux de type double et elle doit initialiser les champs.

+ Si le paramètre de largeur est inférieur à 0, il doit définir la valeur du champ de largeur sur 0.

+ Si le paramètre de longueur est inférieur à 0, il doit définir la valeur du champ de longueur sur 0.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée **getWidth** sans aucun paramètre, elle doit renvoyer la valeur du champ de largeur.

    + Méthode nommée **getLength** sans aucun paramètre, elle doit renvoyer la valeur du champ de longueur.

    + Méthode nommée **getArea** sans aucun paramètre, elle doit renvoyer la zone calculée (largeur * longueur).



2. Écrivez une classe avec le nom Cuboid qui étend la classe Rectangle. La classe a besoin d'un champ (variable d'instance) avec une hauteur de nom de type double.

+ La classe doit avoir un constructeur avec trois paramètres width, length et height, tous de type double. Il doit appeler le constructeur parent et initialiser un champ de hauteur.

+ Si le paramètre de hauteur est inférieur à 0, il doit définir la valeur du champ de hauteur sur 0.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

  + Méthode nommée **getHeight** sans aucun paramètre, elle doit renvoyer la valeur du champ height.

  + Méthode nommée **getVolume** sans aucun paramètre, elle doit renvoyer le volume calculé. Pour calculer le volume, multipliez la surface par la hauteur.



**EXEMPLE DE TEST**



```
Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());
Cuboid cuboid = new Cuboid(5,10,5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());
```

**→ SORTIE**

```
rectangle.width= 5.0
rectangle.length= 10.0
rectangle.area= 50.0
cuboid.width= 5.0
cuboid.length= 10.0
cuboid.area= 50.0
cuboid.height= 5.0
cuboid.volume= 250.0
```

REMARQUE : Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

REMARQUE : Au total, vous devez écrire 2 cours.

REMARQUE : assurez-vous de placer chaque classe dans son propre fichier. Voir les onglets à gauche.

REMARQUE : n'ajoutez pas de méthode principale au code de la solution.