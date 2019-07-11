package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojo.Reimbursement;
import com.revature.pojo.Users;
import com.revature.util.ConnectionFactory;

public class ReimbursementDAO {
//	public List<Reimbursement> findALLCurrReimb(){
//		Reimbursement a = null;
//		List<Reimbursement> Reimbursement = new ArrayList<Reimbursement>();
//			try(Connection conn = ConnectionFactory.getInstance().getConnection()){
//				String sql = "select * from ERS_REIMBURSEMENT";
//				PreparedStatement ps = conn.prepareStatement(sql);
////				ps.setInt(1, userID);
//				ResultSet rs = ps.executeQuery();
//				while(rs.next()) {
//					a = new Reimbursement();
//					a.setReimb_id(rs.getDouble(1));
//					a.setReimb_amount(rs.getDouble(2));
//					a.setReimb_submitted(rs.getString(3));
//					a.setReimb_resolved(rs.getString(4));
//					a.setReimb_description(rs.getString(5));
//					a.setReimb_receipt(rs.getString(6));
//					a.setReimb_author(rs.getInt(7));
//					a.setReimb_resolver(rs.getInt(8));
//					a.setReimb_status_id(rs.getInt(9));
//					a.setReimb_type_id(rs.getInt(10));
//					Reimbursement.add(a);
//				}
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
//		return Reimbursement;
//	}
	
	public List<Reimbursement> findALLREIMB(){
		List<Reimbursement> Reimbursement = new ArrayList<Reimbursement>();
			try(Connection conn = ConnectionFactory.getInstance().getConnection()){
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery("select * from ERS_REIMBURSEMENT");
				while(rs.next()) {
					Reimbursement r = new Reimbursement();
					r.setReimb_id(rs.getDouble(1));
					r.setReimb_amount(rs.getDouble(2));
					r.setReimb_submitted(rs.getString(3));
					r.setReimb_resolved(rs.getString(4));
					r.setReimb_description(rs.getString(5));
					r.setReimb_receipt(rs.getString(6));
					r.setReimb_author(rs.getInt(7));
					r.setReimb_resolver(rs.getInt(8));
					r.setReimb_status_id(rs.getInt(9));
					r.setReimb_type_id(rs.getInt(10));
					Reimbursement.add(r);
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		return Reimbursement;
	}
	
	
	
	
	
}
