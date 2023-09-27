class Thor extends SuperHero implements SkillHero  {
    private String skill;
    public void skill(String skill){
        System.out.println("Skill: " + skill);
    }
    public void moving(int moving){
        System.out.println("Moving: " + moving+ "km/h");
    }

    public void weapon(String weapon){
        System.out.println("Weapon: " + weapon);
    }

    public void jumping(String jumping){
        System.out.println("Jumping: " + jumping);
    }








}