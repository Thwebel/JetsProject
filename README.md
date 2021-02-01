# Jets Project

## Overview
This project demonstrates the core concepts of object oriented programming at work.
Abstraction, polymorphism, inheritance, and encapsulation were used to create a
functional menu for fictional Airfield. This airfield is instantiated and populated
at run time with five Jet objects via parsed information from a text
file stored at the root of this project. From this point control is passed to the
user. They may select options tied to method calls in order to display information
about the jets, demonstrate jet behaviors, compare and select jets based on their
state, and add or remove jets from the air fleet.

## Topics
### Encapsulation
This project strives for the smallest possible visibility in every aspect.
Ensuring private fields are exclusively accessed through public method protects
these fields from accidental change.

### Inheritance and polymorphism
Jets project could not function without the dynamic duo of inheritance and
polymorphism. Three Jet classes extend the abstract class Jet. Inheritance secures
all jet classes possess basic qualities shared by all jets; this allows for the
**distinction** between jets types to be at the forefront of these classes. While
distinct, polymorphism allows these Jet types to be stored and acted upon by a single
ArrayList, saving untold amounts of time and energy while obtaining and displaying
information about all Jets.

### Abstraction
Abstraction is used consistently throughout Jets Project to demand each class
is distilled into the essential characteristics of their real world counterparts.
Successful abstraction would not be possible without inheritance. Inheritance allows
behavior and aspects of real life objects to be refine with each extension through
the hierarchical tree, thus ensuring the successful clearing of extraneous concepts
and a focus on the fundamental pieces of an abstracted object.

## Lessons Learned
* Importance of planning before coding.
* Utilizing the core concepts of OOP.
* The power of implementing interfaces.
* The need to catch exceptions in order to protect the user experience and ensure functional code.
