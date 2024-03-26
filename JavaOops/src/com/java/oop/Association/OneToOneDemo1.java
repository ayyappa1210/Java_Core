package com.java.oop.Association;

class Person {
    private String name;
    private Passport passport;

    public Person(String name) {
        this.name = name;
    }

    // Getter and setter for passport
    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    

    // Other methods...
}

class Passport {
    private String passportNumber;
    private Person owner;

    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    // Getter and setter for owner
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
    
    

    // Other methods...
}

public class OneToOneDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person person = new Person("John");
	        Passport passport = new Passport("123456789");
	        
	        // Establishing the association
	        person.setPassport(passport);
	        passport.setOwner(person);
	        
	        // Accessing the associated objects
	        System.out.println("Person: " + person.getName() + ", Passport: " + person.getPassport().getPassportNumber());
	        System.out.println("Passport: " + passport.getPassportNumber() + ", Owner: " + passport.getOwner().getName());

	}

}
