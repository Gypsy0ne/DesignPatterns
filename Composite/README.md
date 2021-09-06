# Composite

Organizes objects in tree type structures to keep them in a part-whole hierarchy. The pattern helps treating them just the same. 

Pattern should be applied when:
- if you want to keep objects in a part-whole hierarchy;
- clients might ignore difference between compound objects and singular ones. In such situation clients will treat every object from a structure just the same. 

Consequences:
- provides definition of hierarchy made out of compound and singular objects;
- simplifies client side code;
- makes it easier to add new component types;

Disadvantage of this pattern is that the project may become too general.