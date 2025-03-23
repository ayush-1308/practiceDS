package Practice.subsec;

import java.util.ArrayList;

public class SUBSEc {
    public static void main(String[] args) {
        //subsec("", "abc");
        System.out.println(subsecRet("", "abc"));
    }

    // prints all the subsets using recursion
    public static void subsec(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsec(p + ch, up.substring(1));
        subsec(p, up.substring(1));
    }

    //now using arrayList
    public static ArrayList<String> subsecRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsecRet(p + ch, up.substring(1));
        ArrayList<String> right = subsecRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
