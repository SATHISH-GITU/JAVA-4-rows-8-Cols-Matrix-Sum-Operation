import java.awt.*;
import java.util.Scanner;

public class MATRIXER {
    protected void Matrix(){
        int A[][][][][]=new int[2][2][2][2][2];
        int B[][][][][]=new int[2][2][2][2][2];
        int C[][][][][]=new int[2][2][2][2][2];
        int d[][][][][]=new int[2][2][2][2][2];
        Scanner sathish=new Scanner(System.in);
        System.out.println("Enter the First Matrix data");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                                 A[i][j][k][l][m]=sathish.nextInt();
                        }
                    }
                }
            }
        }
        System.out.println("Enter the Second Matrix: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                            B[i][j][k][l][m]=sathish.nextInt();
                        }
                    }
                }
            }
        }
        System.out.println("Enter the Third Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            C[i][j][k][l][m] = sathish.nextInt();
                        }
                    }
                }
            }
        }
        System.out.println("First Matrix Element");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                            System.out.print(A[i][j][k][l][m]+" ");
                        }
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println("Second Matrix Element");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                            System.out.print(B[i][j][k][l][m]+" ");
                        }
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println("Third Matrix Element");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                            System.out.print(C[i][j][k][l][m]+" ");
                        }
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println("Addition Operation of the Given set Of Matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    for(int l=0;l<2;l++){
                        for(int m=0;m<2;m++){
                            d[i][j][k][l][m]=A[i][j][k][l][m]+B[i][j][k][l][m];
                            System.out.print(d[i][j][k][l][m]+ " ");
                        }
                    }
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args){
        MATRIXER lovematrix=new MATRIXER();
        lovematrix.Matrix();
    }
}
