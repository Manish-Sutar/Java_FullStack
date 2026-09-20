class game1
{

    void play()
    {
        System.out.println("playing the game ");
    }
}
class play extends game1
{
    void play()
    {
        System.out.println("playing rock paper sisor");

    }
    void gamerule()
    {
        System.out.println("rock paper sisor");
    }
}
public class game
{
    public static void main(String args[])
    {
        game1 g =new game1();
        
    }
}
