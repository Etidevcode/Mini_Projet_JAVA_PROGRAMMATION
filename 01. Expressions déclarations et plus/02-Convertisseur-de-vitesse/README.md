# Convertisseur de vitesse

1. Écrivez une méthode appelée **toMilesPerHour** qui a 1 paramètre de type double avec le nom kilomètresPerHour. 

    + Cette méthode doit renvoyer la valeur arrondie du calcul de type long.

    + Si le paramètre kilometersPerHour est inférieur à 0, la méthode toMilesPerHour doit renvoyer -1 pour indiquer une valeur non valide.

    + Sinon, s'il est positif, calculez la valeur des miles par heure, arrondissez-la et renvoyez-la. Pour la conversion et l'arrondi, vérifiez les notes dans le texte ci-dessous.



**Exemples d'entrée/sortie :**

```
toMilesParHour(1.5); → devrait renvoyer la valeur 1

toMilesParHour(10.25); → devrait renvoyer la valeur 6

toMilesParHour(-5,6); → devrait renvoyer la valeur -1

toMilesParHour(25.42); → devrait renvoyer la valeur 16

toMilesParHour(75.114); → devrait renvoyer la valeur 47
```


2. Écrivez une autre méthode appelée printConversion avec 1 paramètre de type double portant le nom **kilometersPerHour**.

    + Cette méthode ne doit rien renvoyer (vide) et doit calculer milesPerHour à partir du paramètre **kilometersPerHour**.

    + Ensuite, il doit imprimer un message au format **"XX km/h = YY mi/h"**.

        + **XX** représente la valeur d'origine kilomètres par heure.
        + **YY** représente les milesPerHour arrondis du paramètre **kilometersPerHour**.

    + Si le paramètre `kilometersPerHour est < 0` alors imprimez le texte **Valeur invalide**.



**Exemples d'entrée/sortie :**

```
printConversion(1.5); → devrait imprimer le texte suivant (dans la console - System.out) : 1,5 km/h = 1 mi/h

printConversion(10.25); → devrait imprimer le texte suivant (dans la console - System.out) : 10,25 km/h = 6 mi/h

printConversion(-5.6); → devrait imprimer le texte suivant (dans la console - System.out) : Valeur invalide

printConversion(25.42); → devrait imprimer le texte suivant (dans la console - System.out) : 25,42 km/h = 16 mi/h

printConversion(75.114); → devrait imprimer le texte suivant (dans la console - System.out) : 75,114 km/h = 47 mi/h
```




+ Utilisez la méthode `Math.round` pour arrondir le nombre de miles par heure calculé (double). La méthode round renvoie long.



**Comment utiliser la méthode round et comment ça marche ?**

+ `Math.round()` est une méthode mathématique intégrée qui renvoie le long le plus proche de l'argument. Le résultat est arrondi à un nombre entier en ajoutant 1/2, en prenant la valeur du résultat après avoir ajouté 1/2 et en transtypant le résultat en type long. La méthode renvoie la valeur de l'argument arrondie à la valeur entière la plus proche.

**EXEMPLE D'UTILISATION :**


```
double number = 1.5;
long rounded = Math.round(number);
System.out.println("rounded= " + rounded);
System.out.println("with 3.9= " + Math.round(3.9));
System.out.println("with 4.5= " + Math.round(4.5));
int sum = 45;
int count = 10;
// transtypage pour que le résultat soit double, par ex. double / entier -> double
double average = (double) sum / count;
long roundedAverage = Math.round(average);
System.out.println("average= " + average);
System.out.println("roundedAverage= " + roundedAverage);
```

**SORTIE :**

```
rounded= 2
with 3.9= 4
with 4.5= 5
average= 4.5
roundedAverage= 5
```


+ **CONSEIL** : Dans la méthode printConversion, appelez la méthode toMilesPerHour au lieu de dupliquer le code.

+ **REMARQUE** : toutes les méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.

+ **REMARQUE** : 1 mile par heure équivaut à 1,609 kilomètres par heure

+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.