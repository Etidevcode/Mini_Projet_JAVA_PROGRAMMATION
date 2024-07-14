# Calculateur de somme

+ Écrivez une classe avec le nom **SimpleCalculator**. La classe a besoin de deux champs (variables d'instance) avec les noms firstNumber et secondNumber tous deux de type double.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée `getFirstNumber` sans aucun paramètre, elle doit renvoyer la valeur du champ `firstNumber`.

    + Méthode nommée `getSecondNumber` sans aucun paramètre, elle doit renvoyer la valeur du champ `secondNumber`.

    + Méthode nommée `setFirstNumber` avec un paramètre de type double, elle doit définir la valeur du champ `firstNumber`.

    + Méthode nommée `setSecondNumber` avec un paramètre de type double, elle doit définir la valeur du `secondNumberfield`.

    + Méthode nommée `getAdditionResult` sans aucun paramètre, elle doit renvoyer le résultat de l’ajout des valeurs de champ `firstNumber` et `secondNumber`.

    + Méthode nommée `getSubtractionResult` sans aucun paramètre, elle doit renvoyer le résultat de la soustraction des valeurs de champ de `secondNumber` du `firstNumber`.

    + Méthode nommée `getMultiplicationResult` sans aucun paramètre, elle doit renvoyer le résultat de la multiplication des valeurs de champ `firstNumber` et `secondNumber`.

    + Méthode nommée `getDivisionResult` sans aucun paramètre dont elle a besoin pour renvoyer le résultat de la division des valeurs de champ `firstNumber` par `secondNumber`. Si la valeur de secondNumber est 0, retournez 0.



**EXEMPLE DE TEST**


```
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
```

**SORTIE :**

```
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
```

**CONSEILS :**

```
add= 9.0 is printed because 5.0 + 4 is 9.0

subtract= 1.0 is printed because 5.0 - 4 is 1.0

multiply= 0.0 is printed because 5.25 * 0 is 0.0

divide= 0.0 is printed because secondNumber is set to 0
```





**REMARQUE** : Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE** : Au total, vous devez écrire 8 méthodes.

**REMARQUE** : n'ajoutez pas la méthode principale au code de la solution.