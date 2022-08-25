package MyPack.Task1;

public class Worker {

    private String name;
    private String surname;
    private String fathersName;
    private String post;
    private String email;
    private String phoneNum;
    private int age;

    public Worker(String name, String surname, String fathersName, String post, String email, String phoneNum, int age){
        this.name = name;
        this.surname = surname;
        this.fathersName = fathersName;
        this.post = post;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
    }

    public void info(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Father's name: " + fathersName);
        System.out.println("Post: " + post);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNum);
        System.out.println("Age: " + age);
        System.out.println("---------------------------------------------------------------------------");
    }
}
