
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
    static String playerName;
    static int playerHealth;
    static int playerArmor;
    static int playerSpeed;
    static int playerIntellect;
    static boolean playerHasForce = false;
    static boolean playerDarkside = false;
    static Weapon playerWeapon = Weapons.pistol;
    static Gear playerGear = Gears.none;

    static String fake;

    static Hero player = new Hero(playerName, playerHealth, playerArmor, playerSpeed, playerIntellect, playerHasForce, playerDarkside, playerWeapon, playerGear);
    
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        createPlayer();
        showPlayerStats();
        level1();
        upgradePlayer();
        showPlayerStats();
        level2();
        upgradePlayer();
        showPlayerStats();
        System.out.println("Rebel Officer: Sir you have done a great service for the rebellion.");
        fake = userInput.nextLine();
        System.out.println("You: I'd like to join the rebellion full time.");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: It's great to have you with us!");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: I have one more mission if you would like it.");
        int missionChoice = userInput.nextInt();
        System.out.println("1: Take the mission");
        System.out.println("2: Decide to skip this one and go to an ancient planet you heard of a while ago");
        if(missionChoice == 1)
        {
            level3a();
            upgradePlayer();
            showPlayerStats();
        }
        else
        {
            level3b();
            upgradePlayer();
            showPlayerStats();
        }
        level4();
        
        
    }

    public static void createPlayer()
    { 
        Scanner userInput = new Scanner(System.in);
        int points = 25;


        System.out.println("\nIt's time to create your own character!!! \n");
        System.out.println("What would you like your name to be?");
        player.setName(userInput.nextLine());
        playerName = player.getName(); 
        System.out.println("\nYour player name is " + playerName);
        System.out.println("If the text ever stops hit enter to continue.");
        fake = userInput.nextLine();

        System.out.println("\n" + playerName + " you will have 25 points to put into your different attributes.");
        System.out.println("Your different attributes are Hit Points, Armor, Speed, and Intellect.");
        fake = userInput.nextLine();

        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Hit Points");
        player.setHitPoints(userInput.nextInt());
        playerHealth = player.getHitPoints();
        points = points - playerHealth;

        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Armor (Your armor can be a max of 13)");
        player.setArmor(userInput.nextInt());
        playerArmor = player.getArmor();
        points = points - playerArmor;
        if(player.getArmor() > 13)
            {
                player.setArmor(13);
            }

        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Speed");
        player.setSpeed(userInput.nextInt());
        playerSpeed = player.getSpeed();
        points = points - playerSpeed;

        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Intellect");
        player.setIntellect(userInput.nextInt());
        playerIntellect = player.getIntellect();
        points = points - playerIntellect;

    }

    public static void showPlayerStats()
    {
        
        System.out.println("\n\n\nYour player name is " + player.getName());
        System.out.println("You have " + player.getHitPoints() + " Hitpoints");
        System.out.println("Your armor value is " + player.getArmor());
        System.out.println("Your speed is " + player.getSpeed());
        System.out.println("Your Intellect is " + player.getIntellect());
        System.out.println("Your weapon is a " + player.getWeapon().getName()); 
    
        if(playerGear == Gears.none)
        {
            System.out.println("You have no gear");
        }
        else
        {
            System.out.println("Your Gear is a" + playerGear.getName()); 
        }

    }

    public static void upgradePlayer()
    {
        Scanner userInput = new Scanner(System.in);
        int points = 10;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou have completed a mission and you now will get the chance to upgrade your player!!!");
        fake = userInput.nextLine();

        System.out.println("\nYou have " + points + " points to use.");
        System.out.println("How many points would you like to put into your Hit Points");
        int d = userInput.nextInt();
        player.setHitPoints(playerHealth + d);
        playerHealth = player.getHitPoints();
        points = points - d;

        if(player.getArmor() < 13)
        {
            System.out.println("\nYou have " + points + " points left.");
            System.out.println("How many points would you like to put into your Armor (Your armor can only be a max of 13)");
            int c = userInput.nextInt();
            player.setArmor(playerArmor + c);
            playerArmor = player.getArmor();
            points = points - c;
            if(player.getArmor() > 13)
            {
                player.setArmor(13);
            }
        }
        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Speed");
        int b = userInput.nextInt();
        player.setSpeed(playerSpeed + b);
        playerSpeed = player.getSpeed();
        points = points - b;

        System.out.println("\nYou have " + points + " points left.");
        System.out.println("How many points would you like to put into your Intellect");
        int a = userInput.nextInt();
        player.setIntellect(playerIntellect + a);
        playerIntellect = player.getIntellect();
        points = points - a;
    }

    public static void level1()
    {
        Scanner userInput = new Scanner(System.in);
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nYou story starts on the Planet Onderon. A urban planet in the Inner Rim.");
        fake = userInput.nextLine();
        System.out.println("You are a smuggler who frequently steals from Empire.");
        fake = userInput.nextLine();
        System.out.println("The Rebellion has allowed you to make a great sum of money because you often smuggle war material to them.");
        fake = userInput.nextLine();
        System.out.println("You have never had problems smuggling stuff to the Alliance until today!");
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\nAs you walk down the streets of Onderon you find the warehouse where your next box of suppies to smuggle is located. ");
        fake = userInput.nextLine();
        System.out.println("You go up to the door and it is locked, so you decide to see if you can hack the door and open it.");
        fake = userInput.nextLine();

        if(player.getIntellect() > 4)
        {
            System.out.println("Your Intelligence level was high enough to open the door");
            System.out.println(playerName + ", you have now entered the warehouse and the box of supplies is there.");
            fake = userInput.nextLine();
            System.out.println("In the box has military grade blaster rifles in it. It has instructions that say to bring it to the planet Bothawui.");
            fake = userInput.nextLine();
            System.out.println("It also says if you successfully deliver the box you will get to keep one of these weapons.");
            System.out.println("However the box is locked so you can't take one now.");
            fake = userInput.nextLine();
            
        }

        else 
        {
            System.out.println("Your Intelligence level is not high enough to hack the door.");
            fake = userInput.nextLine();
            System.out.println("You will have to try and find a way different way in");
            fake = userInput.nextLine();
            System.out.println("Would you like to check the back, the left, or the right of the building?"); 
            System.out.println("1: The back"); 
            System.out.println("2: The left"); 
            System.out.println("3: The right"); 
            int choice = userInput.nextInt();
            
            if(choice == 1)
            {
                System.out.println("There is another door back here and it is open!"); 
                fake = userInput.nextLine();
                System.out.println(playerName + ", you have now entered the warehouse and the box of supplies is there.");
                fake = userInput.nextLine();
                System.out.println("In the box has military grade blaster rifles in it. It has instructions that say to bring it to the planet Bothawui.");
                fake = userInput.nextLine();
                System.out.println("It also says if you successfully deliver the box you will get to keep one of these weapons.");
                System.out.println("However the box is locked so you can't take one now.");
            }
            else
            {
                System.out.println("There is a window on this side of the warehouse.");
                System.out.println("You could break it to get into the warehouse if you wanted?");
                System.out.println("1: Go to the back of the warehouse"); 
                System.out.println("2: Break the window");
                int breakWindow = userInput.nextInt();
                if(breakWindow == 1)
                {
                    System.out.println("There is another door back here and it is open!"); 
                    fake = userInput.nextLine();
                    System.out.println(playerName + ", you have now entered the warehouse and the box of supplies is there.");
                    fake = userInput.nextLine();
                    System.out.println("In the box has military grade blaster rifles in it. It has instructions that say to bring it to the planet Bothawui.");
                    fake = userInput.nextLine();
                    System.out.println("It also says if you successfully deliver the box you will get to keep one of these weapons.");
                    System.out.println("However the box is locked so you can't take one now.");
                }
                if(breakWindow == 2)
                {
                    System.out.println("You have set the alarm system off and now the authorities have been notified!!!");
                    fake = userInput.nextLine();
                    System.out.println(playerName + ", you have now entered the warehouse and the box of supplies is there.");
                    fake = userInput.nextLine();
                    System.out.println("In the box has military grade blaster rifles in it. It has instructions that say to bring it to the planet Bothawui.");
                    fake = userInput.nextLine();
                    System.out.println("It also says if you successfully deliver the box you will get to keep one of these weapons.");
                    System.out.println("However the box is locked so you can't take one now.");
                    fake = userInput.nextLine();
                    System.out.println("You hear something and realize the Empire has already arived.");
                    fake = userInput.nextLine();
                    System.out.println("You decide to hide and after a minute only one stormtrooper comes in.");
                    fake = userInput.nextLine();
                    System.out.println("You realize you are lucky and now have to decide to...");
                    System.out.println("1: Try and talk your way out of it");
                    System.out.println("2: Fight the stormtrooper");
                    System.out.println("3: Try to run");
                    int choice2 = userInput.nextInt();
                    if(choice2 == 1)
                    {
                        System.out.println("Stromtrooper: Freeze... don't move!");
                        fake = userInput.nextLine();
                        System.out.println("Stromtrooper: Let me see your identification.");
                        System.out.println("1: Hand him your ID");
                        System.out.println("2: Tell him you don't have one");
                        int idChoice = userInput.nextInt();
                        if(idChoice == 1)
                        {
                            System.out.println("Stromtrooper: Why are you here!");
                            fake = userInput.nextLine();
                            System.out.println("You: I'm new to town and I just got lost.");
                            fake = userInput.nextLine();
                            System.out.println("Stromtrooper: Even if that was true you still are tresspasing on private property.");
                            System.out.println("Stromtrooper: So leave right now or I'm going to have to take you in.");
                            System.out.println("\n1: Leave like the Stormtrooper told you");
                            System.out.println("2: Tell him no");
                            int idChoice2 = userInput.nextInt();
                            if(idChoice2 == 1)
                            {
                                System.out.println("Stromtrooper: What is that box you are taking!");
                                fake = userInput.nextLine();
                                System.out.println("You: It's just a box of mellons that I bought this morning.");
                                fake = userInput.nextLine();
                                System.out.println("Scince the box accutally does have a picture of a mellon on it the stormtrooper believes you.");
                            }
                            else
                            {
                                System.out.println("Stromtrooper: I'm going to have to take you in.");
                                fake = userInput.nextLine();
                                System.out.println("You: I can't let you do that!!!");
                                fake = userInput.nextLine();
                                battleStormtrooper();
                                resetTrooperHealth();
                            }
                            
                        }
                        else
                        {
                            System.out.println("Stromtrooper: I'm going to have to take you in.");
                            fake = userInput.nextLine();
                            System.out.println("You: I can't let you do that!!!");
                            fake = userInput.nextLine();
                            battleStormtrooper();
                            resetTrooperHealth();
                        }
                    }
                    if(choice2 == 2)
                    {
                        battleStormtrooper();
                        resetTrooperHealth();
                    }

                    if(choice2 == 3)
                    {
                        if(player.getSpeed() > 5)
                        {
                           System.out.println("You were able to escape the stormtrooper with the cargo.");
                           fake = userInput.nextLine(); 
                        }

                        else
                        {
                            System.out.println("You were not able to escape the stormtrooper and so he attacks you!!!");
                            battleStormtrooper();
                            resetTrooperHealth();
                        }
                    }

                }
            }
        }

        System.out.println("You now run back to your ship in order to get the supplies to Bothawui!!!");
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAfter arriving at the port you see a group of Imperial Stromtroopers");
        fake = userInput.nextLine();
        System.out.println("After quickly leaving your ship with the Cargo you are unlucky and bump into an Imperial Intelligence Officer.");
        fake = userInput.nextLine();
        System.out.println("Intelligence Officer: Woahhhh!!! Watch where you're going there bud.");
        fake = userInput.nextLine();
        System.out.println("Intelligence Officer: Your not supposed to be in this part of town.");
        System.out.println("Intelligence Officer: Let me see your identification!!!");
        System.out.println("1: Hand him your ID");
        System.out.println("2: Don't hand him anything and attack him!");
        int idChoice3 = userInput.nextInt();
        if(idChoice3 == 1)
        {
            System.out.println("Intelligence Officer: Ok this looks good but I'm still going to have to look in the box.");
            fake = userInput.nextLine();
            System.out.println("You: Sir the box is locked and I can't open in.");
            fake = userInput.nextLine();
            System.out.println("Intelligence Officer: Then I'm going to have to take you and the box in.");
            fake = userInput.nextLine();
            System.out.println("You have no choice but pull out your " + player.getWeapon().getName());
            fake = userInput.nextLine();
            battleImperialOfficer();
            resetTrooperHealth();
        }
        else
        {
            battleImperialOfficer();
            resetTrooperHealth();
        }

        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nYou proceed to the location you were supposed to bring the cargo to...");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: Sir you have done a great service for the rebellion today please take one of these blasters!");
        fake = userInput.nextLine();
        player.setWeapon(Weapons.rifle); 
    }

    public static void level2()
    {
        Scanner userInput = new Scanner(System.in);
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\nRebel Officer: If you're up for it we have another mission for you, and we will pay you handsomly!!!");     
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: We need you to go to the planet Taris and deliver this message. (Hands you a flashdrive)"); 
        fake = userInput.nextLine();
        System.out.println("As you leave Bothawui and head to Taris you recognize that you have now taken many missions from the Alliance."); 
        System.out.println("This, you realize, means you are probably wanted by the Empire!!!"); 
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAs you come out of hyperspace you can now see that Taris has many cities.");
        System.out.println("This is bad because that means there is a large imperial pressance on the heavily populated planet."); 
        fake = userInput.nextLine(); 
        System.out.println("Your ship lands, and sure enough there were plenty of stormtroopers.");
        fake = userInput.nextLine(); 
        System.out.println("You: Alright I'm going to have to try and run past these guys.");
        fake = userInput.nextLine(); 
        if(player.getSpeed() > 10)
        {
           System.out.println("You: Those Bucket Heads are too slow with all that armor on."); 
           fake = userInput.nextLine();
        }
        else
        {
            System.out.println("You were not fast enough to get past the Stormtroopers");
            battleStormtrooper();
            resetTrooperHealth();
            battleStormtrooper();
            resetTrooperHealth();
            battleStormtrooper();
            resetTrooperHealth();
            fake = userInput.nextLine(); 
        }
        System.out.println("You run through the city avoiding the Empire as best you can."); 
        fake = userInput.nextLine();
        System.out.println("Once you reach the location you were told to go to, you see a stormtrooper carrying heavy weapons in the building.");
        fake = userInput.nextLine();
        System.out.println("Luckily you are going upstairs so you get into the elevator.");
        fake = userInput.nextLine();
        System.out.println("The stormtrooper starts to come closer to you so you try to hack the elevator shut.");
        fake = userInput.nextLine();
        if(player.getIntellect() > 10)
        {
            System.out.println("You were able to lock the elevator and you are now going up!!");
            fake = userInput.nextLine();
        }
        else
        {
            System.out.println("Stormtrooper: What are you trying to do with that elevator!!!");
            fake = userInput.nextLine();
            System.out.println("You realize you should have not tried to hack the elevator because you aren't smart enough to do that.");
            fake = userInput.nextLine();
            System.out.println("So you pull out your " + player.getWeapon().getName());
            fake = userInput.nextLine();
            battleHeavyStormtrooper();
            resetTrooperHealth();
            fake = userInput.nextLine();
        }
        System.out.println("After you get off the elevator you realize you dont know what room your supposed to go to on this floor.");
        fake = userInput.nextLine();
        System.out.println("Which room would you like to go to?");
        System.out.println("1: Room 801");
        System.out.println("2: Room 802");
        System.out.println("3: Room 803");
        int roomChoice = userInput.nextInt();
        boolean lookingForRoom = true;
        while(lookingForRoom)
        {
        if(roomChoice == 1)
        {
            System.out.println("You go up to room 801 but this room looks like it is under construction.");
            fake = userInput.nextLine();
            System.out.println("Go to a different room");
            System.out.println("2: Room 802");
            System.out.println("3: Room 803");
            roomChoice = userInput.nextInt();
        }

        if(roomChoice == 2)
        {
            System.out.println("Room 802 is locked so you try to hack the door open.");
            fake = userInput.nextLine();
            if(player.getIntellect() > 7)
            {
                System.out.println("You were able to get into the room but no one is in there.");
                fake = userInput.nextLine();
                System.out.println("However there is a Thermal Scope in this room so you decide to pick it up.");
                fake = userInput.nextLine();
                System.out.println("This will help increase your accuracy when attacking!!!");
                fake = userInput.nextLine();
                player.setGear(Gears.thermalscope);
                player.getWeapon().setAccuracy(player.getWeapon().getAccuracy() + 20);
                System.out.println("Your accuracy is now increased by 20. If you change your gear the accuracy will go back to normal.");
                fake = userInput.nextLine();
                System.out.println("Go to a different room");
                System.out.println("1: Room 802");
                System.out.println("3: Room 803");
                roomChoice = userInput.nextInt();
            }
            else
            {
                System.out.println("You were not smart enough to hack the door.");
                fake = userInput.nextLine();
                System.out.println("Go to a different room");
                System.out.println("1: Room 802");
                System.out.println("3: Room 803");
                roomChoice = userInput.nextInt();
            }
        }

        if(roomChoice == 3)
        {
            System.out.println("Room 803 is open and you go inside.");
            fake = userInput.nextLine();
            System.out.println("You see a woman and approach her.");
            fake = userInput.nextLine();
            System.out.println("You reach out to hand her the flashdrive and she takes it.");
            fake = userInput.nextLine();
            System.out.println("She says nothing... except she tells you to leave which you do!!!");
            lookingForRoom = false;
            fake = userInput.nextLine();

        }
        }

        System.out.println("You go back to your ship and fly back to Bothawui!!!!");
        fake = userInput.nextLine();
        System.out.println("When you go back to the rebel base you decide that you have no choice but to formally join the rebellion.");
        System.out.println("You have fought and killed too many stormtroopers!!!");
        fake = userInput.nextLine();

    }

    public static void level3a()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Rebel Officer: Alright the mission involves freeing slaves on the Planet Kashyyyk.");
        fake = userInput.nextLine();
        System.out.println("You: Kashyyyk?!  Isn't that the howm world of the wookies.");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: That is correct.");
        fake = userInput.nextLine();
        System.out.println("You suddenly become very nervous because wookies are huge fury beasts.");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: Don't worry, wookies may seem scary but if you stay on their good side they are kind.");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: If your going to go to Kashyyyk you will need this...");
        int hookChoice = userInput.nextInt();
        System.out.println("1: Take the Grapple Hooks");
        System.out.println("2: Keep the gear you have");
        if(hookChoice == 1)
        {
        player.setGear(Gears.grappleHooks);
        player.getWeapon().setAccuracy(player.getWeapon().getAccuracy());
        System.out.println("You: Thank you!");
        fake = userInput.nextLine();
        }
        else
        {
            System.out.println("You: I appreciate it but I think I'll be ok.");
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nAfter landing on kashyyyk there are many stormtroopers guarding the entrance to the slave camp!");
        fake = userInput.nextLine();       
        battleStormtrooper();
        resetTrooperHealth();
        battleStormtrooper();
        resetTrooperHealth();
        fake = userInput.nextLine(); 
        System.out.println("You then see scout troopers in the distance trying to shoot you with their sniper rifles!!!");
        fake = userInput.nextLine(); 
        if(player.getSpeed() > 15)
        {
            System.out.println("You were able to avoid the Scout troopers and you are now at the back entrance to the slave camp.");
        }

        else
        {
            System.out.println("You were too slow to avoid the scout troopers!!!");
            fake = userInput.nextLine(); 
            battleScoutTrooper();
            resetTrooperHealth();
            battleScoutTrooper();
            resetTrooperHealth();
            battleScoutTrooper();
            resetTrooperHealth();
            fake = userInput.nextLine(); 
            System.out.println("You continue until you at the back entrance to the slave camp.");
            fake = userInput.nextLine();
        }


        if(player.getGear() == Gears.grappleHooks)
        {
            System.out.println("There is a massive tree nearby that you use your gapple hooks to cimb up.");
            fake = userInput.nextLine();
            System.out.println("When the rest of the stormtroopers arive they are supid and forget to look up so they don't see you!!!");
            fake = userInput.nextLine();
            System.out.println("You grapple down from the tree and proceed to the cage where the wookies are being kept.");
            fake = userInput.nextLine();
        }

        else
        {
            System.out.println("There is a massive tree nearby and you really wish you had gapple hooks to cimb up the tree with.");
            fake = userInput.nextLine();
            battleScoutTrooper();
            resetTrooperHealth();
            battleHeavyStormtrooper();
            resetTrooperHealth();
            battleStormtrooper();
            resetTrooperHealth();
            System.out.println("You continue into the camp until you find the cage with the wookies.");
            fake = userInput.nextLine();
        }

        System.out.println("The wookies are massive! You have never been so scared in your life!!!");
        fake = userInput.nextLine();
        System.out.println("You let the wookies out and they roar!!!");
        fake = userInput.nextLine();
        System.out.println("The only thing you can think about is how you don't want to be eaten.");
        fake = userInput.nextLine();
        System.out.println("Then one of the wookies approaches you...");
        fake = userInput.nextLine();
        System.out.println("But he just gives you a big hug.");
        fake = userInput.nextLine();
        System.out.println("You and all the wookies go to where all the weapons in the camp are being kept and begin to arm yourselves.");
        fake = userInput.nextLine();
        int weaponChoice = userInput.nextInt();
        System.out.println("What weapon would you like to take?");
        System.out.println("1: A heavy Baster (very high damage but low accuracy)");
        System.out.println("2: A Sniper (good range and accuracy)");
        System.out.println("3: Keep what you have");
        if(weaponChoice == 1)
        {
            player.setWeapon(Weapons.heavyGun);
        }
        if(weaponChoice == 2)
        {
            player.setWeapon(Weapons.sniper);
        }
        int gearChoice = userInput.nextInt();
        System.out.println("Now what gear would you like to take?");  
        System.out.println("1: Ryyk Blade (A Knife from Kashyyyk good for stealth)");
        System.out.println("2: Thermal Scope (increases your weapons accuracy)");
        System.out.println("3: Grapple Hooks (increases mobility)");
        if(gearChoice == 1)
        {
            player.setGear(Gears.knife);
            player.getWeapon().setAccuracy(player.getWeapon().getAccuracy());
        }
        if(gearChoice == 2)
        {
            player.setGear(Gears.thermalscope);
            player.getWeapon().setAccuracy(player.getWeapon().getAccuracy() + 20);
        }
        else
        {
            player.setGear(Gears.grappleHooks);
            player.getWeapon().setAccuracy(player.getWeapon().getAccuracy());
        }
        fake = userInput.nextLine();
        showPlayerStats();
        fake = userInput.nextLine();
        System.out.println("After you gear up you hear jet packs and realize there are jumptroopers coming at you.");
        battleJumptrooper();
        resetTrooperHealth();
        battleJumptrooper();
        resetTrooperHealth();
        System.out.println("You and the wookies run back to your ship and head back to Bothawui!");
    }

    public static void level3b()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Rebel Officer: I understand you have done a lot for us recently.");
        fake = userInput.nextLine();
        System.out.println("You: Have you ever heard of a place called illum?");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: I do!");
        System.out.println("Rebel Officer: It is a planet that the Jedi considered sacred before they were wiped out. It is said to be near the unknown regions.");
        fake = userInput.nextLine();
        System.out.println("You travel to Illum in hopes to learn about the Jedi.");
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nUpon ariving you land on the snow covered planet and realize you have no idea where to go!");
        fake = userInput.nextLine();
        System.out.println("However you have this feeling...");
        fake = userInput.nextLine();
        System.out.println("A cave not far away from where you are seems to be calling to you.");
        fake = userInput.nextLine();
        System.out.println("This is the strangest feeling you have ever had and so you can't stop yourself from going to that cave.");
        fake = userInput.nextLine();
        System.out.println("In the cave there are many crystals of some sort...");
        fake = userInput.nextLine();
        System.out.println("You try to grab one but no matter how hard you try it won't come out of the ice.");
        fake = userInput.nextLine();
        System.out.println("After giving up you feel the cave calling you to go deeper into the cave.");
        fake = userInput.nextLine();
        System.out.println("As you do you see something glowing...");
        fake = userInput.nextLine();
        System.out.println("You pick of the glowing thing and it begins to play a message.");
        fake = userInput.nextLine();
        System.out.println("The message tells you that it is called a Jedi Holocron and it stores information of the ways of a Jedi.");
        fake = userInput.nextLine();
        System.out.println("You begin to study and do what the Holocron tells you to do.");
        fake = userInput.nextLine();
        player.setHasForce(true);
        System.out.println("You quickly loose track of time and train in the force. You learn to levitate thing with your mind and see things before they happen.");
        fake = userInput.nextLine();
        System.out.println("After the many weeks spent learning the force one of the crystals begin to glow...");
        fake = userInput.nextLine();
        System.out.println("You walk up to it and grab it not knowing what it does.");
        fake = userInput.nextLine();
        System.out.println("The Holocron then tells you that the crystal is called a Kyber Crystal and is used to build lightsabers.");
        fake = userInput.nextLine();
        System.out.println("It also tells you that there is a room in the cave with the parts for a lightsaber.");
        fake = userInput.nextLine();
        System.out.println("Choose a room to go to");
        System.out.println("1: Room 1");
        System.out.println("2: Room 2");
        System.out.println("3: Room 3");
        boolean stillBuildingLightsaber = true;
        int roomChoice = userInput.nextInt();
        while(stillBuildingLightsaber)
        {
        if(roomChoice == 1)
        {
            System.out.println("In this room there are parts for you to create a double bladed lightsaber!!!");
            System.out.println("These lightsabers are long, unwieldy, and hard to control so they have a small amout of range, slightly better damage, but have worse accurcy");
            fake = userInput.nextLine();
            System.out.println("Would you like to build a Double Bladed lightsaber or look in a different room?");
            System.out.println("1: Build it!!!");
            System.out.println("2: Look in a different room");
            int i = userInput.nextInt();
            if(i == 1)
            {
                player.setWeapon(Weapons.daulLightsaber);
                stillBuildingLightsaber = false;
            }
            else
            {
                System.out.println("What room would you like to go to?");
                System.out.println("2: Room 2");
                System.out.println("3: Room 3");
                roomChoice = userInput.nextInt();
            }
        }
        if(roomChoice == 3)
        {
            System.out.println("In this room there are parts for you to create a lightsaber shoto!!!");
            System.out.println("These lightsabers are small and so they increase your attack speed and movement speed, but have slightly less damage.");
            fake = userInput.nextLine();
            System.out.println("Would you like to build a lightsaber shoto or look in a different room?");
            System.out.println("1: Build it!!!");
            System.out.println("2: Look in a different room");
            int i = userInput.nextInt();
            if(i == 1)
            {
                player.setWeapon(Weapons.lightsaberShoto);
                stillBuildingLightsaber = false;
            }
            else
            {
                System.out.println("What room would you like to go to?");
                System.out.println("1: Room 1");
                System.out.println("2: Room 2");
                roomChoice = userInput.nextInt();
            }
        }
        else
        {
            System.out.println("In this room there are parts for you to create a regular lightsaber!!!");
            fake = userInput.nextLine();
            System.out.println("Would you like to build a lightsaber or look in a different room?");
            System.out.println("1: Build it!!!");
            System.out.println("2: Look in a different room");
            int i = userInput.nextInt();
            if(i == 1)
            {
                player.setWeapon(Weapons.lightsaber);
                stillBuildingLightsaber = false;
            }
            else
            {
                System.out.println("What room would you like to go to?");
                System.out.println("1: Room 1");
                System.out.println("3: Room 3");
                roomChoice = userInput.nextInt();
            }
        }

        System.out.println("\nWith you new found ablilities you head back to Bothawui!!!");
        }

    }

    public static void level4()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Rebel Officer: Your next mission is going to be your most dangerous mission yet. You will have to board a Star Destroyer and steal information found of the bridge.");
        fake = userInput.nextLine();
        System.out.println("Rebel Officer: You will go in with a team who are highly trained. They will create a diversion while you go to the bridge.");
        fake = userInput.nextLine();
        System.out.println("\n\n\n\n\n\nYou board the transport and fly away from Bothawui. When you come out of hyperspace you see the massive ship that you are about to enter.");
        fake = userInput.nextLine();
        System.out.println("As you fly into the hangar you hide in the vents of the ship.");
        System.out.println("When the inspection team comes in you decide to steal thier uniforms to sneak around...");
        fake = userInput.nextLine();
        battleStormtrooper();
        resetTrooperHealth();
        battleStormtrooper();
        resetTrooperHealth();
        battleStormtrooper();
        resetTrooperHealth();
        System.out.println("With your new uniforms you begin to go though the ship which at first seems relativly empty.");
        fake = userInput.nextLine();
        System.out.println("However you soon see an Imperial officer who asks you what your trooper ID is.");
        fake = userInput.nextLine();
        System.out.println("1: Attack him!");
        System.out.println("2: Make one up");
        int officerChoice = userInput.nextInt();
        if(officerChoice == 1)
        {
            battleImperialOfficer();
            resetTrooperHealth();
        }
        else
        {
            System.out.println("What 5 digit number do you what to make up");
            int officerChoice2 = userInput.nextInt();
            if(officerChoice2 < 65994 )
            {
                System.out.println("Imperial Officer: That's my ID number!? What is going on?");
                fake = userInput.nextLine();
                System.out.println("You have no choice but to attack him.");
                fake = userInput.nextLine();
                battleImperialOfficer();
                resetTrooperHealth();

            }
            else
            {
               System.out.println("Imperial Officer: Ok then."); 
               fake = userInput.nextLine();
            }
        }

        System.out.println("As you continue through the ship the alarm starts to go off. Your team has started to attack the crew of the ship.");
        System.out.println("The distraction has started which means it is time for you to head to that bridge.");
        fake = userInput.nextLine();
        System.out.println("You approach an elevator that you need to go up in order to get to the bridge.");
        fake = userInput.nextLine();
        if(player.getHasForce() == true)
        {
            System.out.println("Using your new ability to use the force you open the elevator door and pull the elevator down.");
            fake = userInput.nextLine();
            System.out.println("You enter the elevator and head up!");
            fake = userInput.nextLine();
        }
        else if(player.getIntellect() > 15)
        {
            System.out.println("You hack the elevator door open but the elevator is all the way at the top.");
            fake = userInput.nextLine();
            if(player.getGear() == Gears.grappleHooks)
            {
                System.out.println("Your thankful you have grapple hooks you can use to climb up the elevator shaft.");
                fake = userInput.nextLine();
            }
            else
            {
                System.out.println("You wish you had grapple hooks to climb up the elevator shaft.");
                fake = userInput.nextLine();
                System.out.println("Now that you have to take the long way up you prepare yourself to have to fight.");
                fake = userInput.nextLine();
                System.out.println("The only thing you run into on your way up is a Special Forces Trooper.");
                fake = userInput.nextLine();
                battleImperialSpecForce();
                resetTrooperHealth();
            }
        }
        else
        {
            System.out.println("You were not smart enough to hack the elevator door so you have to walk around the ship to get to the bridge.");
            fake = userInput.nextLine();
            System.out.println("The only thing you run into on your way up is a Special Forces Trooper.");
            fake = userInput.nextLine();
            battleImperialSpecForce();
            resetTrooperHealth();
            
        }
        System.out.println("You continue through the ship and see some more stormtroopers outside the next door you need to go to.");
        fake = userInput.nextLine();
        if(player.getGear() == Gears.knife)
        {
            System.out.println("The Knife you grabbed from kashyyyk should be allow you to sneak up on the three stormtroopers and silently kill them.");
            fake = userInput.nextLine();
            if(player.getIntellect() > 13)
            {
                System.out.println("You were smart enough to quietly kill the three stromtroopers!");
                fake = userInput.nextLine();
            }
            else
            {
                System.out.println("You got the first two stromtroopers but the third saw you becuase you were not smart about when you attacked.");
                fake = userInput.nextLine();
                battleHeavyStormtrooper();
                resetTrooperHealth();
            }
        }
        else
        {
            battleStormtrooper();
            resetTrooperHealth();
            battleHeavyStormtrooper();
            resetTrooperHealth();
            battleStormtrooper();
            resetTrooperHealth();
        }
        System.out.println("Now that you have taken care of that can enter the last door before you get to the bridge.");
        fake = userInput.nextLine();
        System.out.println("After you enter the door you see an Imperial Special Forces Trooper coming towards you.");
        fake = userInput.nextLine();
        System.out.println("You quickly reclose the door and hope it will keep the Imperial trooper out.");
        fake = userInput.nextLine();
        System.out.println("He starts to try and hack the door open...");
        if(player.getIntellect() > NpcTypes.imperialSpecForce.getIntellect())
        {
            System.out.println("You were smarter than him so you were able to keep the door sealed.");
            fake = userInput.nextLine();
        }
        else
        {
            System.out.println("The Imperial Special Forces Trooper was smarter than you so he was able to get into the door.");
            fake = userInput.nextLine();
            battleImperialSpecForce();
            resetTrooperHealth();
        }

        System.out.println("Now it is finally time for you to enter the bridge.");
        fake = userInput.nextLine();
        System.out.println("When the door opens the room is completely black...");
        fake = userInput.nextLine();
        System.out.println("Then you see a bright red blade ignite from the darkness...");
        fake = userInput.nextLine();
        System.out.println("The figure holding it turns around and you suddenly feel so much fear it almost over takes you.");
        if(player.getWeapon() == Weapons.lightsaber)
        {
            System.out.println("You pull out your weapon, ignite it, and prepare to fight!");
            fake = userInput.nextLine();
        }
        if(player.getWeapon() == Weapons.daulLightsaber)
        {
            System.out.println("You pull out your weapon, ignite it, and prepare to fight!");
            fake = userInput.nextLine();
        }
        if(player.getWeapon() == Weapons.lightsaberShoto)
        {
            System.out.println("You pull out your weapon, ignite it, and prepare to fight!");
            fake = userInput.nextLine();
        }
        else
        {
            System.out.println("You pull out your weapon and prepare to fight!");
            fake = userInput.nextLine();
        }
        battleDarthVader();

    }

    public static void resetTrooperHealth()
    {
        NpcTypes.stormtrooper.setHitPoints(5);
        NpcTypes.heavyStormtrooper.setHitPoints(5);
        NpcTypes.jumptrooper.setHitPoints(5);
        NpcTypes.scoutTrooper.setHitPoints(5);
        NpcTypes.imperialOfficer.setHitPoints(5);
        NpcTypes.imperialSpecForce.setHitPoints(10);
    }

    public static void battleStormtrooper()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.stormtrooper.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.stormtrooper.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.stormtrooper.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.stormtrooper.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.stormtrooper.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.stormtrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.stormtrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.stormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The Stormtrooper missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.stormtrooper.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.stormtrooper.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.stormtrooper.getHitPoints() + NpcTypes.stormtrooper.getArmor();
                        NpcTypes.stormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.stormtrooper.getName() + ". It has " + NpcTypes.stormtrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.stormtrooper.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.stormtrooper.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.stormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the stormtrooper");
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.stormtrooper.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.stormtrooper.getHitPoints() + NpcTypes.stormtrooper.getArmor();
                        NpcTypes.stormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.stormtrooper.getName() + ". It has " + NpcTypes.stormtrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.stormtrooper.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.stormtrooper.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.stormtrooper.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.stormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The stormtrooper missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        
                    }

                    if(NpcTypes.stormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the stormtrooper");
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The Stormtrooper will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.stormtrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.stormtrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.stormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The Stormtrooper missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.stormtrooper.getHitPoints() + NpcTypes.stormtrooper.getArmor();
                            NpcTypes.stormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.stormtrooper.getName() + ". It has " + NpcTypes.stormtrooper.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        
                    }

                    if(NpcTypes.stormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the stormtrooper");
                        stillAlive = false;
                    }
                }
            }
        }   
    }      

    public static void battleHeavyStormtrooper()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.heavyStormtrooper.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.heavyStormtrooper.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.heavyStormtrooper.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.heavyStormtrooper.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.heavyStormtrooper.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.heavyStormtrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.heavyStormtrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.heavyStormtrooper.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.heavyStormtrooper.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.heavyStormtrooper.getHitPoints() + NpcTypes.heavyStormtrooper.getArmor();
                        NpcTypes.heavyStormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.heavyStormtrooper.getName() + ". It has " + NpcTypes.heavyStormtrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.heavyStormtrooper.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.heavyStormtrooper.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.heavyStormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.heavyStormtrooper.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.heavyStormtrooper.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.heavyStormtrooper.getHitPoints() + NpcTypes.heavyStormtrooper.getArmor();
                        NpcTypes.heavyStormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.heavyStormtrooper.getName() + ". It has " + NpcTypes.heavyStormtrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.heavyStormtrooper.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.heavyStormtrooper.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.heavyStormtrooper.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.heavyStormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.heavyStormtrooper.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.heavyStormtrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.heavyStormtrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.heavyStormtrooper.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.heavyStormtrooper.getHitPoints() + NpcTypes.heavyStormtrooper.getArmor();
                            NpcTypes.heavyStormtrooper.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.heavyStormtrooper.getName() + ". It has " + NpcTypes.heavyStormtrooper.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.heavyStormtrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.heavyStormtrooper.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

    public static void battleJumptrooper()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.jumptrooper.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.jumptrooper.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.jumptrooper.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.jumptrooper.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.jumptrooper.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.jumptrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.jumptrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.jumptrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.jumptrooper.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.jumptrooper.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.jumptrooper.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.jumptrooper.getHitPoints() + NpcTypes.jumptrooper.getArmor();
                        NpcTypes.jumptrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.jumptrooper.getName() + ". It has " + NpcTypes.jumptrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.jumptrooper.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.jumptrooper.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.jumptrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.jumptrooper.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.jumptrooper.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.jumptrooper.getHitPoints() + NpcTypes.jumptrooper.getArmor();
                        NpcTypes.jumptrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.jumptrooper.getName() + ". It has " + NpcTypes.jumptrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.jumptrooper.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.jumptrooper.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.jumptrooper.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.jumptrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.jumptrooper.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.jumptrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.jumptrooper.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The " + NpcTypes.jumptrooper.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.jumptrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.jumptrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.jumptrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.jumptrooper.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.jumptrooper.getHitPoints() + NpcTypes.jumptrooper.getArmor();
                            NpcTypes.jumptrooper.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.jumptrooper.getName() + ". It has " + NpcTypes.jumptrooper.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.jumptrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.jumptrooper.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

    public static void battleImperialSpecForce()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.imperialSpecForce.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.imperialSpecForce.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.imperialSpecForce.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.imperialSpecForce.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.imperialSpecForce.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.imperialSpecForce.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.imperialSpecForce.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.imperialSpecForce.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.imperialSpecForce.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.imperialSpecForce.getHitPoints() + NpcTypes.imperialSpecForce.getArmor();
                        NpcTypes.imperialSpecForce.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.imperialSpecForce.getName() + ". It has " + NpcTypes.imperialSpecForce.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.imperialSpecForce.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.imperialSpecForce.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.imperialSpecForce.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialSpecForce.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.imperialSpecForce.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.imperialSpecForce.getHitPoints() + NpcTypes.imperialSpecForce.getArmor();
                        NpcTypes.imperialSpecForce.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.imperialSpecForce.getName() + ". It has " + NpcTypes.imperialSpecForce.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.imperialSpecForce.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.imperialSpecForce.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.imperialSpecForce.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.imperialSpecForce.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialSpecForce.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.imperialSpecForce.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.imperialSpecForce.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialSpecForce.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.imperialSpecForce.getHitPoints() + NpcTypes.imperialSpecForce.getArmor();
                            NpcTypes.imperialSpecForce.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.imperialSpecForce.getName() + ". It has " + NpcTypes.imperialSpecForce.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.imperialSpecForce.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialSpecForce.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

    public static void battleScoutTrooper()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.scoutTrooper.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.scoutTrooper.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.scoutTrooper.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.scoutTrooper.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.scoutTrooper.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.scoutTrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.scoutTrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.scoutTrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.scoutTrooper.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.scoutTrooper.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.scoutTrooper.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.scoutTrooper.getHitPoints() + NpcTypes.scoutTrooper.getArmor();
                        NpcTypes.scoutTrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.scoutTrooper.getName() + ". It has " + NpcTypes.scoutTrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.scoutTrooper.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.scoutTrooper.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.scoutTrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.scoutTrooper.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.scoutTrooper.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.scoutTrooper.getHitPoints() + NpcTypes.scoutTrooper.getArmor();
                        NpcTypes.scoutTrooper.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.scoutTrooper.getName() + ". It has " + NpcTypes.scoutTrooper.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.scoutTrooper.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.scoutTrooper.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.scoutTrooper.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.scoutTrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.scoutTrooper.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.scoutTrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.scoutTrooper.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The " + NpcTypes.scoutTrooper.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.scoutTrooper.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.scoutTrooper.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.scoutTrooper.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.scoutTrooper.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.scoutTrooper.getHitPoints() + NpcTypes.scoutTrooper.getArmor();
                            NpcTypes.scoutTrooper.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.scoutTrooper.getName() + ". It has " + NpcTypes.scoutTrooper.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.scoutTrooper.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.scoutTrooper.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

    public static void battleImperialOfficer()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.imperialOfficer.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println("There is a " + NpcTypes.imperialOfficer.getName() + " " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.imperialOfficer.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.imperialOfficer.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but the " + NpcTypes.imperialOfficer.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.imperialOfficer.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.imperialOfficer.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialOfficer.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialOfficer.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.imperialOfficer.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but the " + NpcTypes.imperialOfficer.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.imperialOfficer.getHitPoints() + NpcTypes.imperialOfficer.getArmor();
                        NpcTypes.imperialOfficer.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.imperialOfficer.getName() + ". It has " + NpcTypes.imperialOfficer.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.imperialOfficer.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.imperialOfficer.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.imperialOfficer.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialOfficer.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.imperialOfficer.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.imperialOfficer.getHitPoints() + NpcTypes.imperialOfficer.getArmor();
                        NpcTypes.imperialOfficer.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked the " + NpcTypes.imperialOfficer.getName() + ". It has " + NpcTypes.imperialOfficer.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.imperialOfficer.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.imperialOfficer.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.imperialOfficer.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.imperialOfficer.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("The " + NpcTypes.imperialOfficer.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.imperialOfficer.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialOfficer.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println("The " + NpcTypes.imperialOfficer.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.imperialOfficer.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.imperialOfficer.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialOfficer.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("The " + NpcTypes.imperialOfficer.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.imperialOfficer.getHitPoints() + NpcTypes.imperialOfficer.getArmor();
                            NpcTypes.imperialOfficer.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked the " + NpcTypes.imperialOfficer.getName() + ". It has " + NpcTypes.imperialOfficer.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.imperialOfficer.getHitPoints() < 1)
                    {
                        System.out.println("You Killed the " + NpcTypes.imperialOfficer.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

    public static void battleDarthVader()
    {
        Scanner userInput = new Scanner(System.in);
        boolean stillAlive = true;
        boolean outOfRange = true;
        boolean playerOutOfRange = true;
        boolean enemyOutOfRange = true;
        int accuarcyCalc;
        int range = 0;
        int rangeCalc = (int)(Math.random() * 25) + 1;  
        if(playerWeapon.getRange() >= rangeCalc)
        {
            range++;
        }
        if(NpcTypes.darthVader.getWeapon().getRange() >= rangeCalc)
        {
            range++;
        }
        fake = userInput.nextLine();
        System.out.println(NpcTypes.darthVader.getName() + " is " + rangeCalc + " meters away!");
                    
        if (range == 0)
        {

            System.out.println("You are both out of range and will move closer to eachother");

            while(outOfRange)
            {

                rangeCalc = rangeCalc - NpcTypes.darthVader.getSpeed();
            
                rangeCalc = rangeCalc - player.getSpeed();

                if(rangeCalc < 0)
                {
                    rangeCalc = 0;
                }
                fake = userInput.nextLine();
                System.out.println("You are now " + rangeCalc + " meters away.");
                fake = userInput.nextLine();

                if(playerWeapon.getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }

                if(NpcTypes.darthVader.getWeapon().getRange() >= rangeCalc)
                {
                    range++;
                    outOfRange = false;
                }
            }
        } 

        if(range == 1)
        {
            if(playerWeapon.getRange() < rangeCalc)
            {
               System.out.println("You are out of range but " + NpcTypes.darthVader.getName() + " is in range!");

               while(playerOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.darthVader.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.darthVader.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println(NpcTypes.darthVader.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println(NpcTypes.darthVader.getName() + " missed!"); 
                    }

                    rangeCalc = rangeCalc - player.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(playerWeapon.getRange() >= rangeCalc)
                    {
                        range++;
                        playerOutOfRange = false;
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        range++;
                        range++;
                        range++;
                        range++;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }
                    fake = userInput.nextLine();
               } 
            } 

            if(NpcTypes.darthVader.getWeapon().getRange() < rangeCalc)
            {
                System.out.println("You are in range but " + NpcTypes.darthVader.getName() + " is not!");

                while(enemyOutOfRange)
               {
                   accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.darthVader.getHitPoints() + NpcTypes.darthVader.getArmor();
                        NpcTypes.darthVader.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked " + NpcTypes.darthVader.getName() + ". He has " + NpcTypes.darthVader.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }

                    rangeCalc = rangeCalc - NpcTypes.darthVader.getSpeed();

                    if(rangeCalc < 0)
                    {
                        rangeCalc = 0;
                    }
                    System.out.println("You are now " + rangeCalc + " meters away.");

                    if(NpcTypes.darthVader.getWeapon().getRange() >= rangeCalc)
                    {
                        range++;
                        enemyOutOfRange = false;
                    }

                    if(NpcTypes.darthVader.getHitPoints() < 1)
                    {
                        System.out.println("You Killed " + NpcTypes.darthVader.getName());
                        range++;
                        range++;
                        range++;
                        range++;
                    }
                    fake = userInput.nextLine();
               } 
            }
        }   

            
 
        if(range == 2)
        {
            System.out.println("You are both in range.");

            if(player.getSpeed() > NpcTypes.darthVader.getSpeed())
            {
                System.out.println("You will get to attck first becuase you are faster");
            
                while (stillAlive)
                { 
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < playerWeapon.getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int r = NpcTypes.darthVader.getHitPoints() + NpcTypes.darthVader.getArmor();
                        NpcTypes.darthVader.setHitPoints(r - playerWeapon.getDamage()); 
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("You attacked " + NpcTypes.darthVader.getName() + ". He has " + NpcTypes.darthVader.getHitPoints() + " HP left!");
                    }

                    else
                    {
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println("Your attack missed!");
                        fake = userInput.nextLine(); 
                    }
            
                    if(NpcTypes.darthVader.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < NpcTypes.darthVader.getWeapon().getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int y = player.getHitPoints() + player.getArmor();
                            player.setHitPoints(y - NpcTypes.darthVader.getWeapon().getDamage());
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println(NpcTypes.darthVader.getName() + " attacked you now your HP is " + player.getHitPoints());
                        }

                        else
                        {
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println(NpcTypes.darthVader.getName() + " missed!");
                            fake = userInput.nextLine();
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.darthVader.getHitPoints() < 1)
                    {
                        System.out.println("You Killed "+ NpcTypes.darthVader.getName());
                        stillAlive = false;
                    }
                }      
            }

            else
            {
                System.out.println(NpcTypes.darthVader.getName() + " will get to attck first becuase it is faster than you");
            

                while (stillAlive)
                {
                    accuarcyCalc = (int)(Math.random() * 100) + 1;

                    if(accuarcyCalc < NpcTypes.darthVader.getWeapon().getAccuracy())
                    {
                        fake = userInput.nextLine();
                        int y = player.getHitPoints() + player.getArmor();
                        player.setHitPoints(y - NpcTypes.darthVader.getWeapon().getDamage());
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println(NpcTypes.darthVader.getName() + " attacked you now your HP is " + player.getHitPoints());
                    }

                    else
                    {
                        fake = userInput.nextLine();
                        System.out.println("PEW! PEW! PEW!");
                        System.out.println(NpcTypes.darthVader.getName() + " missed!"); 
                    }
            
                    if(player.getHitPoints() > 0)
                    {
                        accuarcyCalc = (int)(Math.random() * 100) + 1;

                        if(accuarcyCalc < playerWeapon.getAccuracy())
                        {
                            fake = userInput.nextLine();
                            int r = NpcTypes.darthVader.getHitPoints() + NpcTypes.darthVader.getArmor();
                            NpcTypes.darthVader.setHitPoints(r - playerWeapon.getDamage()); 
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("You attacked " + NpcTypes.darthVader.getName() + ". He has " + NpcTypes.darthVader.getHitPoints() + " HP left!");
                        
                        }

                        else
                        {
                            fake = userInput.nextLine();
                            System.out.println("PEW! PEW! PEW!");
                            System.out.println("Your attack missed!");
                        
                        }
                    }

                    if(player.getHitPoints() < 1)
                    {
                        System.out.println("You died!!! Game Over!!!");
                        stillAlive = false;
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                        fake = userInput.nextLine();
                    }

                    if(NpcTypes.darthVader.getHitPoints() < 1)
                    {
                        System.out.println("You Killed " + NpcTypes.darthVader.getName());
                        stillAlive = false;
                    }
                }
            }
        }   
    }

}