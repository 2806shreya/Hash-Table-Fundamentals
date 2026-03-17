
public class ParkingLot {
    String[] table = new String[500];

    public int park(String plate) {
        int hash = Math.abs(plate.hashCode()) % 500;

        while (table[hash] != null) {
            hash = (hash + 1) % 500;
        }

        table[hash] = plate;
        return hash;
    }
}