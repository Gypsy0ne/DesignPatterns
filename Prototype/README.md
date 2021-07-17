# Prototype

Specifies types of generated objects based on the provided prototype object. 

Pattern should be applied when:
- system should be independent from creation, composition and representation of products;
- classes of created objects are defined during program runtime eg. dynamic loading.
- a developer wants to avoid creation of a hierarchy of factory classes corresponding to a products' classes hierarchy;
- objects might get one of not many states, in such situation adding a couple of prototypes and cloning them might be more suitable instead of manual creation for each state.   

Main benefits:
- possibility to add and remove objects of a given class during program runtime;
- ability to define new objects by some variable changes;
- new objects can be defined with structures modification;
- subclasses count reduction
- dynamic definition of a application with particular classes. 