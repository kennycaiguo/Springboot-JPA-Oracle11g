package com.example.demo.repository;


import com.example.demo.dataobject.VehViorec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* @author big
* @date 2019-05-29
*/
@Repository
public interface VehViorecRepository extends JpaRepository<VehViorec, String>{

}