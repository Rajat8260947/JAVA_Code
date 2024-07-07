package java_pratice.Arrays;

public class EqualMatrix {
    public static void main(String[] args) {
        int row1,col1,row2,col2;
        boolean Flag =true;
        int[][]a= {
                {1,2,3},
                {8,4,6},
                { 4,5,7},
        };
        int[][]b={
                {1,2,3},
                {8,4,6},
                {4,5,7}
        };
      row1=a.length;
      col1=a[1].length;
        System.out.println(col1);
      row2=b.length;
      col2=b[0].length;
      if(row1!=row2 || col1!=col2)
      {
          System.out.println(" Matrix are not equal");
      }
       else {
          for (int i = 0; i < row1; i++) {
              for (int j = 0; j < col1; j++) {
                  if (a[i][j]!=b[i][j]) {
                      Flag=false;
                      break;


                  }

              }

          }
      }
      if (Flag==true)
      {
          System.out.println(" Matrix are equal");
      }
      else
          System.out.println(" Matrix are not equal");
    }

}
