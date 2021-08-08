# Prototype

Converts class's interface to the expected one used by client. Facilitates cooperation between classes which has no ability to work with each other.
 
Pattern should be applied when:
- developer wants to reuse the existing class but its interface doesn't suit expectations; 
- there is a need to create a reusable class which cooperates with unrelated or unknown(with no interface compatibility assurance) classes.
- many subclasses are used and its too time consuming or impractical to create an adapter for each of them. In such situation it is recommended to create an objective adapter which uses composition over multiple inheritance.

Consequences - class adapter:
- adds only one object and getting access to adapted class doesn't require any additional level of mediation by using pointer.
- allows overriding in the adapter class methods of the adapted class. It is possible because an adapter class is subclass of the adapted one.
- it adapts to a concrete class what makes it impossible to adapt that class and all of their subclasses.

Consequences - objective adapter:
- allows a cooperation between one adapter class and many adapted classes(subclasses as well). In such class it's possible to add functions for every adapted classes at once.
- makes it hard to override the adapted class methods. Such case requires a new subclass and using it instead of a adapted class.