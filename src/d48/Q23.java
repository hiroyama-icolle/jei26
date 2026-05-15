package src.d48;

public class Q23 {
    public static void main(String[] args){
        int i = 1;
        for(;;){ // 無限に繰り返される処理
            i = i + 3;
            if( i < 10){
                System.out.println(i); // 「4」「7」が表示されるようにコードを修正
                continue; // 次のループへ
            } else {
                break; // ループの終了
            }
            // System.out.println(i);←到達不能なのでコメントアウトしたよ
        }
    }
}
/*
Javaは到達不能なコードがある場合、コンパイルエラーとなる
 */