package com.example.opbd_lw_9.DB;

import com.example.opbd_lw_9.Master;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DatabaseUtils {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/re_repair", "postgres", "root");
    }


    public static void insertMaster(Master master) throws SQLException {
        String sql =
                "insert into " +
                "master (id_branch, sum_amount, qualification, master_number_passport, full_name, work_expirience_specialty, insurance_number, master_telephone) " +
                "values " + master + ";";
        getConnection().createStatement().executeUpdate(sql);
    }

    public static void updateMaster(Master master) throws SQLException {
        String sql = "update master set " +
                "id_branch=" + master.getId_branch() + ", " +
                "sum_amount=" + master.getSum_amount() + ", " +
                "qualification=\'" + master.getQualification() + "\', " +
                "master_number_passport=\'" + master.getMaster_number_passport() + "\', " +
                "full_name=\'" + master.getFull_name() + "\', " +
                "work_expirience_specialty=" + master.getExp() + ", " +
                "insurance_number=\'" + master.getInsurance_number() + "\', " +
                "master_telephone=\'" + master.getMaster_telephone() + "\' " +
                "where master_personnel_number = " + master.getMaster_personnel_number();
        getConnection().createStatement().executeUpdate(sql);
    }

    public static Master getMaster(String id) throws SQLException{
        ResultSet rs = getConnection().createStatement().executeQuery("select * from master where master_personnel_number=" + id);
        rs.next();
        return new Master(
                rs.getInt("master_personnel_number"),
                rs.getInt("id_branch"),
                rs.getInt("sum_amount"),
                rs.getString("qualification"),
                rs.getString("master_number_passport"),
                rs.getString("full_name"),
                rs.getInt("work_expirience_specialty"),
                rs.getString("insurance_number"),
                rs.getString("master_telephone")
        );
    }

    public static List<Master> getMasters() throws SQLException {
        ResultSet rs = getConnection().createStatement().executeQuery("select * from master;");
        List<Master> masters = new LinkedList<>();
        while(rs.next()) {
            masters.add(
                    new Master(
                    rs.getInt("master_personnel_number"),
                    rs.getInt("id_branch"),
                    rs.getInt("sum_amount"),
                    rs.getString("qualification"),
                    rs.getString("master_number_passport"),
                    rs.getString("full_name"),
                    rs.getInt("work_expirience_specialty"),
                    rs.getString("insurance_number"),
                    rs.getString("master_telephone")
                    )
            );
        }
        return masters;
    }



    public static void deleteMaster(String id) throws SQLException {
        String sql = "delete from master where master_personnel_number=" + id;
        getConnection().createStatement().executeUpdate(sql);
    }
}
