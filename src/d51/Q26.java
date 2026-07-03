package d51;

public class Q26 {
    static void main(String[] args) {
        int n = 1;
        String s = "";
        switch(n){
            case 1:
                s += "one"; // breakがないので次のcaseも実行される
            case 2:
                s += "two"; // breakがないので次のcaseも実行される
            default:
                s += "?";
        }
        System.out.println(s);
    }
}
