import java.util.Arrays;
public class Runner {

    public static void main(String[] args) {
        String[][] seats =
                {{"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}};

        seats[1][2] = "Paul";

        String temp = seats [0][0];
        seats [0][0] = seats [2][3];;
        seats [2][3] = temp;

        String [] x = seats [1];
        seats [1] = seats [0];
        seats [0] = x;

        for (String [] inner : seats) {
            System.out.println(Arrays.toString(inner));
        }
        System.out.println(seats[0][2] + seats[2][0]);


        int [][] arr1 = new int [2][3];
        int [][] arr2 = new int [3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for (int [] inner : arr1) {
            System.out.println(Arrays.toString(inner));
        }

        arr2[0][0] = 1;
        arr2[0][1] =4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;
        for (int [] inner : arr2) {
            System.out.println(Arrays.toString(inner));
        }



    }

}
