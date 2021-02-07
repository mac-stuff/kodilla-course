package com.kodilla.jdbc;


import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.sql.Statement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTest {

//    @Test
//    public void testUpdateVipLevels() throws SQLException {
//        // Given
//        DbManager dbManager = DbManager.getInstance();
//        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
//        Statement statement = dbManager.getConnection().createdStatement();
//        statement.executeUpdate(sqlUpdate);
//
//        // When
//        String sqlProcedureCall = "CALL UpdateVipLevels()";
//        statement.execute(sqlProcedureCall);
//
//        // Then
//        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
//        int howMany = -1;
//        if (rs.next()) {
//            howMany = rs.getInt("HOW_MANY");
//        }
//        assertEquals(0, howMany);
//    }
}
