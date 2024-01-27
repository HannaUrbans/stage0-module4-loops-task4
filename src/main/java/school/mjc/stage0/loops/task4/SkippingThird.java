package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void printUntilButThird(int lastPrinted) {
int i=0;
if (lastPrinted<=0){System.out.print("");}
else{
        do {
            i++;

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);

        }
while(i<lastPrinted);
    }}
    public static void main  (String[]args){
        int lastPrinted=0;
        printUntilButThird(lastPrinted);
    }
}
