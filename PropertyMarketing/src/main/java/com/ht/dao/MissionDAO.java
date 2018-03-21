package com.ht.dao;

import com.ht.bean.Mission;
import com.ht.bean.Sale;
import com.ht.common.bean.Pager;

import java.util.List;


public interface MissionDAO extends BaseDAO<String,Mission>{

    Pager<Mission> listMissionByMonth(Pager<Mission> pager,String month);

    Pager<Mission> listMissionByEmployeeId(Pager<Mission> pager,String employeeId);

}
