
import javax.swing.* ;
import java.util.ArrayList;
import java.util.List;


public class  banaunere{
    public static void main(String[]args){
        
        List list = new ArrayList<>();
        JFrame fra1 = new JFrame();
        fra1.setBounds(100,100,200,200);
        fra1.setLayout(null);
        
        
        JMenuBar bar = new JMenuBar();
        
        
        JMenu file = new JMenu("file");
        bar.add(file);
        
        JMenuItem item1 = new JMenu("new");
        JMenuItem item2 = new JMenu("save");
        JMenuItem item3 = new JMenu("quit");
        
        file.add(item1);
        file.add(item2);
        file.add(item3);
        
        fra1.setJMenuBar(bar);
        fra1.setLayout(null);
        fra1.setVisible(true);
        
    }
}