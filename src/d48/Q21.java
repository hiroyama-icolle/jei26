package src.d48;

public class Q21 {
    public static void main(String[] args){
        int x, y = 25;

        x = y /= 4 + 3; // 加算(4+3) →  除算代入(y/=7) →　代入
        System.out.println(x + " " + y);
    }
}
/*
【Java　演算子の優先順位：四則演算と代入演算子】
１：乗除・剰余		* / %
２：加減		+ -
３：代入・複合代入	= /= +=などなど
※順位が小さい（上の）ものほど先に計算される
※整数同士の割り算は小数点いかが切り捨てになる
 */