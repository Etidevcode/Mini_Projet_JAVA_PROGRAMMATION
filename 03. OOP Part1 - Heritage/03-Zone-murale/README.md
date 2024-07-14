# Surface du mur

+ Écrivez une classe avec le nom **Wall**. La classe a besoin de deux champs (variables d'instance) avec une largeur de nom et une hauteur de type double.



+ La classe doit avoir deux constructeurs :

    + Le premier constructeur n'a aucun paramètre (constructeur sans argument).

    + Le deuxième constructeur a des paramètres width et height de type double et il doit initialiser les champs.

        + Si le paramètre de largeur est inférieur à 0, il doit définir la valeur du champ de largeur sur 0.

        + Si le paramètre de hauteur est inférieur à 0, il doit définir la valeur du champ de hauteur sur 0.



**Écrivez les méthodes suivantes (méthodes d'instance) :**

+ Méthode nommée **getWidth** sans aucun paramètre, elle doit renvoyer la valeur du champ de largeur.

+ Méthode nommée **getHeight** sans aucun paramètre, elle doit renvoyer la valeur du champ height.

+ Méthode nommée **setWidth** avec un paramètre de type double, elle doit définir la valeur du champ de largeur. Si le paramètre est inférieur à 0, il doit définir la valeur du champ de largeur sur 0.

+ Méthode nommée **setHeight** avec un paramètre de type double, elle doit définir la valeur du champ hauteur. Si le paramètre est inférieur à 0, il doit définir la valeur du champ de hauteur sur 0.

+ Méthode nommée **getArea** sans aucun paramètre, elle doit renvoyer la surface du mur.



**EXEMPLE DE TEST**

```
Wall wall = new Wall(5,4);
System.out.println("area= " + wall.getArea());
wall.setHeight(-1.5);
System.out.println("width= " + wall.getWidth());
System.out.println("height= " + wall.getHeight());
System.out.println("area= " + wall.getArea());
```


**SORTIE :**

```
area= 20.0
width= 5.0
height= 0.0
area= 0.0

```


**REMARQUE :** Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE :** Au total, vous devez écrire 5 méthodes et 2 constructeurs.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.