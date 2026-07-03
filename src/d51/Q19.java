package d51;

public class Q19 {
    static void main(String[] args) {
        float f = 4.7f;
        double d = 0.86;
        double ans = f * d; // floatには代入できないため、大きい方のdoubleにする必要がある
        System.out.print(ans);
    }
}
/*
コンパイルエラーにならないようコードを修正し、
「4.0419...」と出力されるようにしてみましょう
またなぜそうなるかコメントでも記入しておきましょう

 */