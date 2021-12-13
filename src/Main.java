import com.poo.domain.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Content course1 = new Course();
        course1.setTitle("Intoduction to Java");
        course1.setDescription("Description Introduction to Java..");
        Content course2 = new Course();
        course1.setTitle("Java Advanced");
        course1.setDescription("Description Java Advanced..");
        Content mentoring = new Mentoring();   
        mentoring.setTitle("First Mentoring");
        mentoring.setDescription("How to be a Java developer");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer");
        bootcamp.setDescription("Description Java developer...");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);

        Developer dev1 = new Developer();
        dev1.setName("Maria");
        dev1.subscribeToBootcamp(bootcamp);
        
        Developer dev2 = new Developer();
        dev2.setName("Pedro");
        dev2.subscribeToBootcamp(bootcamp);

        System.out.println("Subscrived contents: "+ dev1.getSubscribedContents());
        System.out.println("Subscrived contents: "+ dev2.getSubscribedContents());

        dev1.progress();
        dev2.progress();

        System.out.println("Finished contents: "+ dev1.getFinishedContents());
        System.out.println("Finished contents: "+ dev2.getFinishedContents());

        System.out.println(dev1.calculateTotalXP());
        System.out.println(dev2.calculateTotalXP());
    }
}

