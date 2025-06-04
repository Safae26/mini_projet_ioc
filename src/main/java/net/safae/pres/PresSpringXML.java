package net.safae.pres;

import net.safae.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        IMetier metier = (IMetier) context.getBean("metier");

        double tempF = 212;
        double tempC = metier.convertir("F", "C", tempF);
        System.out.println(tempF + "°F = " + tempC + "°C");

        context.close();
    }
}

