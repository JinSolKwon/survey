package member;

import java.util.List;

public class MemberServiceEnv {
	private static MemberServiceEnv instance;
	private MemberDaoEnv memberDaoEnv;
	
	private MemberServiceEnv(MemberDaoEnv memberDaoEnv) {
		this.memberDaoEnv = memberDaoEnv;
	}
	
	public static MemberServiceEnv getInstance() {
		synchronized(MemberServiceEnv.class) {
			if(instance == null) {
				instance = new MemberServiceEnv(MemberDaoEnv.getInstance());
			}
		}
		return instance;
	}
	
	//등록하기
	public boolean regist(MemberVoEnv vo) {
		int ret = memberDaoEnv.insertMember(vo);
		if(ret == 1) {
			return true;
		}
		return false;
	}
	
	//조회
	public MemberVoEnv readMember(int num) {
		return memberDaoEnv.selectMember(num);
	}
	
	public List<MemberVoEnv> readGender(int num){
		return memberDaoEnv.selectGender(num);
	}
	
	public int readMax() {
		int re = memberDaoEnv.selectMax().getNum(); 
		return re;
	}
	
	
}








