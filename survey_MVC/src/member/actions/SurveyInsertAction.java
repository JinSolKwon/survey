package member.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.MemberDaoEnv;
import member.MemberVoEnv;

public class SurveyInsertAction implements CmdAction{

	@Override
	public String requestProc(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("utf-8");
		
		int gender = Integer.parseInt(request.getParameter("gender"));
		int age = Integer.parseInt(request.getParameter("age"));
		int house = Integer.parseInt(request.getParameter("house"));
		int school = Integer.parseInt(request.getParameter("school"));
		int marry = Integer.parseInt(request.getParameter("house"));
		
		MemberVoEnv vo = new MemberVoEnv();
		vo.setGender(gender);
		vo.setAge(age);
		vo.setHouse(house);
		vo.setSchool(school);
		vo.setMarry(marry);
	
		MemberDaoEnv dao = MemberDaoEnv.getInstance();
		dao.insertMember(vo); 
		
		return "/WEB-INF/survey/surveyInsert.jsp";
	}
	
}
