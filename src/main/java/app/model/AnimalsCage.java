package app.model;

import app.model.Animal;
import app.model.Timer;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    private Dog animal;
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
//        System.out.println(timer.getTime() + " я тимер!");
    }
}
