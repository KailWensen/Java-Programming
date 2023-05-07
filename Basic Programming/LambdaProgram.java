import java.awt.*;//to import awt package which contains interactive window package with a frame window

public class LambdaProgram
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("Action Listener Java");//adding a window frame
        Button b=new Button("Click here");//adding buttons to that frrame
        b.setBounds(50,100,100,50);//setting the size of the button
        Button b1=new Button ("Hello, Click here");
        b1.setBounds(50,50,50,50);


        //LAmbda allows to vrate small block of code without vreating a whole fucntion for it. 
        //Syntax:    ()-> [expression]

        b.addActionListener(e -> System.out.println("Hello Wold"));//using lambda expression to make short fucntions on the go.
        b1.addActionListener(e1 -> System.out.println("Hello Everyone"));
        frame.add(b1);//adding buttons to the frame
        frame.add(b);
        frame.setSize(200,200);//setting the size of the frame
        frame.setLayout(null);
        frame.setVisible(true);
    
    }
}