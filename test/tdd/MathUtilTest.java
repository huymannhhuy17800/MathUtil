/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;
import huy.util.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author DELL
 */
public class MathUtilTest {
    
   // đây là một class db, chứa các hàm, mà mỗi hàm dùng để test các hàm bên class
    // của dự án, ví dụ test hàm cF() coi chạy đúng không
    // mỗi hàm sẽ chạy 1 hoặc nhiều lệnh cF() tùy bạn, để kt coi
    // actual có khớp với expected hay ko:
    // khớp, ném ra màu xanh
    // ko khớp, ném ra màu đỏ
    // mỗi hàm là 1 hàm main() nếu nó mang phía trước một kí hiệu
    //@Test - giọ là anotation
    @Test
    public void TestSucessfulCases(){
        // hàm này gọi những cF() mà trả về 
        //Assert.assertEquals(120, 720);
        // expect 1: actual: cho tính toán khi chạy hàm
        Assert.assertEquals(1, MathUtil.computeFactorial(1));
        // expect 1, actual: cho tính toán
        Assert.assertEquals(1, MathUtil.computeFactorial(0));
        
        Assert.assertEquals(2, MathUtil.computeFactorial(2));
        
        Assert.assertEquals(6, MathUtil.computeFactorial(3));
        
        Assert.assertEquals(720, MathUtil.computeFactorial(6));
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void TestFailedCases(){
        // hàm này test những tình huống cà chớn
        // người dùng đưa 5!, tính thế nào được
        // hàm cF() phải ném về ngoại lệ, một tình huống bất thường
        // một Exception
        // Exception không phải value để assert
        // ta phải xài chiêu khác
        MathUtil.computeFactorial(-5); // ko xài assertEquals()
        // đưa -5 vào tham số, mình ( dev tk ra hàm cF() coi đây là cà chớn)
        // đập vào mặt người đưa con số -5 này vào 
        // bằng cách ném ra Ngoại lệ ArgumentException
    }
    
}
// đỏ: chỉ cần 1 thằng đỏ, là coi như cả đám đỏ, hàm chạy đúng hầu hết 
// các cases, nhưng chỉ 1 tình huống sai, coi như hàm sai
// xanh: tất cả phải xanh, hàm ý cho mọi tình huống đúng 
