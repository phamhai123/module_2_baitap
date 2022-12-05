public class MyClass {
    static public int X = 2;

    public static void main(String[] args) {
        try {
            return;
        }
        finally{
            System.out.println( "Finally" );
        }
    }
}
