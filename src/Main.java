class outerClass {
    int a = 3;
    class innerClass{
        int d = 4;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        outerClass myOuter = new outerClass();
        outerClass.innerClass myInner = myOuter.new innerClass();
        System.out.println(myOuter.a+" "+myInner.d);
    }
}
