import java.util.ArrayList;

public class Subsequence {
    public static void main(String args[])
    {
      System.out.println(subseq("abc",""));
    }
    static void sub(String org,String p)
    {
        if(org.isEmpty() && p.isEmpty())
        {
            return;
        }
        if(org.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=org.charAt(0);
        sub(org.substring(1),p+ch);
        sub(org.substring(1),p);
    }
    static ArrayList<String> subseq(String org,String p)
    {
        if(org.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=org.charAt(0);
        ArrayList<String> left=subseq(org.substring(1),p+ch);
        ArrayList<String> right=subseq(org.substring(1),p);
        left.addAll(right);
        return left;
    }
}
