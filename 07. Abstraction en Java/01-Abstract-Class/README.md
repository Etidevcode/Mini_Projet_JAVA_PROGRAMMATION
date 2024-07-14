# Classe abstraite
Mettez en œuvre les éléments suivants :

1. ListItem (classe abstraite)

- Il dispose de trois champs protégés. Deux ListItems appelés rightLink et leftLink, et un objet appelé value.

- Un constructeur qui prend un objet et initialise la valeur du champ avec le paramètre qui a été transmis.

- Et sept méthodes :

- next(), setNext(), previous(), setPrevious() et compareTo() qui sont privés du package et abstraits (voir la classe enfant pour la déclaration).

- getValue(), ne prend aucun paramètre et renvoie sa valeur.

- setValue(), prend un objet et lui attribue une valeur.



2. Node (classe concrète)

- Il étend ListItem.

- Il a un constructeur qui prend un objet, puis appelle son constructeur parent avec le paramètre qui a été transmis.

- Et cinq méthodes privées du package :

- next(), ne prend aucun paramètre et renvoie le ListItem à sa droite.

- setNext(), prend un ListItem et le définit comme son rightLink, puis il renvoie rightLink.

- previous(), ne prend aucun paramètre et renvoie le ListItem à sa gauche.

- setPrevious(), prend un ListItem et le définit comme son leftLink, puis il renvoie leftLink.

- compareTo(), prend un ListItem et le compare au ListItem qui a appelé cette méthode. Utilisez la valeur de ListItem à des fins de comparaison. Si cette valeur est supérieure à la valeur transmise, elle doit renvoyer un nombre supérieur à zéro. Si vice versa, il doit renvoyer un nombre inférieur à zéro et zéro s'il est égal.



3. MyLinkedList (classe concrète)

- Il implémente NodeList.

- Il comporte un champ de type ListItem appelé root.

- Un constructeur qui prend un ListItem et initialise la racine du champ avec le paramètre nouvellement passé.

- Et quatre méthodes :

- getRoot(), getter pour root.

- addItem(), prend un ListItem et renvoie true s'il a été ajouté avec succès ou false sinon. Si l'élément est déjà présent, il n'est pas ajouté. Utilisez compareTo() pour placer l’élément dans le bon ordre.

- RemoveItem(), prend un ListItem et renvoie true s'il a été supprimé avec succès ou false dans le cas contraire.

- traverse(), prend la racine en argument et ne renvoie rien. Si la racine est nulle, elle affiche : La liste est vide, sinon imprime chaque valeur sur une ligne distincte.



4. NodeList (interface)

- Il dispose de quatre méthodes :

- getRoot(), addItem(), removeItem() et traverse() qui sont privés du package et abstraits (voir la classe enfant pour la déclaration).



5. SearchTree (classe concrète)

- Il implémente NodeList.

- Il comporte un champ de type ListItem appelé root.

- Un constructeur qui prend un ListItem et initialise la racine du champ avec le paramètre nouvellement passé.

- Et cinq méthodes :

- getRoot(), getter pour root.

- addItem(), similaire à MyLinkedList. Voir le deuxième CONSEIL ci-dessous.

- RemoveItem(), identique à MyLinkedList.

- performRemoval(), prend deux ListItems, l'élément à supprimer et son parent. Il ne renvoie rien et est déclaré privé. Appelez cette méthode depuis removeItem() lorsque l'élément est trouvé.

- traverse(), prend la racine en argument et ne renvoie rien. Il utilise la récursivité pour visiter toutes les branches de l'arbre (Inorder). Imprimez chaque valeur sur une ligne séparée.



CONSEIL : Les règles d'ajout d'un élément à l'arborescence liée sont :

Si la tête de l'arborescence est nulle, faites en sorte que la tête fasse référence à l'élément à ajouter.

Si l'élément à ajouter est inférieur à l'élément actuel dans l'arborescence, ajoutez l'élément avant l'élément actuel (c'est-à-dire, faites en sorte que le "suivant" de l'élément précédent fasse référence au nouvel élément et que le "suivant" du nouvel élément fasse référence à l'élément actuel. article).

Si l'élément à ajouter est supérieur à l'élément actuel, passez à l'élément suivant et comparez à nouveau (s'il n'y a pas d'élément suivant, c'est à lui que appartient le nouvel élément).

CONSEIL : lors de l'ajout d'éléments à un arbre de recherche binaire, si l'élément à ajouter est inférieur à l'élément actuel, déplacez-vous vers la gauche.

S'il est supérieur à l'élément actuel, déplacez-vous vers la droite.

Le nouvel élément est ajouté lorsqu'une tentative de déplacement dans la direction requise impliquerait de suivre une référence nulle.

Encore une fois, les doublons ne sont pas autorisés.

CONSEIL : Inorder = imprimer le nœud précédent, puis le nœud parent, puis le nœud suivant (gauche -> nœud -> droite).



CONSEIL : Soyez extrêmement prudent avec l’orthographe des noms des champs, des constructeurs et des méthodes.

CONSEIL : Soyez extrêmement prudent concernant les espaces et l'orthographe dans la sortie imprimée de la méthode traverse().



REMARQUE : Tous les champs sont privés (sauf indication contraire).

REMARQUE : tous les constructeurs sont publics.

REMARQUE : toutes les méthodes sont publiques (sauf indication contraire).

REMARQUE : n'ajoutez pas de méthode principale au code de la solution.