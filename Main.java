
//import tools.*;

@FunctionalInterface   // have one methode
interface I {
    int add(int i , int j);
}


// enums
// enum Status{
//     Running,
//     Faild,
//     Pending,
//     Success
// }
// enum Laptop{
//     Macbook(2000) , Tuf , Thinkpad(2200) , XPS(3000) ;

//     private int price;

//     private Laptop(int price) {
//         this.price = price;
//     }
//     private Laptop(){
//         price = 1800;
//     }
//     public int getPrice() {
//         return price;
//     }
//     public void setPrice(int price) {
//         this.price = price;
//     }
// }

//interfaces
// interface I {
//     int age = 18;        // by default: static final
    
//     void show();        // by default: public abstract
//     void confg();
// }
// interface J {
//     void play();
// }
// interface K extends J{

// }
// class C implements I,K{
//     public void confg() {
//         System.out.println("In config C ");        
//     }
//     public void show() {
//         System.out.println("In show C");        
//     }
    
//     public void play() {
//         System.out.println("In play C");
//     }   
// }

// interface Computer{
//     void code();
// }
// class Laptop implements Computer {
//     public void code(){
//         System.out.println("coding , compile , run ");
//     }
// }
// class Desktop implements Computer{
//     public void code(){
//         System.out.println("coding , compile , run : faster");
//     }
// }
// class Developer{
//     public void devApp(Computer Comp){
//         Comp.code();
//     }
   
// }

//abstruct
// abstract class Car {
//     public abstract void drive();
    
//     public abstract void camion();
// }
// abstract class Bmw extends Car{

//     @Override
//     public void drive() {
//        System.out.println("in driving");
//     }
//     public void playingMusic(){
//         System.out.println("in playing music");
//     }
    
// }
// class Bmw4x4 extends Bmw{

//     @Override
//     public void camion() {
//         System.out.println("has  camion");
//     }

// }
// class BmwSport extends Bmw4x4 {
//     public void modeSport(){
//         System.out.println("mode sport On");
//     }
// }


// class Rectangle {
//     public int a=5;

//     public int Aire(int x,int y){
//         int ar= x*y;
//         return ar;
//     } 

//     // overloading (same name of methode ,different of return type and param number or type)
//     public double Aire(int x,int y ,double z){
//         double ar= x*y*z;
//         return ar;
//     } 
// }
// class Student {
//     public String name;
//     public String classroom;
//     public int age;

// }
// class Human{
//     private String name;
//     private int age;

//     // Constructor
//     //Default Constructor
//     public Human(){
        
//     }
//     //Parameterized Constructor
//     public Human(String name , int age ){
//         this.name = name;
//         this.age=age;

//     }
//     //Getters & Setters
//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//             this.name = name;
//         }
//     // public void setName(String name,Human obj){
//     //     obj.name = name;
//     // }
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         this.age = age;
//     }

// }
// class A {
// public A(){
//     System.out.println("in A");
// }
// public A(int n){
//     System.out.println("in A int");
// }
// }
// class B extends A{
//     public B(){
//         //super(5);
//         this(7);
//         System.out.println("in B");
//     }
//     public B(int m){
//         super(m);
//         //this();
//         System.out.println("in B int");
//     }
// }

// class C {
//     public void show(){
//         System.out.println("in C show");
//     }
//     public void play(){
//         System.out.println("in C play");
//     }
// }

// class D extends C {
//     @Override
//     public void show(){
//         System.out.println("in D show");
//     }
   

// }


class Main {
    public static void main( String[] args) throws ClassNotFoundException{
         
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
        // Student s1 = new Student();
        // s1.name= "ahmed";
        // s1.classroom = "IT";
        // s1.age=24;

        // Student s2 = new Student();
        // s2.name= "rami";
        // s2.classroom = "GC";
        // s2.age=27;
        
        // Student students[] = new Student[2];
        // students[0]=s1;
        // students[1]=s2;

        // for(int i=0 ;i<students.length;i++){
        //     System.out.println(students[i].name +": "+students[i].classroom+ " :"+students[i].age);
        // }

    // For-Each loop
        // for (Student s : students) {
        //     System.out.println(s.name +": "+s.classroom+ " :"+s.age);
        // }

    // String (or String Builder): Mutable , not thread safe
        // String name = "wissem";
        // System.out.println(name.hashCode());
        // name = name + " ch";
        // System.out.println(name.hashCode());
        // System.out.println(name);

        // String s1 = "Wissem";
        // String s2 = "Wissem";
        
        // System.out.println(s1==s2);
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());

