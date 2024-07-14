# Bancaire

+ Votre travail consiste à créer une application bancaire simple.



**Implémentez les classes suivantes :**

**1. Bank**

- Il comporte deux champs, une chaîne appelée nom et une ArrayList qui contient des objets de type Branch appelés branches.

- Un constructeur qui prend un String (nom de la banque). Il initialise le nom et instancie les branches.

- Et cinq méthodes, il y en a (leurs fonctions sont dans leurs noms) :

  - **addBranch()**, possède un paramètre de type String (nom de la branche) et renvoie un booléen. Il renvoie vrai si la branche a été ajoutée avec succès ou faux dans le cas contraire.

  - **addCustomer()**, possède trois paramètres de type String (nom de la succursale), String (nom du client), double (transaction initiale) et renvoie un booléen. Il renvoie vrai si le client a été ajouté avec succès ou faux dans le cas contraire.

  - **addCustomerTransaction()**, possède trois paramètres de type String (nom de la succursale), String (nom du client), double (transaction) et renvoie un booléen. Il renvoie vrai si la transaction client a été ajoutée avec succès ou faux dans le cas contraire.

  - **findBranch()**, possède un paramètre de type String (nom de la Branche) et renvoie une Branche. Renvoie la branche si elle existe ou null sinon.

  - **listCustomers()**, possède deux paramètres de type String (nom de la Branche), booléen (transactions d'impression) et renvoie un booléen. Renvoie true si la branche existe ou false sinon. Cette méthode imprime une liste de clients.

**→ CODE D'ESSAI**

```
Bank bank = new Bank("National Australia Bank");
 
bank.addBranch("Adelaide");
 
bank.addCustomer("Adelaide", "Tim", 50.05);
bank.addCustomer("Adelaide", "Mike", 175.34);
bank.addCustomer("Adelaide", "Percy", 220.12);
 
bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
 
bank.listCustomers("Adelaide", true);
```

**→ SORTIE**

+ La liste des clients doit être imprimée au format suivant si le paramètre booléen est vrai :

**Coordonnées client de la succursale d'Adélaïde**

```
Customer: Tim[1]
Transactions
[1] Amount 50.05
[2] Amount 44.22
[3] Amount 12.44
Customer: Mike[2]
Transactions
[1] Amount 175.34
[2] Amount 1.65
Customer: Percy[3]
Transactions
[1] Amount 220.12
```


**Et si faux, uniquement les clients - aucune transaction :**

```
bank.listCustomers("Adelaide", false);
Customer details for branch Adelaide
Customer: Tim[1]
Customer: Mike[2]
Customer: Percy[3]
```



**2. Branch**

- Il comporte deux champs, une chaîne appelée name et une ArrayList qui contient des objets de type Customer appelés clients.

- Un constructeur qui prend un String (nom de la branche). Il initialise le nom et instancie les clients.

- Et cinq méthodes, il y en a (leurs fonctions sont dans leurs noms) :

  - **getName()**, getter pour le nom.

  - **getCustomers()**, getter pour les clients.

  - **newCustomer()**, possède deux paramètres de type String (nom du client), double (transaction initiale) et renvoie un booléen. Renvoie vrai si le client a été ajouté avec succès ou faux dans le cas contraire.

  - **addCustomerTransaction()**, possède deux paramètres de type String (nom du client), double (transaction) et renvoie un booléen. Renvoie vrai si la transaction client a été ajoutée avec succès ou faux dans le cas contraire.

  - **findCustomer()**, possède un paramètre de type String (nom du client) et renvoie un Customer. Renvoie le Client s'il existe, null sinon.



**3. Client**

- Il comporte deux champs, une chaîne appelée nom et une ArrayList qui contient des objets de type Double appelés transactions.

- Un constructeur qui prend un String (nom du client) et un double (transaction initiale). Il initialise le nom et instancie les transactions.

- Et trois méthodes, il y en a (leurs fonctions sont dans leurs noms) :

  - **getName()**, getter pour le nom.

  - **getTransactions()**, getter pour les transactions.

  - **addTransaction()**, a un paramètre de type double (transaction) et ne renvoie rien.



**CONSEIL :** Dans Bank, utilisez la méthode findBranch() dans chacune des quatre autres méthodes pour valider une succursale. Faites la même chose dans Branch avec findCustomer() - sauf pour les deux getters.

**CONSEIL :** Dans Customer, réfléchissez à ce que vous devez faire d'autre dans le constructeur lorsque vous instanciez un objet Customer.

**CONSEIL :** réfléchissez aux méthodes que vous devez appeler depuis une autre classe lors de l’implémentation d’une méthode.

**CONSEIL :** Soyez extrêmement prudent avec l’orthographe des noms des champs, des constructeurs et des méthodes.

**CONSEIL :** Soyez extrêmement prudent concernant les espaces et l’orthographe dans la sortie imprimée.



**REMARQUE :** Toutes les transactions sont des dépôts (pas de retraits/soldes).

**REMARQUE :** Tous les champs sont privés.

**REMARQUE :** tous les constructeurs sont publics.

**REMARQUE :** toutes les méthodes sont publiques (sauf findBranch() et findCustomer() qui sont privées).

**REMARQUE :** Il n'y a pas de membres statiques.

**REMARQUE :** n'ajoutez pas de méthode principale au code de la solution.

**REMARQUE :** les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.

**REMARQUE :** si vous obtenez une erreur de la classe Evaluate, il s'agit probablement du constructeur. Vérifiez si vous avez ajouté un constructeur ou si le constructeur a les bons arguments.