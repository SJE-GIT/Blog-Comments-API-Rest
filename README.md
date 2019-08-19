# Spring Boot, Spring Data JPA, Hibernate et MySQL API Rest.

Creation d'une API Rest pour gestion des commentaires des blogs, en utilisant les technologies : Spring Boot, Spring Data JPA, Hibernate et Mysql.

## Environment Technique

Java - 1.8.x, Maven - 3.x.x et Mysql - 5.x.x. 

## Etapes pour mise en place de l'application

**1. Cloner l'application de github**

```bash
git clone https://github.com/SJE-GIT/Blog-Comments-API-Rest.git
```

**2. Creation de la base de données Mysql en utilisant la commande de ligne ci-dessous.**

```bash
create database blogs_api
```

**3. Changeement des username et/ou password selon le besoin de l'installation**

1- Ouvrir le fichier : `src/main/resources/application.properties`

2- Changer les variables : `spring.datasource.username` et `spring.datasource.password`

**4. Faire un Build et exécution de l'application en utilisant Maven**

```bash
mvn package
java -jar target/blogs-1.0.0.jar
```

**Ou bien l'exécuter sans packaging :**

```bash
mvn spring-boot:run
```

L'application va démarrer et s'exécuter sur le lien : http://localhost:8080.

## Les méthodes HTTP exposées sur l'API Rest.

L'application définie les méthodes HTTP ci-dessous :

    POST /blogs
    
    GET /comments
    
    POST /blogs/{id}/comments
    
    GET /blogs/{id}/comments
    
    PUT /comments/{id}
    
    DELETE /comments/{id}

Les méthodes peuvent etre testées en utilisant Postman ou tout autre Client Rest.
