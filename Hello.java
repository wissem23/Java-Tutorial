class Hello {
    public static void main( String[] args){
         
        //Type conversion

        // int i = 12 ;
        // byte b = 127;
        
        // i = b;       // conversion
        // b = (byte)i; //casting 
        // // type promotions
        // byte x = 30;
        // byte y = 10;

        // //byte z = x*y ; out of byte range
        // int z = x*y ;

        // Logical Operators
        // int a = 10;
        // int b = 5;

        // int x = 100;
        // int y = 50;

        // boolean r = a<b && x<y; 

        // If Else if
        // int x = 8;
        // int y = 50;
        // int z= 12;
        // if(x>y && x>z){
        //     System.out.println(x);
        // }
        // else if(y>z){
        //     System.out.println(y);
        // }else{
        //     System.out.println(z);
        // }

        //ternary

        int x=5;
         String result = "even";

        // if( x%2 != 0){
        //     result="odd";
        // }
        result = x%2 != 0 ? "odd" : "even";
        System.out.println(result);
    }
}