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
	
    @Test
    public void test1_UiOpen() {
    	ui.setVisible(true);
		assertTrue(ui.isVisible());		
	}
}