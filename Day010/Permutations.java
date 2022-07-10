import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
         perms("abc","");
        //permutation("abc","",0);

    }

    static void permutation(String org, String p, int i) {
        if (org.isEmpty()) {
            System.out.println(p);
            return;
        }
        String str = org.substring(0, 1);
        if (p.isEmpty()) {
            permutation(org.substring(1), p + str, 0);
        }
        if (i == p.length()) {
            permutation(org, p + str, i + 1);
            permutation(org.substring(1), p + str, 0);
        }
        permutation(org.substring(1), p.substring(0, i) + str + p.substring(i, p.length()), i + 1);
        permutation(org.substring(1), p + str, 0);
    }

    static void perms(String org, String p) {
        if (org.isEmpty()) {
            System.out.println(p);
            return;
        }
        String str = org.substring(0, 1);
        for (int i = 0; i <= p.length(); i++) {
            perms(org.substring(1), p.substring(0, i) + str + p.substring(i, p.length()));
        }

    }
}
