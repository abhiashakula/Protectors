import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
//import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Order;

import atm_fingerprint.ATMMain;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tests {
	
	private static ATMMain ui;
	
	@BeforeClass
    public static void setup() {
		try {
			ui = new ATMMain();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}       
    }
	
	@AfterClass
    public static void clearDB() {
		if(ui != null) {
        	String uQuerry = "DELETE FROM `users` WHERE `name` = 'NewTestUser' ";
            PreparedStatement query;
			try {
				query = (PreparedStatement) ui.conn.prepareStatement(uQuerry);
				query.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}

        	ui.dispose();
        }
	}
	
	//testing whether UI is being launched.
    @Test
    public void test1_UiOpen() {
    	ui.setVisible(true);
		assertTrue(ui.isVisible());		
	}
    
    //testing if User name is being taken
    @Test
    public void test2_UserIDkept() {
    	ui.loginName.setText("TestUser");
    	assertEquals("TestUser", ui.loginName.getText());
    }
    
    //testing if data can be entered on login screen
    @Test
    public void test3_correctData() {
    	ui.navToPanel(ui.Authentication);
    	ui.loginName.setText("NewTestUser");
    	ui.filePath = Path.of("tests/test.png").toAbsolutePath().toString();
    	
    	assertEquals(Path.of("tests/test.png").toAbsolutePath().toString(), ui.filePath);
    	assertEquals("NewTestUser", ui.loginName.getText());
    }
    
    
    
}