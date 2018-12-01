import java.awt.*;
import java.applet.*;

//<applet code = "event.class" width = "400" height = "400" ></applet>

public class event extends Applet
 {
  static final int n =4;
  Label lab;
  public void init()
   {
    setLayout(new GridLayout(n,n));
    setFont(new Font("Verdana",Font.BOLD,24));

    for(int i=0;i<n;i++)
     {
      for(int j=0;j<n;j++)
       {
       int k=i*n+j;
        if(k>0)
         add(new Button("  "+k));
      }
    }

    lab = new Label(" * ", Label.CENTER);
    setFont(new Font("TimesRoman",Font.ITALIC,24));
    add(lab);
  }
 public boolean action(Event e, Object obj)
  {
    if(e.target instanceof Button)
      {
       lab.setText((String) obj);
      }
      return false;
    }
  }
