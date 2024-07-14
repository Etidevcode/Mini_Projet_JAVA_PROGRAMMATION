# Téléphone mobile
Créez un programme qui implémente un téléphone mobile simple avec les fonctionnalités suivantes.



1. Implémentez la classe principale MobilePhone, qui contient la liste ArrayList de contacts, avec les attributs suivants :

- Deux champs, une String appelée myNumber et une ArrayList de type Contact appelée myContacts.

- Un constructeur qui prend une chaîne (le numéro de téléphone), initialise myNumber et instancie myContacts.

- Et sept méthodes, ce sont (leurs fonctions sont dans leurs noms) :

- addNewContact(), a un paramètre de type Contact et renvoie un booléen. Renvoie vrai si le contact n'existe pas, ou faux si le contact existe déjà.

- updateContact(), possède deux paramètres de type Contact (l'ancien contact qui sera mis à jour avec le nouveau contact) et renvoie un booléen. Renvoie vrai si le contact existe et a été mis à jour avec succès, ou faux si le contact n'existe pas.

- removeContact(), a un paramètre de type Contact et renvoie un booléen. Renvoie vrai si le contact existe et a été supprimé avec succès, ou faux si le contact n'existe pas.

- findContact(), a un paramètre de type Contact et renvoie un int. La valeur renvoyée est sa position dans ArrayList, elle sera soit -1 (n'existe pas), soit une valeur supérieure ou égale à 0 (existe).

- findContact(), comme ci-dessus, seulement il a un paramètre de type String.

- queryContact(), possède un paramètre de type String et renvoie un Contact. Utilisez la chaîne pour rechercher le nom, puis renvoyez le contact. Renvoie null sinon.

- printContacts(), n'a aucun paramètre et ne renvoie rien. Imprimez les contacts au format suivant :

Liste de contacts:
1. Bob -> 31415926
   2.Alice -> 16180339
3. Tom -> 11235813
4. Jeanne -> 23571113


2. Implémentez la classe Contact avec les attributs suivants :

- Deux champs, tous deux String, l'un appelé nom et l'autre phoneNumber.

- Un constructeur qui prend deux chaînes et initialise le nom et le numéro de téléphone.

- Et trois méthodes, ce sont :

- getName(), getter pour le nom.

- getPhoneNumber(), getter pour phoneNumber.

- createContact(), a deux paramètres de type String (le nom et le numéro de téléphone de la personne) et renvoie une instance de Contact. C'est la seule méthode statique.



CONSEIL : Dans MobilePhone, utilisez findContact() dans les autres méthodes (sauf printContacts()) pour vérifier s'il existe avant de continuer.

CONSEIL : deux objets Contact sont égaux s’ils portent le même nom.

CONSEIL : Faites extrêmement attention aux espaces dans le message imprimé.



REMARQUE : Tous les champs sont privés.

REMARQUE : les constructeurs doivent être définis comme publics.

REMARQUE : toutes les méthodes doivent être définies comme publiques (à l'exception des deux méthodes findContact() qui sont privées).

REMARQUE : n'ajoutez pas de méthode principale au code de la solution.

REMARQUE : les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.

REMARQUE : si vous obtenez une erreur de la classe Evaluate, il s'agit probablement du constructeur. Vérifiez si vous avez ajouté un constructeur ou si le constructeur a les bons arguments.

