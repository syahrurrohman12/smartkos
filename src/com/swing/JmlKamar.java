
package com.swing;
import com.main.Config;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JmlKamar extends JLabel {

    public JmlKamar() {
    super();
    fetchAndDisplayValue();
    }
    

private void fetchAndDisplayValue(){
    Connection conn = null;
    try{
        conn = (Connection)Config.configDB();
        PreparedStatement pstm = conn.prepareStatement("SELECT COUNT(no_kamar) AS jumlah FROM kamar");
        ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
            String valueFromDB = rs.getString("jumlah");
            setText(valueFromDB);
        }else{
            setText("NULL");
        }
        rs.close();
        pstm.close();
    }catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    
}
}
}