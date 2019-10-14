package org.acme.mongodb.panache.model;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;

@MongoEntity(collection = "fruits")
public class Fruit extends PanacheMongoEntity {
    public String name;
    public String description;
}
