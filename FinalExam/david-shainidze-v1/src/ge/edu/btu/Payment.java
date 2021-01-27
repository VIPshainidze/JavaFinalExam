package ge.edu.btu;

import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

public class Payment {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Electricity electricity = new Electricity("david123", 12.79);
        Water water = new Water("user123", 34.78);
        pay(electricity);
        pay(water);
    }

    private static <T> void pay(T arg) {
        logger.info("კომუნალური გადახდილია: " + arg);
    }
}
