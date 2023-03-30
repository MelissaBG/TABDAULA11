# mongo

API restful para a aula de TABD na fundatec, com conexão no mongoDB Atlas

Exemplo de body:
{
"id":1,
"num~~~~eroPedido" : 45,
"item" : "BigMac"";
"qtd": 1,
"valor": 30,00
}

endpoints:

GET localhost:8080/mongo/mcDonalds - listar todos
GET localhost:8080/mongo/mcDonalds/{id} - listar por id
POST localhost:8080/mongo/mcDonalds - salvar
PUT localhost:8080/mcDonalds/{id} - editar
DELETE localhost:8080/mcDonalds/{id} - deletar 
