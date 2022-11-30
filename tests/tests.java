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
}