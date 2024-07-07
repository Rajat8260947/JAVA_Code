package java_pratice.MidTerm;

public class TwoDmatrixEqual {
    public static void main(String[] args) {
        int row1, row2, col1, col2;
        boolean flag=true;
        int[][] arr1 =
                {
                        {1, 2, 3},
                        {7, 8, 9},
                        {3, 4, 5}
                };
        int[][] arr2 =
                {
                        {1, 2},
                        {7, 8,9},
                        {3, 4, 5}
                };
        row1 = arr1.length;
        row2 = arr1.length;
        col1 = arr1[0].length;
        col2 = arr2[0].length;

        if (row1 != row2 || col1 != col2)
        {
            System.out.println(" matrix are not equal");
        }
        else
            for (int i = 0; i < row1 ; i++) {
                for (int j = 0; j < col1; j++)
                    if (arr1[i][j] != arr2[i][j]) {
                        flag = false;
                        break;
                    }

            }

            if(flag)
            {
                System.out.println("2d matrix are  equal");
            }
            else
            {
                System.out.println(" 2d matrix are not  equal");
            }
    }
}