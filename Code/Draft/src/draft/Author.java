
public class Author {
    private String name, email, gender;

    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String toString(){
        return "Name : " + name + "\nEmail : " + email + "\nGender : " + gender;
    }
}
