package member;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDaoMain {
	private static MemberDaoMain instance;
	private JdbcConnectionUtil util;
	
	private MemberDaoMain() {
		util = JdbcConnectionUtil.getInstance();
	}
	
	public static MemberDaoMain getInstance() {
		synchronized(MemberDaoMain.class) {
			if(instance == null) {
				instance = new MemberDaoMain();
			}
		}
		return instance;
	}
	
	//C
	public int insert(MemberVoMain voM,int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = util.getConnection();
			
			StringBuffer query = new StringBuffer();
			query.append("insert into \"SURVEY_MAIN\" ");
			query.append("(\"NUM\", \"S1\", \"S2\", \"S3\", \"S4\", \"S5\", "
					+ "\"S6\",\"S7\", \"S8\", \"S9\", \"S10\")");
			query.append("values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			System.out.println(query.toString());
			
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setInt(1, num);
			pstmt.setInt(2, voM.getS1());
			pstmt.setInt(3, voM.getS2());
			pstmt.setInt(4, voM.getS3());
			pstmt.setInt(5, voM.getS4());
			pstmt.setInt(6, voM.getS5());
			pstmt.setInt(7, voM.getS6());
			pstmt.setInt(8, voM.getS7());
			pstmt.setInt(9, voM.getS8());
			pstmt.setInt(10, voM.getS9());
			pstmt.setInt(11, voM.getS10());
			
			result = pstmt.executeUpdate();
			System.out.println(result + "행이 삽입되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
	public MemberVoMain select(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVoMain result = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement("select * from \"SURVEY_MAIN\" where \"NUM\"=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = new MemberVoMain(
						rs.getInt("S1"),
						rs.getInt("S2"),
						rs.getInt("S3"),
						rs.getInt("S4"),
						rs.getInt("S5"),
						rs.getInt("S6"),
						rs.getInt("S7"),
						rs.getInt("S8"),
						rs.getInt("S9"),
						rs.getInt("S10")
				);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	public List<MemberVoMain> selectGender(int num){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberVoMain> result = new ArrayList<>();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement("select (\"S1\",\"S2\",\"S3\",\"S4\",\"S5\",\"S6\","
					+ "\"S7\",\"S8\",\"S9\",\"S10\") from \"SURVEY_MAIN\" where \"NUM\"=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVoMain vo = new MemberVoMain(
						rs.getInt("S1"),
						rs.getInt("S2"),
						rs.getInt("S3"),
						rs.getInt("S4"),
						rs.getInt("S5"),
						rs.getInt("S6"),
						rs.getInt("S7"),
						rs.getInt("S8"),
						rs.getInt("S9"),
						rs.getInt("S10")
				);
				result.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;			
	}
}





