public class Character {
    private TypeCharacter type;
    private double height;
    private int power;
    private int defense;
    private String gun;
    private String special;
    private String profession;
    private String name;
    private int life = 0;

    public Character(TypeCharacter type, double height, int power, int defense, String gun, String special, String profession, String name) {
        this.type = type;
        this.height = height;
        this.power = power;
        this.defense = defense;
        this.gun = gun;
        this.special = special;
        this.profession = profession;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "type=" + type +
                ", height=" + height +
                ", power=" + power +
                ", defense=" + defense +
                ", gun='" + gun + '\'' +
                ", special='" + special + '\'' +
                ", profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", life=" + life +
                '}';
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public TypeCharacter getType() {
        return type;
    }

    public double getHeight() {
        return height;
    }

    public int getPower() {
        return power;
    }

    public int getDefense() {
        return defense;
    }

    public String getGun() {
        return gun;
    }

    public String getSpecial() {
        return special;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }
}
