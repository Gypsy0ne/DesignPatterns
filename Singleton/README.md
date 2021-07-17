# Singleton

Guarantees only one class instance with global access in the whole application.

Pattern should be applied when:
- it has to exist the only one instance of a given class;
- you need to be able to extend a single instance by subclassing. Clients should use extended instances without any incode changes. 

Main benefits:
- guarantees control of access to the only one class instance;
- helps in reducing namespace size;
- allows to limit a number of objects of a given class;
- more elastic than static operations.

Disadvantage of this pattern is all of these objects have to be instantiated(automatically) and always be present in memory.