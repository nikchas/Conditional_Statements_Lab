package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int teddiesCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        int allToys = puzzleCount + dollsCount + teddiesCount + minionsCount + trucksCount;

        double sumPuzzle = puzzleCount * 2.60;
        double sumDolls = dollsCount * 3.00;
        double sumTeddies = teddiesCount * 4.10;
        double sumMinions = minionsCount * 8.20;
        double sumTrucks = trucksCount * 2.00;
        double allSum = sumPuzzle + sumDolls + sumTeddies + sumMinions + sumTrucks;

        if (allToys >= 50){
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);

        if (allSum >= price){
            System.out.printf("Yes! %.2f lv left.", allSum - price);
        }
        else{
            System.out.printf("Not enough money! %.2f lv needed.", price - allSum);
        }


    }
}
