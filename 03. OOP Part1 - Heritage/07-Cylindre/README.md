# Cylindre

1. Écrivez une classe avec le nom Cercle. La classe a besoin d'un champ (variable d'instance) avec un rayon de nom de type double.

+ La classe doit avoir un constructeur avec un rayon de paramètre de type double et elle doit initialiser les champs.

+ Si le paramètre de rayon est inférieur à 0, il doit définir la valeur du champ de rayon sur 0.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée getRadius sans aucun paramètre, elle doit renvoyer la valeur du champ radius.

    + Méthode nommée getArea sans aucun paramètre, elle doit renvoyer la zone calculée **(rayon * rayon * PI)**. 
    + Pour **PI**, utilisez la constante **Math.PI.**



2. Écrivez une classe avec le nom Cylindre qui étend la classe Circle. La classe a besoin d'un champ (variable d'instance) avec une hauteur de nom de type double.

+ La classe doit avoir un constructeur avec deux paramètres rayon et hauteur, tous deux de type double. Il doit appeler le constructeur parent et initialiser un champ de hauteur.

+ Si le paramètre de hauteur est inférieur à 0, il doit définir la valeur du champ de hauteur sur 0.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée **getHeight** sans aucun paramètre, elle doit renvoyer la valeur du champ height.

    + Méthode nommée **getVolume** sans aucun paramètre, elle doit renvoyer le volume calculé. Pour calculer le volume, multipliez la surface par la hauteur.



**EXEMPLE DE TEST**

```
Circle circle = new Circle(3.75);
System.out.println("circle.radius= " + circle.getRadius());
System.out.println("circle.area= " + circle.getArea());
Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius());
System.out.println("cylinder.height= " + cylinder.getHeight());
System.out.println("cylinder.area= " + cylinder.getArea());
System.out.println("cylinder.volume= " + cylinder.getVolume());
```

→ **OUTPUT**

```
circle.radius= 3.75
circle.area= 44.178646691106465
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447
```

**REMARQUE :** Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE :** Au total, vous devez écrire 2 cours.

**REMARQUE :** assurez-vous de placer chaque classe dans son propre fichier. Voir les onglets à gauche.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.