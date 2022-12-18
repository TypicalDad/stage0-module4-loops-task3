package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
            if(secondBoarder<0 || firstBoarder<0){
                secondBoarder*=-1;
            }
            if(secondBoarder>firstBoarder){
                secondBoarder = secondBoarder + firstBoarder;
                firstBoarder = secondBoarder - firstBoarder;
                secondBoarder =secondBoarder - firstBoarder;
            }
            if(secondBoarder==firstBoarder){
                secondBoarder +=1;
            }
            for(int i = 0; i<=(firstBoarder-secondBoarder)+1;i++){
                sum += i;
            }
            System.out.println(sum);
    }
}
