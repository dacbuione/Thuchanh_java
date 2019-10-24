/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltmcsdl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class thongtinDB implements URL {
    public static ArrayList<thongtin>laydanhsachthongtin(){
        ArrayList<thongtin>list=new ArrayList<thongtin>();
        try {
            Class.forName(url);
            Connection con = DriverManager.getConnection(dbUrl);
            PreparedStatement stmt = con.prepareStatement(" select id,title,price from thongtinsv");
            ResultSet rs = stmt.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt(1);
                String title=rs.getString(2);
                double price=rs.getDouble(3);
                list.add(new thongtin(id,title,price));
            }   
            stmt.close();
            con.close();
            return list;
          } catch (Exception ex) {
            Logger.getLogger(thongtinDB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public static Vector<Vector>danhsachthongtin(){
        ArrayList<thongtin> list= laydanhsachthongtin();
        Vector<Vector> b =new Vector<Vector>();
        for(thongtin n: list)
        {
            Vector c = new Vector();
            c.add(n.getId());
            c.add(n.getTitle());
            c.add(n.getPrice());
            b.add(c);
        }
        return b;
    }
}
