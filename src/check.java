public class check {
    public static void main(String[] args) {
        try {
            Float f = new Float("3.1");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x+b+d);
            int t = (int)Math.floor(f);
            System.out.println("t  "+t);
            System.out.println("tg  "+Math.floor(f));
        }
        catch (NumberFormatException e){
            System.out.println("bad number");
        }
    }
}
