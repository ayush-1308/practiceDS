package Practice.subsec;

import java.util.ArrayList;

public class SUBSEc {
    public static void main(String[] args) {
        //subsec("", "abc");
        //System.out.println(subsecRet("", "abc"));
        System.out.println(subsecAsciiRet("", "abc"));
        // ascii();
        //subsetAscii("", "abc");
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

    // print the subsets and their ascii values;
    public static void ascii(){
        char ch = 'a';
        System.out.println(ch + 0); // it will print the ascii value of a as their is ongoing addition for a + 0 i.e 97 + 0;
    }

     static void subsetAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsetAscii(p + ch, up.substring(1));
        subsetAscii(p , up.substring(1));
        subsetAscii(p + (ch+0), up.substring(1));
    }

    // now the same with array list subset + ascii
    public static ArrayList<String> subsecAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subsecAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subsecAsciiRet(p, up.substring(1));
        ArrayList<String> third = subsecAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
