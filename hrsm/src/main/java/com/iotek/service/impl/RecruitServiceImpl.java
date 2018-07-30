package com.iotek.service.impl;

import com.iotek.dao.RecruitMapper;
import com.iotek.model.Recruit;
import com.iotek.service.RecruitService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by thinkpad on 2018/7/30.
 */
@Service
public class RecruitServiceImpl implements RecruitService {
    @Resource private RecruitMapper recruitMapper;
    public List<Recruit> showRecruit() {
        return recruitMapper.showRecruit();
    }
}
