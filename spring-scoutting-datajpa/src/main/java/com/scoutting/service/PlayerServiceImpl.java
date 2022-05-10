package com.scoutting.service;

import com.scoutting.exception.PlayerNotFoundException;
import com.scoutting.model.Hander;
import com.scoutting.model.Scoutting;
import com.scoutting.model.Specialist;
import com.scoutting.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements IPlayerService {
    @Autowired
    IPlayerRepository iPlayerRepository;
    @Override
    public void addPlayer(Scoutting scoutting) {
      iPlayerRepository.save(scoutting);
    }

    @Override
    public void updatePlayer(Scoutting scoutting) {
     iPlayerRepository.save(scoutting);
    }

    @Override
    public void deletePlayer(int playerId) {
iPlayerRepository.deleteById(playerId);
    }

    @Override
    public List<Scoutting> getAll() {
        return iPlayerRepository.findAll();
    }

    @Override
    public List<Scoutting> getByName(String name) {
        return iPlayerRepository.findByName(name);
    }

    @Override
    public List<Scoutting> getByCountry(String country) throws PlayerNotFoundException {
        return iPlayerRepository.findByCountry(country);
    }

    @Override
    public List<Scoutting> getByHander(Hander hander) throws PlayerNotFoundException {
        return iPlayerRepository.findByHander(hander);
    }

    @Override
    public List<Scoutting> getBySpecialist(Specialist specialist) throws PlayerNotFoundException {
        return iPlayerRepository.findBySpecialist(specialist);
    }

    @Override
    public Scoutting getById(int playerId) throws PlayerNotFoundException {
        return iPlayerRepository.getById(playerId);
    }

    @Override
    public List<Scoutting> getByRangePrice(double minbasePrice, double maxbasePrice)throws PlayerNotFoundException {
        return iPlayerRepository.findByRangePrice(minbasePrice, maxbasePrice);
    }

    @Override
    public List<Scoutting> getByCountryAndHander(String country, Hander hander) throws PlayerNotFoundException {
        return iPlayerRepository.findByCountryAndHander(country,hander);
    }

    @Override
    public List<Scoutting> getBySpecialistAndCountry(Specialist specialist, String country) throws  PlayerNotFoundException{
        return iPlayerRepository.findBySpecialistAndCountry(specialist, country);
    }

    @Override
    public List<Scoutting> getByNameAndCountry(String name, String country) throws PlayerNotFoundException {
        return iPlayerRepository.findByNameAndCountry(name,country);
    }


}

