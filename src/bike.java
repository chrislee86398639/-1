class Rect{
    protected float width,height;
    public float area;
    public Rect (float w ,float h){

        width = w;
        height = h;
        area = getArea(w,h);
    }
    public float getArea(float w,float h){
        float a;
        a = w*h;
        return a;
        }

}
class MyRect{
    public static void main(String[] args){
        Rect rect = new Rect (4.0f,6.0f);
        System.out.println("The area is :"+rect.area);
    }
}
public class Sample1{}
public class Sample2{
    public Sample2(int a){System.out.println(“My Constructor”);}
}
 
public class Sample3{
    public Sample3(){System.out.println(“My Default Constructor”);}
}
    Sample1 s1=new Sample1();
    Sample2 s2=new Sample2();  //非法
    Sample2 s22=new Sample2(1);
    Sample3 s3=new Sample3();
