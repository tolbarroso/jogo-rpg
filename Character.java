/* Atributos da classe Abstract Character:
HP;
Ataque;
Status;
Poder mágico.

Métodos (Movimentos):
Atacar. */

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
        
    }

}