package java_pratice.Oneshot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Number");
        InputStreamReader in  = new InputStreamReader(System.in);
        BufferedReader  bf = new BufferedReader(in);

        int num =Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
}
}
// System.out -> standard outputStram By deafult console
// System.in ->std is ->keyboard
//System.err -> std err -> console

