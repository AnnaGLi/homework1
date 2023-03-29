import java.util.Scanner;

public class Interegtill100 {

    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            int number;
            System.out.println("Enter number");

            for(int i = 2; i < 100; ++i){
                int count = 0;
                for(int j = 2; j <=i && count < 2;++j){
                    if(i%j==0){
                        ++count;
                    }
                }
                if(count<2)
                    System.out.println(i);
            }
        }
    }
}