package extend1.ex;

public class Album extends Item{
    public String artist;


    public Album(String name, int price) {
        super(name, price);

    }


    @Override
    public void print() {
        super.print();
        System.out.println("artist = " + artist);

    }
}
