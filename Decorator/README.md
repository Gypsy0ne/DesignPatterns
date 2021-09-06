# Decorator

Dynamically gives responsibilities to a created object. This pattern alternates subclasses creation with new functionality.

Pattern should be applied when:
- we want to dynamically provide more functionalities in particular objects without affecting others
- there is a need for a mechanism which handles tasks in a revertible way
- it is impractical to create subclasses. Sometimes base class's definition might be inaccessible what makes it impossible to create subclasses. 

Pros:
- provides more flexibility than inheritance;
- by applying this pattern highly hierarchical classes are less overloaded with functions;

Cons:
- decorator and linked component are not identical
- may lead to class explosion - many small decorators