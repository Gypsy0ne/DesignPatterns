# Facade

Guarantees only one class instance with global access in the whole application.

Pattern should be applied when:
- a developer wants to share a simplified interface to a wider subsytem;
- we want to separate clients and other subsystems. It improves independence of the system and reusability;
- a system needs to be divided into layers.

Main benefits:
- separates clients and a subsystem what reduces number of objects that they use;
- helps in maintaining loose coupling between clients and subsystems;
- doesn't block usage of subsystems directly if it's necessary. 
