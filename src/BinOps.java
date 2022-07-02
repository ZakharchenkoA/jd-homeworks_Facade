public class BinOps {

    private int arg0;
    private int arg1;
    private String result;
    public String sum(String a, String b) {

    arg0 = Integer.parseInt(a, 2);
    arg1 = Integer.parseInt(b, 2);
    result = Integer.toBinaryString(arg0 + arg1);
    return result;
    }

    public String mult(String a, String b) {
        arg0 = Integer.parseInt(a, 2);
        arg1 = Integer.parseInt(b, 2);
        result = Integer.toBinaryString(arg0 * arg1);
        return result;
    }
}