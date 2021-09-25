// A simple chatbot that says hello, asks a question and then says goodbye

// Print a greeting (a hello message)
//
public static void helloMessage ()
{
    System.out.println("Hello, My name is Chatty. I’m a chatbot.");
    return;
} // END helloMessage

// Ask questions and respond to the answers
//
public static void askQuestions ()
{
    //declaring variables
    String name;
    String musicType;
    String yn;
    
    // Asking questions here
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("What's your name?");
    name = scanner.nextLine();
    
    System.out.println("Hi there " + name + ". How are you?");
    scanner.nextLine();
    
    System.out.println("I'm glad to hear it " + name);
    System.out.println("What subject are you doing?");
    scanner.nextLine();
    
    System.out.println("I nearly took Computer Science but in the end I went for Linguistics.");
    System.out.println("What type of music do you like?");
    musicType = scanner.nextLine();
    
    System.out.println("I like " + musicType + " music too");
    System.out.println("Do computers worry you?");
    yn = scanner.nextLine();
    
    System.out.println("Why do you say " + yn +"?");
    scanner.nextLine();
    
    System.out.println("Really? I think that too.");
    
    return;
} // END askQuestions


// Print a salutation (a goodbye message)
//
public static void goodbyeMessage ()
{
    System.out.println("Oops. Thats my phone, I have to go now. I've enjoyed talking with you.");
    System.out.println("Oh, no ... I'm disappearing");
    return;
} // END goodbyeMessage

// A friendly chatbot that greets, asks questions, responds to answers and says goodbye
//
public static void mychatbot4 ()
{
    helloMessage();
    askQuestions();
    goodbyeMessage();
    return;
} // END hellomessage

mychatbot4();
