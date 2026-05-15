package src.d48;

public class Q24 {
    public static void main(String[] args){
        for(int i = 0; i < 9; i++){ // ９回繰り返すよ
            if(i % 3 != 0){ // iを３で割ったあまりが０出ないとき
                continue;
            }
            System.out.println(i);
        }
    }
}
