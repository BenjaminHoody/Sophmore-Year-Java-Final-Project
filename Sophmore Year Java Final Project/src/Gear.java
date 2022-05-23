public class Gear
{
    private String name;
    private int damage;
    private int range;
    private int speedModdifier;
    private int accuarcyModdifier;
    

    public Gear (String n, int d, int r, int s, int a)
    {
        name = n;
        damage = d;
        range = r;
        speedModdifier = s;
        accuarcyModdifier = a;

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

    public int getSpeedModdifier()
    {
        return speedModdifier;   
    }

    public void setSpeedModdifier(int speedModdifier)
    {
        this.speedModdifier = speedModdifier;   
    }

    public int getAccuarcyModdifier()
    {
        return accuarcyModdifier;   
    }

    public void setAccuarcyModdifier(int accuarcyModdifier)
    {
        this.accuarcyModdifier = accuarcyModdifier;   
    }
    
}