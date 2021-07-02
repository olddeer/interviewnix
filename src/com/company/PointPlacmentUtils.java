package com.company;

public class PointPlacmentUtils {
    
    private PointPlacmentUtils() {
    }

    public static boolean isPointInRightBorder(int i, int j, int rowNumber) {
        return i > 0 && j == rowNumber;
    }

    public static boolean isPointInLeftBorder(int i, int j) {
        return i > 0 && j == 0;
    }

    public static boolean isPointInDownBorder(int i, int j, int columnNumber) {
        return i + 1 == columnNumber && j > 0;
    }

    public static boolean isPointInUpBorder(int i, int j, int rowNumber) {
        return i == 0 && j + 1 < rowNumber;
    }

    public static boolean isPointDownRightCorner(int i, int j, int columnNumber, int rowNumber) {
        return i + 1 == columnNumber && j + 1 == rowNumber;
    }

    public static boolean isPointDownLeftCorner(int i, int j, int columnNumber) {
        return i + 1 == columnNumber && j == 0;
    }

    public static boolean isPointInRightUpCorner(int i, int j, int rowNumber) {
        return i == 0 && j + 1 == rowNumber;
    }

    public static boolean isPointInUpLeftCorner(int i, int j) {
        return i == 0 && j == 0;
    }

    public static boolean isPointInsideTable(int i, int j, int columnNumber, int rowNumber) {
        return i - 1 >= 0 && i + 1 < columnNumber && j - 1 >= 0 && j + 1 < rowNumber;
    }
}
