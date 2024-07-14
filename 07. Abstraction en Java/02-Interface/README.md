# Interface
Créez une interface simple qui permet d'enregistrer un objet sur une sorte de support de stockage.



Mettez en œuvre les éléments suivants :

1. ISaveable (interface)

- Il existe deux méthodes :

- write(), ne prend aucun argument et renvoie une liste contenant des objets de type String.

- read(), prend une List de type String et ne renvoie rien.



2. Joueur (classe)

- Il comporte quatre champs. Deux cordes appelées nom et arme. Deux entiers appelés hitPoints et force.

- Un constructeur qui accepte une String (nom) et deux entiers (hitPoints et force). Il initialise le nom, les hitPoints et la force avec les valeurs nouvellement transmises. Il initialise l'arme avec l'arme par défaut "Épée".

- Et onze méthodes :

- Getters et setters pour les quatre champs.

- write(), identique à l'interface. Renvoie une liste des champs dans l'ordre dans lequel ils apparaissent dans toString().

- read(), identique à l'interface. Stockez les valeurs dans la liste, dans l'ordre dans lequel elles apparaissent dans toString(). Assurez-vous que la liste n'est pas nulle et que size() est supérieur à 0 avant de stocker les valeurs.

- toString(), les joueurs remplaçant la méthode toString(). Il ne prend aucun argument et renvoie une chaîne au format suivant :

Joueur{name='Tim', hitPoints=10, force=15, arme='Sword'}


3. Monstre (classe)

- Il comporte trois champs. Une chaîne appelée nom et deux entiers appelés hitPoints et force.

- Un constructeur qui accepte une String (nom) et deux entiers (hitPoints et force). Il initialise le nom, les hitPoints et la force avec les valeurs nouvellement transmises.

- Et six méthodes :

- Uniquement des getters pour les trois champs.

- write(), identique à l'interface. Renvoie une liste des champs dans l'ordre dans lequel ils apparaissent dans toString().

- read(), identique à l'interface. Stockez les valeurs dans la liste, dans l'ordre dans lequel elles apparaissent dans toString(). Assurez-vous que la liste n'est pas nulle et que size() est supérieur à 0 avant de stocker les valeurs.

- toString(), Monstres remplaçant la méthode toString(). Il ne prend aucun argument et renvoie une chaîne au format suivant :

Monstre{name='Loup-garou', hitPoints=20, force=40}


CONSEIL : Le joueur et le monstre doivent implémenter ISaveable.

CONSEIL : Soyez extrêmement prudent avec l’orthographe des noms des champs, des constructeurs et des méthodes.

CONSEIL : Soyez extrêmement prudent concernant les espaces et l'orthographe dans la chaîne renvoyée par la méthode toString().



REMARQUE : Tous les champs sont privés.

REMARQUE : les deux constructeurs sont publics.

REMARQUE : toutes les méthodes sont publiques.

REMARQUE : Il n'y a pas de membres statiques.

REMARQUE : n'ajoutez pas de méthode principale au code de la solution.

REMARQUE : les classes qui ne figurent pas dans le package java.lang doivent être importées manuellement.

REMARQUE : si vous obtenez une erreur de la classe Evaluate, il s'agit probablement du constructeur. Vérifiez si vous avez ajouté un constructeur ou si le constructeur a les bons arguments.