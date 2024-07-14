# Tableau trié

+ Créez un programme utilisant des tableaux qui trie une liste d'entiers par ordre décroissant.

+ L'ordre décroissant va de la valeur la plus élevée à la valeur la plus basse.

    + En d'autres termes, si le tableau contient les valeurs [106, 26, 81, 5, 15], votre programme devrait finalement contenir un tableau contenant [106, 81, 26, 15, 5].

    + Configurez le programme pour que les nombres à trier soient lus à partir du clavier (Scanner).



**Implémentez les méthodes suivantes :**

+ **getIntegers** a un paramètre de type int qui est la taille du tableau. Il renvoie un tableau d'entiers saisis à partir du clavier.

+ **printArray** accepte un tableau et imprime le contenu du tableau. Il doit être imprimé au format suivant :


```
Element 0 contient 106
Element 1 contient 81
Element 2 contient 26
Element 3 contient 15
Element 4 contient 5
```

+ **sortIntegers** accepte le tableau non trié. Il doit trier le tableau et renvoyer un nouveau tableau contenant les nombres triés.



**Le scénario est le suivant :**

1. **getIntegers()** est appelé.

2. Le tableau renvoyé par **getIntegers()** est ensuite utilisé pour appeler sortIntegers().

3. Le tableau renvoyé par **sortIntegers()** est ensuite imprimé sur la console.

[N'essayez pas de mettre en œuvre cela. C'est pour vous donner une idée de la façon dont les méthodes seront utilisées.]



+ **CONSEIL** : vous devrez comprendre comment copier les éléments du tableau du tableau transmis dans un nouveau tableau, les trier et renvoyer le nouveau tableau trié.

+ **CONSEIL** : instanciez (créez) l’objet Scanner à l’intérieur de la méthode.

+ **CONSEIL** : Faites extrêmement attention aux espaces dans le message imprimé.



+ **REMARQUE** : toutes les méthodes doivent être définies comme publiques statiques et NON publiques.

+ **REMARQUE** : n'ajoutez pas de méthode principale au code de la solution.

+ **REMARQUE** : les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.