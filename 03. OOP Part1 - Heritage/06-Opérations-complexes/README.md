# Opérations complexes

+ Un nombre complexe est un nombre qui peut être exprimé sous la forme *a + bi*, où *a* et *b* sont des nombres réels et **i** est une solution de l'équation *x2 = −1*. 
+ Puisqu’aucun nombre réel ne satisfait à cette équation, *i* est appelé un nombre imaginaire. Pour le nombre complexe *a + bi*, *a* est appelé la partie réelle et *b* est appelé la partie imaginaire. 
+ Pour additionner ou soustraire deux nombres complexes, ajoutez ou soustrayez simplement les parties réelles et imaginaires correspondantes. 
+ Par exemple, la somme de *5 + 3i* et *4 + 2i* est *9 + 5i*. D’autre part, la somme de *3 + i* et *–1 + 2i* est *2 + 3i*.



+ Écrivez une classe avec le nom **ComplexNumber**. La classe a besoin de deux champs (variables d'instance) de nom réel et imaginaire de type double. Il représente le nombre complexe.

+ La classe doit avoir un constructeur. Le constructeur a des paramètres réels et imaginaires de type double et il lui faut initialiser les champs.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée **getReal** sans aucun paramètre, elle doit renvoyer la valeur du champ réel.

    + Méthode nommée **getImaginaire** sans aucun paramètre, elle doit renvoyer la valeur du champ imaginaire.

    + Méthode nommée **add** avec deux paramètres réel et imaginaire de type double, elle doit ajouter des paramètres aux champs. En d’autres termes, il doit effectuer une opération complexe d’ajout de nombres comme décrit ci-dessus.

    + Méthode nommée **add** avec un paramètre de type ComplexNumber. Il doit ajouter le paramètre ComplexNumber aux variables d'instance correspondantes.

    + Méthode nommée **subtract** avec deux paramètres réels et imaginaires de type double, elle doit soustraire des paramètres des champs, en d'autres termes, elle doit effectuer une opération de soustraction de nombres complexes comme décrit ci-dessus.

    + Méthode nommée **subtract** avec un paramètre de type ComplexNumber. Il faut soustraire l’autre paramètre de ce nombre complexe.



**EXEMPLE DE TEST**


```
ComplexNumber one = new ComplexNumber(1.0, 1.0);
ComplexNumber number = new ComplexNumber(2.5, -1.5);
one.add(1,1);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
one.subtract(number);
System.out.println("one.real= " + one.getReal());
System.out.println("one.imaginary= " + one.getImaginary());
number.subtract(one);
System.out.println("number.real= " + number.getReal());
System.out.println("number.imaginary= " + number.getImaginary());
```

→ **SORTIE**

```
one.real= 2.0
one.imaginary= 2.0
one.real= -0.5
one.imaginary= 3.5
number.real= 3.0
number.imaginary= -5.0
```

**REMARQUE :** essayez d’éviter le code dupliqué.

**REMARQUE :** Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE :** Au total, vous devez écrire 6 méthodes.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.