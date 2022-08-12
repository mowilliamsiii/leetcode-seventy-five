package dayone;

import java.util.*;

//https://leetcode.com/problems/spiral-matrix/

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        if(matrix.length == 0){
            return result;
        }

        int rowBegin = 0;
        int endRow = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[0].length - 1;

        while(rowBegin <= endRow && columnBegin <= columnEnd){

            for(int i = columnBegin; i <= columnEnd; i++){
                result.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for(int i = rowBegin; i <= endRow; i++){
                result.add(matrix[i][columnEnd]);
            }

            columnEnd--;

            if(rowBegin <= endRow){
                for(int i = columnEnd; i >= columnBegin; i--){
                    result.add(matrix[endRow][i]);
                }
            }

            endRow--;

            if(columnBegin <= columnEnd){
                for(int i = endRow; i>= rowBegin; i--){
                    result.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }

        return result;
    }
}
