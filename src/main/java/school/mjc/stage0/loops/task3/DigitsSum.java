package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
            int result = 0;
            String numb = ""+t;
            int[] myArray;
            myArray = new int[numb.length()];
            for (int i =1;i<=numb.length();i++){
                myArray[numb.length()-i] = t %10;
                t /= 10;
            }
            for (int i =0;i<numb.length();i++){
                result+=myArray[i];
            }
            if(result<0){
                result *= -1;
            }
            System.out.println(result);
    }
}
