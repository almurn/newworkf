import java.util.*;

public class NumberInwords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int  n = sc.nextInt();

        int r;
        String str = "";

        while (n>0){
          r= n%10;
          n = n/10;
          str = str+r;
        }
        System.out.println(str);

        char c;
        for (int i=0; i>str.length()-1; i--){
            c= str.charAt(i);

            switch (c) {

                case 0:
                    System.out.println("0");
                    break;
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("9");
                    break;

                default:
                    System.out.println("Invalid entry");

            }

                }
            }
        }



