/**
 * @Nogizakaz
 */
public class ReverseString {
    public String reverseString ( String s ) {
        if ( s.isEmpty() ) {
            return "null";
        }
        String str = new String();

        char[] ch1 = s.toCharArray();

        str = "";
        for ( int i = s.length() - 1 ; i >= 0 ; i-- ) {
            str += ch1[i];

        }
        return str;


    }

    public static void main ( String[] args ) {
        String b = "";
        String a = new String( b );
        System.out.print( new ReverseString().reverseString( a ) );

    }

}
