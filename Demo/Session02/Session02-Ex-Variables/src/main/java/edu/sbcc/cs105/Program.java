package edu.sbcc.cs105;

/**
 * Getting started with variables
 */
public final class Program {
    

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        // Declare and initialize variable age of type integer
        int age = 42;

        // Even though strings and ints aren't really compatible, 
        // the language will convert age before appending it (concatenation) 
        // to the rest of the string, after which it prints it out
        System.out.println("I feel like I'm " + age);

        // add to the age variable (right side of equals) and assign back to same variable
        age = age + 50;
        System.out.println("But some days it feels more like " + age);

        // Assign values to each "person"
        // In the the third case, we are reusing the variable
        String personOne = "Joe";
        String personTwo = "Julia";
        String personThree = personTwo;
        
        //printf formats the output. Each %s corresponds to one of the person variables after the string (in ordinal position)
        System.out.printf("The gang: %s, %s, and %s", personOne, personTwo, personThree);

        // We'll learn about more variables in the next couple of sessions!
    }
}
