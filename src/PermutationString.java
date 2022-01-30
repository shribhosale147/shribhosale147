import java.util.Arrays;

public class PermutationString {
    public static void main(String args[]){
        String s=new String("batt");
        String t=new String("tabt");

        if (s.length()!=t.length()){
            System.out.println("The two strings are not permutations");
        }
        char str[]=s.toCharArray();
        Arrays.sort(str);
        s=new String(str);

        char str2[]=t.toCharArray();
        Arrays.sort(str2);
        t=new String(str2);

        if (s.equals(t)){
            System.out.println("Yes it is per");
        }else {
            System.out.println("Not per");
        }

    }

}
