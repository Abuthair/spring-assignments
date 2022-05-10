package com.scoutting.repository;

import com.scoutting.exception.PlayerNotFoundException;
import com.scoutting.model.Hander;
import com.scoutting.model.Scoutting;
import com.scoutting.model.Specialist;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPlayerRepository extends JpaRepository<Scoutting,Integer> {
//    DERIVED QUERIES
List<Scoutting> findByName(String name);
    List<Scoutting> findByCountry(String country);
    List<Scoutting> findByHander(Hander hander) ;
    List<Scoutting> findBySpecialist(Specialist specialist);
    List<Scoutting> findByNameAndCountry(String name,String country);

//    CUSTOM QUERIES

    @Query(value = "select * from scoutting where base_price between ?1 and ?2",nativeQuery =true)
    List<Scoutting> findByRangePrice(double minbasePrice,double maxbasePrice);

    @Query( "from Scoutting s where s.country=?1 and s.hander=?2" )
    List<Scoutting> findByCountryAndHander(String country,Hander hander);

    @Query("from Scoutting s where s.specialist=?1 and s.country=?2")
    List<Scoutting> findBySpecialistAndCountry(Specialist specialist,String country);



}
