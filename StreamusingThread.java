

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamusingThread {
    public static void main(String[] args) {
        int size = 1000;
        List<Integer> list = new ArrayList<>(size);

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1000));
        }

        long startSeq=System.currentTimeMillis();
        int resSeq=list.stream().map(n -> {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            return n * 2;
        }).mapToInt(n -> n).reduce(0, (a, b) -> a + b);

        long endSeq=System.currentTimeMillis();


        long startPar=System.currentTimeMillis();
        int resPar=list.parallelStream().map(n -> {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            return n * 2;
        }).mapToInt(n -> n).reduce(0, (a, b) -> a + b);

        long endPar=System.currentTimeMillis();

        System.out.println(resSeq +" "+resPar);
        System.out.println("seq time for threads sleep method = "+(endSeq-startSeq));
        System.out.println("parallel time for threads sleep method = "+(endPar-startPar));



    }

}