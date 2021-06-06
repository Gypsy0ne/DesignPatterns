# Builder

Separates object's creation process from its presentation. Construction process may return various representations of the given object.

Pattern should be applied when:
- object creation algorithm should be independent of object's components, and the way they are connected to each other;
- construction process is suppose to allow creating various representations of the given object.

Main benefits:
- possibility to modify an internal object's representation;
- isolation of code responsible for creation from the presenting one;
- better control over the creation process.