import java.util.Iterator;
import java.util.Set;

public class Notifier {
    private Set<Student> notifiables;

    public Notifier(Set<Student> notifiables) {
        this.notifiables = notifiables;
    }

    public void doNotifyAll(String message) {
        Iterator var2 = this.notifiables.iterator();

        while(var2.hasNext()) {
            Student stud = (Student)var2.next();
            stud.notify(message);
        }

    }
}
