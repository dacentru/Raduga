/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oknaom.raduga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Виктор
 */
public class jdb {

    public static void main(String[] args) {
        String user = "GPR";//Логин пользователя
        String password = "repinboss12345";//Пароль пользователя
        String url = "jdbc:mysql://192.168.137.1/GPR";//URL адрес
        String driver = "com.mysql.jdbc.Driver";//Имя драйвера
        try {
            Class.forName(driver);//Регистрируем драйвер
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Connection c = null;//Соединение с БД
        try {
            c = DriverManager.getConnection(url, user, password);//Установка соединения с БД
            Statement st = c.createStatement();//Готовим запрос
            ResultSet rs = st.executeQuery("select * from gpr");//Выполняем запрос к БД, результат в переменной rs
            while (rs.next()) {
                System.out.println(rs.getString("one"));//Последовательно для каждой строки выводим значение из колонки ColumnName
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Обязательно необходимо закрыть соединение
            try {
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
