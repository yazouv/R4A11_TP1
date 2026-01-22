QUESTION 1 : Où se trouve ce fichier ? Donnez son nom et son emplacement dans l’arborescence du
projet.
> res/layout/activity_main.xml

Question 2 : Qu’avez-vous modifié ?
> Dans activity_main.xml ligne 13, modifié "Hello world"

Question 3 : Qu’avez-vous modifié pour changer l’icône ?
> J'ai modifié la ligne 9 (android:icon) et 11 (android:roundIcon) dans le AndroidManifest.xml

Question 4 : Est-ce nécessaire de cliquer sur le bouton valider pour afficher le texte saisi sur la seconde
activité ? Pourquoi ?
> Non, car le texte est récupéré directement depuis l'input et non depuis le texte sur la view.

Question 5 : Le comportement de la question 4 vous semble-t-il normal ?
> Non, car techniquement il devrait valider avant de passer à la vue suivante.

Question 6 : Comment faire pour ne pas afficher le nouveau texte sur la deuxième activité tant que le
bouton valider n’a pas été cliqué ?
> il faudrait vérifier si le texte de base qu'on affiche dans la vue a été changé ou n'est pas vide.