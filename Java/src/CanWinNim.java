
public class CanWinNim {
    public boolean canWinNim ( int n ) {
        return n%4!=0;
    }

    public static void main ( String[] args ) {
        System.out.print(new CanWinNim().canWinNim(5));

    }
}
