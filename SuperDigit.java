public class SuperDigit{

    public static int superDigit(String n, int k){
        if (n.length() > 1){
            long sum = 0;
            for (int i = 0; i < n.length(); i++){
                sum = sum + Character.getNumericValue(n.charAt(i));
            }
            return superDigit(Long.toString(sum * k), 1);
        }
        else{
            return Character.getNumericValue(n.charAt(0));
        }

    }

}