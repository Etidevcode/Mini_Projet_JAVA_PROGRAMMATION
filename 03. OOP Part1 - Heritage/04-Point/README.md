# Point

+ Vous devez représenter un point dans l'espace 2D. Écrivez une classe avec le nom Point. La classe a besoin de deux champs (variables d'instance) avec le nom **x** et **y** de type int.

+ La classe doit avoir deux constructeurs. Le premier constructeur n'a aucun paramètre (constructeur sans argument). Le deuxième constructeur a des paramètres **x** et **y** de type **int** et doit initialiser les champs.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée **getX** sans aucun paramètre, elle doit renvoyer la valeur du champ x.

    + Méthode nommée **getY** sans aucun paramètre, elle doit renvoyer la valeur du champ y.

    + Méthode nommée **setX** avec un paramètre de type int, elle doit définir la valeur du champ x.

    + Méthode nommée **setY** avec un paramètre de type int, elle doit définir la valeur du champ y.

    + Méthode nommée distance sans aucun paramètre, elle doit renvoyer la distance entre ce point et le point (0, 0) sous forme de double.

    + Méthode nommée distance avec paramètre de type Point, elle doit renvoyer la distance entre ce Point et le paramètre Point sous forme de double.

    + Méthode nommée distance avec deux paramètres **x, y** tous deux de type int, elle doit renvoyer la distance entre ce point et le point x, y sous forme de double.



**Comment trouver la distance entre deux points ?**

Pour trouver une distance entre les points *A(xA,yA)* et *B(xB,yB)*, on utilise la formule :

```
d(A,B)=√ (xB − xA) * (xB – xA) + (yB − yA) * (yB – yA)
```

Où **√** représente la racine carrée.



**EXEMPLE DE TEST**


```
Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());
```


**SORTIE**

```
distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0
```


**REMARQUE :** utilisez Math.sqrt pour calculer la racine carrée √.

**REMARQUE :** essayez d’éviter le code dupliqué.

**REMARQUE :** Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE :** Au total, vous devez écrire 7 méthodes.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.
