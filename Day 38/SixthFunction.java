public class SixthFunction {
    public static void main(String[] args) {
        String s1="Gunjan";  
        String s2="Gunjan";  
        String s3="gunjan";  
        String s4="Batra";  
        System.out.println(s1.equals(s2));//true because content and case is same  
        System.out.println(s1.equals(s3));//false because case is not same  
        System.out.println(s1.equals(s4));//false because content is not same 
    }
}
