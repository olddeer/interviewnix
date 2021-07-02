package com.company;

import java.util.Arrays;
import java.util.List;

import static com.company.PointPlacmentUtils.*;

public class Main {

    public static void main(String[] args) {

        int[][] cells =  {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        for (var gen: List.of(1, 2, 3)) {
            printCells(cells);
            cells = computeCells(cells);
            System.out.println();
        }
    }

    private static int[][] computeCells(int [][] cells) {
        int[][] copiedCells = Arrays.stream(cells).map(int[]::clone).toArray(int[][]::new);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if(isCellDeadAfterCompute(cells[i][j], countLiveNeighbors(cells, i, j))) {
                    copiedCells[i][j] = 0;
                } else {
                    copiedCells[i][j] = 1;
                }
            }
        }
        return copiedCells;
    }

    private static void printCells(int[][] cells) {
        System.out.println(Arrays.deepToString(cells)
                .replace("0", "\u25A1")
                .replace("1", "\u25A0")
                .replace("], ", "]\n"));
    }

    private static int countLiveNeighbors(int[][] cells, int i, int j) {
        int liveNeighborsCount = 0;
        int columnsNumber = cells.length;
        int rowsNumber = cells[i].length;
        if (isPointInsideTable(i, j, columnsNumber, rowsNumber)) { // All those strange ifs were added to avoid two embedded loops
            liveNeighborsCount = cells[i-1][j-1] + cells[i-1][j] + cells[i-1][j+1]
                    + cells[i][j-1] + cells[i][j+1] + cells[i+1][j-1]
                    + cells[i+1][j] + cells[i+1][j+1];
        } else if (isPointInUpLeftCorner(i, j)) {
            liveNeighborsCount = cells[i+1][j+1] + cells[i+1][j] + cells[i][j+1];
        } else if (isPointInRightUpCorner(i, j, rowsNumber)) {
            liveNeighborsCount = cells[i+1][j-1] + cells[i+1][j] + cells[i][j-1];
        } else if (isPointDownLeftCorner(i, j, columnsNumber)) {
            liveNeighborsCount = cells[i-1][j+1] + cells[i-1][j] + cells[i][j+1];
        } else if (isPointDownRightCorner(i, j, columnsNumber, rowsNumber)) {
            liveNeighborsCount = cells[i-1][j-1] + cells[i-1][j] + cells[i][j-1];
        } else if (isPointInUpBorder(i, j, rowsNumber)) {
            liveNeighborsCount = cells[i][j-1] + cells[i][j+1] + cells[i+1][j-1] + cells[i+1][j] + cells[i+1][j+1];
        } else if (isPointInDownBorder(i, j, columnsNumber)) {
            liveNeighborsCount = cells[i-1][j-1] + cells[i-1][j] + cells[i-1][j+1] + cells[i][j-1] + cells[i][j+1];
        } else if (isPointInLeftBorder(i, j)) {
            liveNeighborsCount = cells[i-1][j] + cells[i-1][j+1] + cells[i][j+1] + cells[i+1][j+1] + cells[i+1][j];
        } else if (isPointInRightBorder(i, j, rowsNumber)) {
            liveNeighborsCount = cells[i-1][j-1] + cells[i-1][j] + cells[i][j-1] + cells[i+1][j-1] + cells[i+1][j];
        }
        return liveNeighborsCount;
    }

    private static int countLiveNeighborsByLoop(int[][] cells, int i, int j) { // loop implementation
        int liveNeighborsCount = 0;
        for (int l = -1; l <= 1; l++) {
            for (int m = -1; m <= 1; m++) {
                int indexOfNeighborI = i + l;
                int indexOfNeighborJ = j + m;
                if ((indexOfNeighborI >= 0 && indexOfNeighborI < cells.length)
                        && (indexOfNeighborJ >= 0 && indexOfNeighborJ < cells[i].length)
                        && indexOfNeighborI != i && indexOfNeighborJ != j) {
                    liveNeighborsCount += cells[indexOfNeighborI][indexOfNeighborJ];
                }
            }
        }
            return liveNeighborsCount;
    }

    private static boolean isCellDeadAfterCompute(int cell, int liveNeighborsCount) {
        boolean isCellDead = cell < 1;
        if(isCellDead) {
            return liveNeighborsCount != 3;
        } else {
            return liveNeighborsCount != 2 && liveNeighborsCount != 3;
        }
    }
}
