package com.example;
// Java program to demonstrate Need for
// Anonymous Inner class

// Interface // also called abstract class
interface AnonymousInnerclass
{
        // Defining variables and methods
        int x = 21;
        void getAge();
}

// Class 1
// Helper class implementing methods of Age Interface
    class MyClass implements AnonymousInnerclass {

        // Overriding getAge() method
        @Override public void getAge()
        {
            // Print statement
            System.out.print("Age is " + x);
        }
}


