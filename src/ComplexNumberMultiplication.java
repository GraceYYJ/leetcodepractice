/**
 * Created by GraceYang on 2017/8/24.
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        int q=Integer.parseInt(a.substring(0,1));
        int w=Integer.parseInt(a.substring(2,3));
        int e=Integer.parseInt(b.substring(0,1));
        int r=a.charAt(2);
        int x=Integer.parseInt(a.substring(0,1))*b.charAt(0)-a.charAt(2)*b.charAt(2);
        int y=a.charAt(2)*b.charAt(0)+a.charAt(0)*b.charAt(2);
        System.out.println(x);
        System.out.println(y);
        return String.valueOf(x)+"+"+String.valueOf(y);
    }
    public static void main(String args[]){
        System.out.println(new ComplexNumberMultiplication().complexNumberMultiply("1+1i","1+1i"));
    }
}
