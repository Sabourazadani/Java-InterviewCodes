module InterviewQuestions {
	
	/**
	   1. Overloading V/s Constructor Chaining? 
	   --> Constructor overloading allows a class to have more than one constructor that have the same 
	   	   name as that of the class but differ only in terms of number or type of parameters. 
	   --> Constructor chaining is a process of calling the one constructor from another constructor 
	   	   with respect to current object.
	   		The real purpose of Constructor Chaining is that you can pass parameters through a bunch
	    	of different constructors, but only have the initialization done in a single place. 
	    	
	    2. How To Access Private Variables? 
	    --> By using Public Method
	    	We can access a private variable in a different class by putting that variable with in 
	    	a Public method and calling that method from another class by creating object of that class.
	    
	    --> By Using Inner class
	    --> By Using Properties
	    
	    3. Java annotation
	    --> Metadata is data about data. So annotations are metadata for code. ... 
	    	Annotation is a special kind of Java construct used to decorate a class, method, field, 
	    	parameter, variable, constructor, or package. 
	    	
	    	@Override @Override annotation informs the compiler that the element is meant to override 
	    	an element declared in a superclass. 
	    	Overriding methods will be discussed in Interfaces and Inheritance.
	    	 While it is not required to use this annotation when overriding a method, it helps to 
	    	 prevent errors.
	    	
	    4. What is super keyword? 
	    --> The super keyword refers to superclass (parent) objects. 
	    	It is used to call superclass methods, and to access the superclass constructor.
	    	The most common use of the super keyword is to eliminate the confusion between superclasses 
	    	and subclasses that have methods with the same name.
	    	
	    5. Difference between super and super() ?
	    --> The super keyword in java is a reference variable that is used to refer parent class objects.
	     	The keyword “super” came into the picture with the concept of Inheritance. 
	     	Basically this form of super is used to initialize superclass variables when there is no 
	     	constructor present in superclass. 
	     	On the other hand, it is generally used to access the specific variable of a superclass.
	     	
	     	Super () can also be used to access the parent class constructor by adding ‘()’ after it, 
	     	i.e. super(). One more important thing is that ‘super()’ can call both parametric as well as
	     	 non-parametric constructors depending upon the situation.
	     
	     6. This keyword?
	     --> The this keyword refers to the current object in a method or constructor.
	     	 The most common use of the this keyword is to eliminate the confusion between
	     	 class attributes and parameters with the same name (because a class attribute
	     	  is shadowed by a method or constructor parameter).
	     	
	     	--> this can also be used to:
	     		Invoke current class constructor
				Invoke current class method
				Return the current class object
				Pass an argument in the method call
				Pass an argument in the constructor call
				
			--> this keyword is used to refer always current object
			--> this() is used to access one constructor from another where both constructors belong
			 	to the same class
				
		 7. Abstraction is a process of hiding the implementation details from the user. 
		 Only the functionality will be provided to the user. In Java, abstraction is achieved using
		  abstract classes and interfaces. ... Abstraction is one of the four major concepts 
		  behind object-oriented programming (OOP).
		  
		  Abstract class in Java
          A class which is declared as abstract is known as an abstract class. 
          It can have abstract and non-abstract methods. It needs to be extended and its method 
          implemented. It cannot be instantiated.
          
          --> Points to Remember
			An abstract class must be declared with an abstract keyword.
			It can have abstract and non-abstract methods.
			It cannot be instantiated.
			It can have constructors and static methods also.
			It can have final methods which will force the subclass not to change the body of the method.
			
			--> Interface in Java
			Interface
			Example of Interface
			Multiple inheritance by Interface
			Why multiple inheritance is supported in Interface while it is not supported in case of class.
			Marker Interface
			Nested Interface
			An interface in Java is a blueprint of a class. It has static constants and abstract methods.

	 */
}