package binod;
public class TypeOfResult {
    public static void main(String[] args) {
        byte b=4;
        int c=97;
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

        int $=24;

        double result=(f*b)+(i%c)-(d*s)+$;
        System.out.println(result);
    }

}
