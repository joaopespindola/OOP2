public class BuilderCharacter implements Builder{
    private TypeCharacter type;
    private double height;
    private int power;
    private int defense;
    private String gun;
    private String special;
    private String profession;
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTypeCharacter(TypeCharacter type) {
        this.type = type;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void setGun(String gun) {
        this.gun = gun;
    }

    @Override
    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Character getResult(){
        return new Character(type, height, power, defense, gun, special, profession, name);
    }
}
