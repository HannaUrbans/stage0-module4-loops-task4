package school.mjc.stage0.loops.task4;

public class FixMe {
    public static void main(String[] args) {
        int i=-2;
        do { i++;

            if (i % 2 == 0 ) {

                System.out.println(i);

            }

            else if (i == 7) {
                System.out.println("last");
                break;
            }}
            while (i < 100);
        System.out.println("will I be printed?");
        }
    }

////Expected output: 0 2 4 6 last will I be printed?