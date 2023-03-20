import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (ClaudiaEspinosa) 
 * @version clase 02/03/202
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Wall wall = new Wall();
        addObject(wall,281,77);
        Wall wall2 = new Wall();
        addObject(wall2,281,105);
        Wall wall3 = new Wall();
        addObject(wall3,281,133);
        Wall wall4 = new Wall();
        addObject(wall4,281,161);
        Wall wall5 = new Wall();
        addObject(wall5,308,119);
        Wall wall6 = new Wall();
        addObject(wall6,335,119);
        Wall wall7 = new Wall();
        addObject(wall7,361,119);
        Wall wall8 = new Wall();
        addObject(wall8,388,119);
        Wall wall9 = new Wall();

        Wall wall11 = new Wall();
        addObject(wall11,253,161);
        Wall wall12 = new Wall();
        addObject(wall12,226,161);
        Wall wall13 = new Wall();
        addObject(wall13,35,13);
        Wall wall14 = new Wall();
        addObject(wall14,63,13);
        Wall wall15 = new Wall();
        addObject(wall15,91,13);
        Wall wall16 = new Wall();
        addObject(wall16,410,28);
        Wall wall17 = new Wall();
        addObject(wall17,437,28);
        Wall wall18 = new Wall();
        addObject(wall18,465,28);
        Wall wall19 = new Wall();
        addObject(wall19,492,28);
        Wall wall20 = new Wall();
        addObject(wall20,525,109);
        Wall wall21 = new Wall();
        addObject(wall21,552,109);
        Wall wall22 = new Wall();
        addObject(wall22,579,109);

        Wall wall23 = new Wall();
        addObject(wall23,74,92);
        Wall wall24 = new Wall();
        addObject(wall24,74,119);
        Wall wall25 = new Wall();
        addObject(wall25,74,147);
        Wall wall26 = new Wall();
        addObject(wall26,74,174);
        Wall wall27 = new Wall();
        addObject(wall27,74,202);

        Wall wall28 = new Wall();
        addObject(wall28,102,92);
        Wall wall29 = new Wall();
        addObject(wall29,130,92);
        Wall wall30 = new Wall();
        addObject(wall30,91,297);
        Wall wall31 = new Wall();
        addObject(wall31,64,297);

        Wall wall32 = new Wall();
        addObject(wall32,250,247);
        Wall wall33 = new Wall();
        addObject(wall33,277,247);
        Wall wall34 = new Wall();
        addObject(wall34,304,247);

        Wall wall35 = new Wall();
        addObject(wall35,332,247);
        Wall wall36 = new Wall();
        addObject(wall36,360,247);
        Wall wall37 = new Wall();
        addObject(wall37,387,247);
        Wall wall38 = new Wall();
        addObject(wall38,321,274);
        Wall wall39 = new Wall();
        addObject(wall39,321,302);

        Wall wall40 = new Wall();
        addObject(wall40,520,252);
        Wall wall41 = new Wall();
        addObject(wall41,520,278);
        Wall wall42 = new Wall();
        addObject(wall42,520,306);
        Wall wall43 = new Wall();
        addObject(wall43,520,305);

        Wall wall44 = new Wall();
        addObject(wall44,189,310);
        Wall wall45 = new Wall();
        addObject(wall45,189,338);
        Wall wall46 = new Wall();
        addObject(wall46,189,365);

        Apple apple = new Apple();
        addObject(apple,557,31);
        Bannana bannana = new Bannana();
        addObject(bannana,259,292);
        BigItem bigItem = new BigItem();
        addObject(bigItem,25,56);
        Cherry cherry = new Cherry();
        addObject(cherry,234,110);
        SmallItem smallItem = new SmallItem();
        addObject(smallItem,467,169);
        SmallItem smallItem2 = new SmallItem();
        addObject(smallItem2,331,58);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,555,352);
        Bannana bannana2 = new Bannana();
        addObject(bannana2,37,355);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,383,363);
        SmallItem smallItem3 = new SmallItem();
        addObject(smallItem3,127,20);
        Pacman pacman = new Pacman();
        addObject(pacman,27,248);
    }
}
