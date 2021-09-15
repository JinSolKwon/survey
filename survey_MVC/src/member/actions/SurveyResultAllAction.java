package member.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberServiceEnv;
import member.MemberServiceMain;
import member.MemberVoEnv;
import member.MemberVoMain;

public class SurveyResultAllAction implements CmdAction{
	@Override
	public String requestProc(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("utf-8");
		
		MemberServiceMain memberServiceM = MemberServiceMain.getInstance();
		MemberServiceEnv memberServiceE = MemberServiceEnv.getInstance();
		
		List<MemberVoEnv> memberF = memberServiceE.readGender(1);
		List<MemberVoEnv> memberM = memberServiceE.readGender(0);
		
		MemberVoEnv voE = memberServiceE.readMember(memberServiceE.readMax());
		
		int avgF = 0;
		int avgM = 0;
		
		if (memberServiceE.readGender(1).size() != 0){	
		for (MemberVoEnv vo : memberF){
			MemberVoMain voMF = memberServiceM.read(vo.getNum());
			avgF += voMF.getS1()+voMF.getS2()+voMF.getS3()+voMF.getS4()+voMF.getS5()+voMF.getS6()+voMF.getS7()+voMF.getS8()+voMF.getS9()+voMF.getS10();
		}
		avgF /= memberF.size();
		}
		if (memberServiceE.readGender(0).size() != 0){
		for (MemberVoEnv vo : memberM){
			MemberVoMain voMM = memberServiceM.read(vo.getNum());
			avgM += voMM.getS1()+voMM.getS2()+voMM.getS3()+voMM.getS4()+voMM.getS5()+voMM.getS6()+voMM.getS7()+voMM.getS8()+voMM.getS9()+voMM.getS10();
			
		}
		avgM /= memberM.size();
		}
		
		request.setAttribute("voE", voE);
		request.setAttribute("avgF", avgF);
		request.setAttribute("avgM", avgM);
		request.setAttribute("memberM", memberM);
		request.setAttribute("memberF", memberF);		
		
		return "/WEB-INF/survey/resultTotal.jsp";
	}
}