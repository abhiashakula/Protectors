import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Order;

import atm_fingerprint.ATMMain;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tests {

    private static ATMMain ui;

    //setting the variables before the execution of test cases
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

    //clearing the DB after execution of all test cases as we are creating dummy user
    @AfterClass
    public static void clearDB() {
        if(ui != null) {
            String UserQuery = "DELETE FROM `users` WHERE `name` = 'NewTestUser' ";
            PreparedStatement query;
            try {
                query = (PreparedStatement) ui.conn.prepareStatement(UserQuery);
                query.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            ui.dispose();
        }
    }

    //Test case to check if the UI is visible after running the code.
    @Test
    public void UiOpen() {
        ui.setVisible(true);
        assertTrue(ui.isVisible());
    }


}