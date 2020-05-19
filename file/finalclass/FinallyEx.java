package finalclass;

class FinallyEx{
    public static void main(String[] args) {
        try{
            int x = 696969;
        } catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}