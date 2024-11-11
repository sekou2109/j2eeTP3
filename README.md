TP03 - Servlets et JSP J2EE
TP réalisé pour le TP03 du cours de J2EE (ING2, GSI) 2024-2025. Ce TP explore les interactions entre les servlets et les pages JSP pour gérer des formulaires, résoudre des équations et manipuler une matrice dynamique.
Noms : Hadj Rabearimanana, Sekou Bah et Clément Praud

Structure du Projet
Ce projet comprend trois exercices principaux, chacun avec des fonctionnalités spécifiques :

Exigences Techniques
Environnement J2EE (Java Servlet API)
Serveur d'application compatible (ex : Apache Tomcat)
Utilisation de JSP pour gérer l'interface utilisateur
Contenu du Projet
Exercice 1 : Système de Login - Servlet_Login
L'objectif de cet exercice est de créer un formulaire de login et une servlet pour authentifier un utilisateur.

Accès : /Servlet_Login
Fonctionnalités :
Page JSP Login.jsp : Contient deux champs pour le login et le mot de passe, ainsi qu'un bouton pour envoyer les informations.
Vérification des Identifiants : La servlet Servlet_Login vérifie si les informations saisies sont correctes.
Redirection vers resultat.jsp :
Si les identifiants sont corrects, la page affiche le message « Welcome to your First JSP page ».
Si les identifiants sont incorrects, la page affiche « Identification Failure ».
HTML associé :
login.jsp pour le formulaire de connexion.
resultat.jsp pour afficher les messages de réussite ou d'échec.
Exercice 2 : Résolution d'Équation du Second Degré - EquationServlet
Cet exercice consiste à créer une page JSP pour saisir les coefficients d’une équation du second degré, puis utiliser une servlet pour résoudre l’équation.

Accès : /EquationServlet
Fonctionnalités :
Page JSP Formulaire.jsp : Permet à l’utilisateur de saisir les valeurs des coefficients a, b, et c.
Résolution de l’Équation : La servlet EquationServlet calcule le discriminant d = b^2 - 4ac et détermine les racines selon sa valeur.
Discriminant négatif : Affiche « Pas de racines réelles » en rouge.
Discriminant nul : Affiche la racine double en bleu, calculée comme x = -b / 2a.
Discriminant positif : Affiche les deux racines en vert, calculées comme x1 = (-b + √d) / 2a et x2 = (-b - √d) / 2a.
HTML associé :
Formulaire/index.jsp pour l'entrée des coefficients.
resultat/index.jsp pour afficher les solutions de l'équation.
Exercice 3 : Gestion de Matrice - MatriceServlet
Cet exercice implique la création d'une servlet qui gère une matrice 10x10, permettant de l’afficher, de la réinitialiser, et de mettre à jour ses cellules.

Accès : /MatriceServlet
Fonctionnalités :
Afficher la Matrice Complète : Lors d'une requête GET sans paramètres, la servlet renvoie le contenu de la matrice sous forme de table HTML.
Afficher une Cellule Spécifique : Une requête GET avec les paramètres x et y affiche la valeur de la cellule (x, y). Si les indices sont hors limites, un message d'erreur s'affiche.
Réinitialiser la Matrice : Une requête POST sans paramètres remet toutes les cellules de la matrice à zéro.
Mettre à Jour une Cellule : Une requête POST avec les paramètres x, y, et val met à jour la cellule (x, y) avec la valeur val.
Page JSP matrice.jsp : Fournit une interface pour effectuer les opérations ci-dessus sur la matrice.
Installation et Déploiement
Clonez le projet ou ajoutez les fichiers de code Java et JSP dans votre environnement de développement compatible avec J2EE.
Compilez et déployez le projet sur un serveur d'application compatible (ex : Tomcat).
Accédez aux servlets et aux pages JSP en suivant les chemins définis ci-dessus (par exemple, /Servlet_Login, /EquationServlet, et /MatriceServlet).
Usage
Login (Exercice 1) :

Accédez à /login.jsp pour ouvrir le formulaire de login.
Entrez les identifiants corrects pour accéder à la page de bienvenue ou un message d'erreur s'affichera en cas d'échec.
Résolution d’Équation (Exercice 2) :

Accédez à /Formulaire.jsp et saisissez les coefficients a, b, et c.
La solution de l’équation s'affichera en fonction de la valeur du discriminant.
Gestion de la Matrice (Exercice 3) :

Accédez à /matriceOperation/matrice.jsp pour effectuer les différentes opérations de gestion de la matrice :
Afficher la matrice complète.
Afficher la valeur d'une cellule spécifique.
Réinitialiser la matrice.
Mettre à jour une cellule spécifique.
Notes
Les pages JSP servent d’interface utilisateur et utilisent des servlets pour traiter les informations et afficher les résultats.
Chaque exercice présente une solution à une problématique spécifique en utilisant les servlets et JSP.
Auteurs
Ce projet a été réalisé dans le cadre du TP J2EE (ING2, GSI) 2024-2025.



