# Factory Method

Defines interface for object creation but allows subclasses to choose class of the given object. The pattern lets classes delegate object creation process to their subclasses.

Pattern should be applied when:
- in a class definition it is impossible to determine objects' classes to create
- a developer wants subclasses to determine created objects
- classes delegate tasks to one of many helper subclasses and a developer wants to keep info which of these subclasses is a delegate.

Main consequences:
- provision of anchor points for subclasses;
- connectivity between parallel class hierarchies.