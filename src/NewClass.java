import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class NewClass {
    //Colors
    private final String BLUE = "\u001B[36m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\033[0;34m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";

    //Emoji
    private final String IRANIAN_CURRENCY = "\uFDFC";
    private final String USA_CURRENCY = "\uD83D\uDCB5";
    private final String BRITISH_CURRENCY = "\uD83D\uDCB7";
    private final String EUROPE_CURRENCY = 	"\uD83D\uDCB6";
    private final String JAPAN_CURRENCY = "\uD83D\uDCB4";

    //Name
    private String name;

    public NewClass(String name) {this.name = name;}

    public void start(){
        System.out.println(RED + "SO " + BLUE + name + PURPLE + "\nit seems you" + RED +  " have a lot of money");
        System.out.println(CYAN + "Lets see what" + BROWN + " you have");
    }

    public void printCurrency(){
        System.out.println(WHITE + "USD: " + USA_CURRENCY);
        System.out.println("RIAL: " + IRANIAN_CURRENCY);
        System.out.println("POUND: " + BRITISH_CURRENCY);
        System.out.println("EURO: " + EUROPE_CURRENCY);
        System.out.println("YEN: " + JAPAN_CURRENCY);
    }

}
