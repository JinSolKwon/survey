package member;

import java.util.List;

public class MemberServiceMain {
	private static MemberServiceMain instance;
	private MemberDaoMain memberDaoMain;
	
	private MemberServiceMain(MemberDaoMain memberDaoMain) {
		this.memberDaoMain = memberDaoMain;
	}
	
	public static MemberServiceMain getInstance() {
		synchronized(MemberServiceMain.class) {
			if(instance == null) {
				instance = new MemberServiceMain(MemberDaoMain.getInstance());
			}
		}
		return instance;
	}
	
	//등록하기
	public boolean regist(MemberVoMain voM, int num) {
		int ret = memberDaoMain.insert(voM, num);
		if(ret == 1) {
			return true;
		}
		return false;
	}
	
	//조회
	public MemberVoMain read(int num) {
		return memberDaoMain.select(num);
	}
	
	//성별
		public List<MemberVoMain> listGender(int num){
			return memberDaoMain.selectGender(num);
		}
}
