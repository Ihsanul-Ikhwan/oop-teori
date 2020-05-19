package wrapperclass;

/**
 * wrapperclass.wrapperclass.autoboxing
 * Program Java untuk mengkonvert primitive ke Objek
 */
public class autoboxing {

    public static void main(String[] args) {
        int a=69;
        Integer b = Integer.valueOf(a); // mengubah integer ke bentuk eksplisitnya
        Integer c = a; // wrapperclass.wrapperclass.autoboxing, dimana compiler akan menulis Integer.valueOf(a) secara internal

        System.out.println(a+" "+b+" "+c);
    }
}
