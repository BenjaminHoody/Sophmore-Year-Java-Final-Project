public class Hero
{
    private String name;
    private int hitPoints;
    private int armor;
    private int speed;
    private int intellect;
    private boolean hasForce;
    private boolean darkside;
    private Weapon weapon;
    private Gear gear;



    public Hero (String n, int h, int a, int s, int i, boolean hf, boolean d, Weapon w, Gear g)
	{
		name = n;
		hitPoints = h;
        armor = a;
        speed = s;
        intellect = i;
        hasForce = hf;
        darkside = d;
        weapon = w;
        gear = g;
	}

    public String getName()
    {
        return name;   
    }

    public void setName(String name)
    {
        this.name = name;   
    }

    public int getHitPoints()
    {
        return hitPoints;   
    }

    public void setHitPoints(int hitPoints)
    {
        this.hitPoints = hitPoints;   
    }

    public int getArmor()
    {
        return armor;   
    }

    public void setArmor(int armor)
    {
        this.armor = armor;   
    }

    public int getSpeed()
    {
        return speed;   
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;   
    }

    public int getIntellect()
    {
        return intellect;   
    }

    public void setIntellect(int intellect)
    {
        this.intellect = intellect;   
    }

    public boolean getHasForce()
    {
        return hasForce;   
    }

    public void setHasForce(boolean hasForce)
    {
        this.hasForce = hasForce;   
    }

    public boolean getDarkside()
    {
        return darkside;   
    }

    public void setDarkside(boolean darkside)
    {
        this.darkside = darkside;   
    }

    public Weapon getWeapon()
    {
        return weapon;   
    }

    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;   
    }

    public Gear getGear()
    {
        return gear;   
    }

    public void setGear(Gear gear)
    {
        this.gear = gear;   
    }

}