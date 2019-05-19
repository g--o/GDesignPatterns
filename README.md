# GDesignPatterns (G_O Design Patterns)

These are my own design patterns that I find useful.
As most design patterns for languages are mostly established these are more neiche.

## Currently Commited:

### Authentication pattern

[Java] A pattern that combines the proxy & factory patterns to make code that allows
selective access to class methods depending on the object at hand.
The purpose is making sure your code is both OOP correct (encapsulation), and fool proof.
This way, you can make your library and hand it to your clients without fear.
The choice of Java is due to it's casting rules. Any language with similar concepts can use this pattern.

Example:

Imagine writing a driver in which writing to a certain register before making a proper setup can be harmful to the hardware itself.
Using the Authentication pattern the code itself does not compile when attempting something like this!
Instead of unecessarily long documentation and warnings, the code is self explanatory and is fool proof.

## Suggestions

Feel free to suggest improvements. Also link me if a pattern was documented properly earlier, so I can add it.

## Links

TBD

