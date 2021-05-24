import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("nhập chuỗi:");
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            int i=0;
            System.out.print(input.charAt(i));
            while (i<input.length()-1){
                if(input.codePointAt(i)<input.codePointAt(i+1)){
                    System.out.print(input.charAt(i+1));
                }
                i++;
            }

        }
    }

