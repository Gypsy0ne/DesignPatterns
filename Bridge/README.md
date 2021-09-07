# Bridge

Separates abstraction and its implementation layers what makes possible to modify them separately.

Pattern should be applied when:
- you want to avoid permanent abstraction and implementation coupling;
- both abstraction and implementation layers are extendable;
- implementation layer changes shouldn't affect abstraction layer;

Main benefits:
- abstraction and implementation separation;
- hierarchies of each layer might be developed independently;
- hiding implementation details from clients. 

The bridge pattern is used on a system projection level.  