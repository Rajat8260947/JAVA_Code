package com.kunal.file;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
//   try(InputStreamReader isr =new InputStreamReader(System.in)) {
//       System.out.println("Enter Some letters :");
//       int letters = isr.read();
//       while (isr.ready()) {
//           System.out.println((char) letters);
//           letters = isr.read();
//       }
//
////       isr.close();
////       System.out.println();
//   }
//   catch (IOException e){
//       System.out.println(e.getMessage());
//   }
//   try(FileReader fr =new FileReader("new-file.txt")) {
//
//       int letters = fr.read();
//       while (fr.ready()) {
//           System.out.println((char) letters);
//           letters = fr.read();
//       }
//
////      // fr.close();
//       System.out.println();
//   }
//   catch (IOException e){
//       System.out.println(e.getMessage());
//   }
        // Byte to char and then read the character
//   try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//       System.out.println("Enter something");
//       System.out.println("You Typed: " + br.readLine());
//   }
//   catch (IOException e){
//       System.out.println(e.getMessage());
//   }

//        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
//            osw.write("Hello  World");
//            osw.write(97);
//            osw.write(10);
//            osw.write('A');
//            osw.write('\n');
//            char[] arr ="helllo  world" .toCharArray();
//            osw.write(arr);
//        }
//        catch (IOException e){
//       System.out.println(e.getMessage());
//   }


        //create

        try{
            File  fo =new File("new-file.txt");
            fo.createNewFile();
        }
        catch (IOException e){
       System.out.println(e.getMessage());
   }
         // write
        try{
            FileWriter  fw= new FileWriter("new-file.txt");
            fw.write("Gyan ranjan Sahoo");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
