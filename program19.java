import java.applet.Applet; 
import java.awt.Graphics; 
public class LifecycleApplet extends Applet { 
public void init() { 
System.out.println("Applet initialized"); 
} 
} 
public void start() { 
System.out.println("Applet starting"); 
} 
public void stop() { 
System.out.println("Applet stopping"); 
} 
public void destroy() { 
} 
System.out.println("Applet destroyed"); 
public void paint(Graphics g) { 
} 
g.drawString("See console for life cycle messages.", 10, 20); 
