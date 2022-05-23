public class Weapon
{
    private String name;
    private int damage;
    private int range;
    private int accuracy;

    public Weapon (String n, int d, int r, int a)
    {
        name = n;
        damage = d;
        range = r;
        accuracy = a;
    }

    public String getName()
    {
        return name;   
    }

    public void setName(String name)
    {
        this.name = name;   
    }

    public int getDamage()
    {
        return damage;   
    }

    public void setDamage(int damage)
    {
        this.damage = damage;   
    }

    public int getRange()
    {
        return range;   
    }

    public void setRange(int range)
    {
        this.range = range;   
    }

    public int getAccuracy()
    {
        return accuracy;   
    }

    public void setAccuracy(int accuacy)
    {
        this.accuracy = accuracy;   
    }
}    

