public class Matrix {
   int[][] arr1={
           {0,1,2,3},
           {4,5,6,7},
           {8,9,10,11},
           {12,13,14,15}
   };
    int[][] arr2={
            {0,1,2,3},
            {4,5,6,7},
            {8,9,10,11},
            {12,13,14,15}
    };
    int[][]arr3;
   int row=4;
   int column=4;
   int rand_number=12;
   //constructor
    public Matrix() {
        arr3 = new int[row][column]; // Initialization

    }
   //methods
    public void addition(){
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void multiplication(){
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                arr3[i][j]=arr1[i][j]*rand_number;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Matrix obj1 =new Matrix();
        obj1.multiplication();
    }


}
/*public void output(){
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }*/


