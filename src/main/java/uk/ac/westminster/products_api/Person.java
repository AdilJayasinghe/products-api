package uk.ac.westminster.products_api;

/**
 * Week 1 starter class.
 *
 * Already provided:
 *   - a private "name" field
 *   - a no-argument constructor (required by Jackson later in the module)
 *   - a full constructor
 *   - a getter and setter for "name"
 *
 * TODO (Lab Activity 3):
 *   Add a new private String field called "email", following the
 *   JavaBean convention: provide a getter called getEmail().
 */
public class Person {
    private int id;
    private String name;
    private String email;

    public Person() {
    }

    public Person(int id,String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public int getID(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // TODO (Activity 3): add the "email" field and its getter here.

}
