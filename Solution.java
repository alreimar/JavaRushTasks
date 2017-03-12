/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first = reader.readLine();
        int n = Integer.parseInt(first);

        int m = Integer.parseInt(reader.readLine());
        //System.out.println(m + n);
              for (int i = 1; i<=m; i++){ // method for with integer i do one step and wright 8 in line, go to the next cycle for j and wright
                  // one else 8, ny the end of this cycle he goes to the next line

             for (int j =1; j<=n; j++){
                 System.out.print("8");
             }System.out.println("");
        }
    }
}
