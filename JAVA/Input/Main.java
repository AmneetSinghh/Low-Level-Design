package JAVA.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Character> s = new ArrayList<>();
        // read lines.

//        for(int i=1;i<=n;i++){
//            String temp = scanner.nextLine();
//            s.add(temp);
//        }


        // read words


//        for(int i=1;i<=n;i++){
//            String word = scanner.next();
//            s.add(word);
//        }
//        for(String val: s){
//            System.out.println(val);
//        }


        // read char.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter charcters");
        for(int i=1;i<=n;i++){
            char input = (char) reader.read();
            s.add(input);
        }

        for(Character c : s){
            System.out.println(c);
        }

    }
}
