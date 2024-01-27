package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int i = 0;
        int a = 0;
        int b = 0;
        int aEqu = 0;
        int j=0;
        int k=0;
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");}
            else if (lastInRow < 0) {
                System.out.println("last number in row is negative");}
        else if (numberToSkip == lastInRow) {{
            do{aEqu=aEqu+i;
            i++;}
            while (i<=lastInRow);}
            System.out.println("skipped sum is " + aEqu);
            System.out.println("counted sum is " + 0);}


            else{{
                    do {i++;
                        if (i%numberToSkip==0){j=i;a+=j;
                            continue;}
            k=i;b+=k;
                    }

                    while (i < lastInRow);
                }
        System.out.println("skipped sum is " + a);
        System.out.println("counted sum is " + b);}
    }

        public static void main (String[]args){
                int numberToSkip = 10;
        int lastInRow = 10;
        printSumOfTwoRanges(numberToSkip, lastInRow);
    }

}
