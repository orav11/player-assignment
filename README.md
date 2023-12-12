# Player-assignment

This service utilizes Java 17 and Spring Boot 3 to provide a REST API serving the contents of the player.csv file
The service exposes two REST endpoints:

GET /api/players - returns the list of all players.
GET /api/players/{playerID} - returns a single player by ID.

These APIs can be explored via swagger
http://localhost:8080/swagger-ui/index.html

The service is dockerized and can be built from the Dockerfile path with the following command

docker build -t player-assignment .

In order to run the docker image 

docker run -p 8080:8080 player-assignment



Given more time I would do the following improvements:
1. Pagination - in order to improve the performance of retrieving all the players list 
2. Assuming that the project will be enhanced authentication/autherization should be added 
3. Adding more tests
4. Adding more logging
5. Adding additional handling for the cache, for example expiration time for each entry
6. Handling failures, more specific exception catching rather than global exception handling
