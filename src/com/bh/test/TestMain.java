package com.bh.test;

import com.bh.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		DBConnector dbConnector = new DBConnector();
		try {
			dbConnector.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}