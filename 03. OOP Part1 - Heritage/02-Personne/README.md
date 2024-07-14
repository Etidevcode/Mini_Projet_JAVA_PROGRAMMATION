# Personne

+ Écrivez une classe avec le nom Personne. La classe a besoin de trois champs (variables d'instance) avec les noms firstName, lastName de type String et age de type int.

+ Écrivez les méthodes suivantes (méthodes d'instance) :

    + Méthode nommée **getFirstName** sans aucun paramètre, elle doit renvoyer la valeur du champ firstName.

    + Méthode nommée **getLastName** sans aucun paramètre, elle doit renvoyer la valeur du champ lastName.

    + Méthode nommée **getAge** sans aucun paramètre, elle doit renvoyer la valeur du champ age.

    + Méthode nommée **setFirstName** avec un paramètre de type String, elle doit définir la valeur du champ firstName.

    + Méthode nommée **setLastName** avec un paramètre de type String, elle doit définir la valeur du champ lastName.

    + Méthode nommée **setAge** avec un paramètre de type int, elle doit définir la valeur du champ age. Si le paramètre est inférieur à 0 ou supérieur à 100, il doit définir la valeur du champ d'âge sur 0.

    + Méthode nommée **isTeen** sans aucun paramètre, elle doit renvoyer vrai si la valeur du champ âge est supérieure à 12 et inférieure à 20, sinon renvoyer faux.

    + Méthode nommée **getFullName** sans aucun paramètre, elle doit renvoyer le nom complet de la personne.

      + Si les champs **firstName** et **lastName** sont vides, les chaînes renvoient une chaîne vide.

      + Si **lastName** est une chaîne vide, renvoyez firstName.

      + Si **firstNam**e est une chaîne vide, renvoyez lastName.

      + Pour vérifier si s **String** est vide, utilisez la méthode isEmpty de la classe String. Par exemple, firstName.isEmpty() renvoie true si la chaîne est vide ou en d'autres termes, lorsque la chaîne ne contient aucun caractère.



**EXEMPLE DE TEST**


```
Person person = new Person();
person.setFirstName("");   // firstName is set to empty string
person.setLastName("");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());
```


**SORTIE**

```
fullName=
teen= false
fullName= John
teen= true
fullName= John Smith
```


**REMARQUE** : Toutes les méthodes doivent être définies comme publiques et NON publiques statiques.

**REMARQUE** : Au total, vous devez écrire 8 méthodes.

**REMARQUE** : n'ajoutez pas la méthode principale au code de la solution.