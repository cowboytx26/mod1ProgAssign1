/*
Short Description:  This program will convert Imperial distance to Metric measurements.
Author:  Brian Wiatrek
Date:  August 20, 2024
*/
public class Main {

    public static class imperialMetricConversion {
        public static double footToMeter(double foot){
            return 0.305*foot;
        }

        public static double meterToFoot(double meter){
            return 3.279 * meter;
        }
    }

    public static void main(String[] args) {

        System.out.printf("%s%10s |  %s%7s\n", "Feet","Meters","Meters","Feet");
        System.out.printf("--------------------------------\n");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-3d%10.2f  |  %d%12.2f\n", i, imperialMetricConversion.footToMeter(i), (5*(3+i)),
                    imperialMetricConversion.meterToFoot((5*(3+i))));
        }
    }
}