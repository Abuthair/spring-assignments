package com.course.model;

public enum Topic {
    HTML("Html"),
    ANGULAR("Angular"),
    PYTHON("Python"),
    DIGITALMARKETING("Digital Marketing"),
    NODEJS("Node Js"),
    REACT("React"),
    CSS("CSS"),
    DJANGO("Django"),
    SPRING("Spring"),
    JAVA("Java"),
    MONGODB("MongoDb"),
    COUCHDB("CouchDb");

    private String topicName;

    Topic(String topicName) {
        this.topicName = topicName;
    }
}
