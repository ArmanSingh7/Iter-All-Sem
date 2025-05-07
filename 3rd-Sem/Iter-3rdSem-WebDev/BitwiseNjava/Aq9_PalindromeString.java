public class Aq9_PalindromeString {
    public static void main(String[] args) {
        String s="oko";
        System.out.println(ispali(s));
    }
    static boolean ispali(String str){
        String r="";
        boolean ans=false;
        for(int i=str.length()-1;i>=0;i--){
            r=r+str.charAt(i);
        }
        if (str.equals(r)) {
            ans=true;
            
        }
        return ans;
    }
}
