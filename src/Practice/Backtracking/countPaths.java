package Practice.Backtracking;

import java.util.ArrayList;

public class countPaths {
    public static void main(String[] args) {
        System.out.println(countPath("", 3, 3));
    }

    public static ArrayList<String> countPath(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(countPath(p + 'D', r - 1, c));
        }

        if(c > 1){
            list.addAll(countPath(p + 'R', r, c - 1));
        }
        return list;
    }

    public static ArrayList<String> countPathWithDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r > 1){
            list.addAll(countPathWithDiagonal(p + 'D', r - 1, c));
        }

        if(r > 1 && c > 1){
            list.addAll(countPathWithDiagonal(p + 'd', r - 1, c - 1));
        }

        if(c > 1){
            list.addAll(countPathWithDiagonal(p + 'R', r, c - 1));
        }
        return list;
    }
}
