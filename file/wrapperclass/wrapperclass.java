package wrapperclass;

// kelas yang mengkonvert semua jenis tipe data primitive ke bentuk
// wrapper object dan vice-versa
public class wrapperclass {
    public static void main(String[] args) {
        // tipe data primitif
        byte b = 16;
        short s = 30;
        int i = 69;
        long l = 400;
        float f = 99.0F;
        double d = 10.3E3;
        char c = 'a';
        boolean b2 = false;

        // Autoboxing: Mengubah bentuk primitif ke
        // bentuk objek
        Byte byteob = b;
        Short shortob = s;
        Integer intob = i;
        Long longob = l;
        Float floatob = f;
        Double doubleob = d;
        Character charob = c;
        Boolean boolob = b2;

        // menuliskan masing-masing objek
        System.out.println("##Printing nilai objek##");
        System.out.println("Objek Byte: " + byteob);
        System.out.println("Objek Short: " + shortob);
        System.out.println("Objek Integer: " + intob);
        System.out.println("Objek Long: " + longob);
        System.out.println("Objek Float: " + floatob);
        System.out.println("Objek Double: " + doubleob);
        System.out.println("Objek Character: " + charob);
        System.out.println("Objek Boolean: " + boolob);

        // Unboxing: Mengubah bentuk Objek ke
        // bentuk primitif
        byte bytevalue = byteob;
        short shortvalue = shortob;
        int intvalue = intob;
        long longvalue = longob;
        float floatvalue = floatob;
        double doublevalue = doubleob;
        char charvalue = charob;
        boolean boolvalue = boolob;

        // menuliskan primitif kembali
        System.out.println("++Printing nilai primitif++");
        System.out.println("Objek byte: " + bytevalue);
        System.out.println("Objek short: " + shortvalue);
        System.out.println("Objek integer: " + intvalue);
        System.out.println("Objek long: " + longvalue);
        System.out.println("Objek float: " + floatvalue);
        System.out.println("Objek double: " + doublevalue);
        System.out.println("Objek char: " + charvalue);
        System.out.println("Objek boolean: " + boolvalue);
    }
}