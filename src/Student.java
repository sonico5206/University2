public class Student extends Person implements Notifiable {
    private String login;
    private String email;

    public Student(String name, String login, String email) {
        super(name);
        this.login = login;
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public String getEmail() {
        return this.email;
    }

    public void notify(String message) {
        System.out.println("I am ready" + message);
    }
}