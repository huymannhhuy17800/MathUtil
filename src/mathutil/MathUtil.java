/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mathutil;
import static huy.util.MathUtil.computeFactorial;
/**
 *
 * @author DELL
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here:
        System.out.print("5! = " + computeFactorial(5));
        // tui muốn biết xem 5! chạy đúng hay không
        // vậy tui in kết quả xử lí của hàm ra (actual value)
        // tui so sánh nó coi có = 120 mà tui tính trước đó không ( expected value)
        // nếu hàm có 1 value trả về ( actual - giả sử 120)
        // và khớp với cái tui cần nó phải thế ( expected - giả sử mình cần hàm 
        // trả về 120)
        // actual khớp với expected, hàm chạy như mong đợi, hàm chạy đúng
        // testing chẳng qua là chạy app, chạy hàm, coi kết quả trả về nó
        // đúng như mình mong đợi hay không - actual và expected là như nhau
        // nếu không khớp,code có bug, hoặc mình kỳ vọng sai
        
        // expected: 720 mới chịu
        System.out.print("6! = " + computeFactorial(6));
        // expected: 1 mới chịu nhé
        System.out.print("0! = " + computeFactorial(0));
        
        // cách test kiểu này phải 
        // 1. chuẩn bị data đầu vào 
        // 2. gọi hàm với data đầu vào 
        // 3. tính trước kq trả về (expected)
        // so sánh kq trả về từ hàm (actual) với expected = mắt
        // tự đưa ra kết luận --> luận hàm = mắt
        
        // expected: Exception mới chịu nghe
        System.out.print("-5! = " + computeFactorial(-5));
        
        // kĩ thuật này dùng để đối chiếu kết quả, KHÔNG HIỆU QUẢ
        // vì máy có thể đối chiếu kq dc, máy so dc expected va actual
        // GIANG HỒ ĐƯA RA 1 BỘ THƯ VIỆN, 1 FRAMEWORK GIÚP MÌNH 
        // TỰ ĐỘNG SO SÁNH 2 KẾT QUẢ EXPECTED VÀ ACTUAL:
        // FRAMEWORK NÀY SẼ TỰ SO SÁNH VÀ ĐƯA RA MÀU SẮC ĐỂ HÀM Ý RẰNG 
        // HÀM CHẠY ĐÚNG, MÀU XANH
        // HÀM CHẠY SAI, KO NHƯ KỲ VỌNG, MÀU ĐỎ
        // ÁP DỤNG CHO 1 LOẠT DATA ĐẦU VÀO 
    }
    
}
