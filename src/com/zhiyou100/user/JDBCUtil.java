package com.zhiyou100.user;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JDBCUtil {
	
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String URL ="jdbc:mysql://127.0.0.1:3306/mydb";
	public static final String USERNAME = "root";
	public static final String PASSWORD ="123";
	
	
	
	
	public static <E> List<E> dbDQLWithSQL(String sql, Class<E> class1, Object... objects) {
		Connection connection = getConnection();
		PreparedStatement statement = null;
		List<E> list = new ArrayList<>();
		ResultSet set = null;
		try {
			statement = connection.prepareStatement(sql);
			for (int i = 1; i <= objects.length; i++) {
				Object o = objects[i - 1];
				statement.setObject(i, o);
			}
			ResultSetMetaData data = statement.getMetaData();
			String[] names = new String[data.getColumnCount()];
			for (int i = 1; i <= data.getColumnCount(); i++) {
				String name = data.getColumnLabel(i);
				names[i - 1] = name;
			}
			set = statement.executeQuery();
			while (set.next()) {
				E oE = class1.newInstance();
				for (String name : names) {
					Object value = set.getObject(name);
					Field field = class1.getDeclaredField(name);
					field.setAccessible(true);
					field.set(oE, value);
				}
				list.add(oE);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			close(connection, statement, set);
		}
		return list;
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static boolean dbDMLWithSQL(String sql, Object... objects) {
		Connection connection = getConnection();
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				statement.setObject(i + 1, objects[i]);
			}
			statement.execute();
			close(connection, statement);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void close(Connection connection,Statement statement,ResultSet set) {
		close(set);
		close(connection,statement);
	}
	public static void close(Connection connection,Statement statement) {
		close(statement);
		close(connection);
	}
	public static void close(Connection connection) {
		try {
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void close(Statement statement) {
		try {
			statement.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet set) {
		try {
			set.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
//	private 

}
