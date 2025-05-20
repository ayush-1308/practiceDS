package Practice.Backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };

        System.out.println(mazeProblem(board, "", 0, 0));
    }

    public static ArrayList<String> mazeProblem(boolean maze[][], String p, int r, int c){
        if(r ==  maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(!maze[r][c]){
            return list;
        }

        if(r < maze.length - 1){
            list.addAll(mazeProblem(maze, p + 'D', r + 1, c));
        }

        if(c < maze[0].length - 1){
            list.addAll(mazeProblem(maze, p + 'R', r, c + 1));
        }
        return list;
    }

}
