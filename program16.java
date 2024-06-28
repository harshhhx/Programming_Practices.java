import java applet.Applet; 
import java.awt.Graphics; 
public class Hello Applet extends Applet { 
public void paint (Graphicsg) { 
gdrawstring("HELLO JAVA", 20, 20), 
} 
} 
To run this applet, you would need an HTML file: 
<html> 
<body> 
<applet code="Hello Applet.class" width="300" height="300"></applet> 
<body> </html> 