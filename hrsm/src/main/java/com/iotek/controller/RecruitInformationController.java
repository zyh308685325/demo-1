package com.iotek.controller;

import com.iotek.model.Recruit;
import com.iotek.model.RecruitInformation;
import com.iotek.model.User;
import com.iotek.service.RecruitService;
import com.iotek.service.impl.RecruitInformationServiceImpl;
import com.iotek.service.impl.RecruitServiceImpl;
import com.iotek.util.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by thinkpad on 2018/7/30.
 */
@Controller
public class RecruitController {
    @Resource private RecruitInformationServiceImpl recruitInformationService;

    @RequestMapping("/")
    public String show(HttpSession session,@RequestParam(value = "currentPage",defaultValue = "1")int currentPage)throws Exception{
       int state=1;
       int pageSize = 10;
       int totalRows = recruitInformationService.getRecruitInformation(state);
       int totalPages = DoPage.getTotalPages(totalRows,pageSize);
       int begin = (currentPage-1)*pageSize+1;
       int end = (currentPage-1)*pageSize+pageSize;
        List<RecruitInformation> recruitInformations= recruitInformationService.showRecruitInformation(state,begin,end);
        session.setAttribute("recruitInformations",recruitInformations);
        session.setAttribute("currentPage",currentPage);
        session.setAttribute("totalPages",totalPages);
        return "../../login";
    }
    @RequestMapping("/mailing")
    public String mailing(String mail ,HttpSession session){
        User user1= (User) session.getAttribute("user");
        if (user1==null){
            session.setAttribute("Mailerror","ÇëµÇÂ¼");
            return "../../login";
        }else {
         return "resume";
        }
    }

    @RequestMapping("/getResume")
    public String getResume(){
        return "getResume";
    }
}
