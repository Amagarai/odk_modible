# odk_modible
l'url de l'API est accessible sur http://localhost:8080/api :
Ajout apprenant : Demande de type Post : http://localhost:8080/api/add
Lister les apprenants présents dans la base de données : Requête de type Get : http://localhost:8080/api/listing
Supprimer un apprenant : Requête de type Supprimer : http://localhost:8080/api/delete/{id}
Rechercher un apprenant par son id : Requête de type Get : http://localhost:8080/api/listId/{id}
Modifier un apprenant : Demande de type Patch : http://localhost:8080/api/modifier/{id}
Rechercher dans les si un apprenant existe a travers son login et son mot de passe : Requête de type Get : http://localhost:8080/api//auth/login={login}&password={password}

PS : si vous utilisez un autre logiciel que xampp veuillez changer le port d'accès de Mysql  
 Et aussi l'Api porte le nom de ODK_Apprennant et l'application est  OdkMobile
