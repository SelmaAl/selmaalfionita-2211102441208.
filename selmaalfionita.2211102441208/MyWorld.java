import greenfoot.*;  
public class MyWorld extends World
{
    private int currentLevel = 1;
    public MyWorld()
    {    
        super(600, 400, 1);
        prepare();
    }
    public void act(){
        //Priksa apakah level selesai
        if (getObject(ObjectSpesial.class).isEmpty()) {
            if (currentLevel < 3) { //ganti angka ini sesuai level
                currentLevel++;
                addObject(new LevelComplete(currentLevel), getWidth() / 2,
        }
    }
}
getHight() / 2);
                Greenfoot.delay
