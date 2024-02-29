# Read Me First

The original idea is from  
https://towardsdev.com/mastering-jpa-in-spring-boot-a-comprehensive-guide-dd296eb6df6f

The @ElementCollection annotation in JPA (Java Persistence API) is used to define a collection of simple or embeddable
types (non-entity types) that are stored as an element in a *separate* table.

This is commonly used when you want to model a one-to-many relationship where the "many" side is a collection of basic
types or embeddable objects rather than full-fledged entities.