package com.example.demo.task;

import com.example.demo.config.StartConfig;
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

    public void inputTimeTask() throws InterruptedException {
        log.info("开始插入数据");
        while (true) {
            List<VehViorec2> vehViorec2List = vehViorec2Repository.findAll();
            for(int i = 0; i < vehViorec2List.size(); ++i ){
                if (!StartConfig.start) {
                    return;
                }
                VehViorec2 vehViorec2 = vehViorec2List.get(i);
                VehViorec vehViorec = new VehViorec();
                BeanUtils.copyProperties(vehViorec2, vehViorec);
                vehViorec.setXlh(UUID32Utils.getUUID32());
                vehViorec.setTpzt("0");
                vehViorec.setWfsj(new Date(System.currentTimeMillis()));
                vehViorecRepository.save(vehViorec);
                Thread.sleep(3000);
            }
            // 一百条插完 休眠 5s 等待数据全部处理完
            Thread.sleep(5000);
        }
    }
}
