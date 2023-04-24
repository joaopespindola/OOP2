import java.util.Scanner;
public class Director {
    Scanner scanner = new Scanner(System.in);
    public void constructWizard(Builder builder){

        builder.setTypeCharacter(TypeCharacter.WIZARD);
        builder.setGun("SINGLE FIREBALL");
        builder.setHeight(1.50);
        builder.setPower(80);
        builder.setDefense(30);
        builder.setSpecial("DOUBLE FIREBALL!");
        builder.setProfession("UBER");

        System.out.println("WHAT'S YOUR WIZARD NAME?");
        String name = scanner.nextLine();
        builder.setName(name);

    }
    public void constructWizard(Builder builder, String name){

        builder.setTypeCharacter(TypeCharacter.WIZARD);
        builder.setGun("SINGLE FIREBALL");
        builder.setHeight(1.50);
        builder.setPower(80);
        builder.setDefense(30);
        builder.setSpecial("DOUBLE FIREBALL!");
        builder.setProfession("UBER");

        builder.setName(name + " WIZARD");
    }
    public void constructWarrior(Builder builder){
        builder.setTypeCharacter(TypeCharacter.WARRIOR);
        builder.setGun("AX AND ARMOR");
        builder.setHeight(1.75);
        builder.setPower(95);
        builder.setDefense(10);
        builder.setSpecial("SWORD!");
        builder.setProfession("AÇOUGUEIRO");

        System.out.println("WHAT'S YOUR WARRIOR NAME?");
        String name = scanner.nextLine();
        builder.setName(name);
    }
    public void constructWarrior(Builder builder, String name){
        builder.setTypeCharacter(TypeCharacter.WARRIOR);
        builder.setGun("AX AND ARMOR");
        builder.setHeight(1.75);
        builder.setPower(95);
        builder.setDefense(10);
        builder.setSpecial("SWORD!");
        builder.setProfession("AÇOUGUEIRO");
        builder.setName(name + " WARRIOR");
    }
    public void constructWitch(Builder builder){
        builder.setTypeCharacter(TypeCharacter.WITCH);
        builder.setGun("AX AND ARMOR");
        builder.setHeight(1.75);
        builder.setPower(95);
        builder.setDefense(10);
        builder.setSpecial("SWORD!");
        builder.setProfession("RESELLER HINODE");

        System.out.println("WHAT'S YOUR WITCH NAME?");
        String name = scanner.nextLine();
        builder.setName(name);
    }
    public void constructWitch(Builder builder, String name){
        builder.setTypeCharacter(TypeCharacter.WITCH);
        builder.setGun("AX AND ARMOR");
        builder.setHeight(1.75);
        builder.setPower(95);
        builder.setDefense(10);
        builder.setSpecial("SWORD!");
        builder.setProfession("RESELLER HINODE");
        builder.setName(name + " WITCH");
    }
}
