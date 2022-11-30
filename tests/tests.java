import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import atm_fingerprint.ATMMain;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(OrderAnnotation.class)
public class tests {

    private static ATMMain ui;

    //setting the variables before the execution of test cases
    @BeforeAll
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
    @AfterAll
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
}