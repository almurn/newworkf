public class Patterns {

    public static void main(String[] args) {

        for(int i =1; i<=5; i++){
          for(int j = 1; j<=5; j++){
              System.out.print(j +" ");
          }
            System.out.println("");
        }

        System.out.println();

        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(i +" ");
            }
            System.out.println("");
        }

        System.out.println();

        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(i + j + " ");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println("Multiplication table");
        System.out.println();

        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                System.out.format("%02d ",i * j );
               // System.out.print(i * j + " ");
            }
            System.out.println("");
        }

        System.out.println();

        int count = 0;
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                count++;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }

        System.out.println();

        for(int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j +" " );

            }
            System.out.println("");
        }

        System.out.println();

        int counter = 0;
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                counter++;
                System.out.print(counter +" " );

            }
            System.out.println("");
        }

        System.out.println();
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=i; j++){

                System.out.print("*" );

            }
            System.out.println("");
        }


        System.out.println();

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=5-i+1; j++){
                System.out.print(j +" " );

            }
            System.out.println("");
        }

        System.out.println();
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5-i+1; j++){

                System.out.print("*" );

            }
            System.out.println("");
        }

        System.out.println();
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(j>=i) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println();
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(j + i > 5) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


        System.out.println();
        for(int i =1; i<=5; i++){
            for(int j = 1; j<=5; j++){
                if(j + i > 5) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }

            for(int k = 0; k<=4; k++){
                if(k + i > 4) {
                    System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }


            System.out.println("");
        }

    }

}
