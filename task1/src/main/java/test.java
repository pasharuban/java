package main.java;

import CustomUtils.Matrix;

public class test {
   public static void main(String[] args)
   {
      double[][]arr={{1,2,3},{4,5,6},{7,8,9}};
      double[][]arr1={{3,2,4},{1,6,3}};
      var a=new Matrix(arr);
      var b=new Matrix(arr);
      var c=new Matrix(2,2);
      for(int i=0;i<b.getRows();i++) {
         for (int j = 0; j < b.getCols(); j++) {
            System.out.print(b.get(i, j));
            System.out.print(" ");
         }
         System.out.println();
      }
       b =b.reverse();

      System.out.println();
      for(int i=0;i<b.getRows();i++)
      {
         for(int j=0;j<b.getCols();j++)
         {
            System.out.print(b.get(i,j));
            System.out.print(" ");
         }
         System.out.println();
      }
   }
}