class Hello {
    public static void main( String args[]){
        int i = 12 ;
        byte b = 127;
        
        i = b;       // conversion
        b = (byte)i; //casting 
        // type promotions
        byte x = 30;
        byte y = 10;

        //byte z = x*y ; out of byte range
        int z = x*y ;


        System.out.println(z);
    }
}