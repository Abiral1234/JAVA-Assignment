# CLosable Frame
We can close the AWT Window or Frame by calling dispose() or System.exit() inside windowClosing() method. The windowClosing() method is found in WindowListener interface and WindowAdapter class.

The WindowAdapter class implements WindowListener interfaces. It provides the default implementation of all the 7 methods of WindowListener interface. To override the windowClosing() method, you can either use WindowAdapter class or WindowListener interface.

If you implement the WindowListener interface, you will be forced to override all the 7 methods of WindowListener interface. So it is better to use WindowAdapter class.

### Different ways to override windowClosing() method
There are many ways to override windowClosing() method:

By anonymous class
By inheriting WindowAdapter class
By implementing WindowListener interface
