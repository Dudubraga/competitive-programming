import java.io.IOException;
import java.util.*;

public class bee3468 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.charAt(0) == 'O' || str.charAt(0) == 'o' || 
        str.charAt(0) == 'C' || str.charAt(0) == 'c'){
            System.out.println("mas");
        }else{
            System.out.println("mais");
        }

        scan.close();
    }
}

/* 3468 - Do more, but do better!
https://judge.beecrowd.com/en/problems/view/3468 */