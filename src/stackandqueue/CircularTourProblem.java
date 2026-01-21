package stackandqueue;
/*
 * CircularTourProblem
 * -------------------
 * Find starting petrol pump to complete circular tour.
 * Approach: Track surplus petrol and reset start if balance goes negative.
 */

class PetrolPump {
    int petrol, distance;
    PetrolPump(int petrol, int distance) { this.petrol = petrol; this.distance = distance; }
}

public class CircularTourProblem {

    public static int findStartPump(PetrolPump[] pumps) {
        int start = 0, balance = 0, deficit = 0;
        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4,6),
                new PetrolPump(6,5),
                new PetrolPump(7,3),
                new PetrolPump(4,5)
        };

        int start = findStartPump(pumps);
        if (start != -1) System.out.println("Start at pump index: " + start);
        else System.out.println("No possible tour.");
    }
}
