class FinallizeEx{
    public void finallizeex(){
        System.out.println("Finallize called");
    }

    public static void main(String[] args) {
        FinallizeEx f1 = new FinallizeEx();
        FinallizeEx f2 = new FinallizeEx();
        f1 = null;
        f2 = null;
        System.gc;
    }
}