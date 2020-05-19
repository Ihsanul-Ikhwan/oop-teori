// program java untuk menkonvert objek ke bentuk primitif
// mengkonvert dari Integer ke int

public class unboxing {
    public static void main(String[] args) {
        // proses mengubah dari Intgeger ke bentuk int
        Integer a = new Integer(4); // instansiasi kelas java.lang.Integer
        int b = a.intValue();   // convert Integer ke int secara langsung
        int c = a; // unboxing, compiler menuliskan perintah a.intValue() secara Internal

        System.out.println(a+" "+b+" "+c);
    }
}
