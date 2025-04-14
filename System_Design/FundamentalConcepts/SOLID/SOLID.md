## The SOLID Principles

## S — Single Responsibility
A class should have a single responsibility
If a Class has many responsibilities, it increases the possibility of bugs because making changes to one of its responsibilities, could affect the other ones without you knowing.

## O — Open-Closed
Classes should be open for extension, but closed for modification
Changing the current behaviour of a Class will affect all the systems using that Class.
If you want the Class to perform more functions, the ideal approach is to add to the functions that already exist NOT change them.


## L — Liskov Substitution

If S is a subtype of T, then objects of type T in a program may be replaced with objects of type S without altering any of the desirable properties of that program.
When a child Class cannot perform the same actions as its parent Class, this can cause bugs.
If you have a Class and create another Class from it, it becomes a parent and the new Class becomes a child. The child Class should be able to do everything the parent Class can do. This process is called Inheritance.
The child Class should be able to process the same requests and deliver the same result as the parent Class or it could deliver a result that is of the same type.

## I — Interface Segregation
Clients should not be forced to depend on methods that they do not use.
When a Class is required to perform actions that are not useful, it is wasteful and may produce unexpected bugs if the Class does not have the ability to perform those actions.
A Class should perform only actions that are needed to fulfil its role. Any other action should be removed completely or moved somewhere else if it might be used by another Class in the future.

## D — Dependency Inversion
- High-level modules should not depend on low-level modules. Both should depend on the abstraction.
- Abstractions should not depend on details. Details should depend on abstractions.





