public abstract class Character {
    public int hp;
    public int ataque;
    public String status;
    public int poderMagico;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }
    
    public Character(int hp, int ataque, String status, int poderMagico) {
        super();
    }

    public Warrior warrior1 = new Warrior(20, 3, "Normal", 5);
    public Monster monster1 = new Monster(24, 4, "Normal", 6);
    
}