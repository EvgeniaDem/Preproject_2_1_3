package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animalCageBean")
public class AnimalsCage {

    @Autowired
    @Qualifier("dogBean")
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime()); // каждый раз создается новый объект
        System.out.println(timer.getTime());       // bean singleton - один раз создался и все, он неизменный
        System.out.println("________________________");
    }
}
