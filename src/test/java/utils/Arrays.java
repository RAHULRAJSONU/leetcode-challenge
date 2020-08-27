package utils;

public class Arrays {
    public static boolean deepEquals(int[] orig, int[] exp){
        if(orig.length!=exp.length)return Boolean.FALSE;
        for (int m = 0; m < orig.length; m++) {
            if(orig[m]!=exp[m])return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
