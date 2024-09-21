# Autorola Home Assignment

Løsningen er en Spring Boot application bygget op i et MVC pattern, og er bygget med Apache Maven.

Den kræver Java Runtime 17 eller nyere for at bygge. 

## Installation

Hvis du har Maven installeret kan du køre følgende kommando i din terminal for at bygge JAR filen:

```bash
> mvn clean install
```
Alternavtivt kan du bruge Maven Wrapper for Windows eller Linux:
```bash
> ./mvnw.cmd clean install      // Windows
> ./mvnw clean install          // Linux
```
Efter build, åbn `web/target` folderen og kør følgende i terminalen:
```bash
> java -jar web-1.0-SNAPSHOT
```

## Brugsanvisning

Applikationen eksponerer et REST endpoint på `localhost:9090/api/cars`, hvor den skal returnere en liste af registerede biler. I starten er listen tom. 
Se alle biler ved at åbne pathen op i en browser, eller kør følgende:
```bash
curl -X GET http://localhost:9090/api/cars
```
For at tilføje en bil, brug følgende format: 
```bash
curl -X POST http://localhost:9090/api/cars -H "Content-Type: application/json" -d '{
  "vin": "JH4DA3340HS004951",
  "make": "Acura",
  "model": "Integra",
  "firstRegistration": "2001-11-19T00:00:00",
  "mileage": "150,000 km",
  "color": "Purple",
  "transmission": "Manual"
}'
```
En liste af json formatterede biler findes i root mappen, under `sample_cars.txt`. For at hente en specific bil vha. dens vin nummer, køres en `GET` request med vin nummeret tilføjet til routen:

```bash
> curl -X GET http://localhost:9090/api/cars/JH4DA3340HS004951
```

For at slette en bil, bruges en `DELETE` request med samme vin nummer routing:

```bash
> curl -X DELETE http://localhost:9090/api/cars/JH4DA3340HS004951
```
