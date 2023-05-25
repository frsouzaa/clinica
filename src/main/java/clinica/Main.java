package clinica;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import clinica.DAO.MedicoDAO;
import clinica.DAO.ReceitaDAO;
import clinica.DAO.ExameDAO;
import clinica.DAO.RecepcionistaDAO;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Programa iniciou");

        Principal principal = new Principal();
    }

}