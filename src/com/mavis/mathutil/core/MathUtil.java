/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavis.mathutil.core;

/**
 *
 * @author Mavis
 */
//Class này sẽ chứa các hàm static, là tiện ích chung dùng cho các class khác!!!
public class MathUtil {

    //ham tinh n1 = 1.2.3...n
    //0! = 1! = 1 quy ước
    //vi giai thừa tăng cực nhanh, 211 tràn kiểu long (18 số 0)
    //ko có giai thừa âm
    //quy ước: n nhận vào từ 0...20!
    //viết tính giai thừa theo đệ quy
    //n! = 1.2.3.4...n
    //c1: viết kiểu for, con heo đất, nhồi dần kết quả vào 1 biến
    //product = product * i; //i chạy từ 1...n
    //c2: đệ quy - recursion
    //GỌI LẠI CHỈNH MÌNH VỚI 1 QUY MÔ/GIÁ TRỊ KHÁC
    //Búp bê của người Nga: con búp bê bự chứa con búp bê nhỏ bên trong
    //                                         con trong chứa con khác... khoảng 12 con
    //                                         lặp lại chính mình 12 lần
    //5! = ??? 1.2.3.4.5
    //5! =           4! . 5 = 5 x 4!
    //4! = 4 x 3!
    //3! = 3 x 2!
    //2! = 2 x 1!
    //1! = 1
    //n! = n x (n - 1)!
    public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1;
        //sống sót đến đây n = 2...20
        //hàm này đang tính n! mà n! = n * (n - 1)!
        return n * getFactorial(n - 1);
        //n! = n * (n - 1)!
    }
/*    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 to 20");
        if (n == 0 || n == 1)
            return 1;
        long product = 1;//tích khởi đầu là 1, biến tích lũy acc
        for (int i = 2; i <= n; i++)
            product *= i; //product = product * i
        return product;

    }*/
    //tư duy viết code theo kiểu gọi là TDD - Test Driven Development
    //Test First Development: khi viết code thì song song đó phải viết các tính huống kiểm thử code/class/kiểm thử app
    //tư duy viết code kiểm thử:
    //hàm của ta getFactorial (n đưa vào) -> trả về n! trong giới hạn long
    //ta suy nghĩ luôn tình huống kiểm thử - TEST CASE
    //TEST CASE: 1 TÌNH HUỐNG XÀI APP, TỨC LÀ ĐƯA ĐẦU VÀO APP CHỜ APP TRẢ RA KẾT QUẢ VÀ SO SÁNH APP TRẢ RA CÓ ĐÚNG KÌ VỌNG
    //TDD là kĩ thuật vừa viết code vừa suy nghĩ luôn các TEST CASE kiểm thử code
    //Case 1: n = 0, expected == getFactorial(0) == 1
    //Case 2: n = 1, expected == getFactorial(1) == 1
    //Case 3: n = 2, expected == getFactorial(2) == 2
    //Case 4: n = 3, expected == getFactorial(3) == 6
    //Case 5: n = 4, expected == getFactorial(4) == 24
    //Case ...: n = 21, expected == getFactorial(21) == Ngoại lệ vì n! quá lớn trong long ĐC
    //Case ...: n < 0, expected == getFactorial(-5) == Ngoại lệ vì k tính giai thừa âm!!!

}
