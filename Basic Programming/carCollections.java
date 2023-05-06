



import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class carCollections
{
public static void main(String[] args)
{

    Cars1 c1 = new Cars1("Aston Martin", "DB11", 3.29, 301, 5198, 675, 675);
List<Cars1> cat = new ArrayList<Cars1>();
cat.add(c1);
cat.add(new Cars1("Audi", "A8 L", 1.92, 250, 2995, 500, 500));
cat.add(new Cars1("Bentley", "Bentayga", 4.10, 290, 3996, 770, 770));
cat.add(new Cars1("BMW", "840i Gran Coupe", 1.62, 250, 2998, 500, 500));
cat.add(new Cars1("Aston Martin", "Vantage", 2.95, 314, 3982, 685, 685));
cat.add(new Cars1("Audi", "RSS", 1.27, 250, 2894, 600, 600));
cat.add(new Cars1("BMW", "M8", 2.65, 250, 4395, 750, 750));
cat.add(new Cars1("Ferrari", "Roma", 3.76, 320, 3855, 760, 760));

cat.stream().forEach(System.out::println);
// using streams to sort and filter
cat.stream()
.filter(d -> d.getSpeed() < 300)
.sorted(comparing(Cars1::getPrice));

System.out.println(cat);
}
}



 class Cars1
{
private String make;
private String model;
private double price;
private int top_speed;
private int engine;
private int max_torque;
private int max_power;

Cars1(String make, String model, double price, int top_speed, int engine, int max_torque, int max_power)
{
this.make = make;
this.model = model;
this.price = price;
this.top_speed = top_speed;
this.engine = engine;
this.max_torque = max_torque;
this.max_power = max_power;
}

public Cars1()
{

}



// getter and setter for Make
String getMake()
{
return make;
}
void setMake(String make)
{
this.make = make;
}

// getter and setter for Model
String getModel()
{
return model;
}
void setModel(String model)
{
this.model = model;
}

// getter and setter for price
double getPrice()
{
return price;
}
void setPrice(double price)
{
this.price = price;
}

// getter and setter for top_speed
int getSpeed()
{
return top_speed;
}
void setSpeed(int top_speed)
{
this.top_speed = top_speed;
}

// getter and setter for Engine
int getEngine()
{
return engine;
}
void setEngine(int engine)
{
this.engine = engine;
}

// getter and setter for max_torque
int getTorque()
{
return max_torque;
}
void setTorque(int max_torque)
{
this.max_torque = max_torque;
}

// getter and setter for max_power
int getPower()
{
return max_torque;
}
void setPower(int max_power)
{
this.max_power = max_power;
}
}