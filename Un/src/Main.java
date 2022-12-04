//klasa reprezentująca dwuwymiarowy obiekt
class TwoDShape {
    double width, height;

    void showDim() {
        System.out.println("Szerokość i wysokość obiektu:" + width + "i" + height);}
}
//klasa pochodną klasy bazowej
class Triange extends TwoDShape {//Traingle dziedziczy po TwoDShape
    String style; //własną słądowa
    double area(){return width*height/2;} //Triangle może używac składowych TwoDShape jak własnych
    void showStyle(){System.out.println("Trójkąt jest" + style);}
}

class Shape {
    public static void main(String[]args) {
        Triangle t1=new Triangle();
        Triangle t2=new Triangle();

        t1.width=4.0; //obiekty Triaingle mogą równiez składowych TwoDShape
        t1.height=4.0;
        t1.style="wypełniony";
        t2.width=8.0;
        t2.height=12.0;
        t2.style="pusty";

        System.out.println("Informacje o t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Powierzchnia wynosi:" + t1.area());
        System.out.println();
        System.out.println("INformacje o t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Powierchnia wynosi:" + t2.area());
    }
}
