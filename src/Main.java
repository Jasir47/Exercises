class exercise {
    int a = 3;
    class exe{
        int d = 4;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        exercise e = new exercise();
        exercise.exe ee = e.new exe();
        System.out.println(e.a+" "+ee.d);
    }
}
