package member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDaoEnv;
import member.MemberDaoMain;
import member.MemberServiceEnv;
import member.MemberServiceMain;
import member.MemberVoEnv;
import member.MemberVoMain;

public class SurveyResultAction implements CmdAction{
	@Override
	public String requestProc(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("utf-8");
		
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2 = Integer.parseInt(request.getParameter("s2"));
		int s3 = Integer.parseInt(request.getParameter("s3"));
		int s4 = Integer.parseInt(request.getParameter("s4"));
		int s5 = Integer.parseInt(request.getParameter("s5"));
		int s6 = Integer.parseInt(request.getParameter("s6"));
		int s7 = Integer.parseInt(request.getParameter("s7"));
		int s8 = Integer.parseInt(request.getParameter("s8"));
		int s9 = Integer.parseInt(request.getParameter("s9"));
		int s10 = Integer.parseInt(request.getParameter("s10"));
		
		MemberVoMain vo = new MemberVoMain();
		vo.setS1(s1);
		vo.setS2(s2);
		vo.setS3(s3);
		vo.setS4(s4);
		vo.setS5(s5);
		vo.setS6(s6);
		vo.setS7(s7);
		vo.setS8(s8);
		vo.setS9(s9);
		vo.setS10(s10);
		
		MemberDaoEnv daoE = MemberDaoEnv.getInstance();
		MemberDaoMain daoM = MemberDaoMain.getInstance();
		daoM.insert(vo,daoE.selectMax().getNum()); 
		
		MemberServiceMain voMberServiceM = MemberServiceMain.getInstance();
		MemberServiceEnv voMberServiceE = MemberServiceEnv.getInstance();
		
		MemberVoEnv voE = voMberServiceE.readMember(voMberServiceE.readMax());
		MemberVoMain voM= voMberServiceM.read(voMberServiceE.readMax());
		
		int sum=voM.getS1()+voM.getS2()+voM.getS3()+voM.getS4()+voM.getS5()+voM.getS6()+voM.getS7()+voM.getS8()+voM.getS9()+voM.getS10();
		
		request.setAttribute("voE", voE);
		request.setAttribute("sum", sum);
		
		return "/WEB-INF/survey/result.jsp";
	}
}
