/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util;

/**
 *
 * @author DELL
 */
public class MathUtil {
    //tinh n! = 1.2.3.4....n vì n! tăng rất nhanh, sẽ tràn int sớm 
    // int chỉ lưu được tối đa 2 tỷ 1, nên mình xài long an toàn hơn
    //15! to lắm rồi, tính tối đa 15!
    public static long computeFactorial(int n){
        
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("Invalid argument n must be >=0 or n < = 15");
        if(n == 0 || n == 1)
            return 1;
        // xài else trừ điểm
        return n * computeFactorial(n - 1); // đệ quy
                                           // n! = n * (n-1)!
    }
}
