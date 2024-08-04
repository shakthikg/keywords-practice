public class KwNative {
    public native void printMessage();

    static {
        System.loadLibrary("NativeLibrary");
    }

    public static void main(String[] args) {
        KwNative example = new KwNative();
        example.printMessage();
    }
}
