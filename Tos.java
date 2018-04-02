public class Tos {
    private String name, category;
    private Float attack, blood, res;

    public Tos(String name1, String category1, Float attack1, Float blood1,Float res1) {
        this.setName(name1);
        this.setCategory(category1);
        this.setAttack(attack1);
        this.setBlood(blood1);
        this.setRes(res1);
    }
    //get
    public String getName() { return name; }

    public String getCategory() { return category; }

    public float getAttack() { return attack; }

    public float getBlood() { return blood; }

    public float getRes() { return res; }
    //set
    public void setName(String name2) { name=name2; }

    public void setCategory(String category2) { category=category2; }

    public void setAttack(float attack2) { attack=attack2; }

    public void setBlood(float blood2) { blood=blood2; }

    public void setRes(float res2) { res=res2; }

    public void showAll() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("Name(角色):" + this.getName());
        System.out.println("Category(屬性):" + this.getCategory());
        System.out.println("Price(攻擊力):" + this.getAttack());
        System.out.println("Blood(血量):" + this.getBlood());
        System.out.println("Resilience(回復力):" + this.getRes());
        System.out.println("---------------我是分隔線--------------");
    }

}