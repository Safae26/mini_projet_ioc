package net.safae.ext;

import net.safae.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getTauxConversion(String from, String to) {
        // Version alternative avec des constantes légèrement différentes
        if (from.equalsIgnoreCase("C") && to.equalsIgnoreCase("F")) {
            return 1.8001; // Légère variation pour démontrer l'injection
        }
        return 0;
    }
}
