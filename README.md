# spring-model-test

Este projeto é uma REST API utilizando framework SpringBoot com Java, possui 2 rotas com o seguinte endPoint:

> "/api/car"

### POST
Body:
```
{
	"modelo": "Fiat Argo 1.3",
	"fabricante": "Fiat",
	"dataFabricacao": "10/02/2006",
	"valor": 10000,
	"anoModelo": 2023
}
```
Response: 200 OK!

### GET

Response:
```
[
  {
	  "modelo": "Fiat Argo 1.3",
	  "fabricante": "Fiat",
	  "dataFabricacao": "10/02/2006",
	  "valor": 10000,
	  "anoModelo": 2023
  },
]
```
