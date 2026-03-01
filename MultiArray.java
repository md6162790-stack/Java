class MultiArray{
    public static void main(String args[]){
       /* int[][] flat=new int[2][3];
        flat[0][0]=101;
        flat[0][1]=102;
        flat[0][2]=103;
        flat[1][0]=201;
        flat[1][1]=202;
        flat[1][2]=203;
        for(int i=0;i<flat.length;i++){
            for(int j=0;j<flat[i].length;j++){
                System.out.print(flat[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }  */

        int [][] mat1={{1,2,3},{4,5,6}};
        int [][] mat2={{6,5,4},{3,2,1}};
        int[][] result={{0,0,0},{0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("for setting values i=%d and j=%d\n",i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println("");
        }
    }
}