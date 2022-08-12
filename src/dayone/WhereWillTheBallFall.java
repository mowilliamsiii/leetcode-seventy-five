package dayone;

//https://leetcode.com/problems/where-will-the-ball-fall/

import java.util.*;

public class WhereWillTheBallFall {
    public int[] findBall(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int[] array = new int[m];

        Arrays.fill(array, -1);

        for(int i = 0; i < m; i++){
            int x = 0;
            int y = i;

            while (true){
                if(x >= n){
                    if(y >= 0 && y < m ){
                        array[i] = y;
                    }
                    break;
                }else{
                    if(y + 1 < m && grid[x][y] == 1 && grid[x][y+1] == 1){
                        x++;
                        y++;
                    }else if(y - 1 >= 0 && grid[x][y] == -1 && grid[x][y-1] == - 1){
                        x++;
                        y--;
                    }else{
                        break;
                    }
                }
            }
        }
        return array;
    }
}
