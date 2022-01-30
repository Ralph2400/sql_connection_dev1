Version :
---------
mySQL community server : 8.0.13

mySQL connector : 5.1.49

OS : macOS Mojave 10.14.6


Etapes: 
-------
Téléchargement de "mySQL community server" et "mySQL connector", puis création a partir du terminal d'une base de données marketDB avec une table items contenant les champs ci dessous.

+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| item_id    | int(11)     | NO   | PRI | NULL    |       |
| item_name  | varchar(20) | YES  |     | NULL    |       |
| item_price | int(10)     | YES  |     | NULL    |       |
| item_date  | varchar(20) | YES  |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+

Inception de 5 items grace au commandes insert

+---------+-----------+------------+------------+
| item_id | item_name | item_price | item_date  |
+---------+-----------+------------+------------+
|       1 | Pasta     |         20 | 21/10/2020 |
|       2 | tuna      |          8 | 10/6/2020  |
|       3 | nutella   |          5 | 05/1/2021  |
|       4 | maxtella  |          2 | 05/1/2021  |
|       5 | chicken   |         45 | 29/1/2021  |
+---------+-----------+------------+------------+


On cree un projet intelligent et on ajoute dans File -> project structure -> Libraries le file .jar qui a été télécharger lors du téléchargement de mySQL connector

On s'est connecté a la base de données et avons créer un query de SELECT * FROM items et puis on utilise la fonction println pour tout afficher
