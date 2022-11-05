import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);
        System.out.println("WELCOME TO THE ROCK, PAPER, SCISSORS\nPLAYER1\nPLEASE SELECT AN OPTION");
        System.out.println("1-ROCK\n2-PAPER\n3-SCISSORS");
        int secim1 = player1.nextInt(4);
        System.out.println("PLAYER2\nPLEASE SELECT AN OPTIONS");
        System.out.println("1-ROCK\n2-PAPER\n3-SCISSORS");
        int secim2 = player2.nextInt(4);
        if(secim1==1 && secim2==2){
            System.out.println("PLAYER2 WIN!!!");
        } else if (secim1==2 && secim2==3){
            System.out.println("PLAYER 2 WINN!!!");
        } else if (secim1==3 && secim2==1) {
            System.out.println("PLAYER 2 WINN!!!");
        } else if(secim1==secim2){
            System.out.println("THE GAME IS TIE");
        }else{
            System.out.println("PLAYER 1 WINN!!!");
        }
    }
}