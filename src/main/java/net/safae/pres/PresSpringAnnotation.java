package net.safae.pres;

import net.safae.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("net.safae");

        IMetier metier = context.getBean(IMetier.class);

        double tempC = 100;
        double tempF = metier.convertir("C", "F", tempC);
        System.out.println(tempC + "°C = " + tempF + "°F");

        context.close();
    }
}




