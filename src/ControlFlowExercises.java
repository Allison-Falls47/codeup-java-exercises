import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//    int i = 5;
//
//    while (i <= 15) {
//        System.out.print(i + " ");
//        i++;
//    }


//    int counter = 0;
//
//    do {
//        System.out.println(counting);
//        counting += 2;
//        counting = counting + 2;
//    }while (counting <= 100);

//      int backwardsCounting = 100;
//
//      do {
//          System.out.println(backwardsCounting);
//          backwardsCounting -= 5;
//
//      }while (backwardsCounting >= -10);

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        long twoCounting = 2L;
//
//        do {
//            System.out.println(twoCounting);
//            twoCounter *= twoCounting;
//            twoCounter = twoCounting * twoCounting;
//        }while (twoCounting < 1000000L);

//        for (long i = 2L; i < 1000000L; i *= i){
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++){
//            if (i % 5 == 0 && i % 3 == 0){
//                System.out.println("fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//
//        }


//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//                System.out.printf("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//
//             System.out.printf("%-6d | %-7d | %-5d\n", i, i*i, i*i*i);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")){
//                userContinues = false;
//            }
//
//
//        }while(userContinues);


        boolean grade = true;

        do {
            System.out.println("Please enter a numerical grade from 0 - 100");

            int userGrade = scanner.nextInt();

            if (userGrade >= 88) {
                System.out.println("A");
            } else if (userGrade >= 80) {
                System.out.println("B");
            } else if (userGrade >= 67) {
                System.out.println("C");
            } else if (userGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter a new grade? (y/n)?");

            String userResponse = scanner.next();


            if (!userResponse.equalsIgnoreCase("y")){
                grade = false;
            }


        }while (grade);












    }
}
