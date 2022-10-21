 public interface BattleAction{

        public void execute(Combatant user, Combatant target);

        public String toString();
    }

    class AttackAction implements BattleAction{

        String outcomeText;

        public void execute(Combatant user, Combatant target){
            int damage = BattleHelper.getRng(user.getStrength())+1;     //get randomized damage based on user strength
            target.decreaseHealth(damage);
            outcomeText = (user.getName() + " hits for " + damage + "\n" + target.getName() + "'s health is now " + target.getHealth() + "\n\n");
        }

        public String toString(){
            return outcomeText;     //return the result of the attack (the gnarly string above)
        };
    }

    class HealAction implements BattleAction{

        public void execute(Combatant user, Combatant target){
            int amount = BattleHelper.getRng(user.getMagic()+1);
            user.increaseHealth(amount);
        }

        public String toString(){
            return "placeholder text for heal";
        };
    }

    class FaintedAction implements BattleAction{
        String outcomeText;

        public void execute(Combatant user, Combatant target){
            outcomeText =   (user.getName() + " fainted...");
        }

        public String toString(){
            return outcomeText;
        };
    }
