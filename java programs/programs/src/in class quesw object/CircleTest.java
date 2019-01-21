class Circle {

double radius;

Circle(){
    this.radius=1;
}
Circle (double r){
    this.radius=r;
}


double Area(){
    double temp=radius*radius*3.14;
    return temp;
}
double circumfrence(){
    double temp1= 2*3.14*radius;
    return temp1;
}
void display(double ar , double cir)
{System.out.println("Area is"+ar);
System.out.println("Circumfrence is " +cir);
}

}
class CircleTest{   
    public static void main (String[] args){
        Circle c = new Circle (2);
    
        double temp3 = c.Area();
        double temp4 = c.circumfrence();
        c.display(temp3,temp4);


}
}
    

