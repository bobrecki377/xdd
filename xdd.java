

import java.util.Scanner;

public class Problem610A {
    public static void solution() {

        //System.out.println("podaj n");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if(n%4==0){
            System.out.print((n/4)-1);
            for(int i=1;i<(n/4);i++){
                System.out.printf(", {%d, %d, %d, %d}",i,i,(n/2)-i,(n/2)-i);
            }
        } else if (n%4==2) {
            System.out.print(n/4);
            for(int i=1;i<=(n/4);i++){
                System.out.printf(", {%d, %d, %d, %d}",i,i,(n/2)-i,(n/2)-i);
            }
        } else {
            System.out.println(0);
        }


    }
}
