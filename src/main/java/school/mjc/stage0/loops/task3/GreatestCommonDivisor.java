package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
                    int realDelitel = 0;
            int delimoe = first > second ? second : first;
            for(int i = 1; i<=delimoe; i++){
                int delitel = i;
                if(first % delitel == 0 && second % delitel == 0){
                    realDelitel = delitel;
                }
            }
            System.out.println(realDelitel);
    }
}
