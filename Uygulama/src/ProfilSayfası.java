import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public ProfilSayfası()
    {
        label.setText("İSİM: Fatih Sultan Mehmet");
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        ImageIcon imageIcon = new ImageIcon("fatih_sultan_mehmet");

        JLabel label2 = new JLabel();
        label2.setIcon(imageIcon);

        frame.add(label2);

        JLabel label3 = new JLabel();
        label3.setText("Karizmatik Kaslı Asil Duruşuyla İçerisinde Pek De Gizli Olmayan Savaşçı Ve Lider Ruhuyla KOSTANTİNAPOLİSİ İSTANBULA Çeviriren Bir OSMANLI İMPARATORU");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfası");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
