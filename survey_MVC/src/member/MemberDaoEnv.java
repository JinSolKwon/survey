package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberDaoEnv {
	private static MemberDaoEnv instance;
	private JdbcConnectionUtil util;
	
	private MemberDaoEnv() {
		util = JdbcConnectionUtil.getInstance();
	}
	
	public static MemberDaoEnv getInstance() {
		synchronized(MemberDaoEnv.class) {
			if(instance == null) {
				instance = new MemberDaoEnv();
			}
		}
		return instance;
	}
	
	//C
	public int insertMember(MemberVoEnv vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			conn = util.getConnection();
			
			StringBuffer query = new StringBuffer();
			query.append("insert into \"SURVEY_ENV\" ");
			query.append("(\"NUM\", \"GENDER\", \"AGE\", \"HOUSE\", \"SCHOOL\", \"MARRY\") ");
			query.append("values (\"ENV_SEQ\".nextval, ?, ?, ?, ?, ?)");
			
			System.out.println(query.toString());
			
			pstmt = conn.prepareStatement(query.toString());
			pstmt.setInt(1, vo.getGender());
			pstmt.setInt(2, vo.getAge());
			pstmt.setInt(3, vo.getHouse());
			pstmt.setInt(4, vo.getSchool());
			pstmt.setInt(5, vo.getMarry());
			
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
	
	//R
	public MemberVoEnv selectMember(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVoEnv result = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement("select * from \"SURVEY_ENV\" where \"NUM\"=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = new MemberVoEnv(
						rs.getInt("NUM"),
						rs.getInt("GENDER"),
						rs.getInt("AGE"),
						rs.getInt("HOUSE"),
						rs.getInt("SCHOOL"),
						rs.getInt("MARRY")
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
	
	//R
		public List<MemberVoEnv> selectGender(int num) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			List<MemberVoEnv> result = new ArrayList<>();
			try {
				conn = util.getConnection();
				pstmt = conn.prepareStatement("select * from \"SURVEY_ENV\" where \"GENDER\"=?");
				pstmt.setInt(1, num);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					MemberVoEnv vo = new MemberVoEnv(rs.getInt("NUM"));
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
	
	public MemberVoEnv selectMax() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVoEnv result = null;
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement("select max(NUM) from \"SURVEY_ENV\"");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				result = new MemberVoEnv(rs.getInt("max(NUM)"));
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





