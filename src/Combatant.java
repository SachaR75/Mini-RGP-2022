public class Combatant{
    // variable
    private final String nom;
    private int maxvie;
    private int vie;
    private int attaque;
    private int mana;
    BattleAction battleAction;


    //  combatant
    public Combatant(String nom, int attaque, int mana){
        this.nom = nom;
        maxvie = 10;
        this.vie = maxvie;
        this.attaque = attaque;
        this.mana = mana;
    }


    //  méthode
    protected void takeTurn(BattleAction chosenAction, Combatant target){
        if(vie > 0){
            setBattleAction(chosenAction);              //strategy pattern
        }
        else{
            setBattleAction(new FaintedAction());
        }
        performAction(target);
    }


    private void performAction(Combatant target){
        battleAction.execute(this, target);
    };

    protected void decreaseHealth(int amount){
        if(vie - amount < 0){vie = 0;}
        else{vie -= amount;}
    }

    protected void increaseHealth(int amount){
        if(vie + amount > maxvie){vie = maxvie;}
        else{vie += amount;}
    }


    //  accès
    public String getName(){
        return name;
    }

    public int getHealth(){
        return vie;
    }

    public int getStrength(){
        return strength;
    }

    public int getMagic(){
        return magic;
    }

    public void setBattleAction(BattleAction chosenAction){
        battleAction = chosenAction;
    }


}