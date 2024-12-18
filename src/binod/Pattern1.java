package binod;
import com.sun.security.jgss.GSSUtil;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2 {
    public static void main(String[] args) {
        for (int line = 0; line < 5; line++) {
            for (int star = 0; star < star; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern3{
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=4;star>=line;star--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
