package coreprogramming.methods.level1;
import java.util.*;

/*
 * This class calculates the wind chill factor, which represents how cold air feels
 * when combined with wind speed. It demonstrates practical meteorological calculations
 * and the formula: windChill = 35.74 + 0.6215*temp - 35.75*(speed^0.16) + 0.4275*temp*(speed^0.16)
 */
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.println(windChill);
        sc.close();
    }

    // Applies wind chill formula: 35.74 + 0.6215*T + (0.4275*T - 35.75)*V^0.16
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature +
                (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}

