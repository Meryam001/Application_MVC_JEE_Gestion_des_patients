<h1>Introduction</h1>
Le But de ce projet c'est de mettre en pratique L'architecture MVC en utilisant <strong>Spring Web</strong>, <strong>Spring Security</strong> , <strong>JPA</strong> et <strong>thymeleaf</strong> en utilisant biensur l'approche rendu coté serveur.

<h1>Concept Générale :</h1>

<h3>Architecture JEE :</h3>
Il existe 2 type de composant :
<h3>Servlet :</h3>

>C'est une class java a pour but d'effectuer des traitement coté serveur (Controller).   
>Il recoit la requet http et utilisent l'objet request qui permet de lire les requettes http.

<h3>JSP :</h3>

>JSP = Java Server Pages (View).                     
>Génére le code HTML, il recupère le résultat dans le model.

<h1>Concept de la l'application :</h1>
<ul>
<li>Chercher des patients avec pagination</li>
<li>Supprimer un patient</li>
<li>Ajouter un patient avec validation du formulaire</li>
<li>Editer et Mettre à jour un patient</li>
<li>Creér une page Template basée sur Thymleaf layout</li>
</ul>

<h1>Pratique :</h1>
Dans cette Activité pratiqué nous allons mettre en oeuvre tous ces notions :

<h3>Architecture du projet :</h3>
<img src="Captures\architecture1.png">
<h3>La structure du projet :</h3>
<img src="Captures\architecture2.png">
<h3>POM.XML :</h3>
Après définitions des models. il faut vérifier dans le fichier xml les dépendences suivantes :

- Ajouter les dépendance du Bootstrap :

>        <dependency>
>            <groupId>org.webjars</groupId>
>            <artifactId>bootstrap</artifactId>
>            <version>5.1.3</version>
>        </dependency>

- Ajouter les dépendances thymeleaf :

>       <dependency>
>           <groupId>nz.net.ultraq.thymeleaf</groupId>
>           <artifactId>thymeleaf-layout-dialect</artifactId>
>        </dependency>

- Ajouter les dépendances des validations :

>       <dependency>
>           <groupId>org.springframework.boot</groupId>
>           <artifactId>spring-boot-starter-validation</artifactId>
>       </dependency>

<h3>application.properties :</h3>
<img src="Captures\DB.png">

Dans ce fichier en mets notre configuration :

- Définir le port
- Définir le url de la base de données(h2-database/mysql)

>Vous trouverez les configurations des 2 database (h2/mysql), on cas ou vous voulez migrez en une autre base de donnée<h3>application.properties :</h3>

Dans ce fichier en mets notre configuration :

- Définir le port
- Définir le url de la base de données(h2-database/mysql)

>Vous trouverez les configurations des 2 database (h2/mysql), on cas ou vous voulez migrez en une autre base de donnée

<img src="Captures\jbdc.png">

<h3>Package web :</h3>
Dans ce package on a définit nos controller :


>**PatientController** : pour le traitement de l'entité Patient                        
>**SecurityController** : cette class à pour but de faire une redirection vers une page qui affiche '403' c-à-d en cas de fraudement d'autorisation !</p>

<h1>Conclusion :</h1>
Cette application pratique a pour but de mettre en pratiques 2 notions principaux :
- Faire une application native (Approche coté serveur)
- Faire la securité de l'application en pratiquant 3 principe : <strong>inMemoryAuthentication</strong>, <strong>jdbc Authentication</strong>, <strong>userDetailsService</strong>

