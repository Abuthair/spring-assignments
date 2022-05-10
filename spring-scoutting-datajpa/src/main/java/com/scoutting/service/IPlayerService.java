package com.scoutting.service;

import com.scoutting.exception.PlayerNotFoundException;
import com.scoutting.model.Hander;
import com.scoutting.model.Scoutting;
import com.scoutting.model.Specialist;

import java.util.List;

public interface IPlayerService {
    void addPlayer(Scoutting scoutting);
    void updatePlayer(Scoutting scoutting);
    void deletePlayer(int playerId);
    List<Scoutting> getAll();
    List<Scoutting> getByName(String name)throws  PlayerNotFoundException;
    List<Scoutting> getByCountry(String country)throws PlayerNotFoundException;
    List<Scoutting> getByHander(Hander hander) throws PlayerNotFoundException;
    List<Scoutting> getBySpecialist(Specialist specialist)throws PlayerNotFoundException;
    Scoutting getById(int playerId) throws PlayerNotFoundException;

    List<Scoutting> getByRangePrice(double minbasePrice,double maxbasePrice)throws PlayerNotFoundException;
    List<Scoutting> getByCountryAndHander(String country,Hander hander)throws PlayerNotFoundException;
    List<Scoutting> getBySpecialistAndCountry(Specialist specialist,String country)throws PlayerNotFoundException;
    List<Scoutting> getByNameAndCountry(String name,String country)throws PlayerNotFoundException;
}
