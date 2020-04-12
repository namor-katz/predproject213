package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component(value = "dog")
//@Bean(name="dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
