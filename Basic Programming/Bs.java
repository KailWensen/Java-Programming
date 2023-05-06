class A {
    int a;
    float b;

    void Show() {
        System.out.println("b in super class: " + b);
    }
}

class Bs extends A 
{
    int a;
    float b;

    Bs(int p, float q) 
    {
        a = p;
        super.b = q;
    }

    void Show() {
        super.Show();
        System.out.println("b in super class: " + super.b);
        System.out.println("a in sub class: " + a);
    }

    public static void main(String[] args) 
    {
        Bs subobj = new Bs(1, 5);
        subobj.Show();
    }
}