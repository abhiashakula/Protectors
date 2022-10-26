package Junittestcases;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TransactionTestCase {

    @Mock
    private Connection connection;

    @Mock
    private PreparedStatement preparedStatement;

    @Before
    public void setUp() throws Exception{
        when(connection.prepareStatement(anyString())).thenReturn(preparedStatement);
    }

  //testing if DB connection established
    @Test
    public void testMockDBConnection() throws Exception {
        Mockito.when(connection.createStatement()).thenReturn(preparedStatement);
        Mockito.when(connection.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
        boolean value = preparedStatement.execute("");
        Assert.assertEquals(value, true);
        //Mockito.verify(connection.createStatement(), Mockito.times(1));
    }


//testing if any transcations made for valid user
    @Test
    public void testForTransaction() throws Exception{

        String query="SELECT * FROM `transactions` WHERE `toName` = ? OR `fromName` = ?";
    preparedStatement.setString(1, "xyz");
    preparedStatement.setString(2, "abc");
    ResultSet rs=preparedStatement.executeQuery(query);
    rs.last();
    int rowcount=rs.getRow();
    Assert.assertEquals(rowcount>0,true);
    //Assert.assertEquals();


    }

    //testing if no transactions for invalid user
    @Test
    public void testForNoTransaction() throws Exception{

        String query="SELECT * FROM `transactions` WHERE `toName` = ? OR `fromName` = ?";
        preparedStatement.setString(1, "xyz");
        preparedStatement.setString(2, "abc");
        ResultSet rs=preparedStatement.executeQuery(query);
        rs.last();
        int rowcount=rs.getRow();
        Assert.assertNotEquals(rowcount>0,true);
        //Assert.assertEquals();


    }
    @Test
   public void successtransactiontest()
    {

    }

}
