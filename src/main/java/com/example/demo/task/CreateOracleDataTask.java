package com.example.demo.task;

import com.example.demo.dataobject.VehViorec;
import com.example.demo.dataobject.VehViorec2;
import com.example.demo.repository.VehViorec2Repository;
import com.example.demo.repository.VehViorecRepository;
import com.example.demo.utils.UUID32Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 16:27
 */
@Service
@Slf4j
public class CreateOracleDataTask {

    @Resource
    VehViorecRepository vehViorecRepository;

    @Resource
    VehViorec2Repository vehViorec2Repository;

    public void inputTimeTask(){
        log.info("开始插入数据");
        while (true) {
            List<VehViorec2> vehViorec2List = vehViorec2Repository.findAll();
            for(int i = 0; i < vehViorec2List.size(); ++i ){
                VehViorec2 vehViorec2 = vehViorec2List.get(i);
                VehViorec vehViorec = new VehViorec();
                BeanUtils.copyProperties(vehViorec2, vehViorec);
                vehViorec.setXlh(UUID32Utils.getUUID32());
                vehViorec.setTpzt("0");
                vehViorec.setWfsj(new Date(System.currentTimeMillis()));
                vehViorecRepository.save(vehViorec);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    log.error("线程休眠出现异常{}",e);
                }
            }
        }
    }
}
