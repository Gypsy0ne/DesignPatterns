# Abstract Factory

Provides interface for related objects creation without determining their concrete implementations.

Pattern should be applied when:
- the whole system should be independent of objects composition, representation and creation;
- a system is configured with one of many product groups;
- related product objects from the same group are designed to common use, and we want to force simultaneous usage; 
- a developer wants to share library classes of products and reveal only their interfaces not implementations.

Main benefits:
- isolates concrete classes;
- easier product classes groups replacement;
- facilitates maintaining consistency between products(classes).

Cons:
- makes difficult to support products of new types.