package net.safae.metier;

import net.safae.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {

    // Injection par champ
    @Autowired
    private IDao dao;

    // Injection par constructeur
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    // Injection par setter
    @Autowired
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double convertir(String from, String to, double valeur) {
        double taux = dao.getTauxConversion(from, to);

        if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
            return valeur * taux + 32;
        } else if (from.equalsIgnoreCase("F") && to.equalsIgnoreCase("C")) {
            return (valeur - 32) * taux;
        } else if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("K")) {
            return valeur + 273.15;
        }

        throw new IllegalArgumentException("Conversion non supportée");
    }
}
