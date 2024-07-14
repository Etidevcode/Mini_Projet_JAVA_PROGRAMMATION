# Travail de peinture

+ Bob est peintre mural et il a besoin de votre aide. Vous devez écrire un programme qui aide Bob à calculer le nombre de seaux de peinture dont il a besoin avant d'aller travailler. Bob pourrait aussi avoir des seaux supplémentaires à la maison. Il connaît également la zone qu'il peut recouvrir avec un seul seau de peinture.

1. Écrivez une méthode nommée getBucketCount avec 4 paramètres. Le premier paramètre doit être nommé width de type double. Ce paramètre représente la largeur du mur.

+ Le deuxième paramètre doit être nommé hauteur de type double. Ce paramètre représente la hauteur du mur.

+ Le troisième paramètre doit être nommé AreaPerBucket. Ce paramètre représente la zone pouvant être recouverte d'un seau de peinture.

+ Le quatrième paramètre doit être nommé extraBuckets. Ce paramètre représente le nombre de compartiments dont Bob dispose à la maison.

+ La méthode doit renvoyer une valeur de type int qui représente le nombre de buckets que Bob doit acheter avant d'aller travailler. Pour calculer le nombre de compartiments, reportez-vous aux notes ci-dessous.

+ Si l'un des paramètres width, height ou areaPerBucket est inférieur ou égal à 0 ou si extraBuckets est inférieur à 0, la méthode doit renvoyer -1 pour indiquer une valeur invalide.

+ Si tous les paramètres sont valides, la méthode doit calculer le nombre de buckets et le renvoyer.



**Exemples d'entrée/sortie :**

```
getBucketCount(-3.4, 2.1, 1.5, 2); → devrait renvoyer -1 puisque le paramètre width n'est pas valide

getBucketCount(3.4, 2.1, 1.5, 2); → devrait renvoyer 3 puisque la surface du mur est de 7,14, un seul seau peut couvrir une superficie de 1,5 et Bob a 2 seaux supplémentaires chez lui.

getBucketCount(2,75, 3,25, 2,5, 1); → devrait renvoyer 3 puisque la surface du mur est de 8,9375, un seul seau peut couvrir une superficie de 2,5 et Bob a 1 seau supplémentaire à la maison.
```

2. Bob n'aime pas saisir 0 pour le paramètre extraBuckets, il a donc besoin d'une autre méthode.

+ Écrivez une autre méthode surchargée nommée getBucketCount avec 3 paramètres à savoir width, height et AreaPerBucket (tous de type double).

+ Cette méthode doit renvoyer une valeur de type int qui représente le nombre de buckets que Bob doit acheter avant d'aller travailler. Pour calculer le nombre de compartiments, reportez-vous aux notes ci-dessous.

+ Si l'un des paramètres width, height ou areaPerBucket est inférieur ou égal à 0, la méthode doit renvoyer -1 pour indiquer une valeur invalide.

+ Si tous les paramètres sont valides, la méthode doit calculer le nombre de buckets et le renvoyer.



**Exemples d'entrée/sortie :**

```
getBucketCount(-3.4, 2.1, 1.5); → devrait renvoyer -1 puisque le paramètre width n'est pas valide

getBucketCount(3.4, 2.1, 1.5); → devrait renvoyer 5 puisque la surface du mur est de 7,14 et qu'un seul seau peut couvrir une superficie de 1,5.

getBucketCount(7.25, 4.3, 2.35); → devrait renvoyer 14 puisque la superficie du mur est de 31,175 et qu'un seul seau peut couvrir une superficie de 2,35.
```


3. Dans certains cas, Bob ne connaît pas la largeur et la hauteur du mur, mais il connaît la superficie d'un mur. Il a besoin que vous écriviez une autre méthode.

+ Écrivez une autre méthode surchargée nommée getBucketCount avec 2 paramètres, à savoir Area et AreaPerBucket (tous deux de type double).

+ La méthode doit renvoyer une valeur de type int qui représente le nombre de buckets que Bob doit acheter avant d'aller travailler. Pour calculer le nombre de compartiments, reportez-vous aux notes ci-dessous.

+ Si l'un des paramètres zone ou zonePerBucket est inférieur ou égal à 0, la méthode doit renvoyer -1 pour indiquer une valeur non valide.

+ Si tous les paramètres sont valides, la méthode doit calculer le nombre de buckets et le renvoyer.



**Exemples d'entrée/sortie :**

```
getBucketCount(3.4, 1.5); → devrait renvoyer 3 puisque la superficie est de 3,4 et qu'un seul seau peut couvrir une superficie de 1,5

getBucketCount(6.26, 2.2); → devrait renvoyer 3 puisque la surface du mur est de 6,26 et qu'un seul seau peut couvrir une superficie de 2,2.

getBucketCount(3,26, 0,75); → devrait renvoyer 5 puisque la surface du mur est de 3,26 et qu'un seul seau peut couvrir une superficie de 0,75 .
```


**Faites de votre mieux pour aider Bob.**



**REMARQUE :** utilisez la méthode Math.ceil pour arrondir le nombre de buckets calculés (double), puis convertissez-le en int avant de renvoyer la valeur des méthodes.

**REMARQUE :** Toutes les méthodes doivent être définies comme publiques statiques, comme nous l'avons fait jusqu'à présent dans le cours.

**REMARQUE :** n'ajoutez pas la méthode principale au code de la solution.