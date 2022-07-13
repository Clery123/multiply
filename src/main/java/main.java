public class main {


    public static void main(String[] args){
        mult mlt = new mult();
        if(args[2].equals("alg1"))
            System.out.println(mlt.multiplyBigInt(args));
        else if(args[2].equals("alg2"))
            System.out.println(mlt.multiply(args));
    }
}
