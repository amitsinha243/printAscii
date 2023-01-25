public class printAscii {
    public static void main(String[] args) {
        String str = "hodgepodge";
        int sum = 0;
        for(int i=0;i<str.length();i++){
            int asciiValue = str.charAt(i);
            sum = sum+asciiValue;
        }
        System.out.println("ASCII value of "+str+"="+sum);
    }
}