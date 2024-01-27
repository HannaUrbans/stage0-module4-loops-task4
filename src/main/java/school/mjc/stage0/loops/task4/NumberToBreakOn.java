package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
int i=0;
if(numberToGoUntil<toBreakWith)
System.out.println("iterating till the end");

    {
        do {
            i++;
            System.out.println(i);
            if (i == toBreakWith) {
                break;
            }
        }
        while (i < numberToGoUntil);
    }

    }
    public static void main (String[]args)
    {int toBreakWith=5;
        int numberToGoUntil=10;
    printNumbersUntilWithBreakOn(toBreakWith, numberToGoUntil);}
}
//Write a program that will consume 2 args:
// the first is number to break on,
// the second to iterate till,
//
// and print all the numbers till the end,
// otherwise all numbers till toBreakWith.

