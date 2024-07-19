class Rectangle {
    public int a=5;

    public int Aire(int x,int y){
        int ar= x*y;
        return ar;
    } 

    // overloading (same name of methode ,different of return type and param number or type)
    public double Aire(int x,int y ,double z){
        double ar= x*y*z;
        return ar;
    } 
}
class Student {
    public String name;
    public String classroom;
    public int age;

}


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

        // int x=5;
        //  String result = "even";

        // // if( x%2 != 0){
        // //     result="odd";
        // // }
        // result = x%2 != 0 ? "odd" : "even";
        // System.out.println(result);

        //switch

        // int n = 5;
        // switch (n) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Thursday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Sturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        
        //     default:
        //         System.out.println("enter a valid number");
        //         break;
        // }


        // while loop
        // int n = 0;
        // while (n<10) {
        //     System.out.println(n);
        //     n++;            
        // }

        // Do while loop
        // int n = 11;
        // do {
        //     System.out.println(n);
        //     n++;
        // } while (n<10);

        // nested while loop
        // int i = 0;
        // while (i<10) {
        //     System.out.println(i);
        //     int j = 0;
        //     while (j<3) {
        //         System.out.println("done "+j);
        //         j++;
        //     }
        //     i++;            
        // }

        //  for loop

        // for (int i=0;i<10;i++){
        //     System.out.println(i);
        // }

        // Class and Object
        // int n1=5;
        // int n2=2;
        // double n3 = 4;
        // Rectangle rec = new Rectangle();
        // int r=rec.Aire(n1, n2);
        // double r2=rec.Aire(n1, n2, n3);
        // System.out.println(r2);
        // System.out.println(rec.a);

        // Data Area( Stack And Heap ) 


        // Array

        // int nums[] = {5,6,9,45};  //taille mutable
         // nums[1]=17;
        //System.out.println(nums.length);
        // System.out.print('{');
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ,");
        // }
        //System.out.print('}');
        
        // int tab[] = new int[4]; //taille immutable
        // tab[0]=14;
        // tab[1]=4;
        // tab[2]=1;
        // tab[3]=8;
        // //tab[4]=9;
        // for(int i=0;i<tab.length;i++){
        //         System.out.print(tab[i]+" ");
        //     }
        
        // 2D Array

    //     int tab[][] = new int[3][4];
    //     for(int i=0;i<3;i++){
    //         for(int j=0;j<4;j++){
    //             tab[i][j]=(int)(Math.random()*10);
    //         }
    //     }

    //     for (int i=0;i<3;i++){
    //         for(int j=0;j<4;j++){
    //             System.out.print(tab[i][j]+" ");
    //         }
    //     System.out.println();        
    //     }
    //    System.out.println();
    //     // Enhanced for loop (or for-each loop)
    //     //for(dataType variable : array) {// Use element }
    //     for(int n[] : tab){
    //         for(int m: n){
    //             System.out.print(m + " ");        
    //         }
    //         System.out.println();
    //     }
        
    // Array of object
    Student s1 = new Student();
    s1.name= "ahmed";
    s1.classroom = "IT";
    s1.age=24;

    Student s2 = new Student();
    s2.name= "rami";
    s2.classroom = "GC";
    s2.age=27;
    
    Student students[] = new Student[2];
    students[0]=s1;
    students[1]=s2;

    for(int i=0 ;i<students.length;i++){
        System.out.println(students[i].name +": "+students[i].classroom+ " :"+students[i].age);
    }
       


    }
   


}