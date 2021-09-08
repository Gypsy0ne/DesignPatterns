# Proxy

Provides a deputy for an object to control the right one.

Pattern should be applied when(benefits included):
- local object representation comes from different memory address pool, such thing is called "remote proxy";
- large objects are created only on demand what's called "virtual proxy". This proxy will provide some default and instant results if the real object is supposed to take some time to produce results;
- primary object access requires some control - "protection proxy";
- real objects might get locked and to check whether it can be modified or not - "smart proxy".
