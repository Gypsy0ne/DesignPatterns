# Proxy

Provides a deputy for an object to control the right one.

Pattern should be applied when:
- local object representation comes from different memory address pool, such thing is called "remote proxy";
- large objects are created only on demand what's called "virtual proxy";
- primary object access requires some control - security proxy.

Main benefits:
// todo
