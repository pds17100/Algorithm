package ���Ӹ����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �ڹٰ��� {
    private static int[][] board;
    private static int size;
    private static int emptyRow;
    private static int emptyCol;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("���� ������ ũ�⸦ �Է��ϼ��� (3 �̻�): ");
        size = scanner.nextInt();
        initializeBoard();

        System.out.println("������ �����մϴ�!");

        while (!isSolved()) {
            printBoard();
            System.out.print("���ڸ� �̵���Ű���� ������ �Է��ϼ��� (w: ��, s: �Ʒ�, a: ����, d: ������): ");
            String direction = scanner.next().toLowerCase();
            if (isValidMove(direction)) {
                move(direction);
            } else {
                System.out.println("��ȿ���� ���� �������Դϴ�. �ٽ� �õ��ϼ���.");
            }
        }

        System.out.println("�����մϴ�! ������ �ذ��߽��ϴ�.");

        scanner.close();
    }

    private static void initializeBoard() {
        board = new int[size][size];
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size - 1 && j == size - 1) {
                    board[i][j] = 0;
                    emptyRow = i;
                    emptyCol = j;
                } else {
                    board[i][j] = num;
                    num++;
                }
            }
        }
        shuffleBoard();
    }

    private static void shuffleBoard() {
        for (int i = 0; i < size * size * 100; i++) {
            int randomNum = random.nextInt(4);
            String direction;
            switch (randomNum) {
                case 0:
                    direction = "w";
                    break;
                case 1:
                    direction = "s";
                    break;
                case 2:
                    direction = "a";
                    break;
                case 3:
                    direction = "d";
                    break;
                default:
                    direction = "";
            }
            if (isValidMove(direction)) {
                move(direction);
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    System.out.print("[  ]");
                } else {
                    System.out.printf("[%2d]", board[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isSolved() {
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == size - 1 && j == size - 1) {
                    continue;
                }
                if (board[i][j] != num) {
                    return false;
                }
                num++;
            }
        }
        return true;
    }

    private static boolean isValidMove(String direction) {
        switch (direction) {
            case "w":
                return emptyRow > 0;
            case "s":
                return emptyRow < size - 1;
            case "a":
                return emptyCol > 0;
            case "d":
                return emptyCol < size - 1;
            default:
                return false;
        }
    }

    private static void move(String direction) {
        switch (direction) {
            case "w":
                swap(emptyRow, emptyCol, emptyRow - 1, emptyCol);
                emptyRow--;
                break;
            case "s":
                swap(emptyRow, emptyCol, emptyRow + 1, emptyCol);
                emptyRow++;
                break;
            case "a":
                swap(emptyRow, emptyCol, emptyRow, emptyCol - 1);
                emptyCol--;
                break;
            case "d":
                swap(emptyRow, emptyCol, emptyRow, emptyCol + 1);
                emptyCol++;
                break;
        }
    }

    private static void swap(int row1, int col1, int row2, int col2) {
        int temp = board[row1][col1];
        board[row1][col1] = board[row2][col2];
        board[row2][col2] = temp;
    }
}
