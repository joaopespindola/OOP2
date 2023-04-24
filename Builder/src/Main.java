import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String[] nomes = {"JOÃO", "JOSÉ", "MARIA", "lUIZA", "MATEUS", "HUGO", "GUILHERME"};
        Director director = new Director();
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO JÃO RPG" + "\n" + "WANT TO CREATE A NEW CHARACTER? ENTER 1"
        + "\n" + "WANT TO SCROLL ATTRIBUTES RANDOMLY? ENTER 2");

        BuilderCharacter builder = new BuilderCharacter();
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("");
            System.out.println("WHAT WILL YOUR CHARACTER TYPE BE?" + "\n"
                    + "TEXT 1 FOR WIZARD, 2 FOR WARRIOR, 3 FOR WITCH");
            int choice2 = scanner.nextInt();

            switch (choice){
                case 1:
                    director.constructWizard(builder);
                    Character character = builder.getResult();
                    System.out.println("" + character.toString());
                    break;
                case 2:
                    director.constructWarrior(builder);
                    Character character1 = builder.getResult();
                    System.out.println("" + character1.toString());
                    break;
                case 3:
                    director.constructWitch(builder);
                    Character character2 = builder.getResult();
                    System.out.println("" + character2.toString());
                    break;
            }
        }else if(choice == 2){
            Random random = new Random();
            int randomNumber = random.nextInt(3) + 1;
            int randomNumber2 = random.nextInt(7);
            switch (randomNumber){
                case 1:
                    director.constructWizard(builder, nomes[randomNumber2]);
                    Character character = builder.getResult();
                    System.out.println("" + character.toString());
                    break;
                case 2:
                    director.constructWarrior(builder, nomes[randomNumber2]);
                    Character character1 = builder.getResult();
                    System.out.println("" + character1.toString());
                    break;
                case 3:
                    director.constructWitch(builder, nomes[randomNumber2]);
                    Character character2 = builder.getResult();
                    System.out.println("" + character2.toString());
            }
        }


    }
}