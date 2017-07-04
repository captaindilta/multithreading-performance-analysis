**Multithreading is useless in CPU bound functions.**
Python does not execute threads on different processors.
Threads will not make your program faster if they already use 100% of the CPU time.
Threads are useful in cases where execution of a task involves some waiting, i.e. only useful when a thread is busy doing something else except using the processor, like doing I/O, which is taking time, and thread is waiting and cannot use processor. To make use of the idle processor, context switching happens and the other thread who is waiting for the CPU, gets the CPU time. 
Therefore, threading allows python to execute other code while waiting; this is easily simulated with the sleep function.

This behaviour is due to the Global Interpreter Lock (GIL) in Python.
It prevents more than one thread from running simultaneously in the Python interpreter.