        // //String lastName = new String("chehoumi");
        // System.out.println(name);

    // String Buffer  : Immutable ,thread safe
        // StringBuffer s1 = new StringBuffer("wissem");
        // // s1 = "chehoumi";   this is not work
        // System.out.println(s1.capacity()); // 22 caractere :  16 caractere always present and the 6 fo wissem
        // s1.append(" chehoumi");
        // s1.insert(7, "al ");
        // String s2 = s1.toString();
        // System.out.println(s2);
        // System.out.println(s1);

    //static (ps: class loads & objects are instantiated)
        //static variable
        //     class Mobile {
        //         String brand;
        //         double price;
        //         static String name;
        //         public void show(){
        //             System.out.println(brand + " "+price+" "+name);
        //         }
        //         //static methode
        //         public static void show1(Mobile obj){
        //             System.out.println(obj.brand + " "+obj.price+" "+name);
        //         }
        //     //contructor    
        //     public Mobile(){
        //         brand ="";
        //         price = 0;
        //         System.out.println("this is static contructor");


        //     };
        //     // static block
        //     static{
        //         name = "Phone";
        //         System.out.println("this is static block");
        //     }
        //     }

        //     Mobile m1 = new Mobile();
        //     m1.brand = "apple";
        //     m1.price = 1500;
        //     Mobile.name = "SmartPhone";

        //     Mobile m2 = new Mobile();
        //     m2.brand = "sumsung";
        //     m2.price = 1200;

        //     Mobile.name = "Phone";
        //     m2.show();

        //     Mobile m3 = new Mobile();
        //     System.out.println(m3.price);
        // // Class.forName("Mobile");
        //     Mobile.show1(m1);

    // Encapsulation
        // Human h1 = new Human();
        // //h1.setName("wissem",h1);
        // h1.setName("wissem");
        // h1.setAge(25);
        // System.out.println(h1.getName()+" "+h1.getAge());
    // Constructor
        // Human h2 = new Human("Ali",15);
        // System.out.println(h2.getName()+" : "+h2.getAge());

    //super() & this()
        // B b = new B();
        // //B b1 = new B(5);

    // Inheritance
        // AdvCal obj1 = new AdvCal();
        // int n1 = obj1.add(5, 2);
        // int n2 = obj1.mul(5, 2);
        // System.out.println(n1+"    "+n2);
     
    // Overriding    
        // D obj = new D();
        // obj.show();
        // obj.play();

    
    // Abstruct and Polymorphisme
    //     Car obj = new Bmw4x4();
    //     obj.drive();
    //    // obj.playingMusic();
    //     obj.camion();

    //     // UpCasting
    //     Bmw4x4 obj1 = new BmwSport();
    //    // obj1 same obj2
    //     Bmw4x4 obj2 =(Bmw4x4) new BmwSport();

    //     //DownCasting
    //     BmwSport obj3 = (BmwSport)obj1;

    //interface
        // I obj;
        // obj = new C();
        // obj.confg();
        // obj.show();

        // K obj1 = new C();
        // obj1.play();

        // System.out.println(I.age);
    //Need of Interface
        // Computer lap = new Laptop();
        // Computer desk = new Laptop();

        // Developer dev = new Developer();
        // dev.devApp(desk);
    
    //Enums
        // Status s = Status.Running;
        // //System.out.println(s);

        // Status ss[] = Status.values();
        // for (Status status : ss) {
        //     System.out.println(status+" : "+status.ordinal());
        // }

        // Laptop lap = Laptop.Tuf;
        
        // for (Laptop laptop : lap.values()) {
        //     System.out.println(laptop+ " : " +laptop.getPrice());
        // }

    //Functional Interface
        I obj = new I() {
            @Override
            public int add(int i,int j){
                return i+j;
            }
            
        };
       int r =  obj.add(5,8);
       System.out.println(r);
    //Lamda Expression
    I obj1 =  (i,j) ->  i+j;
       
   int r1 =  obj1.add(2,3);
   System.out.println(r1);

    }
}