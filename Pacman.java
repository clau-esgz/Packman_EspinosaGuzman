import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 @author (ClaudiaEspinosa) 
 * @version clase 02/03/2023
 */
public class Pacman extends Actor{
    private static final int COUNT_DOWN_MOUTH_START_VALUE = 15 ;
    private static final int OFFSET = 2;
    
    private static final int DIRECTION_RIGHT = 0;
    private static final  int DIRECTION_LEFT = 1;
    private static final int DIRECTION_UP = 2;
    private static final int DIRECTION_DOWN = 3;
    
    private int mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
    
    private String [][] images;
    private int imageIndex;
    private int direction = DIRECTION_RIGHT;
    private int score;
    private int offsetX = 0 ;
    private int offsetY = 0;
    

    public Pacman(){
        prepareImagesCollection();
        
    }
    private void prepareImagesCollection(){
        images = new String[4][];
        images[DIRECTION_RIGHT]= new String[]{
        "images/pacman-close.png",
        "images/pacman-open.png"
        };
        
        images[DIRECTION_LEFT] = new String []{
          "images/pacman-close-left.png",
          "images/pacman-open-left.png"
        };
        
        images[DIRECTION_DOWN]= new String[]{
        "images/pacman-close-down.png",
        "images/pacman-open-down.png"
        };
        
        images[DIRECTION_UP] = new String []{
          "images/pacman-close-up.png",
          "images/pacman-open-up.png"
        };
        
        setImage(images[DIRECTION_RIGHT][0]);
    }
    
    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        handleKeys();
        
        handleImageSelector();
        
        movePacman();
        
        checkCollisions();
        
        updateHud();
        
        
        }
    private void movePacman()
        {
             switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                break;
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                break;
            case DIRECTION_UP:
                setLocation(getX(),getY()- OFFSET);
                break;
            case DIRECTION_DOWN:
                setLocation(getX(),getY() + OFFSET);
                break;
        }
        Actor wall = getWallOnTheWay();

        if(wall != null) {
            setLocation(getX() - offsetX, getY() - offsetY);
        }
        }
        
       private void handleKeys()
       {
       if(Greenfoot.isKeyDown("left"))
        {
            direction = DIRECTION_LEFT;
            offsetY = 0;
            offsetX = -OFFSET;
        }else if(Greenfoot.isKeyDown("right")){
            direction = DIRECTION_RIGHT;
            offsetY = 0;
            offsetX = OFFSET;
            
        }else if (Greenfoot.isKeyDown("up")){
            
            direction = DIRECTION_UP;
            offsetX = 0;
            offsetY = -OFFSET;
          
        }else if (Greenfoot.isKeyDown("down")){
            direction = DIRECTION_DOWN;
            offsetX = 0;
            offsetY = OFFSET;
            
        }
    }
    private void handleImageSelector(){
       mouthDelay --;
        if (mouthDelay == 0){
            imageIndex = (imageIndex + 1) % images[direction].length;
            setImage(images[direction][imageIndex]);
            mouthDelay = COUNT_DOWN_MOUTH_START_VALUE;
        } 
    }
    private void updateHud (){
        World world = getWorld();
        world.showText("score : " + score, world.getWidth() -100 ,20);
    }
    private void checkCollisions(){
        Item item = (Item)this.getOneIntersectingObject(Item.class);
        if (item != null){
            score += item.getPoints();
            this.getWorld().removeObject(item);
            
        }
    }
    private Wall getWallOnTheWay(){
        switch(direction){
            case DIRECTION_UP:
                return (Wall)getOneObjectAtOffset(0,-30,Wall.class);
            case DIRECTION_DOWN:
               return (Wall)getOneObjectAtOffset(0,30,Wall.class);
            case DIRECTION_RIGHT:
                return (Wall)getOneObjectAtOffset(30,0,Wall.class);
            case DIRECTION_LEFT:
               return (Wall)getOneObjectAtOffset(-30,0,Wall.class);
                        
        }
        return null;
    }
    }

