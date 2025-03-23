package codeWars;

public class WhoLikesIt {
    public static void main(String[] args) {

    }

     static String whoLikesIt(String... names) {
        int length = names.length;
         return switch (length) {
             case 0 -> "no one likes this";
             case 1 -> names[0] + " likes this";
             case 2 -> names[0] + " and " + names[1] + " likes this";
             case 3 -> names[0] + ", " + names[1] + " and " + names[2] + " like this";
             default -> names[0] + ", " + names[1] + " and " + (length - 2) + " others like this";
         };
    }
}
