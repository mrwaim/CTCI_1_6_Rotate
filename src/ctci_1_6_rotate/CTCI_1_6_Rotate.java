/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci_1_6_rotate;

/**
 *
 * @author klsandbox
 */
public class CTCI_1_6_Rotate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int picture [][] = {{1,2,3}, {4, 5, 6}, {7, 8, 9}};
//        int picture [][] = {{1,2,3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14,15, 16}};
        int picture [][] = {{1,2,3, 4, 5}, {6, 7, 8, 9 ,10}, {11, 12, 13, 14,15}, {16, 17, 18, 19, 20}, {21,22,23,24,25}};
        
        print(picture);
        print(rotate(picture));
        print(rotateInPlace(picture));
    }
    
    public static int[][] rotate(int [][] array) {
        int [][] copy = new int [array.length][array.length];
        
        for (int ii = 0; ii < array.length; ii++) {
            for (int jj = 0; jj < array.length; jj++) {
                copy[jj][array.length - ii - 1] = array[ii][jj];
            }
        }
        
        return copy;
    }
    
    public static int[][] rotateInPlace(int [][] array) {
        
        // Notice we have 4 sides
        // We "shift" each element, 90 deg, and the last one will come back to us

        int len = array.length;
        
        int extra = array.length % 2 == 0 ? 0 : 1;
        
        for (int ii = 0; ii < len / 2 + extra; ii++)
        {
            for (int jj = 0; jj < len / 2; jj++)
            {
                System.out.println("ii:" + ii + " jj:" + jj);
                int a = array[ii][jj];
                int b = array[jj][len - ii - 1];
                int c = array[len - ii - 1][len - jj - 1];
                int d = array[len - jj - 1][ii];
                array[jj][len - ii - 1] = a;
                array[len - ii - 1][len - jj - 1] = b;
                array[len - jj - 1][ii] = c;
                array[ii][jj] = d;
            }
        }
        
        return array;
    }
    
    public static void print(int array[][]) {
        for (int ii = 0; ii < array.length; ii++) {
            for (int jj = 0; jj < array[ii].length; jj++) {
                System.out.print(String.format("%3d", array[ii][jj]));
            }
            
            System.out.println();
        }
    }
    
}
