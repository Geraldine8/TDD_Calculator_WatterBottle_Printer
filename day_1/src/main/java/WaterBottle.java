public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int getVolume(){
        return volume;
    }

    public int canDrink(){
        this.volume -= 10;
        return this.volume;
    }

    public int canEmpty(){
        return this.volume = 0;
    }

    public int canFill(){
        return this.volume = 100;
    }


}
