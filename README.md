
## run mongodb

    docker run -d -p 27017:27017 mongo

## run app

    ./mvnw compile quarkus:dev

## play!

### add a fruit

    curl -X POST \
        http://127.0.0.1:8080/fruits \
        -H 'Content-Type: application/json' \
        -d '{
            "name": "banana",
            "description": "yellow!"
            }'

### find all fruits
    
    curl -X GET http://127.0.0.1:8080/fruits

