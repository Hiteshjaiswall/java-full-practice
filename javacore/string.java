public class string {
    public static void main(String[] args){
        // String str = new String("hitesh");
        String str="hitesh";
        String str2="hitesh";
        // System.out.println(str.charAt(3));
        System.out.println(str==str2);
        // stringbuffer and stringbuilder
        StringBuilder sb= new StringBuilder("hitesh");
        sb.deleteCharAt(0);
        sb.append(" jaiswal");
        System.out.println(sb.toString());
        // String str3=str.concat(" kumar");
        // System.out.println(str3);
        String str4="hitesh kumar";
    }
}
