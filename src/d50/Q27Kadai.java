package d50;

public class Q27Kadai {
    static void main(String[] args) {
        int control = 2; // 2に変更
        String mode;

        switch(control){
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break; // case 2 が実行された後、defaultに処理が移らないようbreakをつけておく
            default:
                mode = "Wind";
                break;
        }
        System.out.println(mode); // Cool が出力された

    }
}
